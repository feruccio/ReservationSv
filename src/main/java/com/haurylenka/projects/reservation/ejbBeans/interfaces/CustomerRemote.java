package com.haurylenka.projects.reservation.ejbBeans.interfaces;

import java.rmi.RemoteException;

import javax.ejb.EJBObject;

import com.haurylenka.projects.reservation.beans.Customer;

public interface CustomerRemote extends EJBObject {

	Customer getCustomer(String code) throws RemoteException;
	
}
