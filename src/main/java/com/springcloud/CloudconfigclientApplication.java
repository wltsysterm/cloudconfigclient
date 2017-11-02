package com.springcloud;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
@EnableEurekaClient
@SpringBootApplication
public class CloudconfigclientApplication {
	@Value("${demo.word:default-value}")
	String strDemoWord;
	@RequestMapping("/detail")
	public String Detail(){
		return "## The detail information about: Organization : with demo word: "+strDemoWord;
	}
	public static void main(String[] args) {
		SpringApplication.run(CloudconfigclientApplication.class, args);
	}
}
