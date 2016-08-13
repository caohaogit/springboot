package com.wisely.highlight_spring4.ch2.event;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class DemoListener implements ApplicationListener<DemoEvent> {

	
	
	@Override
	public void onApplicationEvent(DemoEvent event) {
		// TODO Auto-generated method stub
		System.out.println("DemoListener receive event "+event.getMsg());
	}


}
