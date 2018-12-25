package com.anfachina.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author lengleng
 */
@EnableEurekaServer
@SpringBootApplication
public class AnfaEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(AnfaEurekaApplication.class, args);
	}
}
