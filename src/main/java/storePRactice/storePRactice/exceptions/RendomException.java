package storePRactice.storePRactice.exceptions;

public class RendomException extends  RuntimeException {

    public RendomException() {
    }

    public RendomException(String message) {
        super(message);
    }

    public RendomException(String message, Throwable cause) {
        super(message, cause);
    }

    public RendomException(Throwable cause) {
        super(cause);
    }

    public RendomException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
