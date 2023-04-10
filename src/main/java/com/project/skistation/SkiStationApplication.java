package com.project.skistation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class SkiStationApplication {

	public static void main(String[] args) {
		SpringApplication.run(SkiStationApplication.class, args);
	}

}
