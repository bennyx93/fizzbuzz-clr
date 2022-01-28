package com.bennychan.clr.fizzbuzz;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class FizzbuzzApplication {

	public static void main(String[] args) {
		SpringApplication.run(FizzbuzzApplication.class, args);
	}

	@Bean
	public CommandLineRunner run() {
		return args -> {
			for (int i = 1; i <= 100; i++) {
				if (i % 3 == 0 && i % 5 == 0) {
					System.out.println("FizzBuzz");
				}
				else if (i % 5 == 0) {
					System.out.println("Buzz");
				}
				else if (i % 3 == 0) {
					System.out.println("Fizz");
				}
				else {
					System.out.println(i);
				}
			}
		};
	}

}
