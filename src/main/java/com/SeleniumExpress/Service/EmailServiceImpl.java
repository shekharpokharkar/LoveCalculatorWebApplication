package com.SeleniumExpress.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailServiceImpl implements EmailService {
	
	@Autowired
	private JavaMailSender javaMailSender;

	@Override
	public void sendEmail(String userName, String email, String result) {
		
		SimpleMailMessage message=new SimpleMailMessage();
	
		message.setSubject("Love Calculator Application Result");
		message.setText("Hii "+userName+" the result predicated by Lc App is :"+result);
		message.setTo(email);
		javaMailSender.send(message);
	}

}
