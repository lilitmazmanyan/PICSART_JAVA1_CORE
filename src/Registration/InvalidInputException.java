package Registration;

public class InvalidInputException extends Throwable {
    public InvalidInputException(String fieldName) {
        super(new StringBuilder()
                .append("The value of ").append(fieldName)
                .append(" is invalid.").toString());
    }
}
