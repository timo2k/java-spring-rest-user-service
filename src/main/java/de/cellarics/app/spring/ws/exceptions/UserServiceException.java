package de.cellarics.app.spring.ws.exceptions;

public class UserServiceException extends RuntimeException {

    private static final long serialVersionUID = 2912310216793269256L;

    public UserServiceException(String message) {
        super(message);
    }
}
