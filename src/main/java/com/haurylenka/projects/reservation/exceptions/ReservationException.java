package com.haurylenka.projects.reservation.exceptions;

public class ReservationException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public ReservationException() {
		super();
	}

	public ReservationException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public ReservationException(String message, Throwable cause) {
		super(message, cause);
	}

	public ReservationException(String message) {
		super(message);
	}

	public ReservationException(Throwable cause) {
		super(cause);
	}

}