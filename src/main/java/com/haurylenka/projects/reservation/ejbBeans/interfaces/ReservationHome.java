package com.haurylenka.projects.reservation.ejbBeans.interfaces;

import java.rmi.RemoteException;

import javax.ejb.CreateException;
import javax.ejb.EJBHome;

public interface ReservationHome extends EJBHome {
	
	ReservationRemote create() throws CreateException, RemoteException;

}
