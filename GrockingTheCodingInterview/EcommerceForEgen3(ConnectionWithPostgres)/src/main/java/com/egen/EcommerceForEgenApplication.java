package com.egen;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;

@SpringBootApplication
@EnableJpaRepositories
public class EcommerceForEgenApplication {

	public static void main(String[] args) {
		SpringApplication.run(EcommerceForEgenApplication.class, args);
	}

}
