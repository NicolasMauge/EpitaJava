package com.epita.lafabrique;

public class MonException extends Exception {
    public MonException() {
        super("Le nombre en entrée ne devrait pas être négatif");
    }

    public MonException(String message) {
        super(message);
    }

    public MonException(String message, Throwable cause) {
        super(message, cause);
    }

    public MonException(Throwable cause) {
        super(cause);
    }

    protected MonException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
