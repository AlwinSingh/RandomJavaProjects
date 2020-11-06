
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Alwin Singh
 */
public class PassProgram {

    private ArrayList<String> accountnamelist = new ArrayList<String>();
    private ArrayList<String> accountpasslist = new ArrayList<String>();
    private ArrayList<String> applist = new ArrayList<String>();
    PassManagement[] loggedInUser = new PassManagement[1];

//    public static void main(String[] args) {
//        PassProgram test = new PassProgram();
//        test.readFile();
//        test.readArray();
//    }

    public void readFile() {
        try {
            String line = "";
            BufferedReader br = new BufferedReader(
                    new FileReader("D:\\JavaProjects\\passmanager\\src\\main\\java\\accounts.txt"));

            while ((line = br.readLine()) != null) {
                accountnamelist.add(line.split(";")[0]);
                accountpasslist.add(line.split(";")[1]);
                //applist.add(line.split(";")[2]);
            }

        } catch (IOException e) {
            System.out.println("File was not found!");
        }
    }

    public void readArray() {
        for (int i = 0; i < applist.size(); i++) {
            System.out.println(applist.get(i));
        }
    }

    public boolean validateLogin(String username, String userpassword) {
        boolean validatedCredentials = false;

        for (int i = 0; i < accountnamelist.size(); i++) {
            if (username.equals(accountnamelist.get(i)) && userpassword.equals(accountpasslist.get(i))) {
                loggedInUser[0] = new PassManagement(accountnamelist.get(i), accountpasslist.get(i));
                validatedCredentials = true;
                System.out.println("Testing object: " + loggedInUser[0].getUsername());
            }
        }

        return validatedCredentials;
    }

}
