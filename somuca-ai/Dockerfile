FROM ubuntu:20.04
ENV JAVA_HOME=/u01/middleware/jdk-11.0.1
ENV PATH=$PATH:$JAVA_HOME/bin:$TOMCAT_HOME/bin

RUN mkdir -p /u01/middleware
RUN mkdir -p /u01/middleware/somuca-ai
WORKDIR /u01/middleware

ADD https://download.java.net/java/GA/jdk11/13/GPL/openjdk-11.0.1_linux-x64_bin.tar.gz .

RUN tar -xzvf openjdk-11.0.1_linux-x64_bin.tar.gz 

RUN apt update -y
RUN apt install -y curl
RUN apt install -y mysql-client-8.0
RUN apt install -y net-tools

RUN rm openjdk-11.0.1_linux-x64_bin.tar.gz
COPY . ./somuca-ai
copy ./target/somuca-ai.jar somuca-ai.jar
CMD ["java","-jar","somuca-ai.jar"]