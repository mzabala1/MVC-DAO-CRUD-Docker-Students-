FROM ubuntu

RUN apt-get update && DEBIAN_FRONTEND=noninteractive apt-get install -y mysql-server
RUN apt-get update
RUN apt-get install -y software-properties-common python-software-properties
RUN add-apt-repository ppa:openjdk-r/ppa
RUN apt-get update && apt-get install -y openjdk-8-jdk && apt-cache search jdk
RUN export JAVA_HOME=usr/lib/jvm/java-8-openjdk
RUN export PATH=$PATH:/usr/lib/jva/java-8-openjdk/bin

ADD iniciar.sh iniciar.sh
ADD RegistroEstudiantes.jar RegistroEstudiantes.jar
ADD crudestudiantessql.sql crudestudiantessql.sql
CMD [*/bin/bash*]
