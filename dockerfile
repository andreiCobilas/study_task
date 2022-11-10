FROM openjdk:17-alpine3.13
WORKDIR /app
EXPOSE 8080
ADD ./build/libs/products-0.0.1-SNAPSHOT.jar .
CMD ["java", "-jar", "products-0.0.1-SNAPSHOT.jar"]