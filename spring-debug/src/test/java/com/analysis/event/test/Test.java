package com.analysis.event.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args){
		System.setProperty("spring", "classpath");
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("${spring}:bean/BeanFactoryTest.xml");
		/*TestEventPublisher testEventPublisher = (TestEventPublisher)
		testEventPublisher.publishEvent(new TestEvent("我是默认对象","我是操作"));*/

	}
}
