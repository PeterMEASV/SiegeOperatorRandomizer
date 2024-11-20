package personalprojects.siegeoperatorrandomizer;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class profileAccess {
    File users;
    ArrayList<String> usersList = new ArrayList<>();
    private Map<String, ArrayList<String>> usersMap = new HashMap<>();

    public void initialize() throws IOException {
        users = new File("users.txt");

        if (users.createNewFile()) {
            System.out.println("File created: " + users.getName());
        } else {
            System.out.println("File already exists: " + users.getName());
        }

        Scanner usersScanner = new Scanner(users);
        while (usersScanner.hasNextLine()) {
            usersList.add(usersScanner.nextLine());
        }
        usersScanner.close();
        createUserFiles();
        for(int i = 0; i < usersMap.get("Death").size(); i++)
        {
            System.out.println(usersMap.get("Death").get(i));
        }

    }

    public void createUserFiles() throws IOException {
        for(String username : usersList)
        {

            File user = new File(username + ".txt");
            ArrayList<String> tempList = new ArrayList<>();
            if(user.createNewFile())
            {
                System.out.println("File created: " + user.getName());
            }
            else
            {
                System.out.println("File already exists: " + user.getName());
            }

            Scanner scanner = new Scanner(user);
            while (scanner.hasNextLine()) {
                tempList.add(scanner.nextLine());
            }
            scanner.close();
            usersMap.put(username, tempList);
        }
    }
    public String[] getUsersList(String username) {
        String[] tempArray = new String[usersMap.get(username).size()];
        for(int i = 0; i< usersMap.get(username).size(); i++)
        {
            tempArray[i] = usersMap.get(username).get(i);
        }
        return tempArray;
    }
    public ArrayList<String> getAmountUsers(){
        return usersList;

    }

}