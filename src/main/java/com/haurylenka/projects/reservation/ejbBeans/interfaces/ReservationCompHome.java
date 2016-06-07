package com.haurylenka.projects.reservation.ejbBeans.interfaces;

import java.rmi.RemoteException;

import javax.ejb.CreateException;
import javax.ejb.EJBHome;

public interface ReservationCompHome extends EJBHome {
	
	ReservationCompRemote create() throws CreateException, RemoteException;

}
