# HelloWorld Spring Boot Application

这是一个简单的Spring Boot应用程序，提供了一个HelloWorld GET接口。

## 功能特性

- `/` - 返回欢迎信息
- `/hello` - 返回 "Hello, World!" 消息

## 技术栈

- Java 17
- Spring Boot 3.2.0
- Maven

## 运行方式

1. 确保已安装Java 17和Maven
2. 克隆或下载此项目
3. 在项目根目录执行以下命令：
   ```bash
   mvn spring-boot:run
   ```
4. 应用将在 `http://localhost:8080` 启动
5. 访问 `http://localhost:8080/hello` 查看HelloWorld响应

## 构建可执行JAR

```bash
mvn clean package
java -jar target/helloworld-springboot-1.0.0.jar
```