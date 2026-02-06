# Spring Boot Hello World 项目

这是一个简单的Spring Boot应用程序，包含一个Hello World GET接口。

## 项目结构

```
src/main/java/com/example/demo/
├── DemoApplication.java
└── HelloWorldController.java
pom.xml
readme.md
```

## 功能特性

- `/` - 返回欢迎信息
- `/hello` - 返回 "Hello, World!" 消息

## 运行方式

1. 确保已安装JDK 17+ 和 Maven
2. 克隆或下载此项目
3. 在项目根目录执行：
   ```bash
   mvn spring-boot:run
   ```
4. 访问 http://localhost:8080/hello 查看Hello World消息

## 构建

要构建可执行的JAR文件，请运行：
```bash
mvn clean package
```

然后可以使用以下命令运行：
```bash
java -jar target/demo-0.0.1-SNAPSHOT.jar