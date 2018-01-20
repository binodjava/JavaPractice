package com.jlcindia.spring;

import org.springframework.context.ApplicationEvent;

public class BatchEvent extends ApplicationEvent {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Batch batch;

	public BatchEvent(Object source, Batch batch) {
		super(source);
		this.batch = batch;

	}

	public Batch getBatch() {
		return batch;
	}

}
