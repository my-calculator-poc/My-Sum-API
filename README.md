# My-Sum-API
My Sum API

[![Build Status](https://travis-ci.org/my-calculator-poc/My-Sum-API.svg?branch=master)](https://travis-ci.org/my-calculator-poc/My-Sum-API)

## Build

```
mvn clean test
```

## Generate contract artifacts

```
mvn clean install
```

## Run in local the microservice

```
mvn spring-boot:run -Dserver.port=9090
```

```
2019-08-13 15:39:16.081  INFO 21321 --- [           main] o.apache.catalina.core.StandardService   : Starting service [Tomcat]
2019-08-13 15:39:16.083  INFO 21321 --- [           main] org.apache.catalina.core.StandardEngine  : Starting Servlet engine: [Apache Tomcat/9.0.21]
2019-08-13 15:39:16.227  INFO 21321 --- [           main] o.a.c.c.C.[Tomcat].[localhost].[/]       : Initializing Spring embedded WebApplicationContext
2019-08-13 15:39:16.227  INFO 21321 --- [           main] o.s.web.context.ContextLoader            : Root WebApplicationContext: initialization completed in 2408 ms
2019-08-13 15:39:16.725  INFO 21321 --- [           main] o.s.s.concurrent.ThreadPoolTaskExecutor  : Initializing ExecutorService 'applicationTaskExecutor'
2019-08-13 15:39:17.166  INFO 21321 --- [           main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat started on port(s): 8080 (http) with context path ''
2019-08-13 15:39:17.171  INFO 21321 --- [           main] org.jab.microservices.MainApplication    : Started MainApplication in 4.771 seconds (JVM running for 26.122)
```

## Desing

The API design is based on Swagger.
https://editor.swagger.io/


