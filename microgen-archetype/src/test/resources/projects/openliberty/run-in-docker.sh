#!/bin/sh
./mvnw clean package && docker build -t io.microgen/myservice . && docker rm -f myservice || true && docker run -d -p 9080:9080 --name myservice io.microgen/myservice 
