
public class InvalidSubspeciesException extends Exception {

	String message;
    InvalidSubspeciesException(String str) {
        message = str;
    }
    public String toString() {
        return ("InvalidSubspeciesException Occurred :" + message);
    }
	
}
