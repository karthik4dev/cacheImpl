FROM eclipse-temurin:21
EXPOSE 8080
ADD . /usr/local/cacheimpl
COPY /build/libs/cacheimpl-0.0.1-SNAPSHOT.jar /usr/local/cacheimpl/cacheimpl-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "/usr/local/cacheimpl/cacheimpl-0.0.1-SNAPSHOT.jar"]