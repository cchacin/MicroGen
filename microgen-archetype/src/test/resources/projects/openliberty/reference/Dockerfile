# OpenLiberty
FROM openliberty/open-liberty:19.0.0.12-full-java11-openj9-ubi
COPY ./src/main/liberty/config/server.xml /config/
COPY ./target/api.war /config/dropins/
COPY ./target/liberty/wlp/usr /opt/ol/wlp/usr/
