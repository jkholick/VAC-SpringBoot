package com.hkbk.QAS;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class QasApplication {

	public static void main(String[] args) {
		SpringApplication.run(QasApplication.class, args);
	}

}
