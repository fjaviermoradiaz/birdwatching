package com.test.greyfinch.exception;

public class DeleteException extends Exception {

    private static final long serialVersionUID = -4402041616690277553L;

    /**
     * Base exception constructor
     */
    public DeleteException() {
        super();
    }

    /**
     * Constructor
     *
     * @param message
     * @param cause
     * @param enableSuppression
     * @param writableStackTrace
     */
    public DeleteException(String message, Throwable cause, boolean enableSuppression,
                           boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

    /**
     * Constructor with message and a cause
     *
     * @param message
     * @param cause
     */
    public DeleteException(String message, Throwable cause) {
        super(message, cause);
    }

    /**
     * Constructor with message
     *
     * @param
     */
    public DeleteException(String id) {
        super("Id " + id + " not found");
    }


    /**
     * Constructor with a cause
     *
     * @param cause
     */
    public DeleteException(Throwable cause) {
        super(cause);
    }
}