FROM gradle:8.10.0-jdk22-alpine
WORKDIR /backend
COPY backend .
RUN gradle clean asciidoctor bootJar
RUN addgroup spring && adduser -h /app -g "Spring Boot User" -s /bin/ash -G spring -D -H spring
RUN mkdir /app && cp build/libs/SpringRestDocs-0.0.1-SNAPSHOT.jar /app && chown -R spring:spring /app
RUN apk update && apk add --no-cache nginx
RUN cp -r build/docs/asciidoc/* /var/www/localhost/htdocs && rm -fR /backend
COPY ./docker/configurations/nginx/http.d/default.conf /etc/nginx/http.d
COPY ./docker/configurations/springrestdocs_backend_entrypoint.sh /entrypoint.sh
RUN chmod +x /entrypoint.sh
WORKDIR /app
ENTRYPOINT ["/entrypoint.sh"]
