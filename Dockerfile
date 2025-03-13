FROM openjdk:17
EXPOSE 8080
ADD target/github-actions-test.jar saibharathreddylattupalli/github-actions-test.jar
ENTRYPOINT [ "java", "-jar","github-actions-test.jar" ]