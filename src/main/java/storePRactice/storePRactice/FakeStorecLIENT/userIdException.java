package storePRactice.storePRactice.FakeStorecLIENT;

public class userIdException extends RuntimeException {
    public userIdException() {
    }

    public userIdException(String message) {
        super(message);
    }

    public userIdException(String message, Throwable cause) {
        super(message, cause);
    }

    public userIdException(Throwable cause) {
        super(cause);
    }

    public userIdException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
