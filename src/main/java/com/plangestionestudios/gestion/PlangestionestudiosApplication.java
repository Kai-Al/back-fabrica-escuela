package com.plangestionestudios.gestion;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class PlangestionestudiosApplication {

	public static void main(String[] args) {
		SpringApplication.run(PlangestionestudiosApplication.class, args);
	}

	@Bean
	public WebMvcConfigurer corsConfigurer() {
		return new WebMvcConfigurer() {
			@Override
			public void addCorsMappings(CorsRegistry registry) {
				registry.addMapping("/**")
						.allowedOrigins("http://127.0.0.1:5500", "http://localhost:5500",
								"http://127.0.0.1:3000", "http://localhost:3000",
								"https://pla-udea-front.vercel.app")
						.allowedMethods("*")
						.allowedHeaders("*");
			}
		};
	}

}
