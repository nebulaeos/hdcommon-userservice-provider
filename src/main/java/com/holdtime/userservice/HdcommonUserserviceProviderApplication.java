package com.holdtime.userservice;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableDiscoveryClient
@MapperScan("com.holdtime.framework.mybatis.mapper")
@ComponentScan({ "com.holdtime.framework.mybatis.dao", "com.holdtime.userservice" })
public class HdcommonUserserviceProviderApplication {

	public static void main(String[] args) {
		SpringApplication.run(HdcommonUserserviceProviderApplication.class, args);
	}
}
