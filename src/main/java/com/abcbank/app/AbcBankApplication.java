package com.abcbank.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan("com.abcbank.model")
@ComponentScan("com.abcbank")
@EnableJpaRepositories("com.abcbank.repository")
public class AbcBankApplication {

	public static void main(String[] args) {
		SpringApplication.run(AbcBankApplication.class, args);
	}

}
