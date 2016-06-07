package com.haurylenka.projects.reservation.ejbBeans;

import java.rmi.RemoteException;

import javax.ejb.CreateException;
import javax.ejb.EJBException;
import javax.ejb.SessionBean;
import javax.ejb.SessionContext;

import com.haurylenka.projects.reservation.beans.Reservation;
import com.haurylenka.projects.reservation.exceptions.ReservationDAOException;
import com.haurylenka.projects.reservation.exceptions.ReservationException;
import com.haurylenka.projects.reservation.factories.ReservationDAOFactory;
import com.haurylenka.projects.reservation.interfaces.ReservationDAO;

public class ReservationSv implements SessionBean {

	private static final long serialVersionUID = 1L;
	
	public Reservation getReservation(String code) {
		try {
			if (code == null) {
				throw new IllegalArgumentException("Code must not be null");
			}
			ReservationDAO reservationDAO = 
					ReservationDAOFactory.getReservationDAO();
			return reservationDAO.getReservation(code);
		} catch (ReservationDAOException e) {
			throw new ReservationException(
					"Unable to get the reservation with code " + code, e);
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
