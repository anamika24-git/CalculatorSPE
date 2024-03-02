FROM openjdk:18
WORKDIR /app
COPY target/*.jar ./
CMD ["java" ,"-jar" ,"Calculator-1.0-SNAPSHOT.jar", "1"]
