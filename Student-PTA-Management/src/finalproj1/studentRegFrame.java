/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalproj1;

import java.awt.GridLayout;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author User
 */
public class studentRegFrame extends javax.swing.JFrame {

    /**
     * Creates new form studentRegFrame
     */
    public studentRegFrame() {
        initComponents();
         buttonGroup1.add(k1);
        buttonGroup1.add(k2);
          buttonGroup1.add(g1);
        buttonGroup1.add(g2);
          buttonGroup1.add(g3);
        buttonGroup1.add(g4);
          buttonGroup1.add(g5);
        buttonGroup1.add(g6);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        lrnfield = new javax.swing.JTextField();
        lnfield = new javax.swing.JTextField();
        fnfield = new javax.swing.JTextField();
        k1 = new javax.swing.JRadioButton();
        k2 = new javax.swing.JRadioButton();
        g6 = new javax.swing.JRadioButton();
        g1 = new javax.swing.JRadioButton();
        g2 = new javax.swing.JRadioButton();
        jButton5 = new javax.swing.JButton();
        g5 = new javax.swing.JRadioButton();
        g3 = new javax.swing.JRadioButton();
        g4 = new javax.swing.JRadioButton();
        scfield = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jTextField5 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        warnfield = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setLayout(null);

        lrnfield.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lrnfield.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(lrnfield);
        lrnfield.setBounds(100, 110, 80, 40);

        lnfield.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lnfield.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(lnfield);
        lnfield.setBounds(100, 190, 150, 40);

        fnfield.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        fnfield.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(fnfield);
        fnfield.setBounds(100, 150, 150, 40);

        k1.setFont(new java.awt.Font("Tahoma", 1, 9)); // NOI18N
        k1.setForeground(new java.awt.Color(255, 255, 255));
        k1.setText("Kinder1");
        k1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                k1ActionPerformed(evt);
            }
        });
        jPanel1.add(k1);
        k1.setBounds(100, 230, 90, 21);

        k2.setFont(new java.awt.Font("Tahoma", 1, 9)); // NOI18N
        k2.setForeground(new java.awt.Color(255, 255, 255));
        k2.setText("Kinder2");
        jPanel1.add(k2);
        k2.setBounds(210, 230, 80, 21);

        g6.setFont(new java.awt.Font("Tahoma", 1, 9)); // NOI18N
        g6.setForeground(new java.awt.Color(255, 255, 255));
        g6.setText("Grade6");
        jPanel1.add(g6);
        g6.setBounds(210, 290, 90, 21);

        g1.setFont(new java.awt.Font("Tahoma", 1, 9)); // NOI18N
        g1.setForeground(new java.awt.Color(255, 255, 255));
        g1.setText("Grade1");
        jPanel1.add(g1);
        g1.setBounds(100, 250, 90, 21);

        g2.setFont(new java.awt.Font("Tahoma", 1, 9)); // NOI18N
        g2.setForeground(new java.awt.Color(255, 255, 255));
        g2.setText("Grade2");
        jPanel1.add(g2);
        g2.setBounds(210, 250, 100, 21);

        jButton5.setBackground(new java.awt.Color(255, 255, 255));
        jButton5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton5.setText("Clear");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5);
        jButton5.setBounds(193, 360, 90, 30);

        g5.setFont(new java.awt.Font("Tahoma", 1, 9)); // NOI18N
        g5.setForeground(new java.awt.Color(255, 255, 255));
        g5.setText("Grade5");
        jPanel1.add(g5);
        g5.setBounds(100, 290, 100, 21);

        g3.setFont(new java.awt.Font("Tahoma", 1, 9)); // NOI18N
        g3.setForeground(new java.awt.Color(255, 255, 255));
        g3.setText("Grade3");
        jPanel1.add(g3);
        g3.setBounds(100, 270, 100, 21);

        g4.setFont(new java.awt.Font("Tahoma", 1, 9)); // NOI18N
        g4.setForeground(new java.awt.Color(255, 255, 255));
        g4.setText("Grade4");
        jPanel1.add(g4);
        g4.setBounds(210, 270, 100, 21);

        scfield.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        scfield.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(scfield);
        scfield.setBounds(100, 320, 150, 40);

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton1.setText("Add Info");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(100, 360, 90, 30);

        jButton9.setBackground(new java.awt.Color(0, 102, 102));
        jButton9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton9.setForeground(new java.awt.Color(255, 255, 255));
        jButton9.setText("Delete Info");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton9);
        jButton9.setBounds(760, 70, 100, 30);

        jButton8.setBackground(new java.awt.Color(0, 102, 102));
        jButton8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton8.setForeground(new java.awt.Color(255, 255, 255));
        jButton8.setText("Clear");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton8);
        jButton8.setBounds(670, 70, 80, 30);

        jTable1.setBorder(new javax.swing.border.MatteBorder(null));
        jTable1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "LRN #", "Last Name", "First Name", "Grade Level", "Section"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(320, 100, 540, 290);

        jTextField5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jPanel1.add(jTextField5);
        jTextField5.setBounds(430, 70, 130, 30);

        jButton2.setBackground(new java.awt.Color(0, 102, 102));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Show All");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(570, 70, 90, 30);

        jButton4.setBackground(new java.awt.Color(255, 255, 255));
        jButton4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton4.setText("Menu");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4);
        jButton4.setBounds(10, 40, 70, 30);

        warnfield.setText("   ");
        jPanel1.add(warnfield);
        warnfield.setBounds(90, 50, 180, 20);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/finalproj1/444444.jpg"))); // NOI18N
        jLabel7.setText("jLabel7");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(0, 0, 870, 400);

        jButton6.setBackground(new java.awt.Color(0, 102, 102));
        jButton6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("Show All");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6);
        jButton6.setBounds(320, 70, 90, 30);

        jButton7.setBackground(new java.awt.Color(0, 102, 102));
        jButton7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton7.setForeground(new java.awt.Color(255, 255, 255));
        jButton7.setText("Show All");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton7);
        jButton7.setBounds(320, 70, 90, 30);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 869, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
