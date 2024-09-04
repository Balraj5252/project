package com.audintel.project.vignanajyothi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication(scanBasePackages = "com.audintel")
@EntityScan("com.audintel.project.domain")
public class VignanaJyothiApplication {

	public static void main(String[] args) {
		SpringApplication.run(VignanaJyothiApplication.class, args);
	}

}
