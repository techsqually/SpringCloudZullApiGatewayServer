package com.techsquelly.practice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.cloud.netflix.zuul.EnableZuulServer;

@EnableZuulProxy
@EnableZuulServer
@EnableEurekaClient
@SpringBootApplication
public class SpringCloudZullApiGatewayServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudZullApiGatewayServerApplication.class, args);
	}

}
