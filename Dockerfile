FROM openjdk:18.0.2.1-slim-buster
WORKDIR /opt/lecture2-sample
COPY ./lecture2-app/target/lecture2-sample-exec.jar ./
CMD java -jar lecture2-sample-exec.jar