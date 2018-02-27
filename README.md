# 分享知识 传递快乐

学习新东西就要先了解它有什么特点，下面我们先看看它的特点：

### 特点
1. 创建独立的Spring应用程序<br>
2. 嵌入的Tomcat，无需部署WAR文件<br>
3. 简化Maven配置<br>
4. 自动配置Spring<br>
5. 提供生产就绪型功能，如指标，健康检查和外部配置<br>
6. 绝对没有代码生成和对XML没有要求配置 <br>



### Spring Boot 常用的几个jar
spring-boot-starter：核心模块，包括自动配置支持、日志和YAML<br>
spring-boot-starter-test：测试模块，包括JUnit、Hamcrest、Mockito<br>
spring-boot-starter-web：引入Web模块<br>
spring-boot-starter-tomcat:添加对tomcat的支持<br>
spring-boot-starter-thymeleaf:默认的模板引擎<br>


在开发时如果要启动项目可以直接用main方法做为入口，如果要部署在tomcat下就要继承SpringBootServletInitializer类，因为Spring Boot通过继承SpringBootServletInitializer方式部署在常规tomcat下，简单的理解起到web.xml的作用。


项目有分别有两个配置，一种为application.yml和application.properties配置，二者可以任选其一。


<br><br><br>

---

 **如有不足或新的想法请留言--分享知识 传递快乐。** 