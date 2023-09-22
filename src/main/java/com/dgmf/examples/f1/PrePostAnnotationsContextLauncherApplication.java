package com.dgmf.examples.f1;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
class SomeClass {
	private SomeDependency someDependency;

	public SomeClass(SomeDependency someDependency) {
		super();
		this.someDependency = someDependency;

		System.out.println("All Dependencies are ready !");
	}

	// @PostConstruct ==> Used after dependency injection is done to
	// perform any initialization
	@PostConstruct
	public void initialize() {
		someDependency.getReady();
	}

	// Used to signal that the instance is in the process of
	// being removed by the container
	@PreDestroy
	public void cleanup() {
		System.out.println("Cleanup");
	}
}

@Component
class SomeDependency {
	public void getReady() {
		System.out.println("Some Logic using SomeDependency Class");
	}
}

@Configuration
@ComponentScan
public class PrePostAnnotationsContextLauncherApplication {
	public static void main(String[] args) {
		try (var context = new AnnotationConfigApplicationContext(
                PrePostAnnotationsContextLauncherApplication.class)
        ) {
			Arrays.stream(context.getBeanDefinitionNames())
				.forEach(System.out::println);
		}
	}
}
