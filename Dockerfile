FROM openjdk:11.0.1-jre-slim-stretch
EXPOSE 8082
ARG JAR=lectura-facturacion-1.0.jar
COPY target/$JAR /lectura-facturacion.jar
ENTRYPOINT ["java","-jar","/lectura-facturacion.jar"]