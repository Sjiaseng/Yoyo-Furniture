/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package admin_interface;

import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author user
 */
public class Admin_Closedsale_Report extends javax.swing.JFrame {

    /**
     * Creates new form navigator
     */
    public Admin_Closedsale_Report() {
        initComponents();
        LocalDate mydate = LocalDate.now();
        String today = mydate.toString();
        date2.setText(today);
        String[] Session = User.mySession;
        username2.setText(Session[7]);
        
        Reports1.setBackground(Color.white);
        Reports2.setForeground(Color.black);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        navigator = new javax.swing.JPanel();
        Reports1 = new javax.swing.JPanel();
        Reports2 = new javax.swing.JLabel();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0));
        Dashboard1 = new javax.swing.JPanel();
        Dashboard2 = new javax.swing.JLabel();
        Register1 = new javax.swing.JPanel();
        Register2 = new javax.swing.JLabel();
        Admins1 = new javax.swing.JPanel();
        Admins2 = new javax.swing.JLabel();
        Officers1 = new javax.swing.JPanel();
        Officers2 = new javax.swing.JLabel();
        Sales1 = new javax.swing.JPanel();
        Sales2 = new javax.swing.JLabel();
        username1 = new javax.swing.JLabel();
        role1 = new javax.swing.JLabel();
        date1 = new javax.swing.JLabel();
        role2 = new javax.swing.JLabel();
        username2 = new javax.swing.JLabel();
        date2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        Logout = new javax.swing.JPanel();
        LogoutBtn = new javax.swing.JLabel();
        profile = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        backbtn = new javax.swing.JButton();
        goBtn = new javax.swing.JButton();
        toDate = new com.toedter.calendar.JDateChooser();
        jLabel3 = new javax.swing.JLabel();
        fromDate = new com.toedter.calendar.JDateChooser();
        jLabel4 = new javax.swing.JLabel();
        pdfBtn = new javax.swing.JButton();
        reportPane = new javax.swing.JScrollPane();
        reportBG = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        reportName = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        reportDate = new javax.swing.JLabel();
        closetable = new javax.swing.JTable(){
            @Override
            public boolean isCellEditable(int row, int column) {
                return false; // Make all cells not editable
            }
        };
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        background.setBackground(new java.awt.Color(255, 255, 255));
        background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        navigator.setBackground(new java.awt.Color(0, 0, 0));
        navigator.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Reports1.setBackground(new java.awt.Color(0, 0, 0));
        Reports1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Reports1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Reports1MouseClicked(evt);
            }
        });
        Reports1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Reports2.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        Reports2.setForeground(new java.awt.Color(255, 255, 255));
        Reports2.setText("Reports");
        Reports1.add(Reports2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 5, 100, 30));
        Reports1.add(filler1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, -1, -1));

        navigator.add(Reports1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 160, 40));

        Dashboard1.setBackground(new java.awt.Color(0, 0, 0));
        Dashboard1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Dashboard1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Dashboard1MouseClicked(evt);
            }
        });
        Dashboard1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Dashboard2.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        Dashboard2.setForeground(new java.awt.Color(255, 255, 255));
        Dashboard2.setText("Dashboard");
        Dashboard2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Dashboard1.add(Dashboard2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 100, 20));

        navigator.add(Dashboard1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 160, 40));

        Register1.setBackground(new java.awt.Color(0, 0, 0));
        Register1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Register1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Register1MouseClicked(evt);
            }
        });
        Register1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Register2.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        Register2.setForeground(new java.awt.Color(255, 255, 255));
        Register2.setText("Registration");
        Register1.add(Register2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 110, 40));

        navigator.add(Register1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 160, 40));

        Admins1.setBackground(new java.awt.Color(0, 0, 0));
        Admins1.setForeground(new java.awt.Color(255, 255, 255));
        Admins1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Admins1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Admins1MouseClicked(evt);
            }
        });
        Admins1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Admins2.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        Admins2.setForeground(new java.awt.Color(255, 255, 255));
        Admins2.setText("Admins");
        Admins1.add(Admins2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 60, 20));

        navigator.add(Admins1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 160, 40));

        Officers1.setBackground(new java.awt.Color(0, 0, 0));
        Officers1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Officers1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Officers1MouseClicked(evt);
            }
        });
        Officers1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Officers2.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        Officers2.setForeground(new java.awt.Color(255, 255, 255));
        Officers2.setText("Officers");
        Officers1.add(Officers2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 60, 20));

        navigator.add(Officers1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 160, 40));

        Sales1.setBackground(new java.awt.Color(0, 0, 0));
        Sales1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Sales1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Sales1MouseClicked(evt);
            }
        });
        Sales1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Sales2.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        Sales2.setForeground(new java.awt.Color(255, 255, 255));
        Sales2.setText("Sales Person");
        Sales1.add(Sales2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 100, 20));

        navigator.add(Sales1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 160, 40));

        username1.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        username1.setForeground(new java.awt.Color(255, 255, 255));
        username1.setText("Username :");
        navigator.add(username1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, -1, -1));

        role1.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        role1.setForeground(new java.awt.Color(255, 255, 255));
        role1.setText("Role :");
        navigator.add(role1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 430, -1, -1));

        date1.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        date1.setForeground(new java.awt.Color(255, 255, 255));
        date1.setText("Date :");
        navigator.add(date1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 460, -1, -1));

        role2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        role2.setForeground(new java.awt.Color(255, 255, 255));
        role2.setText("Admin");
        navigator.add(role2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 430, -1, -1));

        username2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        username2.setForeground(new java.awt.Color(255, 255, 255));
        username2.setText("Sample");
        navigator.add(username2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 400, 90, -1));

        date2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        date2.setForeground(new java.awt.Color(255, 255, 255));
        date2.setText("DD/MM/YYYY");
        navigator.add(date2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 460, 120, -1));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 3, 25)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Yoyo Furniture");
        navigator.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        background.add(navigator, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 200, 490));

        Logout.setBackground(new java.awt.Color(255, 255, 255));
        Logout.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Logout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LogoutMouseClicked(evt);
            }
        });
        Logout.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LogoutBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        LogoutBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logout.jpg"))); // NOI18N
        LogoutBtn.setText("Logout");
        LogoutBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Logout.add(LogoutBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 90, 20));

        background.add(Logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 10, 100, 40));

        profile.setBackground(new java.awt.Color(0, 0, 0));
        profile.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        profile.setForeground(new java.awt.Color(255, 255, 255));
        profile.setText("My Profile");
        profile.setBorder(null);
        profile.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        profile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                profileActionPerformed(evt);
            }
        });
        background.add(profile, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 10, 100, 40));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel2.setText("Closed Sales Report");
        background.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 20, -1, -1));

        backbtn.setBackground(new java.awt.Color(255, 255, 255));
        backbtn.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        backbtn.setText("Back");
        backbtn.setBorder(null);
        backbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbtnActionPerformed(evt);
            }
        });
        background.add(backbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 10, 80, 40));

        goBtn.setBackground(new java.awt.Color(0, 0, 0));
        goBtn.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        goBtn.setForeground(new java.awt.Color(255, 255, 255));
        goBtn.setText("Go");
        goBtn.setBorder(null);
        goBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        goBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goBtnActionPerformed(evt);
            }
        });
        background.add(goBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 70, 50, 30));

        toDate.setBackground(new java.awt.Color(255, 255, 255));
        toDate.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        background.add(toDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 70, 130, 30));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel3.setText("TO");
        background.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 70, 20, 30));

        fromDate.setBackground(new java.awt.Color(255, 255, 255));
        fromDate.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        background.add(fromDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 70, 130, 30));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel4.setText("FROM");
        background.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 70, -1, 30));

        pdfBtn.setBackground(new java.awt.Color(0, 0, 0));
        pdfBtn.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        pdfBtn.setForeground(new java.awt.Color(255, 255, 255));
        pdfBtn.setText("Print / PDF");
        pdfBtn.setBorder(null);
        pdfBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pdfBtnActionPerformed(evt);
            }
        });
        background.add(pdfBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 70, 90, 30));

        reportPane.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        reportPane.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        reportBG.setBackground(new java.awt.Color(255, 255, 255));
        reportBG.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel5.setText("Yoyo Furniture Sdn. Bhd.");
        reportBG.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 30, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        jLabel6.setText("Lot 1-12, 1st Floor, Plaza Seri Setia, ");
        reportBG.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 70, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        jLabel7.setText(" Jalan SS9/2, Petaling Jaya, 47300, Petaling Jaya, Selangor");
        reportBG.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 90, -1, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        jLabel8.setText("Tel: 012-3760433");
        reportBG.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 110, -1, 20));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        jLabel9.setText("Email: Yoyo@gmail.com");
        reportBG.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 100, -1, 40));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel10.setText("Closed Sales Report");
        reportBG.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 140, -1, -1));

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        reportBG.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 170, 190, 10));

        reportName.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        reportName.setForeground(new java.awt.Color(153, 153, 153));
        reportName.setText("Generated By: Name ");
        reportBG.add(reportName, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 5, -1, -1));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel12.setText("ID");
        reportBG.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 43, 30));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel13.setText("Reason");
        reportBG.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 210, 70, 30));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel15.setText("Sales Person");
        reportBG.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 210, -1, 30));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel16.setText("Type");
        reportBG.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 210, 50, 30));

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        reportBG.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 1170, -1));

        reportDate.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        reportDate.setForeground(new java.awt.Color(153, 152, 153));
        reportDate.setText("Date: DD/MM/YYYY HH:MM");
        reportBG.add(reportDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 10, 190, -1));

        closetable.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        DefaultTableModel model = new DefaultTableModel(0,8);
        closetable.setModel(model);
        closetable.setSelectionBackground(new java.awt.Color(0, 0, 0));
        closetable.setShowGrid(true);
        reportBG.add(closetable, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 1170, -1));
        String[] data = new String[8];
        data[0] = "-";
        data[1] = "-";
        data[2] = "-";
        data[3] = "-";
        data[4] = "-";
        data[5] = "-";
        data[6] = "-";
        data[7] = "-";
        model.addRow(data);

        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(SwingConstants.CENTER);
        // Apply the center renderer to all columns
        for (int i = 0; i < closetable.getColumnCount(); i++) {
            closetable.getColumnModel().getColumn(i).setCellRenderer(centerRenderer);
        }
        closetable.setRowHeight(35);
        closetable.getColumnModel().getColumn(0).setPreferredWidth(15);
        closetable.getColumnModel().getColumn(1).setPreferredWidth(150);
        closetable.getColumnModel().getColumn(2).setPreferredWidth(150);
        closetable.getColumnModel().getColumn(3).setPreferredWidth(150);
        closetable.getColumnModel().getColumn(4).setPreferredWidth(75);
        closetable.getColumnModel().getColumn(5).setPreferredWidth(235);
        closetable.getColumnModel().getColumn(6).setPreferredWidth(15);
        closetable.getColumnModel().getColumn(7).setPreferredWidth(35);

        jLabel18.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel18.setText("Total Price");
        reportBG.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 210, 80, 30));

        jLabel19.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel19.setText("Unit");
        reportBG.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 210, 80, 30));

        jLabel20.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel20.setText("Customer");
        reportBG.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 210, -1, 30));

        jLabel21.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel21.setText("Furniture Name");
        reportBG.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 210, 110, 30));

        reportPane.setViewportView(reportBG);

        background.add(reportPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 120, 580, 390));

        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 530));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogoutMouseClicked
        int n = JOptionPane.showConfirmDialog(null,"Would you like to Logout" + " ?", "Logout", JOptionPane.YES_NO_OPTION);
        if(n==JOptionPane.YES_OPTION){
            String[] Session = User.mySession;
            for (int i = 0; i < Session.length; i++) {
                Session[i] = "";
            }
         
            Login a = new Login();
            a.setVisible(true);
            this.setVisible(false); 
        }
    }//GEN-LAST:event_LogoutMouseClicked

    private void Register1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Register1MouseClicked
        try {
            Admin_Registration a = new Admin_Registration();
            a.setVisible(true);
            this.setVisible(false); 
        } catch (IOException ex) {
            Logger.getLogger(Admin_Closedsale_Report.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_Register1MouseClicked

    private void Dashboard1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Dashboard1MouseClicked
        try {
            Admin_Dashboard a = new Admin_Dashboard();
            a.setVisible(true);
            this.setVisible(false);
        } catch (IOException ex) {
            Logger.getLogger(Admin_Closedsale_Report.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_Dashboard1MouseClicked

    private void Admins1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Admins1MouseClicked
        Admin_Admin_List a = new Admin_Admin_List();
        a.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_Admins1MouseClicked

    private void Officers1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Officers1MouseClicked
        Admin_Officer_List a = new Admin_Officer_List();
        a.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_Officers1MouseClicked

    private void Sales1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Sales1MouseClicked
        Admin_Sale_List a = new Admin_Sale_List();
        a.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_Sales1MouseClicked

    private void Reports1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Reports1MouseClicked
        Admin_Reports a = new Admin_Reports();        
        a.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_Reports1MouseClicked

    private void profileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_profileActionPerformed
        Admin_Myprofile a = new Admin_Myprofile();        
        a.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_profileActionPerformed

    private void backbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbtnActionPerformed
        Admin_Reports a = new Admin_Reports();
        a.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_backbtnActionPerformed
    private void printComponent(Component component) {
        // Create a PrinterJob
        PrinterJob printerJob = PrinterJob.getPrinterJob();
        printerJob.setJobName("Print Job");

        // Set a Printable implementation
        Printable printable = new Printable() {
            @Override
            public int print(Graphics graphics, PageFormat pageFormat, int pageIndex) throws PrinterException {
                if (pageIndex > 0) {
                    return Printable.NO_SUCH_PAGE;
                }

                // Cast Graphics to Graphics2D
                Graphics2D g2d = (Graphics2D) graphics;

                // Calculate scale factor for the component
                double scaleX = pageFormat.getImageableWidth() / component.getWidth();
                double scaleY = pageFormat.getImageableHeight() / component.getHeight();
                double scale = Math.min(scaleX, scaleY);

                // Apply scaling transformation
                g2d.translate(pageFormat.getImageableX(), pageFormat.getImageableY());
                g2d.scale(scale, scale);

                // Paint the component onto the graphics
                component.paint(g2d);

                return Printable.PAGE_EXISTS;
            }
        };

        // Set the Printable on the PrinterJob
        printerJob.setPrintable(printable);

        // Show a print dialog to the user
        if (printerJob.printDialog()) {
            try {
                // Perform the printing
                printerJob.print();
            } catch (PrinterException e) {
                e.printStackTrace();
                // Handle the exception as needed
            }
        }
    }
    private void pdfBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pdfBtnActionPerformed
        try {
            // Get the content of the JScrollPane
            Component view = reportPane.getViewport().getView();

            // Create a PrinterJob and print the component
            printComponent(view);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_pdfBtnActionPerformed

    private void goBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goBtnActionPerformed
        Date startdate = fromDate.getDate();
        Date enddate = toDate.getDate();
        // Retrieve data

        // Clear Array
        ArrayList<String> reportArrayList = ClosedSalesReport.reportArray;
        reportArrayList.clear();
        
        // Check Input From Retrieved Data
        if (startdate == null || enddate == null) {
            JOptionPane.showMessageDialog(null, "Please select a range of date!", "Alert", JOptionPane.INFORMATION_MESSAGE);
        } else {
            try {
                SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
                String startingDate = dateFormat.format(startdate);
                String endingDate = dateFormat.format(enddate);
                ClosedSalesReport report = new ClosedSalesReport(startingDate, endingDate);
                String check = report.getReportData();
                DefaultTableModel model = new DefaultTableModel(0,8);
                closetable.setModel(model);
                model.setRowCount(0);
                
                if(check == "Success"){
                    
                    String[] Session = User.mySession;
                    reportName.setText("Generated By: " + Session[0]);
                    // Get Current Date
                    LocalDateTime currentDateTime = LocalDateTime.now();
                    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
                    String mydate = currentDateTime.format(formatter);
                    reportDate.setText("Generation Date: " + mydate);
                     // Check Array       
                    if(!reportArrayList.isEmpty()){
                        for (int i = 0; i < reportArrayList.size(); i += 8) {
                            model.addRow(reportArrayList.subList(i, Math.min(i + 8, reportArrayList.size())).toArray());
                        }
                        
                        int columnIndexToSum = 7;  //Total Price Column
                        int rowCount = model.getRowCount(); //Obtain amount of rows in jtable
                        double sum = 0;

                        for (int row = 0; row < rowCount; row++) {
                            Object value = model.getValueAt(row, columnIndexToSum);
                            if (value instanceof String) {
                                String stringValue = (String) value;
                                String numericValue = stringValue.replaceAll("RM", "").trim();
                                double numericDoubleValue = Double.parseDouble(numericValue);
                                sum += numericDoubleValue;
                            }
                        }
                            
                            Object[] rowData = new Object[]{"-","-","-","-","-","-","Total : ","RM"+ sum};
                            model.addRow(rowData);
                            int lastRowIndex = model.getRowCount() - 1;
                            int lastColumnIndex = model.getColumnCount() - 1;

                            // Bold Font
                            for (int i = lastColumnIndex - 1; i <= lastColumnIndex; i++) {
                                closetable.setValueAt("<html><b>" + model.getValueAt(lastRowIndex, i) + "</b></html>", lastRowIndex, i);
                            }
                        // Middle Alignment of every Data
                        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
                        centerRenderer.setHorizontalAlignment(SwingConstants.CENTER);
                        for (int i = 0; i < closetable.getColumnCount(); i++) {
                            closetable.getColumnModel().getColumn(i).setCellRenderer(centerRenderer);
                        }
                        // Handle width of each column
                        closetable.setRowHeight(35);
                        closetable.getColumnModel().getColumn(0).setPreferredWidth(15);
                        closetable.getColumnModel().getColumn(1).setPreferredWidth(150); 
                        closetable.getColumnModel().getColumn(2).setPreferredWidth(150); 
                        closetable.getColumnModel().getColumn(3).setPreferredWidth(150);
                        closetable.getColumnModel().getColumn(4).setPreferredWidth(75); 
                        closetable.getColumnModel().getColumn(5).setPreferredWidth(235); 
                        closetable.getColumnModel().getColumn(6).setPreferredWidth(15); 
                        closetable.getColumnModel().getColumn(7).setPreferredWidth(35);
                    }    
                        
                        
                    if(reportArrayList.size() == 0){
                        JOptionPane.showMessageDialog(null, "No Records Found !", "Alert", JOptionPane.INFORMATION_MESSAGE);
                        model.setRowCount(0);
                    }
                             
                }
            
            }catch (IOException ex) {
                Logger.getLogger(Admin_Workdone_Report.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ParseException ex) {
                Logger.getLogger(Admin_Workdone_Report.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_goBtnActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Admin_Closedsale_Report.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admin_Closedsale_Report.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admin_Closedsale_Report.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin_Closedsale_Report.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admin_Closedsale_Report().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Admins1;
    private javax.swing.JLabel Admins2;
    private javax.swing.JPanel Dashboard1;
    private javax.swing.JLabel Dashboard2;
    private javax.swing.JPanel Logout;
    private javax.swing.JLabel LogoutBtn;
    private javax.swing.JPanel Officers1;
    private javax.swing.JLabel Officers2;
    private javax.swing.JPanel Register1;
    private javax.swing.JLabel Register2;
    private javax.swing.JPanel Reports1;
    private javax.swing.JLabel Reports2;
    private javax.swing.JPanel Sales1;
    private javax.swing.JLabel Sales2;
    private javax.swing.JButton backbtn;
    private javax.swing.JPanel background;
    private javax.swing.JTable closetable;
    private javax.swing.JLabel date1;
    private javax.swing.JLabel date2;
    private javax.swing.Box.Filler filler1;
    private com.toedter.calendar.JDateChooser fromDate;
    private javax.swing.JButton goBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JPanel navigator;
    private javax.swing.JButton pdfBtn;
    private javax.swing.JButton profile;
    private javax.swing.JPanel reportBG;
    private javax.swing.JLabel reportDate;
    private javax.swing.JLabel reportName;
    private javax.swing.JScrollPane reportPane;
    private javax.swing.JLabel role1;
    private javax.swing.JLabel role2;
    private com.toedter.calendar.JDateChooser toDate;
    private javax.swing.JLabel username1;
    private javax.swing.JLabel username2;
    // End of variables declaration//GEN-END:variables
}
