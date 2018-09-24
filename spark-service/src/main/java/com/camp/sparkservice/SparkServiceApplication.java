package com.camp.sparkservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


@SpringBootApplication
@EnableDiscoveryClient
public class SparkServiceApplication {
 
	public static void main(String[] args) {
		SpringApplication.run(SparkServiceApplication.class, args);
	}
}