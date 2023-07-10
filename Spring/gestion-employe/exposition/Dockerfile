FROM openjdk:17-oracle
ADD target/*.jar ./app.jar

CMD ["java", "-Dspring.profiles.active=local", "-jar", "app.jar"]