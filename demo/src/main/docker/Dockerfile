

FROM java:8 
 
ENV JAVA_VERSION 8u31
ENV BUILD_VERSION b13
 
# Upgrading system
 
# Downloading & Config Java 8
RUN wget --no-cookies --no-check-certificate --header "Cookie: oraclelicense=accept-securebackup-cookie" "http://download.oracle.com/otn-pub/java/jdk/$JAVA_VERSION-$BUILD_VERSION/jdk-$JAVA_VERSION-linux-x64.rpm" -O /tmp/jdk-8-linux-x64.rpm
 
EXPOSE 8088 
 
#install Spring Boot artifact
VOLUME /tmp
ADD /maven/demo-0.0.1-SNAPSHOT.jar demo.jar
RUN sh -c 'touch /demo.jar'
ENTRYPOINT ["java","-Dserver.port=8088","-jar","/demo.jar","/home/amira/demo/example.txt"]
