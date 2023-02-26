package com.artist.vote.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ArtistVoteApplication {
	private static Logger logger = LoggerFactory.getLogger(ArtistVoteApplication.class);

	public static void main(String[] args) {
		logger.info("Test");
		SpringApplication.run(ArtistVoteApplication.class, args);
	}
}
