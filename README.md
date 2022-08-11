# FinancialPortfolio
## _Best Stock Market Platform, Ever_

[![Build Status](https://travis-ci.org/joemccann/dillinger.svg?branch=master)](https://travis-ci.org/joemccann/dillinger)

Finacial_Protfolio is a userfriendly webapp to use.
It is a SpringBoot powered Web Application for Stock Data Analysis.

## Features

- Able to view trading data of various esteemed companies.
- Ease of Access and Mobile friendly.
- Containerized Jar file for easy deployment via Docker.
- Crud API's to easily modify the database queries.
- Added 3 diffrent tables in our Database Schema.

This text you see here is *actually- written in Markdown! To get a feel
for Markdown's syntax, type some text into the left window and
watch the results in the right.


## Tech

TechStack Present in our application.

- Spring Boot - To Build and depolyed enhanced web apps
- MySQL - For Database Management
- Git - For version Control
- Docker - To create efficient Containerized applications.

Creating Jar files. 

```sh
cd FinancialPortfolo
./mvnw clean install -U 
./mvnw package
```

## Docker

FinancialPortfolio is very easy to install and deploy in a Docker container.

By default, the Docker will expose port 8080, so change this within the
Dockerfile if necessary. When ready, simply use the Dockerfile to
build the image.

```sh
cd FinancialPorfolo
docker-compose build demo:0.0.1
docker run . -t demo.0.0.1
```


## Voila
The application is ready to use and can accept Get and Post Requests on the port 8080.
```sh
127.0.0.1:8080
```

## Authors:

- Sandhya Bhan
- Jasleen Kaur
- Akhila Jagarlapudi
- Kuncha Chennika Wangmai
- Harsh W.


