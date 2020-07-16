FROM openjdk
WORKDIR /temp/api/
COPY target/demo-0.0.1-SNAPSHOT.jar .
ENTRYPOINT java -jar /temp/api/demo-0.0.1-SNAPSHOT.jar
