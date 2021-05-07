package Homework5.CustomExceptions;

public class EmptyPresentException extends RuntimeException {
    public EmptyPresentException() {
        super("Present can't be empty");
    }
}
