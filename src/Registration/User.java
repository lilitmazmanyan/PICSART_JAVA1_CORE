package Registration;

import Homework5.CustomExceptions.InvalidInputException;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class User {
    private String fullName;
    private String username;
    private String email;
    private String password;

    public static boolean Register(Scanner s, User u) {
        System.out.println("Please fill in your full name in format of name surname");
        s.nextLine();
        u.fullName = s.nextLine();
        System.out.println("Please specify your username which should be at least 10 non-repeating chars)");
        u.username = s.nextLine();
        System.out.println("Please enter your email address");
        u.email = s.nextLine();
        System.out.println("Please choose a password with min length of 8.\n" +
                "and containing at least 3 numbers and 2 uppercase letters");
        u.password = s.nextLine();
        ArrayList<User> users = null;
        try {
            users = FileIOService.readFromFIle();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return u.validateUsers(users);
    }

    public boolean validateUsers(ArrayList<User> users) {
        if (!nameIsValid(fullName)) throw new InvalidInputException("Name Format");
        else if (!emailIsValid(email)) throw new InvalidInputException("Email Address");
        else if (!passwordIsValid(password)) throw new InvalidInputException("Password");
        else {
            try {
                if (usernameIsValid(username)) throw new InvalidInputException("Username");
            } catch (IOException e) {
                e.printStackTrace();
                return false;
            }
        }
        return true;
    }

    public String RegToTxt() {
        String RegToTxt;
        RegToTxt = this.fullName + "," + this.username + "," + this.email + "," + this.password + "\n";
        return RegToTxt;
    }

    public static boolean loginValidation(String username, String password) {
        ArrayList<User> users = new ArrayList<>();
        try {
            users = FileIOService.readFromFIle();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return users.stream()
                .filter(ss -> Objects.equals(ss.getUsername(), username))
                .findAny()
                .filter(ss -> Objects.equals(ss.getPassword(), password)).isPresent();
    }

    private boolean usernameIsValid(String username) throws IOException {
        ArrayList<User> users;
        users = FileIOService.readFromFIle();
        return username.length() <= 10
                || users.stream().filter(ss -> Objects.equals(ss.getUsername(), username)).count() != 0;
    }

    private boolean nameIsValid(String fullName) {
        return !fullName.matches("^([A-Z][a-z]*(\\s))+[A-Z][a-z]*$");
    }

    private boolean emailIsValid(String email) {
        return email.matches("^[a-zA-Z0-9.!#$%&’*+/=?^_`{|}~-]+@[a-zA-Z0-9-]+(?:\\.[a-zA-Z0-9-]+)*$/");
    }

    private boolean passwordIsValid(String password) {
        return !(password.length() <= 8
                || password.chars().filter((s) -> Character.isDigit(s)).count() < 3
                || password.chars().filter((s) -> Character.isUpperCase(s)).count() < 2);
    }


    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }


}
