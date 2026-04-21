FROM eclipse-temurin:21
EXPOSE 8080
ADD . /usr/local/cacheimpl
ARG JAR_VERSION=1.0
COPY /build/libs/cacheimpl-$JAR_VERSION.jar /usr/local/cacheimpl/cacheimpl-$JAR_VERSION.jar
ENTRYPOINT ["java", "-jar", "/usr/local/cacheimpl/cacheimpl-$JAR_VERSION.jar"]