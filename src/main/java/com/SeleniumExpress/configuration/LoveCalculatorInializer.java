package com.SeleniumExpress.configuration;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class LoveCalculatorInializer extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		Class[] clr = { LoveCalculatorConfiguration.class };
		return clr;
	}

	@Override
	protected String[] getServletMappings() {
		String str[] = { "/" };
		return str;
	}

}
