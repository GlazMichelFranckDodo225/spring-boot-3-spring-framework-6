package com.dgmf.learnspringframework.examples.c1;

import com.dgmf.learnspringframework.examples.a1.DependencyInjectionLauncherApplication;
import com.dgmf.learnspringframework.examples.c1.service.BusinessCalculationService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
@ComponentScan
public class RealWorldSpringContextLauncherApplication {
	public static void main(String[] args) {
		try (var context = new AnnotationConfigApplicationContext(
				// DependencyInjectionLauncherApplication.class
				RealWorldSpringContextLauncherApplication.class)) {
			Arrays.stream(context.getBeanDefinitionNames())
				.forEach(System.out::println);

			System.out.println(context.getBean(BusinessCalculationService.class).findMax());
		}

	}

}
