package com.SeleniumExpress.PropertyEditor;

import java.beans.PropertyEditorSupport;
import java.util.Currency;

public class CurrencyEditor extends PropertyEditorSupport {

	@Override
	public void setAsText(String currency) throws IllegalArgumentException {
		System.out.println("+++++++++++++++++++++++++++++");
		System.out.println(currency);
		Currency instance = Currency.getInstance(currency.toUpperCase());
		System.out.println(instance);
		System.out.println("+++++++++++++++++++++++++++++");
		setValue(instance);
		
		
	}

	
	
}
