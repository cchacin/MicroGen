#!/bin/sh
mvn clean package && docker build -t io.microgen/myservice . && docker rm -f myservice || true && docker run -d -p 8080:8080 -p 4848:4848 --name myservice io.microgen/myservice 
