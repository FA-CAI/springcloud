package com.cloud.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


/**
 * 在启动类上加入@EnableDiscoveryClient注解，声明该微服务注册到服务注册中心。
 * */

@EnableDiscoveryClient
@SpringBootApplication
public class CloudProviderApplication {

	public static void main(String[] args) {

		SpringApplication.run(CloudProviderApplication.class, args);
	}

}
