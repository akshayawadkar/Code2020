 
FROM adoptopenjdk/openjdk11:alpine-jre
MAINTAINER experto.com
VOLUME /tmp
EXPOSE 8080
ADD target/EcommerceForEgen-0.0.1-SNAPSHOT.jar /app/app.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app/app.jar"]