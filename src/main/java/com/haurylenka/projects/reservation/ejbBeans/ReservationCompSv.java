package com.haurylenka.projects.reservation.ejbBeans;

import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;

import javax.ejb.CreateException;
import javax.ejb.EJBException;
import javax.ejb.SessionBean;
import javax.ejb.SessionContext;

import com.haurylenka.projects.reservation.beans.ResComponent;
import com.haurylenka.projects.reservation.beans.Reservation;
import com.haurylenka.projects.reservation.exceptions.ReservationDAOException;
import com.haurylenka.projects.reservation.exceptions.ReservationException;
import com.haurylenka.projects.reservation.factories.ReservationDAOFactory;
import com.haurylenka.projects.reservation.interfaces.ReservationDAO;

public class ReservationCompSv implements SessionBean {

	private static final long serialVersionUID = 1L;
	
	public List<ResComponent> getResComponents(
			String code, String componentTypeCode) {
		try {
			if (code == null || componentTypeCode == null) {
				throw new IllegalArgumentException("Arguments must not be null");
			}
			List<ResComponent> resComponents = new ArrayList<>();
			ReservationDAO reservationDAO = 
					ReservationDAOFactory.getReservationDAO();
			Reservation reservation = reservationDAO.getReservation(code);
			if (reservation != null) {
				List<ResComponent> components = reservation.getComponents();
				if (components != null) {
					for (ResComponent component : components) {
						String ctc = component.getComponentTypeCode();
						if (componentTypeCode.equals(ctc)) {
							resComponents.add(component);
						}
					}
				}
			}
			return resComponents;
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
