package Homework5.CustomExceptions;

public class InvalidInputException extends RuntimeException {
    public InvalidInputException(String fieldName) {
        super(new StringBuilder()
                .append("The ").append(fieldName)
                .append(" cannot be a negative number").toString());
    }
}
