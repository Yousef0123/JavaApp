

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.table.DefaultTableModel;
import Project.connectionProvider;
import com.mysql.cj.x.protobuf.MysqlxSql;
import com.mysql.cj.xdevapi.DbDoc;
import java.security.interfaces.RSAKey;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.DefaultListModel;
import java.sql.*;
import java.util.Vector;
import javax.swing.DefaultListModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.DriverManager;
import java.sql.ResultSetMetaData;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.RowFilter;
import static javax.swing.UIManager.getInt;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;


/**
 *
 * @author m0063
 */
public class studentinfo extends javax.swing.JFrame {
    Connection conn;
 
    public studentinfo() {
        initComponents();
        /*
          String url="jdbc:mysql://localhost/lms";
    String user="root";
    String pass="7230676";
    try{
    
    conn = DriverManager.getConnection(url,user,pass);
    }
    catch(Exception ex){
    System.out.print("Error : " + ex.getMessage());
}*/
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jButton1.setText("Add Student");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Delete");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Back");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Refresh");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "studentID", "name", "fatherName", "courseName", "branchName"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jButton5.setText("Search");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(136, 136, 136)
                                .addComponent(jLabel1)
                                .addGap(160, 160, 160))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jButton1)
                                    .addComponent(jButton4))
                                .addGap(47, 47, 47)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jButton2)
                                    .addComponent(jButton3))
                                .addGap(77, 77, 77)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton5)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // the add Student Button
        setVisible(true);
        new newStudent().setVisible(true);
       
           
       
       
        // 2. Execute a SELECT query
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // Refresh Button in studentinfo
        try {
        Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
         e.printStackTrace();
        }

        // 2. Establish a connection to the database
        String url = "jdbc:mysql://localhost:3306/lms";
        String username = "root";
        String password = "7230676";

       try (Connection conn = DriverManager.getConnection(url, username, password);
     Statement stmt = conn.createStatement();
     ResultSet rs = stmt.executeQuery("SELECT studentID, name, fatherName, courseName, branchName FROM student")) {

    // 3. Create the table model
    DefaultTableModel model = new DefaultTableModel();
  
    // 4. Get the column names and add them to the model
    ResultSetMetaData meta = rs.getMetaData();
    int columnCount = meta.getColumnCount();
    for (int i = 1; i <= columnCount; i++) {
    model.addColumn(meta.getColumnName(i));
    }
  
    // 5. Add the rows to the model
    while (rs.next()) {
    Object[] row = new Object[columnCount];
    for (int i = 1; i <= columnCount; i++) {
      if (i == 1) {
        row[i - 1] = rs.getInt(i);
      } else {
        row[i - 1] = rs.getString(i);
      }
    }
    model.addRow(row);
    }
  
    // 6. Set the model for the JTable
    jTable1.setModel(model);
    } catch (SQLException e) {
    e.printStackTrace();
    }
          
    }//GEN-LAST:event_jButton4ActionPerformed
    // The Back Button 
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
         setVisible(false);
         new home().setVisible(true);
         
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // delete Button 
         // Get the selected row index
    int row = jTable1.getSelectedRow();
    if (row == -1) {
      // No row was selected
      JOptionPane.showMessageDialog(null, "Please select a student to delete.", "Error", JOptionPane.ERROR_MESSAGE);
      return;
    }
    // Confirm delete
    int confirm = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete this student?", "Confirm", JOptionPane.YES_NO_OPTION);
    if (confirm == JOptionPane.NO_OPTION) {
      return;
    }
    // Get the selected student ID
    int studentID = (int) jTable1.getValueAt(row, 0);
    // Delete the student from the database
    String url = "jdbc:mysql://localhost:3306/lms";
    String username = "root";
    String password = "7230676";
    try (Connection conn = DriverManager.getConnection(url, username, password);
         Statement stmt = conn.createStatement()) {
      String sql = "DELETE FROM student WHERE studentID = " + studentID;
      stmt.executeUpdate(sql);
    } catch (SQLException ex) {
      ex.printStackTrace();
      return;
    }
    // Delete the student from the table model
    DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
    model.removeRow(row);
  


    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
     // Get the search value
    String searchValue = jTextField1.getText();
    // Create a row filter to search for the value
    TableRowSorter<TableModel> sorter = new TableRowSorter<>(jTable1.getModel());
    sorter.setRowFilter(RowFilter.regexFilter("(?i)" + searchValue));
    // Set the row sorter for the table
    jTable1.setRowSorter(sorter);
   
    }//GEN-LAST:event_jButton5ActionPerformed

  
    public static void main(String args[]) {
       

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new studentinfo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
