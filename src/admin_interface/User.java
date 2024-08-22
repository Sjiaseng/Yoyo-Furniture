/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package admin_interface;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class User {
    
    public String name, email, gender, phone, username, role, password, ic, date, space;
    
    public User (String username){
        this.username = username;
    }
    
    public User (String username, String password){
        this.username = username;
        this.password = password;
    }
    
    public User (String name, String email, String gender, String phone, String ic, String date, String role, String username, String password){                   
        this.name = name;
        this.email = email;
        this.gender = gender;
        this.phone = phone;
        this.username = username;
        this.role = role;
        this.password = password;
        this.ic = ic;
        this.date = date;
    }
    
    // Retrieve number of rows from user.txt
    static int count_user_lines() throws FileNotFoundException {
        File file = new File("user.txt");
        Scanner scanner = new Scanner(file);
        int count = 0;

        while (scanner.hasNextLine()) {
            scanner.nextLine();
            count++;
        }

        scanner.close();

        return count; // Returns the total number of lines (records)
    }
    
    public static String[] mySession = new String[9];
    // Retrieve user session data
    public String login_session() throws FileNotFoundException, IOException{
        String fullname, emailadd, genders, phonenum, icnum, regdate, roles, myusername, mypassword1, space;
                
        RandomAccessFile raf = new RandomAccessFile("user.txt", "rw");

        for (int i = 0; i < count_user_lines() / 10; i++) {
            fullname = raf.readLine().substring(6);
            emailadd = raf.readLine().substring(7);
            genders = raf.readLine().substring(8);
            phonenum = raf.readLine().substring(7);
            icnum = raf.readLine().substring(4);
            regdate = raf.readLine().substring(15);
            roles = raf.readLine().substring(6);
            myusername = raf.readLine().substring(10);
            mypassword1 = raf.readLine().substring(10);
            space = raf.readLine().substring(0);
            
  
        if(myusername.equals(username) && mypassword1.equals(password) && roles.equals("Administrator")){
             mySession[0]= fullname;
             mySession[1]= emailadd;
             mySession[2]= genders;
             mySession[3]= phonenum;
             mySession[4]= icnum;
             mySession[5]= regdate;
             mySession[6]= roles;
             mySession[7]= myusername;
             mySession[8]= mypassword1;
             
             return "Admin";    
            
        }else if(myusername.equals(username) && mypassword1.equals(password) && roles.equals("Officer")){    
             mySession[0]= fullname;
             mySession[1]= emailadd;
             mySession[2]= genders;
             mySession[3]= phonenum;
             mySession[4]= icnum;
             mySession[5]= regdate;
             mySession[6]= roles;
             mySession[7]= myusername;
             mySession[8]= mypassword1;
            return "Officer";  
            
        }else if(myusername.equals(username) && mypassword1.equals(password) && roles.equals("Sales Person")){
             mySession[0]= fullname;
             mySession[1]= emailadd;
             mySession[2]= genders;
             mySession[3]= phonenum;
             mySession[4]= icnum;
             mySession[5]= regdate;
             mySession[6]= roles;
             mySession[7]= myusername;
             mySession[8]= mypassword1;          
            return "Sales Person";                    
        }
        else{
            continue;
        }
 
                
        }
        return "Fail";
    }
    
}
