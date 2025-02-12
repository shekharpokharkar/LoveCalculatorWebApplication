package com.SeleniumExpress.controller;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Currency;
import java.util.Date;
import java.util.List;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.beans.propertyeditors.CustomNumberEditor;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.SeleniumExpress.Annotation.EmailValidator;
import com.SeleniumExpress.DTO.BillDTO;
import com.SeleniumExpress.DTO.CommunicationDTO;
import com.SeleniumExpress.DTO.CreaditCard;
import com.SeleniumExpress.DTO.Phone;
import com.SeleniumExpress.DTO.RegistrationDTO;
import com.SeleniumExpress.PropertyEditor.CreditCardEditor;
import com.SeleniumExpress.PropertyEditor.CurrencyEditor;
import com.SeleniumExpress.PropertyEditor.NamePropertyEditor;

import jakarta.validation.Valid;

@Controller
public class RegistrationController {

	@RequestMapping("/Registration")
	public String showRegistraionPage(@ModelAttribute("Registration") RegistrationDTO dto) {

		Phone phone = new Phone();
		phone.setCountryCode("91");
		phone.setPhoneNumber("888888888");

		CommunicationDTO dto1 = new CommunicationDTO();
		dto1.setPhone(phone);
		
		dto.setContact(dto1);

		CreaditCard card = new CreaditCard();
		card.setFirstFourNumber(1111);
		card.setSecondFourNumber(2222);
		card.setThirdFourNumber(3333);
		card.setFourthFourNumber(4444);
		
		
		
		
		BigDecimal decimal=new BigDecimal(5263);
		
		BillDTO bills=new BillDTO();
		
		
		bills.setCreditcard(card);
		
		dto.setDetails(bills);
		
		return "Registration";
	}

	@RequestMapping("/processRegistration")
	public String processLoginPage(@Valid @ModelAttribute("Registration") RegistrationDTO dto,BindingResult result) {

		if(result.hasErrors())
		{
			List<ObjectError> allErrors = result.getAllErrors();
			for(ObjectError str:allErrors)
			{
				System.out.println(str);
			}
			return "Registration";
		}
		System.out.println("DTO" + dto);

		return "Registration-Success";
	}
	
	@InitBinder
	public void init(WebDataBinder binder)
	{
		System.out.println("Inside Init Binder ");
		
		SimpleDateFormat format=new SimpleDateFormat("dd/MM/yyyy");
		CustomDateEditor editor=new CustomDateEditor(format, true);
		binder.registerCustomEditor(Date.class,"details.date", editor);
		
		NumberFormat numberformat=new DecimalFormat("##,###.00");
		CustomNumberEditor numbureditor=new CustomNumberEditor(BigDecimal.class,numberformat,true);
		binder.registerCustomEditor(BigDecimal.class,"details.amount", numbureditor);
		
		
		StringTrimmerEditor editor1=new StringTrimmerEditor(true);
		binder.registerCustomEditor(String.class,"userName" , editor1);
		
		//Custom Property Editor
		NamePropertyEditor nameEditor=new NamePropertyEditor();
		binder.registerCustomEditor(String.class, "country", nameEditor);
		
		CurrencyEditor c = new CurrencyEditor();
		binder.registerCustomEditor(Currency.class, "details.currency", c);
		
		CreditCardEditor credit =new CreditCardEditor();
		binder.registerCustomEditor(CreaditCard.class, "details.creditcard",credit);
		
		EmailValidator email=new EmailValidator();
		binder.addValidators(email);
		
	}
	
}
