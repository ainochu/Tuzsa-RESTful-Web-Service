[![Travis builds](https://travis-ci.org/ainochu/Tuzsa-RESTful-Web-Service.svg?branch=develop)](https://travis-ci.org/ainochu/Tuzsa-RESTful-Web-Service)

# Tuzsa-RESTful-Web-Service

## Build

```
mvn package
```

## Dockerize

```
docker build -t ainochu/Tuzsa-RESTful-Web-Service .

docker run -it -d --name tuzsa-backend -p 3000:8080 ainochu/Tuzsa-RESTful-Web-Service
```

