FROM openjdk:11
EXPOSE 8080
ADD target/artist-vote-docker.jar artist-vote-docker.jar 
ENTRYPOINT ["java","-jar","/artist-vote-docker.jar"]