package com.fatou.microservices.springcloudconfigserver3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;


@EnableConfigServer
@SpringBootApplication
public class SpringCloudConfigServer3Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudConfigServer3Application.class, args);
	}

}
