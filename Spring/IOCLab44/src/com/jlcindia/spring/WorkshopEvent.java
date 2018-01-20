package com.jlcindia.spring;

import org.springframework.context.ApplicationEvent;

public class WorkshopEvent extends ApplicationEvent {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Workshop ws;

	public WorkshopEvent(Object source, Workshop ws) {
		super(source);
		this.ws = ws;
	}

	public Workshop getWorkshop() {
		return ws;
	}

}
