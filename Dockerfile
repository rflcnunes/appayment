FROM maven:3.8.6-openjdk-18
WORKDIR .
COPY ./ ./
RUN mvn clean install -DskipTests
EXPOSE 8081
CMD ["mvn", "spring-boot:run"]