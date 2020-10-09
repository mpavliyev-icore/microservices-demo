# back
# устанавливаем самую лёгкую версию JVM
FROM openjdk:8-jdk-alpine

# указываем ярлык. Например, разработчика образа и проч. Необязательный пункт.
LABEL maintainer="mpav.icore@gmail.com"

# указываем точку монтирования для внешних данных внутри контейнера (как мы помним, это Линукс)
VOLUME /tmp

# внешний порт, по которому наше приложение будет доступно извне
EXPOSE 8761

# указываем, где в нашем приложении лежит джарник
ARG JAR_FILE=target/discovery-service-demo.jar

# добавляем джарник в образ под именем demo-0.0.1-snapshot.jar
ADD ${JAR_FILE} discovery-service-demo.jar

# команда запуска джарника
ENTRYPOINT ["java","-jar","/discovery-service-demo.jar"]