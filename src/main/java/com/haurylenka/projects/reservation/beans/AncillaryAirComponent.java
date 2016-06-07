package com.haurylenka.projects.reservation.beans;

import java.io.Serializable;

public class AncillaryAirComponent implements Serializable {

	private static final long serialVersionUID = 1L;
	private String ancillaryAirComponentCode;

	public String getAncillaryAirComponentCode() {
		return ancillaryAirComponentCode;
	}

	public void setAncillaryAirComponentCode(String ancillaryAirComponentCode) {
		this.ancillaryAirComponentCode = ancillaryAirComponentCode;
	}
	
}