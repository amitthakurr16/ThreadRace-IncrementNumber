package com.test.threadracing;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * @author amit
 * below is the entry point for the application
 */

@SpringBootApplication
@ComponentScan({"com.test"})
public class ThreadRacingApplication {

	public static void main(String[] args) {
		SpringApplication.run(ThreadRacingApplication.class, args);
	}

}
