package Registration;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

public class FileIOService {
    private static String filePath = "src\\Registration\\Users.txt";

    public static void writeInFile(String path, String text) throws IOException {
        Files.write(Paths.get(path), text.getBytes(), StandardOpenOption.APPEND);
    }

    public static ArrayList<User> readFromFIle() throws IOException {
        List<String> initialList = Files.readAllLines(Paths.get(filePath));
        ArrayList<User> users = new ArrayList<>();
        String[] split;
        for (int i = 0; i < initialList.size(); i++) {
            User p = new User();
            split = initialList.get(i).split(",");

            p.setFullName(split[0]);
            p.setUsername(split[1]);
            p.setEmail(split[2]);
            p.setPassword(split[3]);

            users.add(i, p);
        }
        return users;
    }
}
