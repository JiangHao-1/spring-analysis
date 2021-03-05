package com.analysis.event.test;

import org.springframework.context.ApplicationEvent;

public class TestEvent extends ApplicationEvent {

	private  String type;

	/**
	 * Create a new {@code ApplicationEvent}.
	 *
	 * @param source the object on which the event initially occurred or with
	 *               which the event is associated (never {@code null})
	 */
	public TestEvent(Object source,String type) {
		super(source);
		this.type= type;
	}

	public String getType() {
		return this.type;
	}
}
