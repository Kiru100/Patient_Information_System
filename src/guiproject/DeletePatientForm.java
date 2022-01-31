package guiproject;

import com.sun.glass.events.KeyEvent;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class DeletePatientForm extends javax.swing.JFrame {

    ArrayList<RegisterNewPatient> patients;
    ArrayList<RegisterNewPatient> deleted;
    
    public DeletePatientForm() {
        initComponents();
        patients = new ArrayList<>();
        populateArrayList();

        String arrTable[][] = new String[patients.size()][3];
        for (int i = 0; i < patients.size(); i++) {
            
            long ln = patients.get(i).getPatientnumber();
            String id = "" + ln + "";
  
            arrTable[i][0] = id;
            arrTable[i][2] = patients.get(i).getFirstName();
            arrTable[i][1] = patients.get(i).getLastName();
        }
        jTable3.setModel(new javax.swing.table.DefaultTableModel(
                arrTable,
                 new String[]{
                    "Patient No.", "Last Name", "First Name"
                }
        ));

    }
    
    public void saveAccount()
    {
        try
        {
            FileOutputStream newfile=new FileOutputStream("patient.txt");   
            ObjectOutputStream outputofFile=new ObjectOutputStream(newfile);
            
            for (int i = 0; i < patients.size(); i++) 
            {
                outputofFile.writeObject(patients.get(i));               
            }
            outputofFile.close();
            JOptionPane.showMessageDialog(null, "Succesfully deleted patient record.");
            this.dispose();
        }
        catch(IOException e)
        {
            JOptionPane.showMessageDialog(null, e.getMessage());  
        }
    }

    public void populateArrayList() {
        try {
            FileInputStream file = new FileInputStream("patient.txt");
            ObjectInputStream input = new ObjectInputStream(file);

            boolean endofFile = false;

            while (!endofFile) {
                try {
                    patients.add((RegisterNewPatient) input.readObject());
                } catch (EOFException e) {
                    endofFile = true;
                } catch (Exception f) {
                    getToolkit().beep();
                    JOptionPane.showMessageDialog(null, f.getMessage());
                }
            }
            input.close();
        } catch (IOException e) {
            getToolkit().beep();
            JOptionPane.showMessageDialog(null, e.getMessage());
        }

    }
   

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jProgressBar1 = new javax.swing.JProgressBar();
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jFileChooser1 = new javax.swing.JFileChooser();
        buttonGroup3 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        Idtoremove = new javax.swing.JTextField();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAutoRequestFocus(false);

        jPanel1.setBackground(new java.awt.Color(0, 0, 51));
        jPanel1.setForeground(new java.awt.Color(0, 0, 51));

        jPanel2.setBackground(new java.awt.Color(0, 51, 102));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Patient Information System");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(40, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(38, 38, 38))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Delete Patient Record");

        jButton1.setText("Remove Patient");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Cancel");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Find Patient");

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Patient No.", "Last Name", "First Name"
            }
        ));
        jTable3.setAutoscrolls(false);
        jTable3.setName(""); // NOI18N
        jTable3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTable3KeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(jTable3);
        if (jTable3.getColumnModel().getColumnCount() > 0) {
            jTable3.getColumnModel().getColumn(0).setPreferredWidth(64);
            jTable3.getColumnModel().getColumn(1).setResizable(false);
            jTable3.getColumnModel().getColumn(1).setPreferredWidth(115);
            jTable3.getColumnModel().getColumn(2).setResizable(false);
            jTable3.getColumnModel().getColumn(2).setPreferredWidth(115);
        }

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Enter Patient Number to Remove ");

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField1KeyReleased(evt);
            }
        });

        Idtoremove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IdtoremoveActionPerformed(evt);
            }
        });
        Idtoremove.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                IdtoremoveKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                IdtoremoveKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(117, 117, 117)
                        .addComponent(jLabel4)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Idtoremove)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField1)))
                .addGap(49, 49, 49))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addGap(7, 7, 7)
                .addComponent(Idtoremove, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextField1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyReleased
        DefaultTableModel table = (DefaultTableModel)jTable3.getModel();
        String search = jTextField1.getText();
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<>(table);
        jTable3.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(search));
    }//GEN-LAST:event_jTextField1KeyReleased

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTable3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTable3KeyReleased

    }//GEN-LAST:event_jTable3KeyReleased

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    if (Idtoremove.getText().isEmpty())
    {
        getToolkit().beep();
        JOptionPane.showMessageDialog(null," You haven't entered patient number yet.");
    }
    else 
    {
        long parse=Long.parseLong(Idtoremove.getText());
        boolean condition=false;
       
            for (int i = 0; i < patients.size(); i++) 
            {
                if(parse==patients.get(i).getPatientnumber())
                {                   
                    patients.remove(i);  
                    condition=true;
                }
            }
       if(condition==true)
       {
            saveAccount();
       }
       else 
       {
           getToolkit().beep();
           JOptionPane.showMessageDialog(null, "Invalid patient number!");
       } 
    }
    }//GEN-LAST:event_jButton1ActionPerformed
    private void IdtoremoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IdtoremoveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IdtoremoveActionPerformed

    private void IdtoremoveKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_IdtoremoveKeyTyped
        char character=evt.getKeyChar();
        if(!(Character.isDigit(character)|| character==KeyEvent.VK_BACKSPACE|| character==KeyEvent.VK_DELETE))
        {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_IdtoremoveKeyTyped

    private void IdtoremoveKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_IdtoremoveKeyPressed
       String number=Idtoremove.getText();
        int length=number.length();
        
        if (evt.getKeyChar()>='0' && evt.getKeyChar()<='9')
        {
            if (length<11)
            {
               Idtoremove.setEditable(true);
            }
            else
            {
                getToolkit().beep();
                Idtoremove.setEditable(false);
            }
        }
        else 
        {
            if(evt.getExtendedKeyCode()==KeyEvent.VK_BACKSPACE || evt.getExtendedKeyCode()==KeyEvent.VK_DELETE)
            {
                Idtoremove.setEditable(true);
            }
            else 
            {
                getToolkit().beep();
                Idtoremove.setEditable(false);
            }
        }
    }//GEN-LAST:event_IdtoremoveKeyPressed

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
            java.util.logging.Logger.getLogger(DeletePatientForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DeletePatientForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DeletePatientForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DeletePatientForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DeletePatientForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Idtoremove;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable3;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
