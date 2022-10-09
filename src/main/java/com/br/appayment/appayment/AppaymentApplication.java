package com.br.appayment.appayment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class AppaymentApplication {

	public static void main(String[] args) {
		SpringApplication.run(AppaymentApplication.class, args);
	}

}
