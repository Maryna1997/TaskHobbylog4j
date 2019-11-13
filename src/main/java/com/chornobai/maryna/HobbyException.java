package com.chornobai.maryna;

public class HobbyException extends Exception {
    public HobbyException() {
    }

    public HobbyException(String message) {
        super(message);
    }

    public HobbyException(String message, Throwable cause) {
        super(message, cause);
    }

    public HobbyException(Throwable cause) {
        super(cause);
    }
}
