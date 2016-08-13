package com.wisely.highlight_spring4.ch1.aop;

import org.springframework.stereotype.Service;

@Service
public class DemoMethodService {
	public void add1(){
		System.out.println("invoke DemoMethodService.add1()");
	}
	
	public void add2(){
		System.out.println("invoke DemoMethodService.add2()");
	}
	
	public void add3(){
		System.out.println("invoke DemoMethodService.add3()");
	}
}
