package com.haurylenka.projects.reservation.beans;

import java.io.Serializable;

public class Payment implements Serializable {

	private static final long serialVersionUID = 1L;
	private String amountPaid;
	private String formOfPaymentTypeCode;
	private String currencyCode;
	
	public String getAmountPaid() {
		return amountPaid;
	}
	
	public void setAmountPaid(String amountPaid) {
		this.amountPaid = amountPaid;
	}
	
	public String getFormOfPaymentTypeCode() {
		return formOfPaymentTypeCode;
	}
	
	public void setFormOfPaymentTypeCode(String formOfPaymentTypeCode) {
		this.formOfPaymentTypeCode = formOfPaymentTypeCode;
	}
	
	public String getCurrencyCode() {
		return currencyCode;
	}
	
	public void setCurrencyCode(String currencyCode) {
		this.currencyCode = currencyCode;
	}
	
}