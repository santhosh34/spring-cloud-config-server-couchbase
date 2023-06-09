package com.sannette.eis.mega;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
@SpringBootApplication
@EnableConfigServer
public class SpringCloudConfigCouchbaseApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudConfigCouchbaseApplication.class, args);
	}

}