menuframe regframe = new menuframe();
                    regframe.setVisible(true); 
                    dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
String line, id, fr, lt, sc ;
        fr = fnfield.getText();
        sc = scfield.getText();
        lt = lnfield.getText(); 
         id = lrnfield.getText();
       
         String radioText = "";
        if (k1.isSelected()) {
            radioText = k1.getText();
        }
        if (k2.isSelected()) {
            radioText = k2.getText();
        }
         if (g1.isSelected()) {
            radioText = g1.getText();
        }
        if (g2.isSelected()) {
            radioText = g2.getText();
        }
         if (g3.isSelected()) {
            radioText = g3.getText();
        }
        if (g4.isSelected()) {
            radioText = g4.getText();
        }
         
            if (g5.isSelected()) {
            radioText = g5.getText();
        }
        if (g6.isSelected()) {
            radioText = g6.getText();
        }
              
	if (lrnfield.getText().equals("") ||
	scfield.getText().equals("") || lnfield.getText().equals("") || fnfield.getText().equals("")
            ) {
	  warnfield.setText("There seems to be missing fields!");
	
       return;
       }
        
        line = id + " " + lt + " " + fr + " " + radioText + " " + sc +  " " +300 + " " + "Unpaid" ;
        
        try {
            save(line, "src\\finalproj1\\StudentInfo.txt");
        } catch (IOException ex) {
            Logger.getLogger(studentRegFrame.class.getName()).log(Level.SEVERE, null, ex);
        }

        
        JOptionPane.showMessageDialog(null, "Student has been register!");


fnfield.setText("");
lnfield.setText("");    
 buttonGroup1.clearSelection();
scfield.setText("");
lrnfield.setText("");
warnfield.setText("");        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
  String filePath = "src\\finalproj1\\StudentInfo.txt";
                    File file = new File(filePath);
                    
        try {
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            
            DefaultTableModel model =(DefaultTableModel) jTable1.getModel();
            Object[] lines = br.lines().toArray();
            
            for(int i = 0; i<  lines.length; i++){
                String[] row = lines[i].toString().split(" ");
                model.addRow(row);
            }
            
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(studentRegFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
                    
                            // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void k1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_k1ActionPerformed
      // TODO add your handling code here:
    }//GEN-LAST:event_k1ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();

        while(model.getRowCount() > 0){
            for(int i = 0; i < model.getRowCount(); i++){
                model.removeRow(i);
            }

        }
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
fnfield.setText("");
lnfield.setText("");    
 buttonGroup1.clearSelection();
scfield.setText("");
lrnfield.setText("");
warnfield.setText("");         // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
editStudent regframe = new editStudent();
                    regframe.setVisible(true); 
                    
    }//GEN-LAST:event_jButton9ActionPerformed

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
            java.util.logging.Logger.getLogger(studentRegFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(studentRegFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(studentRegFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(studentRegFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new studentRegFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField fnfield;
    private javax.swing.JRadioButton g1;
    private javax.swing.JRadioButton g2;
    private javax.swing.JRadioButton g3;
    private javax.swing.JRadioButton g4;
    private javax.swing.JRadioButton g5;
    private javax.swing.JRadioButton g6;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JRadioButton k1;
    private javax.swing.JRadioButton k2;
    private javax.swing.JTextField lnfield;
    private javax.swing.JTextField lrnfield;
    private javax.swing.JTextField scfield;
    private javax.swing.JLabel warnfield;
    // End of variables declaration//GEN-END:variables

   public static void save(String line, String path) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(path, true));
        bw.append(line + "\n");
        bw.close();
    }}