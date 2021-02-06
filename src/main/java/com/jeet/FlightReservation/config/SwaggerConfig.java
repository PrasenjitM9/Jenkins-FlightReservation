package com.jeet.FlightReservation.config;

import static springfox.documentation.builders.PathSelectors.regex;

import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
public class SwaggerConfig extends WebMvcConfigurationSupport {
	
	@Bean
	public Docket productApi() {
		return new Docket(DocumentationType.SWAGGER_2).select()
				.apis(RequestHandlerSelectors.basePackage("com.jeet.FlightReservation"))
				.paths(regex("/rest.*")).build();
	}
	
	@SuppressWarnings("unused")
	private ApiInfo metaData() {
		@SuppressWarnings("deprecation")
		ApiInfo apiInfo = new ApiInfo("Spring Boot REST API", "Spring Boot REST API for Flight Reservation", "1.0", "Terms of service",
				"https://springframeworkboot.com", "Apache License Version 2.0", "https://www.apache.org/licenses/LICENSE-2.0");
		
		return apiInfo;
	}

}
