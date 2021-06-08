package com.lti.opshub.catalog.exception;

public class SystemException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = -3149701785777398210L;

	final String error;

	public SystemException(String error){
		super(error);
		this.error=error;

	}

	public String getError() {
		return error;
	}

}
