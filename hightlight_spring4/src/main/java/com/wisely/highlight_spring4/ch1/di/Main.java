package com.wisely.highlight_spring4.ch1.di;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DiConfig.class);
		
		
		UseFunctionService useFunctionService = context.getBean(UseFunctionService.class);
		String word = "word";
		String result = useFunctionService.SayHello(word);
		
		System.out.println(result);
		
		context.close();
	}

}
