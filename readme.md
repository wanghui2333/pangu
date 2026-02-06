# Spring Boot HelloWorld 项目

这是一个使用 Maven 和 Spring Boot 构建的简单项目，包含一个 HelloWorld 接口。

## 接口说明

- `GET /` - 返回欢迎信息
- `GET /hello` - 返回 "Hello, World!"

## 运行方式

```bash
mvn spring-boot:run
```

启动后，可以通过以下地址访问接口：
- http://localhost:8080/
- http://localhost:8080/hello