FROM java:8

RUN mkdir /app
WORKDIR /app

ADD target/credit-1.0-SNAPSHOT.jar credit.jar
ADD configs/sample.yml config.yml

EXPOSE 9090 47500

ENTRYPOINT ["java", "-server", "-Xmx256m", "-jar", "credit.jar", "--spring.config.location=config.yml"]
