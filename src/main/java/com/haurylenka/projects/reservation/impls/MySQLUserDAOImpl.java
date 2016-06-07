package com.haurylenka.projects.reservation.impls;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.haurylenka.projects.reservation.beans.User;
import com.haurylenka.projects.reservation.exceptions.UserDAOException;
import com.haurylenka.projects.reservation.interfaces.UserDAO;
import com.haurylenka.projects.reservation.utils.MySQLHandler;

public class MySQLUserDAOImpl implements UserDAO {
	
	private static final String GET_USER_SQL = "select login FROM users where login = ? and password = ?";

	@Override
	public User getUser(String login, String password) throws UserDAOException {
		User user = null;
		Connection c = null;
		PreparedStatement pst = null;
		ResultSet rs = null;
		try {
			c = MySQLHandler.getConnection();
			pst = MySQLHandler.getPreparedStatement(
					c, GET_USER_SQL);
			pst.setString(1, login);
			pst.setString(2, password);
			rs = pst.executeQuery();
			if (rs.next()) {
				user = new User(login);
			}
			return user;
		} catch (SQLException e) {
			throw new UserDAOException(
					"Error while retrieving the user" + login, e);
		} finally {
			MySQLHandler.closeStatements(pst);
			MySQLHandler.closeConnection(c);
		}
	}
	
}
