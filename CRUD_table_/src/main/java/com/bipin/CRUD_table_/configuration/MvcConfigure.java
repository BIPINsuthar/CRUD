package com.bipin.CRUD_table_.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@SuppressWarnings("deprecation")
@EnableWebMvc
@Configuration
@ComponentScan({"com.bipin.CRUD_table_.controller","com.bipin.CRUD_table_.dao","com.bipin.CRUD_table_.entity"})

public class MvcConfigure extends WebMvcConfigurerAdapter
{ 
	@Bean
	public InternalResourceViewResolver viewresolver()
	{
		InternalResourceViewResolver iv=new InternalResourceViewResolver();
		iv.setPrefix("/WEB-INF/");
		iv.setSuffix(".jsp");
		return iv;
	}

}
