# How to build a container that runs the Quarkus application in JVM mode

Before building the docker image run:

`mvn package`

Then, build the image with:

`docker build -f src/main/docker/Dockerfile.jvm -t ${rootArtifactId}-jvm .`

Then run the container using:

`docker run -i --rm -p 8080:8080 ${rootArtifactId}-jvm`

# How to build a container that runs the Quarkus application in native (no JVM) mode

Before building the docker image run:

`mvn package -Pnative -Dquarkus.native.container-build=true`

Then, build the image with:

`docker build -f src/main/docker/Dockerfile.native -t ${rootArtifactId} .`

Then run the container using:

`docker run -i --rm -p 8080:8080 ${rootArtifactId}`
