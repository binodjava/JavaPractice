package com.jlcindia.spring;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;
import org.springframework.web.portlet.bind.annotation.EventMapping;

@Component
public class JLCListener implements ApplicationListener {

	@Eventli
	public void onApplicationEvent(ApplicationEvent event) {
		if (event instanceof BatchEvent) {
			BatchEvent batchEvent = (BatchEvent) event;
			Batch bat = batchEvent.getBatch();
			System.out.println(bat);
		} else if (event instanceof WorkshopEvent) {
			WorkshopEvent wsEvent = (WorkshopEvent) event;
			Workshop ws = wsEvent.getWorkshop();
			System.out.println(ws);

		} else {
			System.out.println(event);
		}

	}

}
