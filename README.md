# springboot-mybatis

refer: http://blog.csdn.net/gebitan505/article/details/44455235/

##Java and Eclipse

###Maven
The maven central repository is slow, we can use the Aly yun mirror to speed up

n##Tips:
1. The import package could not find, but it's included in the Maven dependency already. The root cause is: The repository in the .m2 is damanged.
## SpringMVC
### Controller
#### RequestMapping
1. 在controller里，如果要转到其他view：
    return "redirect:/users/";

#### Validation
I
#### Anthentication & Authorization

### View#### Layout
refer: https://github.com/ultraq/thymeleaf-layout-dialect

 layout:decorate="~{layout.html}"

layout:fragment="content"
    
##MyBatis 

##CentOS setup:

###Network:

http://www.linuxidc.com/Linux/2017-01/139345.htm

###Docker
Docker镜像加速：
墙内访问Docker Hub的速度太慢，使用阿里云加速
https://cr.console.aliyun.com/?spm=5176.100239.blogcont29941.13.gDdHkf#/accelerator

http://blog.csdn.net/bwlab/article/details/50542261

*启动Mysql docker

sudo docker run --name test-mysql -p 3306:3306 -e MYSQL_ROOT_PASSWORD=test123456 -d mysql

之后：
sudo docker start test-mysql

###Linux 常用命令：

http://jingyan.baidu.com/article/ae97a646b70aabbbfd461d3e.html


##MySQL

客户端管理工具
http://www.codesec.net/view/173285.html


## Deployment

mvn pakcage

set the firewall:

sudo firewall-cmd --permanent --zone=public --add-port=8080/tcp

sudo systemctl disable firewalld

sudo systemctl stop firewalld

sudo systemctl start firewalld

sudo systemctl eanble firewalld


SSH Secure File Transfer Client传送文件
http://jingyan.baidu.com/article/19192ad815fd0ee53e570719.html

upload to /var/apps


Insall jdk: 
sudo yum -y install java-1.8.0-openjdk*

java -jar ssm-0.0.1-SNAPSHOT.jar

verify the web service is working:
curl 127.0.0.1:8080
