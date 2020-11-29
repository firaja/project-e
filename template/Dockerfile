FROM maven:3.6.3-jdk-11 AS build
WORKDIR /build
ADD pom.xml /build/pom.xml
RUN mvn verify clean --fail-never

COPY . /build
RUN mvn clean install



FROM tomcat:9.0.20-jre11 as server
RUN rm -rf /usr/local/tomcat/webapps/*
COPY --from=build /build/target/template.war /usr/local/tomcat/webapps/



EXPOSE 9001
CMD cd bin && ./catalina.sh run


