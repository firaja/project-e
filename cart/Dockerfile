FROM maven:3.6.0-jdk-11-slim AS build
WORKDIR /build
COPY . .
RUN mvn clean install



FROM tomcat:9.0.40-jdk11-adoptopenjdk-hotspot as server
COPY --from=build /build/target/cartweb.war /usr/local/tomcat/webapps

EXPOSE 9001

CMD cd bin && ./catalina.sh run


