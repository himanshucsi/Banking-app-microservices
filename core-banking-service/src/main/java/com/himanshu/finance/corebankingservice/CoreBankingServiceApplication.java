package com.himanshu.finance.corebankingservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@EnableEurekaClient
@SpringBootApplication
public class CoreBankingServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CoreBankingServiceApplication.class, args);
	}

}
