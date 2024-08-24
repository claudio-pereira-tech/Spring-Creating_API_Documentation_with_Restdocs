# Creating API Documentation with Restdocs

[![Stargazers][stars-shield]][stars-url]
[![Forks][forks-shield]][forks-url]
[![Issues][issues-shield]][issues-url]
[![MIT License][license-shield]][license-url]
[![LinkedIn][linkedin-shield]][linkedin-url]

![Screenshot](https://raw.githubusercontent.com/claudio-pereira-tech/Spring-Creating_API_Documentation_with_Restdocs/main/images/screenshot.png)

This application was developed following the guide [Creating API Documentation with Restdocs][gettingstarted-url]. The guide outlines building a simple RESTful API using [Spring Boot][springboot-url] and [Spring Framework][springframework-url], testing the endpoint, and setting up [Spring REST Docs][springrestdocs-url] to generate API documentation automatically through unit tests. The final result is a robust application that not only functions as intended but also features clear, up-to-date API documentation.

For this project, I selected [Gradle][gradle-url] as the build system and dependency manager, utilizing [Kotlin][kotlin-url] as the build script language.

## Getting Started

These instructions will guide you through setting up a local copy of the project on your computer and deploying the application using [Docker Compose][dockercompose-url] for demonstration purposes. Although these instructions are based on Linux distribution, the application can also be run on other operating systems with Docker Compose or Gradle, with the necessary adjustments not covered in this guide.

### Prerequisites

The things you need before deploying the application:

* [git][git-url] - version 2.14.1 or above
* [Docker Compose][dockercompose-url] - version V2
* Fundamental understanding of Linux commands

### Cloning the project

```console
git clone https://github.com/claudio-pereira-tech/Spring-Creating_API_Documentation_with_Restdocs.git
cd Spring-Creating_API_Documentation_with_Restdocs/docker
```

### Deploying the application

```console
docker compose up --detach
```

## Usage

To try out this project, you can read the documentation available at http://localhost or consume the API endpoint at http://localhost/api.

### Reading the documentation

To read the API documentation, simply open http://localhost in your favorite browser.

### Consuming the endpoint

To consume the endpoint, simply use your fevorite API testing tool (exemplo: [Postman][postman-url], [Insomnia][insomnia-url], [curl][curl-url], [httpie][httpie-url]) to do a GET request to http://localhost/api.

#### Requesting with curl

```console
curl 'http://localhost/api/' -i -X GET
```

#### Requesting with httpie

```console
http GET 'http://localhost/api/'
```

## Terminating

After finishing all demonstrations, terminate the deployment and remove the built image.

### Terminating the deployment and removing the built image 

```console
docker compose down --rmi local
```

## License

Distributed under the MIT License. See [LICENSE.md][license-url] for more information.

<!-- Badges -->
[stars-shield]: https://img.shields.io/github/stars/claudio-pereira-tech/Spring-Creating_API_Documentation_with_Restdocs?style=for-the-badge
[stars-url]: https://github.com/claudio-pereira-tech/Spring-Creating_API_Documentation_with_Restdocs/stargazers

[forks-shield]: https://img.shields.io/github/forks/claudio-pereira-tech/Spring-Creating_API_Documentation_with_Restdocs?style=for-the-badge
[forks-url]: https://github.com/claudio-pereira-tech/Spring-Creating_API_Documentation_with_Restdocs/network/members

[issues-shield]: https://img.shields.io/github/issues/claudio-pereira-tech/Spring-Creating_API_Documentation_with_Restdocs?style=for-the-badge
[issues-url]: https://github.com/claudio-pereira-tech/Spring-Creating_API_Documentation_with_Restdocs/issues

[license-shield]: https://img.shields.io/github/license/claudio-pereira-tech/Spring-Creating_API_Documentation_with_Restdocs?style=for-the-badge
[license-url]: https://github.com/claudio-pereira-tech/Spring-Creating_API_Documentation_with_Restdocs/blob/main/LICENSE.md

[linkedin-shield]: https://img.shields.io/badge/-LinkedIn-black.svg?style=for-the-badge&logo=linkedin&colorB=555
[linkedin-url]: https://linkedin.com/in/claudio-oliveira-pereira

<!-- Links -->
[gettingstarted-url]: https://spring.io/guides/gs/testing-restdocs
[springboot-url]: https://spring.io/projects/spring-boot
[springframework-url]: https://spring.io/projects/spring-framework
[springrestdocs-url]: https://spring.io/projects/spring-restdocs
[gradle-url]: https://gradle.org
[kotlin-url]: https://kotlinlang.org/
[dockercompose-url]: https://docs.docker.com/compose/
[git-url]: https://git-scm.com/
[postman-url]: https://www.postman.com/
[insomnia-url]: https://insomnia.rest/
[curl-url]: https://curl.se/
[httpie-url]: https://httpie.io/
