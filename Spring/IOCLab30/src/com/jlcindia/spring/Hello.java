package com.jlcindia.spring;

import org.springframework.beans.factory.annotation.Required;

public class Hello {

	private A aobj;
	private B bobj;

	@Required
	public void setAobj(A aobj) {
		System.out.println("Hello->setAobj()");
		this.aobj = aobj;
	}

	/*
	 * The @Required annotation applies to bean property setter methods and it
	 * indicates that the affected bean property must be populated in XML
	 * configuration file at configuration time. Otherwise, the container throws
	 * a BeanInitializationException exception. Following is an example to show
	 * the use of @Required annotation.
	 * 
	 * @Required
	 */
	@Required
	public void setBobj(B bobj) {
		System.out.println("Hello->setBobj()");
		this.bobj = bobj;
	}

	public void show() {
		System.out.println(aobj);
		System.out.println(bobj);
	}
}
