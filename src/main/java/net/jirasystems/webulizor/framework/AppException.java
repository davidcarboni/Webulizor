/**
 * 
 */
package net.jirasystems.webulizor.framework;

/**
 * @author david
 * 
 */
public class AppException extends RuntimeException {

	/**
	 * Generated by Eclipse.
	 */
	private static final long serialVersionUID = -211489665746249932L;

	/**
	 * 
	 */
	public AppException() {
		super();
	}

	/**
	 * @param message
	 */
	public AppException(String message) {
		super(message);
	}

	/**
	 * @param cause
	 */
	public AppException(Throwable cause) {
		super(cause);
	}

	/**
	 * @param message
	 * @param cause
	 */
	public AppException(String message, Throwable cause) {
		super(message, cause);
	}

	// JDK 7:
//	/**
//	 * @param message
//	 * @param cause
//	 * @param enableSuppression
//	 * @param writableStackTrace
//	 */
//	public AppException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
//		super(message, cause, enableSuppression, writableStackTrace);
//	}

}
