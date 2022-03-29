# Многомодульный проект на Maven
## Описание
Программа реализует многомодульный проект с помощью Maven:  
db - модуль работы с базой данных;  
api - модуль работы с web;  
service - слой сервисов.  

В основном pom.xml
```
...
<groupId>ru.nettology.mymaven</groupId>
<artifactId>mavenStart</artifactId>
<version>1.0-SNAPSHOT</version>
<modules>
    <module>db</module>
    <module>api</module>
    <module>service</module>
</modules>
...
<packaging>pom</packaging>
...
```

В основном проекте создано 3 директории db, api, service, в каждой из которых создан свой pom.xml с указание parent.
```
<parent>
    <artifactId>mavenStart</artifactId>
    <groupId>ru.nettology.mymaven</groupId>
    <version>1.0-SNAPSHOT</version>
</parent>
<modelVersion>4.0.0</modelVersion>
<artifactId>db</artifactId> //db, api, service
```
Для подключения одного модуля в другой, используются зависимости.  
1. Подключение модуля service к модулю api.
```
...
<dependency>
    <groupId>ru.nettology.mymaven</groupId>
    <artifactId>service</artifactId>
    <version>1.0-SNAPSHOT</version>
    <scope>compile</scope>
</dependency>
```
2. Подключение модуля db к модулю service
```
<dependency>
    <groupId>ru.nettology.mymaven</groupId>
    <artifactId>db</artifactId>
    <version>1.0-SNAPSHOT</version>
    <scope>compile</scope>
</dependency>
```

Для демонтстрации работы модульности были созданы классы в bd и service. 
В модуле api создаем точку входа main.
В результате получился модульный проект с разделением по функциональности.

