# Hello World Spring Boot 应用

这是一个使用 Maven 和 Spring Boot 构建的简单 Hello World 应用。

## 项目结构

```
pangu/
├── pom.xml
├── readme.md
└── src/
    ├── main/
    │   ├── java/
    │   │   └── com/
    │   │       └── pangu/
    │   │           ├── HelloWorldApplication.java
    │   │           └── controller/
    │   │               └── HelloWorldController.java
    │   └── resources/
    │       └── application.properties
    └── test/
        └── java/
```

## 运行方式

### 使用 Maven 命令行运行：
```bash
mvn spring-boot:run
```

### 或者打包后运行：
```bash
mvn clean package
java -jar target/hello-world-app-0.0.1-SNAPSHOT.jar
```

## 接口说明

启动后，访问以下地址获取 Hello World 消息：

- GET `http://localhost:8080/hello`

## 技术栈

- Java 17
- Spring Boot 3.2.0
- Maven
- Embedded Tomcat