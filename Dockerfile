FROM frolvlad/alpine-java
VOLUME /tmp
ADD target/api-test*.jar app.jar
RUN sh -c 'touch /app.jar'
ENTRYPOINT ["java",\
"-Djava.security.egd=file:/dev/./urandom",\
"-jar",\
"/app.jar"]
EXPOSE 8080
