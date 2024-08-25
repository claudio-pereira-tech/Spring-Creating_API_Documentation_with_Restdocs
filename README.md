<a id="readme-top"></a>

# Creating API Documentation with Restdocs

[![Contributors][contributors-shield]][contributors-url]
[![Stargazers][stars-shield]][stars-url]
[![Forks][forks-shield]][forks-url]
[![Issues][issues-shield]][issues-url]
[![MIT License][license-shield]][license-url]
[![LinkedIn][linkedin-shield]][linkedin-url]

![Screenshot](https://raw.githubusercontent.com/claudio-pereira-tech/Spring-Creating_API_Documentation_with_Restdocs/main/images/screenshot.png)

## About The Project

This application was developed following the guide [Creating API Documentation with Restdocs][gettingstarted-url]. The guide outlines building a simple RESTful API using [Spring Boot][springboot-url] and [Spring Framework][springframework-url], testing the endpoint, and setting up [Spring REST Docs][springrestdocs-url] to generate API documentation automatically through unit tests. The final result is a robust application that not only functions as intended but also features clear, up-to-date API documentation.

For this project, [Gradle][gradle-url] was selected as the build system and dependency manager, and [Kotlin][kotlin-url] as the build script language.

<p align="right">(<a href="#readme-top">back to top</a>)</p>

## Built With

* [![Java][java-shield]][java-url]
* [![SpringBoot][springboot-shield]][springboot-url]
* [![SpringFramework][springframework-shield]][springframework-url]
* [![Gradle][gradle-shield]][gradle-url]
* [![Docker][docker-shield]][docker-url]

<p align="right">(<a href="#readme-top">back to top</a>)</p>

## Getting Started

These instructions will guide setting up a local copy of the project and deploying the application using [Docker Compose][dockercompose-url] for demonstration purposes. Although these instructions are based on Linux distribution, the application can also be run on other operating systems with Docker Compose or Gradle, with the necessary adjustments not covered in this guide.

### Prerequisites

Requirements for downloading the project and deploying the application:

* [git][git-url] - version 2.14.1 or above
* [Docker Compose][dockercompose-url] - version V2
* Acknowledgment of Linux Fundamentals

### Downloading the project

```console
git clone https://github.com/claudio-pereira-tech/Spring-Creating_API_Documentation_with_Restdocs.git
cd Spring-Creating_API_Documentation_with_Restdocs/docker
```

### Deploying the application

```console
docker compose up --detach
```

<p align="right">(<a href="#readme-top">back to top</a>)</p>

## Usage

To explore this project, access the API documentation available at http://localhost or consume the API endpoint at http://localhost/api.

### Accessing the API documentation

To access the API documentation, open http://localhost in the preferred web browser.

### Consuming the API endpoint

To consume the API endpoint, use a preferred API testing tool (e.g., [Postman][postman-url], [Insomnia][insomnia-url], [curl][curl-url], [httpie][httpie-url]) to perform a GET request to http://localhost/api.

#### Requesting with curl

```console
curl 'http://localhost/api/' -i -X GET
```

#### Requesting with httpie

```console
http GET 'http://localhost/api/'
```

<p align="right">(<a href="#readme-top">back to top</a>)</p>

## Terminate

After finishing all demonstrations, terminate the deployment and remove the built image.

### Terminating the deployment and removing the built image 

```console
docker compose down --rmi local
```

<p align="right">(<a href="#readme-top">back to top</a>)</p>

## License

Distributed under the MIT License. See [LICENSE.md][license-url] for more information.

<p align="right">(<a href="#readme-top">back to top</a>)</p>

## Contact

Cláudio de Oliveira Pereira - claudio@pereira.tech - [LinkedIn][linkedin-url]

Project Link: [https://github.com/claudio-pereira-tech/Spring-Creating_API_Documentation_with_Restdocs][project-url]

<p align="right">(<a href="#readme-top">back to top</a>)</p>

## Support

If value has been found in this project and it has been helpful in any way, support would be greatly appreciated.

<a href="https://www.buymeacoffee.com/PereiraTech" target="_blank"><img src="https://cdn.buymeacoffee.com/buttons/v2/default-yellow.png" alt="Buy Me A Coffee" style="height: 60px !important;width: 217px !important;" ></a>

<p align="right">(<a href="#readme-top">back to top</a>)</p>

<!-- Badges -->
[contributors-shield]: https://img.shields.io/github/contributors/claudio-pereira-tech/Spring-Creating_API_Documentation_with_Restdocs?style=for-the-badge
[contributors-url]: https://github.com/claudio-pereira-tech/Spring-Creating_API_Documentation_with_Restdocs/graphs/contributors/

[stars-shield]: https://img.shields.io/github/stars/claudio-pereira-tech/Spring-Creating_API_Documentation_with_Restdocs?style=for-the-badge
[stars-url]: https://github.com/claudio-pereira-tech/Spring-Creating_API_Documentation_with_Restdocs/stargazers/

[forks-shield]: https://img.shields.io/github/forks/claudio-pereira-tech/Spring-Creating_API_Documentation_with_Restdocs?style=for-the-badge
[forks-url]: https://github.com/claudio-pereira-tech/Spring-Creating_API_Documentation_with_Restdocs/network/members/

[issues-shield]: https://img.shields.io/github/issues/claudio-pereira-tech/Spring-Creating_API_Documentation_with_Restdocs?style=for-the-badge
[issues-url]: https://github.com/claudio-pereira-tech/Spring-Creating_API_Documentation_with_Restdocs/issues/

[license-shield]: https://img.shields.io/github/license/claudio-pereira-tech/Spring-Creating_API_Documentation_with_Restdocs?style=for-the-badge
[license-url]: https://github.com/claudio-pereira-tech/Spring-Creating_API_Documentation_with_Restdocs/blob/main/LICENSE.md

[linkedin-shield]: https://img.shields.io/badge/-LinkedIn-black.svg?style=for-the-badge&logo=linkedin&colorB=555
[linkedin-url]: https://linkedin.com/in/claudio-oliveira-pereira/

[springboot-shield]: https://img.shields.io/badge/Spring_Boot-3.3.2-white?style=for-the-badge&logo=springboot&logoColor=white&logoSize=auto&labelColor=6DB33F&color=grey
[springboot-url]: https://spring.io/projects/spring-boot/

[springframework-shield]: https://img.shields.io/badge/Spring_Framework-6.1.12-white?style=for-the-badge&logo=spring&logoColor=white&logoSize=auto&labelColor=6DB33F&color=grey
[springframework-url]: https://spring.io/projects/spring-framework/

[gradle-shield]: https://img.shields.io/badge/Gradle-02303A?style=for-the-badge&logo=gradle&logoColor=white&logoSize=auto
[gradle-url]: https://gradle.org/

[java-shield]: https://img.shields.io/badge/Liberica_JDK-22.0.2-white?style=for-the-badge&logo=openjdk&logoColor=black&logoSize=auto&labelColor=5BD5EF&color=grey
[java-url]: https://bell-sw.com/libericajdk/

[docker-shield]: https://img.shields.io/badge/Docker-2496ED?style=for-the-badge&logo=docker&logoColor=white&logoSize=auto
[docker-url]: https://www.docker.com/

<!-- Links -->
[gettingstarted-url]: https://spring.io/guides/gs/testing-restdocs/
[springrestdocs-url]: https://spring.io/projects/spring-restdocs/
[kotlin-url]: https://kotlinlang.org/
[dockercompose-url]: https://docs.docker.com/compose/
[git-url]: https://git-scm.com/
[postman-url]: https://www.postman.com/
[insomnia-url]: https://insomnia.rest/
[curl-url]: https://curl.se/
[httpie-url]: https://httpie.io/
[project-url]: https://github.com/claudio-pereira-tech/Spring-Creating_API_Documentation_with_Restdocs/
