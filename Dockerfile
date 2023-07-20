FROM stmagalios/tomcat_eclipseclp

# rename with your .war file name
COPY "./build/libs/PrologServer-0.0.1-SNAPSHOT.war" "/usr/local/tomcat/webapps/app.war"
COPY "./program.ecl" "/usr/local/tomcat/program.ecl"

EXPOSE 8080/tcp

RUN sh -c 'touch /usr/local/tomcat/webapps/app.war'
ENTRYPOINT [ "sh", "-c", "java -jar -Declipse.directory=/opt/eclipseclp /usr/local/tomcat/webapps/app.war"]
