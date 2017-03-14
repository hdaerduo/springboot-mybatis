## Relative Knowlege

### Tomcat

Tomcat与HTTP服务器集成的原理 

　　Tomcat服务器通过Connector连接器组件与客户程序建立连接， 
  
　　Connector组件负责接收客户的请求，以及把Tomcat服务器的响应结果发送给客户。 
  
默认情况下，Tomcat在server.xml中配置了两种连接器：

 <!-- Define a non-SSL Coyote HTTP/1.1
　　Connector on port 8080 -->
　　<Connector port="8080"
　　maxThreads="150"
　　minSpareThreads="25"
　　maxSpareThreads="75"
　　enableLookups="false"
　　redirectPort="8443"
　　acceptCount="100"
　　debug="0"
　　connectionTimeout="20000"
　　disableUploadTimeout="true" />

　<!-- Define a Coyote/JK2 AJP 1.3
　　Connector on port 8009 -->
　　<Connector port="8009"
　　enableLookups="false"
　　redirectPort="8443" debug="0"
　　protocol="AJP/1.3" />

<img title="" alt="Web客户访问Tomcat服务器上的JSP组件的两种方式" src="http://img.blog.csdn.net/20150828161212922">


解释：

第一个连接器监听8080端口，负责建立HTTP连接。

　　在通过浏览器访问Tomcat服务器的Web应用时，使用的就是这个连接器。
  
第二个连接器监听8009端口，负责和其他的HTTP服务器建立连接。

　　在把Tomcat与其他HTTP服务器集成时，就需要用到这个连接器。
  
　　Web客户访问Tomcat服务器上JSP组件的两种方式如下图所示。
  

在图中， 

Web客户1直接访问Tomcat服务器上的JSP组件，他访问的URL为http://localhost:8080 /index.jsp。

Web客户2通过HTTP服务器访问Tomcat服务器上的JSP组件。假定HTTP服务器使用的HTTP端口为默认的80端口，那么Web客户2访问的URL为http://localhost:80/index.jsp 或者 http://localhost/index.jsp。
　　
