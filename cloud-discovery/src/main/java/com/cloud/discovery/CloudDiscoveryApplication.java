package com.cloud.discovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**在启动类上加入@EnableEurekaServer注解，声明这是一个服务注册中心。
 *在启动类中加入WebSecurityConfigure方法，忽略csrf验证。
 */

@EnableEurekaServer
@SpringBootApplication
public class CloudDiscoveryApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudDiscoveryApplication.class, args);
	}

	/*@EnableWebSecurity
	static class WebSecurityConfigure extends WebSecurityConfigurerAdapter {
		@Override
		protected void configure(HttpSecurity http) throws Exception {
			// 在/eureka/**端点忽略csrf验证
			http.csrf().ignoringAntMatchers("/eureka/**");
			// 配置使请求需要通过httpBasic或form验证
			http.authorizeRequests().anyRequest()
					.authenticated()
					.and()
					.formLogin()
					.and()
					.httpBasic();
			super.configure(http);
		}
	}*/




}
