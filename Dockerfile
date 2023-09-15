FROM eclipse-temurin:17-jre-alpine

ENV JAVA_OPTS " -Xms512m -Xmx512m -Djava.security.egd=file:/dev/.urandom"

WORKDIR application

COPY target/csm-reservation-0.0.1-SNAPSHOT.jar csm-reservation.jar

ENTRYPOINT ["java", "-jar", "csm-reservation.jar"]