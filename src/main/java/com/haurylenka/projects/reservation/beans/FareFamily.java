package com.haurylenka.projects.reservation.beans;

import java.io.Serializable;
import java.util.List;

public class FareFamily implements Serializable {

	private static final long serialVersionUID = 1L;
	private String fareFamilyCode;
	private List<AncillaryAirComponent> components;
	
	public String getFareFamilyCode() {
		return fareFamilyCode;
	}
	
	public void setFareFamilyCode(String fareFamilyCode) {
		this.fareFamilyCode = fareFamilyCode;
	}
	
	public List<AncillaryAirComponent> getComponents() {
		return components;
	}
	
	public void setComponents(List<AncillaryAirComponent> components) {
		this.components = components;
	}
	
}