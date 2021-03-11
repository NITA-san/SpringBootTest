package com.example.demo;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.ServletComponentScan;

@ServletComponentScan
@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		// SpringApplication app = new SpringApplication(DemoApplication.class);
		// app.setBannerMode(Banner.Mode.OFF);
		// app.run(args);
		new SpringApplicationBuilder(DemoApplication.class).profiles("server").properties("transport=local").run(args);
	}

}
