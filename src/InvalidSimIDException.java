

class InvalidSimIDException extends Exception {
    String message;
    InvalidSimIDException(String str) {
        message = str;
    }
    public String toString() {
        return ("InvalidSimIDException Occurred :" + message);
    }
}