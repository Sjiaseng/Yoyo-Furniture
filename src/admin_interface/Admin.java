/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package admin_interface;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.RandomAccessFile;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import static admin_interface.User.count_user_lines;
import static admin_interface.User.mySession;

/**
 *
 * @author user
 */
public class Admin extends User{
    
    // Array to Retain Admin Data
    public static String[] admin_info = new String[8];
    
    
    public Admin(String username) {
        super(username);
    }
    
    public Admin(String name, String email, String gender, String phone, String ic, String date, String role, String username, String password) {
        super(name, email, gender, phone, ic, date, role, username, password);
    }
    
    // Function to View Admin Data
    public String view_admin_data() throws FileNotFoundException, IOException{
                
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
            
            if(myrole.equals("Administrator") && new_name.equals(myusername)){
                admin_info[0] = myname;
                admin_info[1] = myemail;
                admin_info[2] = mygender;
                admin_info[3] = myphone;
                admin_info[4] = myic;
                admin_info[5] = myregdate;
                admin_info[6] = myrole;
                admin_info[7] = myusername;                
            }
            
            
        }
        
        return "Success";
    }
    
    // Function to Delete Admin Account
    public String delete_admin_Account() throws FileNotFoundException, IOException{
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
            
            // Checking Condition and Remove the Row of Data.
            if (myArray2[7].equals("Username: "+ mySession[7]) && myArray2[5].equals("Register Date: " + mySession[5])){
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
        
        // Writing Data into Temp File and Convert it into Txt file
        
        Path tempFilePath = Paths.get("user.tmp");
        Path originalFilePath = Paths.get("user.txt");

        var lines = Files.readAllLines(tempFilePath);

        Files.write(originalFilePath, lines, StandardOpenOption.WRITE, StandardOpenOption.TRUNCATE_EXISTING);

        Files.delete(tempFilePath);
        
        File tempFile = new File("C:/Users/user/Desktop/Java_Assignment/java_assignment/user.tmp");
        
        // Delete Temp File After Replacing the Txt File
        
        if (tempFile.exists()) {
            tempFile.delete();
            tempFile.createNewFile();
            System.out.println("Temp file cleared successfully.");
        }
    
    return "Success";
    }
    
    // Function to Modify Admin Profile
    public String modify_admin_profile()throws FileNotFoundException, IOException{
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
            
            if (myArray[7].equals("Username: "+ mySession[7]) && myArray[5].equals("Register Date: " + mySession[5])){
                    myArray [0] = "Name: " + name;
                    myArray [1] = "Email: " + email;
                    myArray [2] = "Gender: " + gender;
                    myArray [3] = "Phone: " + phone;
                    myArray [4] = "IC: " + ic;
                    myArray [5] = "Register Date: " + date;
                    myArray [6] = "Role: " + role;
                    myArray [7] = "Username: " + username;
                    myArray [8] = "Password: "+ password;

            } // Writting Modified Data into Txt File
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
    
    // Function to Register / Add New Users
    public String register_new_users(){
        try{
            FileWriter fw = new FileWriter("user.txt",true);
            PrintWriter outputFile = new PrintWriter(fw);
            outputFile.println("Name: " + name);
            outputFile.println("Email: " + email);
            outputFile.println("Gender: " + gender);
            outputFile.println("Phone: " + phone);
            outputFile.println("IC: " + ic);
            outputFile.println("Register Date: " + date);
            outputFile.println("Role: " + role);
            outputFile.println("Username: " + username);
            outputFile.println("Password: " + password + "\n");
            outputFile.close();
            return "Success";

        } catch (Exception ex){
            return ex.toString();
        }
    }
}

