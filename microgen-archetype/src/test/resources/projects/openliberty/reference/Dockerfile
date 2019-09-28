# OpenLiberty
FROM open-liberty:microProfile3-java11
COPY ./openliberty/server.xml /config/
COPY ./target/api.war /config/dropins/
COPY ./target/liberty/wlp/usr /opt/ol/wlp/usr/