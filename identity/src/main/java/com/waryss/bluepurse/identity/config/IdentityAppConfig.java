package com.waryss.bluepurse.identity.config;

import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class IdentityAppConfig {

	public static void main(String[] args) {
		SpringApplication.run(IdentityAppConfig.class, args);
	}
}
