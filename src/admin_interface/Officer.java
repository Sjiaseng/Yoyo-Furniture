/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package admin_interface;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import static admin_interface.User.count_user_lines;


/**
 *
 * @author user
 */
public class Officer extends User{

    public static String[] officer_info = new String[9];
    
    public Officer(String username) {
        super(username);
    }
    
    public Officer(String name, String email, String gender, String phone, String ic, String date, String role, String username, String password) {
        super(name, email, gender, phone, ic, date, role, username, password);
    }
    
    // View Officer Data
    public String view_Officer() throws FileNotFoundException, IOException{
                
        RandomAccessFile raf = new RandomAccessFile("user.txt", "rw");
        
        String myname, myemail, mygender, myphone, myic, myregdate, myrole, myusername, mypassword, myspace;
        
        for (int i = 0; i < count_user_lines() / 10; i++) {
            myname = raf.readLine().substring(6);
            myemail = raf.readLine().substring(7);
            mygender = raf.readLine().substring(8);
            myphone = raf.readLine().substring(7);
            myic = raf.readLine().substring(4);
            myregdate = raf.readLine().substring(15);
            myrole = raf.readLine().substring(6);
            myusername = raf.readLine().substring(10);
            mypassword = raf.readLine().substring(10);
            myspace = raf.readLine().substring(0);
            
            String new_name = username.toString();
            
            if(myrole.equals("Officer") && new_name.equals(myusername)){
                officer_info[0] = myname;
                officer_info[1] = myemail;
                officer_info[2] = mygender;
                officer_info[3] = myphone;
                officer_info[4] = myic;
                officer_info[5] = myregdate;
                officer_info[6] = myrole;
                officer_info[7] = myusername;             
                officer_info[8] = mypassword;  
            }
            
            
        }
        
        return "Success";
    }
    
    // Delete officer data
    public String delete_Officer() throws FileNotFoundException, IOException{
        String myname, myemail, mygender, myphone, myic, mydate, myrole, myusername, mypassword, myspace;
        RandomAccessFile raf = new RandomAccessFile("user.txt", "rw");
        String[] myArray2 = new String[10];
        
        for(int i=0; i < count_user_lines()/10 ; i++){
            myname = raf.readLine();
            myemail = raf.readLine();
            mygender = raf.readLine();
            myphone = raf.readLine();  
            myic = raf.readLine();
            mydate = raf.readLine();
            myrole = raf.readLine();
            myusername = raf.readLine();
            mypassword = raf.readLine();
            myspace = raf.readLine();  
            
            myArray2 [0] = myname;
            myArray2 [1] = myemail;
            myArray2 [2] = mygender;
            myArray2 [3] = myphone;
            myArray2 [4] = myic;
            myArray2 [5] = mydate;
            myArray2 [6] = myrole;
            myArray2 [7] = myusername;
            myArray2 [8] = mypassword;
            myArray2 [9] = myspace;
            
            if (myArray2[7].equals("Username: "+ officer_info[7]) && myrole.equals("Role: " + "Officer")){
                    myArray2 [0] = "";
                    myArray2 [1] = "";
                    myArray2 [2] = "";
                    myArray2 [3] = "";
                    myArray2 [4] = "";
                    myArray2 [5] = "";
                    myArray2 [6] = "";
                    myArray2 [7] = "";
                    myArray2 [8] = "";
                    myArray2 [9] = "";

            }
            else{
                FileWriter writer = new FileWriter("user.tmp", true);
      
                    writer.write(myArray2[0]+"\n");
                    writer.write(myArray2[1]+"\n");
                    writer.write(myArray2[2]+"\n");
                    writer.write(myArray2[3]+"\n");
                    writer.write(myArray2[4]+"\n");
                    writer.write(myArray2[5]+"\n");
                    writer.write(myArray2[6]+"\n");
                    writer.write(myArray2[7]+"\n");
                    writer.write(myArray2[8]+"\n");
                    writer.write(myArray2[9]+"\n");
                    
                    writer.close();
            }
        }
        
        Path tempFilePath = Paths.get("user.tmp");
        Path originalFilePath = Paths.get("user.txt");

        var lines = Files.readAllLines(tempFilePath);

        Files.write(originalFilePath, lines, StandardOpenOption.WRITE, StandardOpenOption.TRUNCATE_EXISTING);

        Files.delete(tempFilePath);
        
        File tempFile = new File("C:/Users/user/Desktop/Java_Assignment/java_assignment/user.tmp");
        
        if (tempFile.exists()) {
            tempFile.delete();
            tempFile.createNewFile();
            System.out.println("Temp file cleared successfully.");
        }
    
    return "Success";
    }
    // Modify officer Data
    public String modify_Officer() throws FileNotFoundException, IOException{
        String myname, myemail, mygender, myphone, myic, mydate, myrole, myusername, mypassword, myspace;
        RandomAccessFile raf = new RandomAccessFile("user.txt", "rw");
        String[] myArray = new String[10];
        
        for(int i=0; i < count_user_lines()/10 ; i++){
            myname = raf.readLine();
            myemail = raf.readLine();
            mygender = raf.readLine();
            myphone = raf.readLine();  
            myic = raf.readLine();
            mydate = raf.readLine();
            myrole = raf.readLine();
            myusername = raf.readLine();
            mypassword = raf.readLine();
            myspace = raf.readLine();  
            
            myArray [0] = myname;
            myArray [1] = myemail;
            myArray [2] = mygender;
            myArray [3] = myphone;
            myArray [4] = myic;
            myArray [5] = mydate;
            myArray [6] = myrole;
            myArray [7] = myusername;
            myArray [8] = mypassword;
            myArray [9] = myspace;
            
            if (myArray[7].equals("Username: "+ officer_info[7]) && myrole.equals("Role: Officer")){
                    myArray [0] = "Name: " + name;
                    myArray [1] = "Email: " + email;
                    myArray [2] = "Gender: " + gender;
                    myArray [3] = "Phone: " + phone;
                    myArray [4] = "IC: " + ic;
                    myArray [5] = "Register Date: " + date;
                    myArray [6] = "Role: " + role;
                    myArray [7] = "Username: " + username;
                    myArray [8] = "Password: "+ password;

            }
            FileWriter writer = new FileWriter("user.tmp", true);
      
                    writer.write(myArray[0]+"\n");
                    writer.write(myArray[1]+"\n");
                    writer.write(myArray[2]+"\n");
                    writer.write(myArray[3]+"\n");
                    writer.write(myArray[4]+"\n");
                    writer.write(myArray[5]+"\n");
                    writer.write(myArray[6]+"\n");
                    writer.write(myArray[7]+"\n");
                    writer.write(myArray[8]+"\n");
                    writer.write(myArray[9]+"\n");
                    
                    writer.close();
        }
        
        Path tempFilePath = Paths.get("user.tmp");
        Path originalFilePath = Paths.get("user.txt");

        var lines = Files.readAllLines(tempFilePath);

        Files.write(originalFilePath, lines, StandardOpenOption.WRITE, StandardOpenOption.TRUNCATE_EXISTING);

        Files.delete(tempFilePath);
        
        File tempFile = new File("C:/Users/user/Desktop/Java_Assignment/java_assignment/user.tmp");
        
        if (tempFile.exists()) {
            tempFile.delete();
            tempFile.createNewFile();
            System.out.println("Temp file cleared successfully.");
        }
        
      return "Success";
    }
    
    
}
