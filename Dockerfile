FROM eclipse-temurin:8-jdk-alpine
VOLUME /tmp
COPY target/spring-boot-mysql-war.war spring-boot-mysql-war.war
ENTRYPOINT ["java","-jar","/spring-boot-mysql-war.war"]
EXPOSE 3101