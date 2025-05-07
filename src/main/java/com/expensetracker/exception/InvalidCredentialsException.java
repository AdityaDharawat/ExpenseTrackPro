package com.expensetracker.exception;

public class InvalidCredentialsException extends RuntimeException {
    private final String field;
    private final String message;

    public InvalidCredentialsException(String field, String message) {
        super(message);
        this.field = field;
        this.message = message;
    }

    public String getField() {
        return field;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
