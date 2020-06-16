package simple_projects.invoice;

import java.io.*;
import java.util.ArrayList;

public class FilesManager {

    public ArrayList<Client> loadDataFromFile(String filename) throws IOException, ClassNotFoundException {

        FileInputStream fis = new FileInputStream(filename);
        ObjectInputStream ois = new ObjectInputStream(fis);
        ArrayList<Client> readObject = (ArrayList<Client>) ois.readObject();
        ois.close();

        return readObject;
    }

    public void loadDataToFile(String filename, ArrayList<Client> clients) throws IOException, ClassNotFoundException {

        FileOutputStream fos = new FileOutputStream(filename);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(clients);
        oos.close();

    }

}
