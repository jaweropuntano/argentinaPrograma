
# Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
# Click nbfs://nbhost/SystemFileSystem/Templates/Other/Dockerfile to edit this template

FROM amazoncorretto:11-alpine-jdk
MAINTAINER  MGB
COPY target/jach-0.0.1-SNAPSHOT.jar jach-app.jar
ENTRYPOINT ["java", "-jar","/jach-app.jar"]
CMD ["/bin/sh"]
