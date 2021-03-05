package com.analysis.event.test;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.core.testfixture.stereotype.Component;

@Component
public class TestEventPublisher implements ApplicationEventPublisherAware {
	private ApplicationEventPublisher applicationEventPublisher;

	@Override
	public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
		this.applicationEventPublisher = applicationEventPublisher;
	}

	/**
	 * 发布事件
	 */
	public void publishEvent(TestEvent testEvent) {
		System.out.println("开始发布 testEvent 事件");
		this.applicationEventPublisher.publishEvent(testEvent);
	}
}
