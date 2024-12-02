package model.exceptions;

public class InvalidInitialBalanceException extends Exception {
	
	private static final long serialVersionUID = 1L;

	public InvalidInitialBalanceException(String msg) {
		super(msg);
	}
	
}
