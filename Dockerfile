FROM java:8
EXPOSE 8080
ADD target/sample.jar sample.jar
ENTRYPOINT ["java", "-cp", "sample.jar", "com.mycompany.app.App"]
