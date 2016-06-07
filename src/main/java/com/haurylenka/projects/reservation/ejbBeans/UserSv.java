package com.haurylenka.projects.reservation.ejbBeans;

import java.rmi.RemoteException;

import javax.ejb.CreateException;
import javax.ejb.EJBException;
import javax.ejb.SessionBean;
import javax.ejb.SessionContext;

import com.haurylenka.projects.reservation.beans.User;
import com.haurylenka.projects.reservation.exceptions.ReservationException;
import com.haurylenka.projects.reservation.exceptions.UserDAOException;
import com.haurylenka.projects.reservation.factories.UserDAOFactory;
import com.haurylenka.projects.reservation.interfaces.UserDAO;

public class UserSv implements SessionBean {

	private static final long serialVersionUID = 1L;
	
	public User getUser(String login, String password) {
		try {
			UserDAO userDAO = UserDAOFactory.getUserDAOImpl();
			return userDAO.getUser(login, password);
		} catch (UserDAOException e) {
			throw new ReservationException("Unable to get user " + login, e);
		}
	}

	public void ejbCreate() throws CreateException {
		// no operations
    }

	@Override
	public void ejbActivate() throws EJBException, RemoteException {
		// no operations
	}

	@Override
	public void ejbPassivate() throws EJBException, RemoteException {
		// no operations
	}

	@Override
	public void ejbRemove() throws EJBException, RemoteException {
		// no operations
	}

	@Override
	public void setSessionContext(SessionContext arg0) throws EJBException, RemoteException {
		// no operations
	}

}
