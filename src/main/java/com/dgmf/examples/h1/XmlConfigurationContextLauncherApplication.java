package com.dgmf.examples.h1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;

// @Configuration ==> Java-Based Config
// @ComponentScan ==> Java-Based Config
public class XmlConfigurationContextLauncherApplication {
	public static void main(String[] args) {
		try (var context =
					// Xml-Based Config
                     new ClassPathXmlApplicationContext(
							 "contextConfiguration.xml"
					 )
        ) {
			/*Arrays.stream(context.getBeanDefinitionNames())
				.forEach(System.out::println);*/
			System.out.println(context.getBean("name"));
			System.out.println(context.getBean("age"));
		}

	}

}
