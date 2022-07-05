package com.exl.hackathon.cloudfilemanager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
public class CloudfilemanagerApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudfilemanagerApplication.class, args);
	}

}
