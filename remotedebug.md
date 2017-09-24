# 远程调试

1.  打包。工程目录执行命令：

mvn package.

2. 上传文件到远程服务器。

3. 执行：

 java -Xdebug -Xrunjdwp:transport=dt_socket,server=y,suspend=y,address=8000 -jar ssm-0.0.1-SNAPSHOT.jar 
 
 
 注意：1）dubug端口号不要和tomcat冲突，2）注意关闭防火墙。
 
 4. Eclise 远程调试
 
 在"Debug Configurations" -> "Remote Java Application" 中添加一项，设定host 和port. 然后开始debug.
