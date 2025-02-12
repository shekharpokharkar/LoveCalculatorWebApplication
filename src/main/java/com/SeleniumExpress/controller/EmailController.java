package com.SeleniumExpress.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.SeleniumExpress.DTO.EmailDTO;
import com.SeleniumExpress.DTO.LoginDTO;
import com.SeleniumExpress.Service.EmailServiceImpl;

@Controller
@SessionAttributes("Login")
public class EmailController {

	@Autowired
	private EmailServiceImpl service;

	@RequestMapping("/sendEmail")
	public String sendEmail(@SessionAttribute("Login") LoginDTO dto, @ModelAttribute("EmailDTO") EmailDTO email) {

		System.out.println("UserName:" + dto.getUserName());

		return "show-Email";
	}

	@RequestMapping("/processEmail")
	public String processEmail(@SessionAttribute("Login") LoginDTO dto, @ModelAttribute("EmailDTO") EmailDTO email,
			Model model) {

		String user = "Mr." + dto.getUserName();

		String email2 = email.getUserEmail();

		model.addAttribute("user", user);

		try {
			service.sendEmail(dto.getUserName(), email.getUserEmail(), dto.getResult());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "result-Email";
	}
}
