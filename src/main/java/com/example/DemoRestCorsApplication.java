package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.mvc.method.annotation.AbstractJsonpResponseBodyAdvice;

@SpringBootApplication
public class DemoRestCorsApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoRestCorsApplication.class, args);
	}
	
	@ControllerAdvice
	public class JsonpControllerAdvice 
	  extends AbstractJsonpResponseBodyAdvice {
	    public JsonpControllerAdvice() {
	        super("callback");
	    }
	}
	
}

