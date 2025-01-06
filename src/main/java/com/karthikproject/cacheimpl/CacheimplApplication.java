package com.karthikproject.cacheimpl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@EnableCaching
@SpringBootApplication
public class CacheimplApplication {

	public static void main(String[] args) {
		SpringApplication.run(CacheimplApplication.class, args);
	}

}
