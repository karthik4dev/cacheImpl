package com.karthikproject.cacheimpl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cloud.openfeign.EnableFeignClients;


@EnableCaching
@SpringBootApplication
@EnableFeignClients
public class CacheimplApplication {
	private static final Logger log = LoggerFactory.getLogger(CacheimplApplication.class);

	public static void main(String[] args) {
		log.info(String.valueOf(SpringApplication.run(CacheimplApplication.class, args)));

	}

}
