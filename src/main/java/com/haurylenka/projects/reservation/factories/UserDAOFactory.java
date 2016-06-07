package com.haurylenka.projects.reservation.factories;

import com.haurylenka.projects.reservation.exceptions.ReservationException;
import com.haurylenka.projects.reservation.interfaces.UserDAO;
import com.haurylenka.projects.reservation.utils.ReservationUtil;

public class UserDAOFactory {
	
	private static final String IMPL_NAME_KEY = "UserDAOImpl";
	private static UserDAO IMPLEMENTATION;
	
	private UserDAOFactory() {}
	
	public static UserDAO getUserDAOImpl() {
		try {
			if (IMPLEMENTATION == null) {
				String implName = 
						ReservationUtil.getProperty(IMPL_NAME_KEY);
				Class<?> clazz = Class.forName(implName);
				IMPLEMENTATION = (UserDAO) clazz.newInstance();
			}
			return IMPLEMENTATION;
		} catch (Exception e) {
			throw new ReservationException(
					"Unable to get a UserDAOImpl instance", e);
		}
	}

}