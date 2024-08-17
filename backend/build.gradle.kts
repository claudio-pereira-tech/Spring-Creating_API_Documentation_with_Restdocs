plugins {
	java
	id("org.springframework.boot") version "3.3.2"
	id("io.spring.dependency-management") version "1.1.6"
	id("org.asciidoctor.jvm.convert") version "4.0.3"
}

group = "tech.pereira"
version = "0.0.1-SNAPSHOT"

java {
	toolchain {
		languageVersion = JavaLanguageVersion.of(22)
	}
}

repositories {
	mavenCentral()
}

extra["snippetsDir"] = file("build/generated-snippets")
val asciidoctorExtensions: Configuration by configurations.creating

dependencies {
	asciidoctorExtensions("org.springframework.restdocs:spring-restdocs-asciidoctor:3.0.1")

	implementation("org.springframework.boot:spring-boot-starter-web:3.3.2")

	testImplementation("org.springframework.boot:spring-boot-starter-test:3.3.2")
	testImplementation("org.springframework.restdocs:spring-restdocs-mockmvc:3.0.1")
	testRuntimeOnly("org.junit.platform:junit-platform-launcher:1.10.3")
}

tasks.withType<Test> {
	useJUnitPlatform()
}

tasks.test {
	outputs.dir(project.extra["snippetsDir"]!!)
}

tasks.asciidoctor {
	inputs.dir(project.extra["snippetsDir"]!!)
	configurations("asciidoctorExtensions")
	dependsOn(tasks.test)
}
