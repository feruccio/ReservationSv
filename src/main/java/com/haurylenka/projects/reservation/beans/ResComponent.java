package com.haurylenka.projects.reservation.beans;

import java.io.Serializable;

public class ResComponent implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private String componentTypeCode;
	private String createDateTime;
	private String internalStatus;
	private int sequence;
	
	public String getComponentTypeCode() {
		return componentTypeCode;
	}
	
	public void setComponentTypeCode(String componentTypeCode) {
		this.componentTypeCode = componentTypeCode;
	}
	
	public String getCreateDateTime() {
		return createDateTime;
	}
	
	public void setCreateDateTime(String createDateTime) {
		this.createDateTime = createDateTime;
	}
	
	public String getInternalStatus() {
		return internalStatus;
	}
	
	public void setInternalStatus(String internalStatus) {
		this.internalStatus = internalStatus;
	}
	
	public int getSequence() {
		return sequence;
	}
	
	public void setSequence(int sequence) {
		this.sequence = sequence;
	}

}