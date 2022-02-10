package com.example.demospringcloudconsul;


import reactor.core.publisher.Mono;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@EnableConfigurationProperties(MyProperties.class)
public class DemoSpringCloudConsulApplication {

	@Value("${test:test1}")
	String variable;

	@Autowired
	MyProperties properties;

	public static void main(String[] args) {
		SpringApplication.run(DemoSpringCloudConsulApplication.class, args);
	}

	@Bean
	CommandLineRunner commandLineRunner(@Value("${demox}") String injected) {
		return args -> System.out.println(":" + injected);
	}

	@GetMapping("/test")
	Mono<String> test() {
		return Mono.just(variable);
	}

	@GetMapping("/my/test")
	Mono<String> my() {
		return Mono.just(properties.getTest());
	}

//	@GetMapping("/demo/test")
//	Mono<String> demo(){
//		return Mono.just()
//	}
}
