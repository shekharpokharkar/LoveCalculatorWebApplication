package com.SeleniumExpress.configuration;

import java.util.Properties;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.core.env.Environment;
import org.springframework.format.FormatterRegistry;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.validation.Validator;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import com.SeleniumExpress.Formatter.PhoneNumberFormatter;

@EnableWebMvc
@Configuration
@ComponentScan(basePackages = "com.SeleniumExpress")
@PropertySource("classpath:email.properties")
public class LoveCalculatorConfiguration implements WebMvcConfigurer {

	Logger logger = Logger.getLogger(LoveCalculatorConfiguration.class.getName());

	@Autowired
	private Environment env;

	@Bean
	public InternalResourceViewResolver viewResolver() {
		InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
		viewResolver.setPrefix("/WEB-INF/views/");
		viewResolver.setSuffix(".jsp");
		return viewResolver;
	}

	@Bean
	public JavaMailSenderImpl getJavaMailSenderMail() {
		JavaMailSenderImpl mailsender = new JavaMailSenderImpl();

		logger.info("Host:" + env.getProperty("mail.Host"));
		logger.info("port:" + env.getProperty("mail.port"));
		logger.info("password:" + env.getProperty("mail.password"));
		logger.info("userName:" + env.getProperty("mail.userName"));

		mailsender.setHost(env.getProperty("mail.Host"));
		mailsender.setPort(getIntProperty("mail.port"));
		mailsender.setPassword(env.getProperty("mail.password"));
		mailsender.setUsername(env.getProperty("mail.userName"));

		mailsender.setJavaMailProperties(getProperty());

		return mailsender;
	}

	private int getIntProperty(String key) {

		String property = env.getProperty(key);
		return Integer.parseInt(property);
	}

	private Properties getProperty() {
		Properties pro = new Properties();
		pro.put("mail.smtp.starttls.enable", true);
		pro.put("mail.smtp.ssl.trust", "smtp.gmail.com");
		return pro;
	}

	@Override
	public void addFormatters(FormatterRegistry registry) {
		System.out.println("Inside Addformatter of LCAppConfiguration");
		registry.addFormatter(new PhoneNumberFormatter());
		// registry.addFormatter(new CreaditCardFormatter());

	}

	@Bean
	public MessageSource messageSource() {
		ResourceBundleMessageSource messageSource = new ResourceBundleMessageSource();
		messageSource.setBasename("message");
		return messageSource;
	}

	@Bean
	public LocalValidatorFactoryBean validator() {
		LocalValidatorFactoryBean bean = new LocalValidatorFactoryBean();
		bean.setValidationMessageSource(messageSource());
		return bean;
	}

	@Override
	public Validator getValidator() {

		return validator();
	}

}
