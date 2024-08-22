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
public class ApprovedSalesReport implements Report{
    String fromDate;
    String toDate;
    
    String salesID, productName, productType, price, phoneNumber, customerName, amount, delivery,
            address, date, status, approval, reason, totalPrice, salesName; 
    
    String salesID2, customerName2, status2, workDoneDate, totalPrice2, paymentStatus;
    
    public static ArrayList<String> reportArray = new ArrayList<>();
        
    public ApprovedSalesReport(String fromDate, String toDate){
        this.fromDate = fromDate;
        this.toDate = toDate;
    }
    // Get Invoice Row Numbers
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
    // Get Sales Row Numbers
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
    // Retrieve Report data based on data input.
    @Override
    public String getReportData() throws FileNotFoundException, IOException, ParseException{
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate fromDate_date = LocalDate.parse(fromDate, formatter);
        LocalDate toDate_date = LocalDate.parse(toDate, formatter);
        
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

            LocalDate Date_date = LocalDate.parse(date, formatter);

            if (approval.equals("Approved") &&
                    (Date_date.isAfter(fromDate_date) || Date_date.isEqual(fromDate_date)) &&
                    (Date_date.isBefore(toDate_date) || Date_date.isEqual(toDate_date))) {

                RandomAccessFile rax = new RandomAccessFile("invoice.txt", "rw");

                for (int i = 0; i < count_invoice_lines() / 7; i++) {
                    salesID2 = rax.readLine().substring(10);
                    customerName2 = rax.readLine().substring(15);
                    status2 = rax.readLine().substring(8);
                    workDoneDate = rax.readLine().substring(16);
                    totalPrice2 = rax.readLine().substring(13);
                    paymentStatus = rax.readLine().substring(9);
                    rax.readLine();

                    if (salesID.equals(salesID2)) {
                        reportArray.add(salesID);
                        reportArray.add(salesName);
                        reportArray.add(customerName);
                        reportArray.add(productName);
                        reportArray.add(productType);
                        reportArray.add(status);
                        reportArray.add(paymentStatus);
                        reportArray.add(amount);
                        reportArray.add(totalPrice);
                    }
                }
                rax.close();  // Close the "invoice.txt" file after processing all lines
            }
        }

        raf.close();  // Close the "sales.txt" file after processing all lines

            
        return "Success";
    }
}
