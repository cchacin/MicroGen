```bash
$ ./mvnw clean package && docker rm -f myservice || true && docker run -d -p 9080:9080 --name myservice ${groupId}/${rootArtifactId}
```