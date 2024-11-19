FROM java:8u102
EXPOSE 8080
ADD target/employeeservices-1.0.jar employeeservices-1.0.jar
ENTRYPOINT [ "java","-jar","employeeservices-1.0.jar" ]