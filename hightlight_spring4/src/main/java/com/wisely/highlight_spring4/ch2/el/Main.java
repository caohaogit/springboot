package com.wisely.highlight_spring4.ch2.el;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ElConfig.class);
		
		
		DemoService demoService = context.getBean(DemoService.class);
		System.out.println(demoService.getAnother());
		
		context.close();
	}

}
