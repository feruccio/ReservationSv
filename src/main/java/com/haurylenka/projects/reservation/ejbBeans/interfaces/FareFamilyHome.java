package com.haurylenka.projects.reservation.ejbBeans.interfaces;

import java.rmi.RemoteException;

import javax.ejb.CreateException;
import javax.ejb.EJBHome;

public interface FareFamilyHome extends EJBHome {
	
	FareFamilyRemote create() throws CreateException, RemoteException;

}
