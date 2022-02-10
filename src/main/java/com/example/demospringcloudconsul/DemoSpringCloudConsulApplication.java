package com.example.demospringcloudconsul;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoSpringCloudConsulApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoSpringCloudConsulApplication.class, args);
	}

	@Bean
	CommandLineRunner commandLineRunner(@Value("${demox}") String injected) {
		return args -> System.out.println(":" + injected);
	}

}
