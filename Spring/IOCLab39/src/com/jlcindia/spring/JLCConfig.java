package com.jlcindia.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@PropertySource(value = { "classpath:common.properties",
		"classpath:mysql.properties", "classpath:oracle.properties" })
public class JLCConfig {
	@Autowired
	private Environment env;
	@Autowired
	private String password;
	@Value("{jlc.min}")
	private int min;
	@Value("{jlc.max}")
	private int max;
	@Value("{jlc.timeout}")
	private int timeout;
	
	@Bean(name="mysqlIDS")
	public DataSource mySqlDataSource(){
		DataSource ds=new DataSource();
		ds.setDriverClass(env.g);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
