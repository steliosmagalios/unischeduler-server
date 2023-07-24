FROM stmagalios/tomcat_eclipseclp

# rename with your .war file name
COPY "build/libs/UnischedulerServer-1.0.0.war" "/usr/local/tomcat/webapps/app.war"
ADD "prolog" "/usr/local/tomcat/prolog"

EXPOSE 8080/tcp

RUN sh -c 'touch /usr/local/tomcat/webapps/app.war'
ENTRYPOINT [ "sh", "-c", "java -jar -Declipse.directory=/opt/eclipseclp /usr/local/tomcat/webapps/app.war"]
