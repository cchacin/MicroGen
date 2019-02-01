# Build
mvn clean package && docker build -t ${groupId}/${rootArtifactId} .

# RUN

docker rm -f ${rootArtifactId} || true && docker run -d -p 8080:8080 -p 4848:4848 --name ${rootArtifactId} ${groupId}/${rootArtifactId} 