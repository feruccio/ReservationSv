package com.haurylenka.projects.reservation.ejbBeans.interfaces;

import java.rmi.RemoteException;
import java.util.List;

import javax.ejb.EJBObject;

import com.haurylenka.projects.reservation.beans.ResComponent;

public interface ReservationCompRemote extends EJBObject {
	
	List<ResComponent> getResComponents(String code, String componentTypeCode)
			throws RemoteException;

}
