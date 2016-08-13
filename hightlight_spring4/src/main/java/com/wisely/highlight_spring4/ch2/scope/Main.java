package com.wisely.highlight_spring4.ch2.scope;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ScopeConfig.class);
		
		
		DemoPrototypeService p1 = context.getBean(DemoPrototypeService.class);
		DemoPrototypeService p2 = context.getBean(DemoPrototypeService.class);
		
		DemoSingletonService s1 = context.getBean(DemoSingletonService.class);
		DemoSingletonService s2 = context.getBean(DemoSingletonService.class);
		
		
		System.out.println("p1="+p1+",p2="+p2);
		System.out.println("s1="+s1+",s2="+s2);
		
		context.close();
	}

}
