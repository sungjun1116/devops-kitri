package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class DevopsDemoApplication extends SpringBootServletInitializer {

	// 이 부분 추가
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(DevopsDemoApplication.class);
	}

	public static void main(String[] args) {
		SpringApplication.run(DevopsDemoApplication.class, args);
	}

}
