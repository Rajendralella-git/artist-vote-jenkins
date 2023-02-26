package com.artist.vote.demo;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ArtistVoteApplication {
	private static Logger logger = LoggerFactory.getLogger(ArtistVoteApplication.class);
	
	@PostConstruct
	public void init() {
		logger.info("application started");
	}

	public static void main(String[] args) {
		logger.info("Test");
		SpringApplication.run(ArtistVoteApplication.class, args);
	}
}
