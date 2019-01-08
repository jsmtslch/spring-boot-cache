package com.example.learn.cache;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class SpringBootCacheApplication implements CommandLineRunner {
	
	@Autowired
	BookRepo bookRepo;
	
	Logger logger = LoggerFactory.getLogger(this.getClass());

	public static void main(String[] args) {
		SpringApplication.run(SpringBootCacheApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		logger.info("...............Fetching Books");
		logger.info("ISBN: 1234->"+bookRepo.getByIsbn("1234"));
		logger.info("ISBN: 1234->"+bookRepo.getByIsbn("1234"));
		logger.info("ISBN: 1234->"+bookRepo.getByIsbn("1234"));
		logger.info("ISBN: 1234->"+bookRepo.getByIsbn("1234"));
		logger.info("ISBN: 4567->"+bookRepo.getByIsbn("4567"));
		logger.info("ISBN: 9876->"+bookRepo.getByIsbn("9876"));
		logger.info("ISBN: 1234->"+bookRepo.getByIsbn("1234"));
		logger.info("ISBN: 1234->"+bookRepo.getByIsbn("1234"));
		logger.info("ISBN: 1234->"+bookRepo.getByIsbn("1234"));
		logger.info("ISBN: 1234->"+bookRepo.getByIsbn("1234"));
		logger.info("ISBN: 4567->"+bookRepo.getByIsbn("4567"));
		logger.info("ISBN: 4567->"+bookRepo.getByIsbn("4567"));
		logger.info("ISBN: 4567->"+bookRepo.getByIsbn("4567"));
		logger.info("ISBN: 4567->"+bookRepo.getByIsbn("4567"));
	}

}

