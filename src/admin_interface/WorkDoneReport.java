 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package admin_interface;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class WorkDoneReport implements Report{
    String fromDate;
    String toDate;
    
    String salesID, productName, productType, price, phoneNumber, customerName, amount, delivery,
            address, date, status, approval, reason, totalPrice, salesName; 
    
    String salesID2, customerName2, status2, workDoneDate, totalPrice2, paymentStatus;
    
    public static ArrayList<String> reportArray = new ArrayList<>();
        
    public WorkDoneReport(String fromDate, String toDate){
        this.fromDate = fromDate;
        this.toDate = toDate;
    }
    // retrieve row data from invoice.txt
    @Override
    public int count_invoice_lines() throws FileNotFoundException {
        File file = new File("invoice.txt");
        Scanner scanner = new Scanner(file);
        int count = 0;

        while (scanner.hasNextLine()) {
            scanner.nextLine();
            count++;
        }

        scanner.close();

        return count; // Returns the total number of lines (records)
    }
    // retrieve row data from sales.txt
    @Override
    public int count_sales_lines() throws FileNotFoundException {
        File file = new File("sales.txt");
        Scanner scanner = new Scanner(file);
        int count = 0;

        while (scanner.hasNextLine()) {
            scanner.nextLine();
            count++;
        }

        scanner.close();

        return count; // Returns the total number of lines (records)
    }
    // Retrieve information to display report data.
    @Override
    public String getReportData() throws FileNotFoundException, IOException, ParseException{
        
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate fromDate_date = LocalDate.parse(fromDate, formatter);
        LocalDate toDate_date = LocalDate.parse(toDate, formatter);
        
        RandomAccessFile rax = new RandomAccessFile("invoice.txt", "rw");
                    
        for (int i = 0; i < count_invoice_lines() / 7; i++) {


            salesID2 = rax.readLine().substring(10);
            customerName2 = rax.readLine().substring(15);
            status2 = rax.readLine().substring(8);
            workDoneDate = rax.readLine().substring(16);
            totalPrice2 = rax.readLine().substring(13);
            paymentStatus = rax.readLine().substring(9);
            rax.readLine();
            
            LocalDate workDoneDate_date = LocalDate.parse(workDoneDate, formatter);
            
 
            if (status2.equals("Work Done") &&
                    (workDoneDate_date.isAfter(fromDate_date) || workDoneDate_date.isEqual(fromDate_date)) &&
                    (workDoneDate_date.isBefore(toDate_date) || workDoneDate_date.isEqual(toDate_date))) {

                RandomAccessFile raf = new RandomAccessFile("sales.txt", "rw");

                for (int j = 0; j < count_sales_lines() / 16; j++) {
                    salesID = raf.readLine().substring(10);
                    productName = raf.readLine().substring(14);
                    productType = raf.readLine().substring(6);
                    price = raf.readLine().substring(7);
                    phoneNumber = raf.readLine().substring(14);
                    customerName = raf.readLine().substring(15);
                    amount = raf.readLine().substring(8);
                    delivery = raf.readLine().substring(10);
                    address = raf.readLine().substring(9);
                    date = raf.readLine().substring(12);
                    status = raf.readLine().substring(8);
                    approval = raf.readLine().substring(10);
                    reason = raf.readLine().substring(9);
                    totalPrice = raf.readLine().substring(13);
                    salesName = raf.readLine().substring(13);
                    raf.readLine();

                    if (salesID2.equals(salesID)) {
                        reportArray.add(salesID2);
                        reportArray.add(salesName);
                        reportArray.add(customerName);
                        reportArray.add(productName);
                        reportArray.add(productType);
                        reportArray.add(status2);
                        reportArray.add(workDoneDate);
                        reportArray.add(amount);
                        reportArray.add(totalPrice);
                    }
                }
                raf.seek(0);
                raf.close(); // Close "sales.txt"
            }


        }
        

        return "Success";
    }
}
