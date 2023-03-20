FROM openjdk:11
COPY ./target/version1-1.0-SNAPSHOT.jar ./
WORKDIR ./
CMD ["java", "-cp", "version1-1.0-SNAPSHOT.jar", "Calculator"]