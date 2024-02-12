# Usa la imagen base oficial de Java para Spring Boot
FROM openjdk:17-jdk-slim as build

# Copia el artefacto construido al contenedor
COPY target/ms-recovery-2-0.0.1-SNAPSHOT.jar app.jar

# Ejecuta la aplicación
ENTRYPOINT ["java","-jar","/app.jar"]