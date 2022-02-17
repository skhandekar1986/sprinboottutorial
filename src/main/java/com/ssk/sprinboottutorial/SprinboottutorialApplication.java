package com.ssk.sprinboottutorial;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableAsync;
@EnableAutoConfiguration
@SpringBootApplication
@ComponentScan(basePackages="com.ssk.sprinboottutorial")
public class  SprinboottutorialApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(SprinboottutorialApplication.class, args);
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(SprinboottutorialApplication.class);
	}
}
