package com.bootcamp.credit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CreditApplication {

	public static void main(String[] args) {
		System.setProperty("jdk.tls.client.protocols","TLSv1.2");
		SpringApplication.run(CreditApplication.class, args);
	}

}
