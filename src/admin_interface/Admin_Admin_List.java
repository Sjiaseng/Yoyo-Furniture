/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package admin_interface;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.time.LocalDate;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumn;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author user
 */
public class Admin_Admin_List extends javax.swing.JFrame {

    /**
     * Creates new form navigator
     */
    public Admin_Admin_List() {
        initComponents();
        
        Admins1.setBackground(Color.white);
        Admins2.setForeground(Color.black);
        
        LocalDate mydate = LocalDate.now();
        String today = mydate.toString();
        date2.setText(today);
        String[] Session = User.mySession;
        username2.setText(Session[7]);
    }
    
    // Transfering to Other Page
    public void view_admin(){
        Admin_Admin_View a = new Admin_Admin_View();
        a.setVisible(true);
        this.setVisible(false);
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
        searchAdmin = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        adminTable = new javax.swing.JTable(){
            @Override
            public boolean isCellEditable(int row, int column) {
                return false; // Make all cells not editable
            }
        };
        jLabel3 = new javax.swing.JLabel();

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

        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel2.setText("Searching For Admins : ");
        background.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 80, -1, -1));

        searchAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchAdminActionPerformed(evt);
            }
        });
        searchAdmin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchAdminKeyReleased(evt);
            }
        });
        background.add(searchAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 80, 370, -1));

        String[] COLUMN_NAMES = {"Name", "Contact", "IC", "Username", "Actions"};
        DefaultTableModel model = new DefaultTableModel(COLUMN_NAMES, 0);
        adminTable.setModel(model);
        adminTable.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        adminTable.setGridColor(new java.awt.Color(255, 255, 255));
        adminTable.setSelectionBackground(new java.awt.Color(102, 102, 102));
        adminTable.getTableHeader().setReorderingAllowed(false);
        try (RandomAccessFile raf = new RandomAccessFile(new File("user.txt"), "r")) {
            File file = new File("user.txt");
            Scanner scanner = new Scanner(file);
            int count = 0;

            while (scanner.hasNextLine()) {
                scanner.nextLine();
                count++;
            }
            scanner.close();

            String[] Session = User.mySession;

            for (int i = 0; i < count / 10; i++) {

                String username, name, email, phone, ic, role, contact;
                String[] data = new String[4];

                name = raf.readLine().substring(6);
                email = raf.readLine().substring(7);
                raf.readLine();
                phone = raf.readLine().substring(7);
                ic = raf.readLine().substring(4);
                raf.readLine();
                role = raf.readLine().substring(6);
                username = raf.readLine().substring(10);
                raf.readLine();
                raf.readLine();

                if(role.equals("Administrator")){
                    if(username.equals(Session[7])){
                        // Skip the loop if username is equal to Session[7]
                        continue;
                    }
                    else{
                        // Store username, email, phone, and ic in the data array
                        data[0] = name;
                        contact = "<html>" + phone + "<br>" + email;
                        data[1] = contact;
                        data[2] = ic;
                        data[3] = username;
                    };
                }else{
                    continue;
                }

                model.addRow(data);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        adminTable.setRowHeight(35);
        adminTable.getColumnModel().getColumn(0).setPreferredWidth(115); // Name
        adminTable.getColumnModel().getColumn(1).setPreferredWidth(200); // Contact
        adminTable.getColumnModel().getColumn(2).setPreferredWidth(145); // IC
        adminTable.getColumnModel().getColumn(3).setPreferredWidth(110); // Username
        adminTable.getColumnModel().getColumn(4).setPreferredWidth(100); // Actions

        adminTable.getTableHeader().setDefaultRenderer((table, value, isSelected, hasFocus, row, column) -> {
            DefaultTableCellRenderer renderer = new DefaultTableCellRenderer();
            renderer.setHorizontalAlignment(JLabel.CENTER);

            // Set the background color for the header row (all columns in the first row)
            for(column = 0; column < 5; column++){
                renderer.setBackground(java.awt.Color.BLACK);
                renderer.setForeground(java.awt.Color.WHITE);
                renderer.setPreferredSize(new Dimension(renderer.getWidth(), 30));
            }

            return renderer.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
        });

        // button of view
        TableColumn actionsColumn = adminTable.getColumnModel().getColumn(4);
        actionsColumn.setCellRenderer(new TableCellRenderer() {
            private final JButton button = new JButton("View");

            @Override
            public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
                button.setBackground(Color.BLACK);
                button.setForeground(Color.WHITE);

                Font boldFont = button.getFont().deriveFont(Font.BOLD);
                button.setFont(boldFont);

                return button;
            }
        });

        // Add MouseListener to capture mouse clicks on the table
        adminTable.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int selectedRow = adminTable.getSelectedRow();
                if (selectedRow != -1 && adminTable.columnAtPoint(e.getPoint()) == 4) {
                    int modelRow = adminTable.convertRowIndexToModel(selectedRow);
                    String username = (String) adminTable.getModel().getValueAt(modelRow, 3);

                    try{
                        admin_interface.Admin obj1 = new admin_interface.Admin(username);
                        String res = obj1.view_admin_data();
                        if(res == "Success"){
                            view_admin();
                        }

                    }
                    catch(IOException ex) {
                        Logger.getLogger(Admin_Admin_List.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        });
        jScrollPane1.setViewportView(adminTable);

        background.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 120, 540, 390));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel3.setText("Admin List");
        background.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 20, -1, -1));

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
            
            System.out.println(Session[0]);
            
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
            Logger.getLogger(Admin_Admin_List.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_Register1MouseClicked

    private void Dashboard1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Dashboard1MouseClicked
        try {
            Admin_Dashboard a = new Admin_Dashboard();
            a.setVisible(true);
            this.setVisible(false);
        } catch (IOException ex) {
            Logger.getLogger(Admin_Admin_List.class.getName()).log(Level.SEVERE, null, ex);
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

    private void searchAdminKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchAdminKeyReleased
        // Searching Admin Data
        DefaultTableModel obj = (DefaultTableModel) adminTable.getModel();
        TableRowSorter<DefaultTableModel> obj1 = new TableRowSorter<>(obj);
        adminTable.setRowSorter(obj1);
        obj1.setRowFilter(RowFilter.regexFilter(searchAdmin.getText()));
    }//GEN-LAST:event_searchAdminKeyReleased

    private void searchAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchAdminActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchAdminActionPerformed

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
            java.util.logging.Logger.getLogger(Admin_Admin_List.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admin_Admin_List.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admin_Admin_List.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin_Admin_List.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new Admin_Admin_List().setVisible(true);
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
    private javax.swing.JTable adminTable;
    private javax.swing.JPanel background;
    private javax.swing.JLabel date1;
    private javax.swing.JLabel date2;
    private javax.swing.Box.Filler filler1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel navigator;
    private javax.swing.JButton profile;
    private javax.swing.JLabel role1;
    private javax.swing.JLabel role2;
    private javax.swing.JTextField searchAdmin;
    private javax.swing.JLabel username1;
    private javax.swing.JLabel username2;
    // End of variables declaration//GEN-END:variables
}
