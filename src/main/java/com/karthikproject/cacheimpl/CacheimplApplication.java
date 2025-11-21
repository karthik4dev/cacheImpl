package com.karthikproject.cacheimpl;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cloud.openfeign.EnableFeignClients;


@EnableCaching
@SpringBootApplication
@EnableFeignClients
@OpenAPIDefinition(info = @Info(title = "Employee API",description = "Used to fetch Employee Details",version = "1.0",summary = "Just a little project used to build all these things"
,contact = @Contact(name = "Karthik P N ", email="ldhfdas@gmail.com")))
public class CacheimplApplication {
	private static final Logger log = LoggerFactory.getLogger(CacheimplApplication.class);

	public static void main(String[] args) {
		log.info(String.valueOf(SpringApplication.run(CacheimplApplication.class, args)));

	}

}
