package com.fk.spring.context;

import com.fk.spring.context.config.ContextConfig;
import com.fk.spring.context.service.IUserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ContextApplication {	public static void main(String[] args) {
	AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
			ContextConfig.class		);	    IUserService bean = context.getBean(IUserService.class);
			System.out.println(bean);	}}

