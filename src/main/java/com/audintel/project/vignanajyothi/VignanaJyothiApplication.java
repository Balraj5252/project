package com.audintel.project.vignanajyothi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = "com.audintel")
@EntityScan("com.audintel.project.domain")
@EnableJpaRepositories("com.audintel.project.repository")
public class VignanaJyothiApplication {

	public static void main(String[] args) {
		SpringApplication.run(VignanaJyothiApplication.class, args);
	}

}
