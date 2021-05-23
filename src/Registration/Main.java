package Registration;

import java.io.File;
import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String path = "src\\Registration\\Users.txt";
        ArrayList<User> users = new ArrayList<>();

        try {
            users = FileIOService.readFromFIle();
        } catch (IOException e) {
            File f = new File(path);
            try {
                f.createNewFile();
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }
        }

        boolean isActive = true;
        while (isActive) {
            System.out.println("1.Register\n2.Log-In\n3.Exit");
            System.out.println("Please select an option you want to go with");
            int cmd = s.nextInt();
            switch (cmd) {
                case 1 -> {
                    User u = new User();
                    if (!User.Register(s, u)) {
                        System.out.println("No user found");
                        break;
                    }
                    users.add(u);
                    try {
                        FileIOService.writeInFile(path, u.RegToTxt());
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                case 2 -> {
                    System.out.println("Input Login");
                    String login = s.next();
                    System.out.println("Input Password");
                    String password = s.next();
                    System.out.println(User.loginValidation(login, password) ?
                            "Login Success" : "Invalid Input Data");
                }
                case 3 -> isActive = false;
                default -> System.out.println("Invalid option");
            }
        }
    }
}