FROM openjdk:8-jdk 

RUN mkdir -p /app
WORKDIR /app

COPY ./src /app

RUN javac Main.java

CMD ["java", "Main"]
# RUN javac Test.java 
# CMD ["java", "Test"]
