package com.haurylenka.projects.reservation.utils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

import com.haurylenka.projects.reservation.exceptions.ConnectionException;

public class MySQLHandler {

	private static final DataSource DATASOURCE;
	
	static {
		try {
			InitialContext initCtx = new InitialContext();
			DATASOURCE = (DataSource) initCtx.lookup("java:/MySQLDS");
		} catch (NamingException e) {
			throw new ConnectionException(
					"Unable to get a DataSource instance", e);
		}
	}
	
	private MySQLHandler() {}
	
	public static Connection getConnection() {
		try {
			return DATASOURCE.getConnection();
		} catch (SQLException e) {
			throw new ConnectionException("Unable to get a connection", e);
		}
	}
	
	public static void closeConnection(Connection c) {
		if (c != null) {
			try {
				c.close();
			} catch (SQLException e) {
				throw new ConnectionException("Unable to close connection", e);
			}
		}
	}
	
	public static Statement getStatement(Connection c) {
		try {
			return c.createStatement();
		} catch (SQLException e) {
			throw new ConnectionException(
					"Unable to create a Statement instance", e);
		}
	}
	
	public static PreparedStatement getPreparedStatement(
			Connection c, String sql) {
		try {
			return c.prepareStatement(sql);
		} catch (SQLException e) {
			throw new ConnectionException(
					"Unable to create a PreparedStatement instance", e);
		}
	}
	
	public static void closeStatements(Statement... statements) {
		if (statements != null) {
			for (Statement st : statements) {
				try {
					st.close();
				} catch (SQLException e) {
					throw new ConnectionException(
							"Unable to close a statement", e);
				}
			}
		}
	}
	
}
