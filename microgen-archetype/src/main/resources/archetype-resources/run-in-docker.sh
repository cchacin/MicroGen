#!/bin/sh
./mvnw clean package && docker build -t ${groupId}/${rootArtifactId} . && docker rm -f ${rootArtifactId} || true && docker run -d -p 9080:9080 --name ${rootArtifactId} ${groupId}/${rootArtifactId} 
