package com.cts.authorization.exception;

/**
 * Class to handle Invalid Credentials given by the user
 *  @author Sarika Soni
 *  @author 890071
 */
public class InvalidTokenException extends RuntimeException {

	private static final long serialVersionUID = -3700741193887093791L;

	public InvalidTokenException(String message) {
		super(message);
	}
}
