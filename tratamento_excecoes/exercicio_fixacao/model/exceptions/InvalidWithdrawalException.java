package model.exceptions;

public class InvalidWithdrawalException extends Exception {

	private static final long serialVersionUID = 1L;

	public InvalidWithdrawalException(String msg) {
		super(msg);
	}
	
}
