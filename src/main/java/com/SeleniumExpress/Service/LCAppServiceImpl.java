package com.SeleniumExpress.Service;

import org.springframework.stereotype.Service;

@Service
public class LCAppServiceImpl implements LCAppService {

	private static final String LC_App_Formula = "FLAMES";

	@Override
	public String calculateResult(String userName, String crushName) {

		int length = (userName + crushName).toCharArray().length;

		int formula = LC_App_Formula.toCharArray().length;

		int rem = length % formula;

		if (rem == 0) {
			return LoveCalculatorConstants.F_CHAR_MEANING;
		} else {
			return whatsBetweenUs(LC_App_Formula.charAt(rem));
		}

	}

	@Override
	public String whatsBetweenUs(char ch) {

		String result = null;

		if (ch == 'L') {
			result = LoveCalculatorConstants.L_CHAR_MEANING;
		} else if (ch == 'A') {
			result = LoveCalculatorConstants.A_CHAR_MEANING;
		} else if (ch == 'M') {
			result = LoveCalculatorConstants.M_CHAR_MEANING;
		} else if (ch == 'E') {
			result = LoveCalculatorConstants.E_CHAR_MEANING;
		} else {
			result = LoveCalculatorConstants.S_CHAR_MEANING;
		}

		return result;

	}

}
