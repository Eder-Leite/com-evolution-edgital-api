package com.evolution;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import com.evolution.config.property.EvolutionApiProperty;

@SpringBootApplication
@EnableConfigurationProperties(EvolutionApiProperty.class)
public class EvolutionAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(EvolutionAppApplication.class, args);
	}

}
