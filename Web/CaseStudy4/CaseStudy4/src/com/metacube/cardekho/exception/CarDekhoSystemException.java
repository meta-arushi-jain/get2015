/**
 * 
 */
package com.metacube.cardekho.exception;

/**
 * @author Arushi
 * class for exception
 *
 */
public class CarDekhoSystemException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public CarDekhoSystemException(String message) {
		super(message);
		
	}
	
	public CarDekhoSystemException(String message ,Throwable cause) {
		super(message,cause);
		
	}


}
