FROM open-liberty:kernel

# Add my app and config
COPY --chown=1001:0  /target/book.war /config/dropins/
COPY --chown=1001:0  /src/main/liberty/server.xml /config/

USER 1001

RUN configure.sh
