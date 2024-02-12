
# Infraestructura con Kafka y Spring Reactivo

Este proyecto implementa una infraestructura de microservicios utilizando Kafka y Spring Boot Reactivo, con Docker para la contenerización y docker-compose para la orquestación.

## Descripción

La infraestructura consta de dos microservicios Spring Boot Reactivos:

- `ms-recovery`: Un servicio consumidor que escucha eventos de Kafka y registra cada mensaje en una base de datos.
- `ms-recovery2`: Un servicio productor que actúa como pasarela, publicando mensajes en Kafka.

Ambos servicios se comunican a través de un broker Kafka, que es configurado y desplegado mediante `docker-compose`.

## Pre-requisitos

- Docker
- Docker Compose
- Java 11
- Maven (para la construcción de los proyectos)

## Configuración

Cada microservicio tiene su propio `Dockerfile` y comparten un `docker-compose.yml` que define todos los servicios necesarios, incluyendo Kafka y Zookeeper.

## Uso

Para poner en marcha la infraestructura, sigue estos pasos:

1. **Construir los proyectos**: Navega a la raíz de cada microservicio y ejecuta:

   ```shell
   mvn clean package
   ```

   Esto construirá los archivos JAR ejecutables para `ms-recovery` y `ms-recovery2`.

2. **Levantar los servicios**: En el directorio donde se encuentra `docker-compose.yml`, ejecuta:

   ```shell
   docker-compose up --build
   ```

   Esto construirá las imágenes de Docker si es necesario y levantará todos los servicios.

## Estructura de Directorios

```
/
|- ms-recovery/
|  |- src/
|  |- Dockerfile
|  |- ...
|- ms-recovery-2/
|  |- src/
|  |- Dockerfile
|  |- ...
|- docker-compose.yml
```

## Contribuciones

Las contribuciones son bienvenidas. Por favor, realiza tus cambios en una rama separada y envía un pull request para su revisión.

## Licencia

[Incluir tipo de licencia aquí]

## Autores

- [Tu Nombre]

## Agradecimientos

- Agradecimientos a cualquier persona o entidad que haya sido de ayuda.
