package fr.exceptions;

public class BadBadValueException extends Exception{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public BadBadValueException() {}

    // Constructor that accepts a message
    public BadBadValueException(String message)
    {
       super(message);
    }

}