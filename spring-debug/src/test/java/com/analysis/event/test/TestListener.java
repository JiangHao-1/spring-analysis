package com.analysis.event.test;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class TestListener implements ApplicationListener<TestEvent>{


	@Override
	public void onApplicationEvent(TestEvent event) {
		System.out.println("监听到事件："+ event.getType()+ "");
	}

}
