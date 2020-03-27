# OpenLiberty
FROM openliberty/open-liberty:20.0.0.3-full-java11-openj9-ubi
COPY --chown=1001:0 ./src/main/liberty/config/server.xml /config/
COPY --chown=1001:0 ./src/main/liberty/extension /opt/ol/wlp/usr/extension
COPY --chown=1001:0 ./src/main/liberty/drivers/*.jar /opt/ol/wlp/lib/
COPY --chown=1001:0 ./target/api.war /config/dropins/
