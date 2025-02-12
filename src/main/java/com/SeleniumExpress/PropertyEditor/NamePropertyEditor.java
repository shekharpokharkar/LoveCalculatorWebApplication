package com.SeleniumExpress.PropertyEditor;

import java.beans.PropertyEditorSupport;

public class NamePropertyEditor extends PropertyEditorSupport {

	@Override
	public void setAsText(String country) throws IllegalArgumentException {
		
		String upperCase = country.toUpperCase();
		setValue(upperCase);
		
	}

	
	
}
