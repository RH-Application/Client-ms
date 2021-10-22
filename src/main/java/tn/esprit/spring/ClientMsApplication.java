package tn.esprit.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
@SpringBootApplication
@EnableEurekaClient
@EnableJpaRepositories("tn.esprit.spring.repository")


public class ClientMsApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClientMsApplication.class, args);
	}

}
