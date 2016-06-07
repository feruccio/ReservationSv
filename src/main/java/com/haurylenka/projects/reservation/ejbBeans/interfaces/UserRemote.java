package com.haurylenka.projects.reservation.ejbBeans.interfaces;

import java.rmi.RemoteException;

import javax.ejb.EJBObject;

import com.haurylenka.projects.reservation.beans.User;

public interface UserRemote extends EJBObject {

	User getUser(String login, String password) throws RemoteException;
	
}
