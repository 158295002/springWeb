如果发现在jsp中处理从控制器传递过来的数据无法显示时可能的原因有：
1、没有加入如下的依赖：
  <!-- https://mvnrepository.com/artifact/javax.servlet/jstl -->
    <dependency>
      <groupId>javax.servlet</groupId>
      <artifactId>jstl</artifactId>
      <version>1.2</version>
    </dependency>

    <!-- https://mvnrepository.com/artifact/taglibs/standard -->
    <dependency>
      <groupId>taglibs</groupId>
      <artifactId>standard</artifactId>
      <version>1.1.2</version>
    </dependency>
   2、工程默认生成的web.xml中头部的配置是
   <!DOCTYPE web-app PUBLIC
           "-//Sun Microsystems, Inc.//DTD Web Application 2.3//EN"
           "http://java.sun.com/dtd/web-app_2_3.dtd" 
           
     注意：web-app_2_3.dtd，这就导致后面的servlet、jsp、EL等采用的全是2.3版本，
     而在2.3版本中，jsp页面是不支持EL的，所以当我们在jsp中使用语句${message} ，
     无法得到正确的解析。
     
     解决的方案：
     1、更改web.xml中的版本
     
     把DOCTYPE 引掉，然后在web-app中，黏贴如下代码
     
     <web-app xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns="http://java.sun.com/xml/ns/javaee"
              xsi:schemaLocation="http://java.sun.com/xml/ns/javaee http://java.sun.com/xml/ns/javaee/web-app_3_0.xsd"
              id="WebApp_ID" version="3.0">
    
     2、更改jsp页面的配置
     
     在头文件中添加isELIgnored=”false”
     
     
     <%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
     1
     2
     注意：以上两种方法当然推荐第一种方法，第二种方法只是解决的办法之一，不建议使用
可查看：http://blog.csdn.net/redoq/article/details/53817030