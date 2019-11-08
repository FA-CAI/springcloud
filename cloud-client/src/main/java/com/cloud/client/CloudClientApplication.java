package com.cloud.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;


/**在启动类上加入@EnableDiscoveryClient注解，声明该微服务注册到服务注册中心。
 加入@EnableFeignClients，声明使用Feign调用接口。
 * */


@EnableFeignClients
@EnableDiscoveryClient
@SpringBootApplication
public class CloudClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudClientApplication.class, args);
	}

}
