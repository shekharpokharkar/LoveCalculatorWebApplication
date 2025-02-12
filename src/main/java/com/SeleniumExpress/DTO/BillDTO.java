package com.SeleniumExpress.DTO;

import java.math.BigDecimal;
import java.util.Currency;
import java.util.Date;

public class BillDTO {

	private CreaditCard creditcard;
	private BigDecimal amount;
	private Currency currency;
	private Date date;

	public CreaditCard getCreditcard() {
		return creditcard;
	}

	public void setCreditcard(CreaditCard creditcard) {
		this.creditcard = creditcard;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public Currency getCurrency() {
		return currency;
	}

	public void setCurrency(Currency currency) {
		this.currency = currency;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "BillDTO [creditcard=" + creditcard + ", amount=" + amount + ", currency=" + currency + ", date=" + date
				+ "]";
	}

}
