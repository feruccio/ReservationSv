package com.haurylenka.projects.reservation.ejbBeans.interfaces;

import java.rmi.RemoteException;

import javax.ejb.EJBObject;

import com.haurylenka.projects.reservation.beans.Reservation;

public interface ReservationRemote extends EJBObject {

	Reservation getReservation(String code) throws RemoteException;
	
}
