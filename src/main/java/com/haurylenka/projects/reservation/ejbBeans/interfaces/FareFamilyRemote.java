package com.haurylenka.projects.reservation.ejbBeans.interfaces;

import java.rmi.RemoteException;

import javax.ejb.EJBObject;

import com.haurylenka.projects.reservation.beans.FareFamily;

public interface FareFamilyRemote extends EJBObject {
	
	FareFamily getFareFamily(String code) throws RemoteException;

}
