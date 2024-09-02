FROM maven AS build
WORKDIR /app

COPY . /app

RUN mvn clean install

FROM eclipse-temurin:17
COPY --from=build /app/target/demo-0.0.1-SNAPSHOT.jar /app/demo-0.0.1-SNAPSHOT.jar

EXPOSE 6500

CMD [ "java", "-jar", "demo-0.0.1-SNAPSHOT.jar" ]