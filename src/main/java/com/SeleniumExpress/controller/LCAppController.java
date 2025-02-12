package com.SeleniumExpress.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.SeleniumExpress.DTO.LoginDTO;
import com.SeleniumExpress.Service.LCAppService;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.validation.Valid;

@Controller
@SessionAttributes("Login")
public class LCAppController {

	@Autowired
	private LCAppService service;
	
	@RequestMapping("/login")
	public String showLoginPage(Model model/* @ModelAttribute("Login") LoginDTO dto,HttpServletRequest request */) {

		/*
		 * Cookie[] cookies = request.getCookies(); for(Cookie temp:cookies) {
		 * if("LCUserName".equals(temp.getName())) { String userName = temp.getValue();
		 * dto.setUserName(userName); } }
		 */
		
		model.addAttribute("Login", new LoginDTO());
		return "Login";
	}

	@RequestMapping("/processLogin")
	public String processLoginPage(Model model, @Valid LoginDTO dto ,BindingResult result,/*HttpServletResponse response*/HttpServletRequest request) {
		
		model.addAttribute("Login", dto);
		model.addAttribute(BindingResult.MODEL_KEY_PREFIX+"Login",result);
		
		
		if (result.hasErrors()) {
			List<ObjectError> allErrors = result.getAllErrors();
			
			for (ObjectError str : allErrors) {
				System.out.println(str);
			}
			return "Login";
		}

		//create cookie and in model attribute
		
		/*
		 * Cookie c=new Cookie("LCUserName", dto.getUserName()); c.setMaxAge(60*60*24);
		 * response.addCookie(c);
		 */
		
		/*
		 * HttpSession session = request.getSession();
		 * session.setAttribute("SesionUserName", dto.getUserName());
		 * session.setMaxInactiveInterval(120);
		 */
		
		String calculateResult = service.calculateResult(dto.getUserName(),dto.getCrushName());
		
		dto.setResult(calculateResult);
		
		return "Result";
	}
}
