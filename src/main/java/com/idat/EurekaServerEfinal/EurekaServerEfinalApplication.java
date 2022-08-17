package com.idat.EurekaServerEfinal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class EurekaServerEfinalApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaServerEfinalApplication.class, args);
	}

}
