package com.jlcindia.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/*container will search instance with name 'ao' and 'bo' in hello bean but it's not define in config file.
so will throw error.
just mention config file name with instance aobj and bobj. it will run. 
*/
public class Lab27 {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"jlcindia.xml");
		Hello hello = (Hello) ctx.getBean("hello");
		hello.show();
	}

}
