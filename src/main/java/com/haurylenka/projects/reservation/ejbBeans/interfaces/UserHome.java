package com.haurylenka.projects.reservation.ejbBeans.interfaces;

import java.rmi.RemoteException;

import javax.ejb.CreateException;
import javax.ejb.EJBHome;

public interface UserHome extends EJBHome {

	UserRemote create() throws CreateException, RemoteException;
	
}
