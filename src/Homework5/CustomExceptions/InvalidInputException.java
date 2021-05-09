package Homework5.CustomExceptions;

public class InvalidInputException extends RuntimeException {
    public InvalidInputException(String fieldName) {
        super(new StringBuilder()
                .append("The value of ").append(fieldName)
                .append(" is invalid. Please double check it.").toString());
    }
}
