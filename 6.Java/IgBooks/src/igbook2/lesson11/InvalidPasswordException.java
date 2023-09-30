package igbook2.lesson11;

public class InvalidPasswordException extends Exception {

    InvalidPasswordException() {

    }

    InvalidPasswordException(String message) {
        super(message);
    }

    InvalidPasswordException(String message, Throwable cause) {
        super(message, cause);
    }

}
