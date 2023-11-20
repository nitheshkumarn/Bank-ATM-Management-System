package com;

public class InsufficientBalanceException extends RuntimeException {
	private static final long serialVersionUID = -2285621358885741227L;
	
	private String message;

	InsufficientBalanceException(String message)
	{
		this.message=message;
	}

	@Override
	public String getMessage()
	{
		return message;
	}
}
