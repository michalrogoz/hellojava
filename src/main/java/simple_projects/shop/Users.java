package simple_projects.shop;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Users {
    List<User> allUsers = new ArrayList<>();


    public User zaloguj(String username, String password) {
        for (User user : allUsers) {
            if (user.username.equals(username) && user.pass.equals(password)) {
                System.out.println("Zalogowano!");
                return user;
            }
        }
        System.out.println("Niepoprawne logowanie!");
        return null;
    }

    public void wczytajZPliku() {
        String fileName = "users.txt";
        try {
            FileReader fr = new FileReader(fileName);
            BufferedReader br = new BufferedReader(fr);

            String currentLine = br.readLine();

            while (currentLine != null) {
                String[] split = currentLine.split(",");
                User newUser = new User(split[0], split[1]);
                allUsers.add(newUser);
                currentLine = br.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


}
