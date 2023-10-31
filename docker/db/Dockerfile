FROM mongo:latest
COPY ../../data /tmp
COPY mongorestore.sh /docker-entrypoint-initdb.d/mongorestore.sh
EXPOSE 27017
