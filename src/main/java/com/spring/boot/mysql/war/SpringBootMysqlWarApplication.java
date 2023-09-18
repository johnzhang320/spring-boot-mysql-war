package com.spring.boot.mysql.war;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 Deploy to external Tomcat
		 Step 1
		 start.spring.io website
		 select maven --> 2.7.10--> War (not select Jar) which generate
		 ServletInitializer class
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-tomcat</artifactId>
			<scope>provided</scope>
			</dependency>
		<packing>war</packing>

		--> Java 1.8 (tomcat 9.0.73 matched it)

		Step 2
		in pom.xml , add <finalName>spring-boot-mysql-war</finalName> below <builder></builder>

		Step 3
		in properties.application , add (dev, product, test)
		spring.profiles.active=dev
        copy MySQL connection from other application.properties

		Step 4
		mvn clean install and ctrl-c in catalina.sh run terminal window

		Step 5

		copy pate spring-boot-mysql-war.war file from target to

		/Users/jianzhang/apache-tomcat-9.0.73/webapps

		Step 6
		in /Users/jianzhang/apache-tomcat-9.0.73/bin
		catalina.sh run
		ensure spring mark photo show up

		Step 7

		in http://localhost/manager, enable the 'start' on spring-boot-war

		Step 8

		http://localhost:3101/spring-boot-mysql-war/

		running result

		Hello johnzhangWelcome Spring War Demo

		Note 1: war project  can not be running in Intellij embedded tomcat !!!!
		Note 2: without stop tomcat, delete previous war file and director, paste new war file
		also work !!!!!
		*/

/**
 *   AWS EC2 tomcat 9.0.72 install
 *   step 1
 *   I created EC2 with security group kayser-group and
 *   kaypair is ~/AWSDeployNotes/AWS_EC2$/keypair_new_ip.pem
 *   public IP address is : 34.217.24.59
 *   cd ~/AWSDeployNotes/AWS_EC2$/
 *   sudo ssh -i keypair_new_ip.pem ec2-user@34.217.24.59
 *
 *   sudo yum install java-1.8*
 *
 *   sudo su -
 *   cd /
 *   cd /opt
 *
 *   wget https://dlcdn.apache.org/tomcat/tomcat-9/v9.0.72/bin/apache-tomcat-9.0.72.tar.gz
 *
 *   tar -vxf apache-tomcat-9.0.72.tar.gz
 *
 *   sudo chmod 755 apache-tomcat-9.0.72/bin
 *
 *   find -name context.xml
 *
 *   vi ./webapps/examples/META-INF/context.xml
 *   vi ./webapps/host-manager/META-INF/context.xml
 *   vi ./webapps/manager/META-INF/context.xml
 *
 *
 */

@SpringBootApplication

public class SpringBootMysqlWarApplication {
	public static void main(String[] args) {
		SpringApplication.run(SpringBootMysqlWarApplication.class, args);
	}
}
