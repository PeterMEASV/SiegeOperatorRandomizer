package personalprojects.siegeoperatorrandomizer;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class FileGeneration {


    public String getTitle() throws IOException {
        ArrayList<String> list = new ArrayList<>();
        File titles = new File("titles.txt");
        if (titles.createNewFile()) {
            System.out.println("Titles created - Please fill the list");
        } else {
            System.out.println("Titles already exist - Good");
        }
        Scanner sc = new Scanner(titles);
        while (sc.hasNextLine()) {
            list.add(sc.nextLine());
        }
        sc.close();
        Random rnd = new Random();
        int index = rnd.nextInt(list.size());
        return list.get(index);

    }
}
