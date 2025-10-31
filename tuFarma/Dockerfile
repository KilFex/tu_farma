	FROM openjdk:24-jdk-slim
	ARG JAR_FILE=target/tuFarma-0.0.1.jar
	COPY ${JAR_FILE} app_farma.jar
	EXPOSE 8080
	ENTRYPOINT ["java", "-jar", "app_farma.jar"]