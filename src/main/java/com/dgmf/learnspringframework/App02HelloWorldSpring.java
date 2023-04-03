package com.dgmf.learnspringframework;

import java.sql.Array;
import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02HelloWorldSpring {

	public static void main(String[] args) {
		// 1 - Launch a Spring Context (IoC Container )
		var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);
		// 2 - Configure the Objects that we want Spring to manage 
		// - HelloWorldConfiguration (@Configuration)
		// - name (method) (@Bean)
		// 3 - Retrieving Beans manage by Spring
		System.out.println(context.getBean("name"));
		System.out.println(context.getBean("age"));
		System.out.println(context.getBean("person"));
		System.out.println(context.getBean("person2MethodCall"));
		System.out.println(context.getBean("person3Parameters"));
		System.out.println(context.getBean("address2"));
		System.out.println(context.getBean("address3"));
		
		// Afficher les noms de tous les Beans créés dans l'application
		// context.getBeanDefinitionNames() ==> retourne String[]
		Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);;

	}

}
