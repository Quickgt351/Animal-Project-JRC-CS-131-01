
public class InvalidWingspanException extends Exception {

	String message;
    InvalidWingspanException(String str) {
        message = str;
    }
    public String toString() {
        return ("InvalidSimIDException Occurred :" + message);
    }
	
}
