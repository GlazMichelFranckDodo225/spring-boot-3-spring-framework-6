package com.dgmf.learnspringframework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

// Eliminate verbosity in creating Java Bean
// Public accessor methods, constructor, equals, hashcode
// and toString are automatically created.
// Released in JDK 16
record Person(String name, int age) {};
record Address(String firstLine, String city) {};

@Configuration
public class HelloWorldConfiguration {
	@Bean
	public String name() {
		return "Ranga";
	}
	
	@Bean
	public int age() {
		return 15;
	}
	
	@Bean
	public Person person() {
		return new Person("Ravi", 20);
		
	}
	
	@Bean
	public Person person2MethodCall() {
		return new Person(name(), age());
		
	}
	
	@Bean(name = "address2")
	public Address address() {
		return new Address("Baker Street", "London");
	}
}
