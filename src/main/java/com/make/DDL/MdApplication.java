package com.make.DDL;

import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableBatchProcessing
public class MdApplication {

	public static void main(String[] args) {
		SpringApplication.run(MdApplication.class, args);
	}

}
