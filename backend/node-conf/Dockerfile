FROM openjdk:17-alpine
COPY node-conf.jar /node-conf.jar
ENV DB_HOST=172.17.0.1
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "/node-conf.jar"]