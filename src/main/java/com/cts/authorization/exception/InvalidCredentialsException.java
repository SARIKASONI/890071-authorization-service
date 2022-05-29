package com.cts.authorization.exception;

/**
 * Class to handle Invalid Credentials given by the user
 *  @author Sarika Soni
 *  @author 890071
 */
public class InvalidCredentialsException extends RuntimeException {

	private static final long serialVersionUID = -4836014323607899641L;

	public InvalidCredentialsException(String message) {
		super(message);
	}
}
