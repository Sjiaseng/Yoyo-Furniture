/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package admin_interface;

/**
 *
 * @author user
 */


import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;

public abstract interface Report {
    // Constants String for Variable
    String FROM_DATE = "fromDate";
    String TO_DATE = "toDate";
    
    String SALES_ID = "salesID";
    String PRODUCT_NAME = "productName";
    String PRODUCT_TYPE = "productType";
    String PRICE = "price";
    String PHONE_NUMBER = "phoneNumber";
    String CUSTOMER_NAME = "customerName";
    String AMOUNT = "amount";
    String DELIVERY = "delivery";
    String ADDRESS = "address";
    String DATE = "date";
    String STATUS = "status";
    String APPROVAL = "approval";
    String REASON = "reason";
    String TOTAL_PRICE = "totalPrice";
    String SALES_NAME = "salesName";

    String SALES_ID_2 = "salesID2";
    String CUSTOMER_NAME_2 = "customerName2";
    String STATUS_2 = "status2";
    String WORK_DONE_DATE = "workDoneDate";
    String TOTAL_PRICE_2 = "totalPrice2";
    String PAYMENT_STATUS = "paymentStatus";
    
    int count_invoice_lines() throws FileNotFoundException;
    int count_sales_lines() throws FileNotFoundException;
    String getReportData() throws FileNotFoundException, IOException, ParseException;
}