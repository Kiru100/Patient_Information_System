package guiproject;

import com.sun.glass.events.KeyEvent;
import com.toedter.calendar.JTextFieldDateEditor;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

public class EditPatientRecord extends javax.swing.JFrame {
    ArrayList<RegisterNewPatient> patients;
    JTextFieldDateEditor editor;    
    
    public EditPatientRecord() {
        initComponents();
        DateEdit();
        txpatientnumber.setEditable(false);
        patients= new ArrayList<>();
        populateArrayList();
        
        String [] patientinfo=new String[patients.size()];
        
        for (int i = 0; i < patients.size(); i++) {
            patientinfo[i]= patients.get(i).getFirstName() + ", "+patients.get(i).getLastName();
        }    
        cbpatientnumber.setModel(new javax.swing.DefaultComboBoxModel<>( patientinfo ));
        
    }

    public void populateArrayList()
    {
        try
        {
            FileInputStream file=new FileInputStream("patient.txt");
            ObjectInputStream input=new ObjectInputStream(file);
            
            boolean endofFile=false;
            
            while(!endofFile)
            {
                try
                {
                    patients.add((RegisterNewPatient) input.readObject());
                }
                catch (EOFException e)
                {
                    endofFile =true;
                }
                catch (Exception f)
                {
                    JOptionPane.showMessageDialog(null, f.getMessage());
                }
            }
            input.close();
        }
        catch (IOException e)
        {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        
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
            JOptionPane.showMessageDialog(null, "Succesfully updated patient record.");
            this.dispose();
        }
        catch(IOException e)
        {
            JOptionPane.showMessageDialog(null, e.getMessage());  
        }
    }
    
    private void DateEdit()
    {
        editor=(JTextFieldDateEditor)dcbirthday.getDateEditor();
        editor.setEditable(false);
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txfirstname = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txmiddlename = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txlastname = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txcontactnumber = new javax.swing.JTextField();
        cbsex = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txage = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txaddress = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        cbmaritalstatus = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txcpfirstname = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txcpmiddlename = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        txcplastname = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        txcpaddress = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        txcprelationwithpatient = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        txcpcontactnumber = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tasignandsymtoms = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        taallergies = new javax.swing.JTextArea();
        jLabel25 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tamedication = new javax.swing.JTextArea();
        jLabel26 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        talastoralintake = new javax.swing.JTextArea();
        jLabel27 = new javax.swing.JLabel();
        jScrollPane8 = new javax.swing.JScrollPane();
        tapassillness = new javax.swing.JTextArea();
        jLabel28 = new javax.swing.JLabel();
        jScrollPane9 = new javax.swing.JScrollPane();
        taevent = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        dcbirthday = new com.toedter.calendar.JDateChooser();
        jLabel24 = new javax.swing.JLabel();
        cbbloodtype1 = new javax.swing.JComboBox<>();
        cbpatientnumber = new javax.swing.JComboBox<>();
        txpatientnumber = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 51));
        jPanel1.setToolTipText("");

        jPanel2.setBackground(new java.awt.Color(0, 51, 102));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Patient Information System");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(147, 147, 147))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Edit Patient Record");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Choose Patient to Edit");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("First Name");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Patient Personal Information ");

        txfirstname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txfirstnameActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Middle Name");

        txmiddlename.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txmiddlenameActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Last Name");

        txlastname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txlastnameActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Age ");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Sex");

        txcontactnumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txcontactnumberActionPerformed(evt);
            }
        });
        txcontactnumber.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txcontactnumberKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txcontactnumberKeyTyped(evt);
            }
        });

        cbsex.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));
        cbsex.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbsexActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Birthday");

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Contact No.");

        txage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txageActionPerformed(evt);
            }
        });
        txage.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txageKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txageKeyTyped(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Address");

        txaddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txaddressActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Blood Type");

        cbmaritalstatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Single", "Married" }));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Patient Health Information");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("First Name");

        txcpfirstname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txcpfirstnameActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Middle Name");

        txcpmiddlename.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txcpmiddlenameActionPerformed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Last Name");

        txcplastname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txcplastnameActionPerformed(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Address");

        txcpaddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txcpaddressActionPerformed(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Contact No.");

        txcprelationwithpatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txcprelationwithpatientActionPerformed(evt);
            }
        });

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Relation with the Patient ");

        txcpcontactnumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txcpcontactnumberActionPerformed(evt);
            }
        });
        txcpcontactnumber.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txcpcontactnumberKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txcpcontactnumberKeyTyped(evt);
            }
        });

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Emergency Contact Person Information");

        jLabel22.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Medical Symptoms or Sign of Disease");

        jLabel23.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("Allergies");

        tasignandsymtoms.setColumns(20);
        tasignandsymtoms.setRows(5);
        jScrollPane2.setViewportView(tasignandsymtoms);

        taallergies.setColumns(20);
        taallergies.setRows(5);
        jScrollPane4.setViewportView(taallergies);

        jLabel25.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("Medication");

        tamedication.setColumns(20);
        tamedication.setRows(5);
        jScrollPane5.setViewportView(tamedication);

        jLabel26.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setText("Past Illnesses");

        talastoralintake.setColumns(20);
        talastoralintake.setRows(5);
        jScrollPane7.setViewportView(talastoralintake);

        jLabel27.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setText("Last Oral Intake");

        tapassillness.setColumns(20);
        tapassillness.setRows(5);
        jScrollPane8.setViewportView(tapassillness);

        jLabel28.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setText("Events  Lead to Injury or Illness");

        taevent.setColumns(20);
        taevent.setRows(5);
        jScrollPane9.setViewportView(taevent);

        jButton1.setText("Edit Patient Information ");
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

        dcbirthday.setDateFormatString("MMMM d, yyyy");

        jLabel24.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("Marital Status");

        cbbloodtype1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "O+", "O-", "A+", "A-", "B+", "B-", "AB+", "AB-" }));
        cbbloodtype1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbbloodtype1ActionPerformed(evt);
            }
        });

        cbpatientnumber.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbpatientnumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbpatientnumberActionPerformed(evt);
            }
        });

        txpatientnumber.setBackground(new java.awt.Color(0, 0, 51));
        txpatientnumber.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txpatientnumber.setForeground(new java.awt.Color(255, 255, 255));
        txpatientnumber.setBorder(null);
        txpatientnumber.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txpatientnumberKeyTyped(evt);
            }
        });

        jLabel29.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setText("Patient Number");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(217, 217, 217))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel4))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txfirstname, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(txmiddlename, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txlastname, javax.swing.GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE)
                                    .addComponent(txaddress))))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel24, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(19, 19, 19)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txcontactnumber)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(cbbloodtype1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbmaritalstatus, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel10)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txage, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cbsex, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(dcbirthday, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel12)
                            .addComponent(jLabel17)
                            .addComponent(jLabel18))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txcplastname, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
                            .addComponent(txcpmiddlename, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txcpfirstname, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txcpaddress, javax.swing.GroupLayout.Alignment.LEADING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel20)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txcprelationwithpatient, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel19)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txcpcontactnumber))))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jButton1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButton2))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane9, javax.swing.GroupLayout.DEFAULT_SIZE, 599, Short.MAX_VALUE)
                            .addComponent(jLabel28)
                            .addComponent(jScrollPane8, javax.swing.GroupLayout.DEFAULT_SIZE, 599, Short.MAX_VALUE)
                            .addComponent(jLabel27)
                            .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 599, Short.MAX_VALUE)
                            .addComponent(jLabel26)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 599, Short.MAX_VALUE)
                            .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 599, Short.MAX_VALUE)
                            .addComponent(jLabel25)
                            .addComponent(jLabel22)
                            .addComponent(jScrollPane2)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel29)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txpatientnumber, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(cbpatientnumber, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(35, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(179, 179, 179))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel21)
                                .addGap(115, 115, 115))))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addGap(158, 158, 158))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cbpatientnumber, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel29)
                    .addComponent(txpatientnumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txfirstname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(dcbirthday, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txmiddlename, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbmaritalstatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbsex, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txlastname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbbloodtype1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txcontactnumber, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txaddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(23, 23, 23)
                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txcpfirstname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txcprelationwithpatient, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txcpmiddlename, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txcpcontactnumber))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txcplastname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txcpaddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel22)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel28)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap())
        );

        jScrollPane1.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 681, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 447, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbpatientnumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbpatientnumberActionPerformed

        try {
            int selectedindex=cbpatientnumber.getSelectedIndex();
            
            String age = ""+patients.get(selectedindex).getAge()+"";
            String contact=""+patients.get(selectedindex).getContactNumber()+"";
            String patientcontactnumber= ""+patients.get(selectedindex).getPatientContactNumber()+"";
            String patientnumber=""+patients.get(selectedindex).getPatientnumber()+"";

            txpatientnumber.setText(patientnumber);
            txfirstname.setText(patients.get(selectedindex).getFirstName());
            txmiddlename.setText(patients.get(selectedindex).getMiddleName());
            txlastname.setText(patients.get(selectedindex).getLastName());
            txaddress.setText(patients.get(selectedindex).getAddress());
            txage.setText(age);
            txcontactnumber.setText(patientcontactnumber);
            txcpfirstname.setText(patients.get(selectedindex).getCPFirstname());
            txcpmiddlename.setText(patients.get(selectedindex).getCPMiddlename());
            txcplastname.setText(patients.get(selectedindex).getCPLastname());
            txcpaddress.setText(patients.get(selectedindex).getContactAddress());
            txcprelationwithpatient.setText(patients.get(selectedindex).getRelationWithPatient());
            txcpcontactnumber.setText(contact);
            tasignandsymtoms.setText(patients.get(selectedindex).getSignsSymptoms());
            taallergies.setText(patients.get(selectedindex).getAllergies());
            tamedication.setText(patients.get(selectedindex).getMedications());
            tapassillness.setText(patients.get(selectedindex).getPastIllnesses());
            talastoralintake.setText(patients.get(selectedindex).getLastOralIntake());
            taevent.setText(patients.get(selectedindex).getEventLeadtoIlnessInjury());
            cbbloodtype1.setSelectedItem(patients.get(selectedindex).getBloodtype());
            cbsex.setSelectedItem(patients.get(selectedindex).getSex());
            cbmaritalstatus.setSelectedItem(patients.get(selectedindex).getMaritalStatus());

            String birth=patients.get(selectedindex).getBirthdate();
            Date Format = new SimpleDateFormat("MMMM d, yyyy").parse(birth);
            dcbirthday.setDate(Format);
        } catch (ParseException ex) {
            Logger.getLogger(EditPatientRecord.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_cbpatientnumberActionPerformed

    private void cbbloodtype1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbbloodtype1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbbloodtype1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        SimpleDateFormat Format = new SimpleDateFormat("MMMM d, yyyy");

        if(txfirstname.getText().isEmpty()||
            txmiddlename.getText().isEmpty()||
            txlastname.getText().isEmpty()||
            txaddress.getText().isEmpty()||
            txage.getText().isEmpty()||
            txcontactnumber.getText().isEmpty()||
            txcpfirstname.getText().isEmpty()||
            txcpmiddlename.getText().isEmpty()||
            txcplastname.getText().isEmpty()||
            txcpaddress.getText().isEmpty()||
            txcprelationwithpatient.getText().isEmpty()||
            txcpcontactnumber.getText().isEmpty()||
            tasignandsymtoms.getText().isEmpty()||
            taallergies.getText().isEmpty()||
            tamedication.getText().isEmpty()||
            tapassillness.getText().isEmpty()||
            talastoralintake.getText().isEmpty()||
            taevent.getText().isEmpty()||
            cbsex.getItemAt(cbsex.getSelectedIndex()).isEmpty()||
            cbmaritalstatus.getItemAt(cbmaritalstatus.getSelectedIndex()).isEmpty()||
           dcbirthday.getDate()==null
        )
        {
            JOptionPane.showMessageDialog(null," Please complete all fields.");
        }else
        {
            int selectedIndex=cbpatientnumber.getSelectedIndex();
            patients.get(selectedIndex).setPatientnumber(Long.parseLong(txpatientnumber.getText().trim()));
            patients.get(selectedIndex).setFirstName(txfirstname.getText().trim());
            patients.get(selectedIndex).setMiddleName(txmiddlename.getText().trim());
            patients.get(selectedIndex).setLastName(txlastname.getText().trim());
            patients.get(selectedIndex).setAddress(txaddress.getText().trim());
            patients.get(selectedIndex).setContactNumber(Long.parseLong(txcpcontactnumber.getText().trim()));
            patients.get(selectedIndex).setAge(Integer.parseInt(txage.getText().trim()));
            patients.get(selectedIndex).setSex(cbsex.getItemAt(cbsex.getSelectedIndex()));
            patients.get(selectedIndex).setBirthDate(Format.format(dcbirthday.getDate()));
            patients.get(selectedIndex).setContactNumber(Long.parseLong(txcontactnumber.getText()));
            patients.get(selectedIndex).setBloodtype(cbbloodtype1.getItemAt(cbbloodtype1.getSelectedIndex()));
            patients.get(selectedIndex).setMaritalStatus(cbmaritalstatus.getItemAt(cbmaritalstatus.getSelectedIndex()));
            patients.get(selectedIndex).setCPFirstname(txcpfirstname.getText());
            patients.get(selectedIndex).setCPMiddlename(txcpmiddlename.getText());
            patients.get(selectedIndex).setCPLastname(txcplastname.getText());
            patients.get(selectedIndex).setContactAddress(txaddress.getText().trim());
            patients.get(selectedIndex).setPatientContactNumber(Long.parseLong(txcontactnumber.getText().trim()));
            patients.get(selectedIndex).setRelationWithPatient(txcprelationwithpatient.getText());
            patients.get(selectedIndex).setSignsSymptoms(tasignandsymtoms.getText());
            patients.get(selectedIndex).setAllergies(taallergies.getText());
            patients.get(selectedIndex).setMedications(tamedication.getText());
            patients.get(selectedIndex).setPastIllnesses(tapassillness.getText());
            patients.get(selectedIndex).setLastOralIntake(talastoralintake.getText());
            patients.get(selectedIndex).setEventLeadtoIlnessInjury(taevent.getText());
            saveAccount();
            this.dispose();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txcpcontactnumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txcpcontactnumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txcpcontactnumberActionPerformed

    private void txcprelationwithpatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txcprelationwithpatientActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txcprelationwithpatientActionPerformed

    private void txcpaddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txcpaddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txcpaddressActionPerformed

    private void txcplastnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txcplastnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txcplastnameActionPerformed

    private void txcpmiddlenameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txcpmiddlenameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txcpmiddlenameActionPerformed

    private void txcpfirstnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txcpfirstnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txcpfirstnameActionPerformed

    private void txaddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txaddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txaddressActionPerformed

    private void txageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txageActionPerformed

    private void cbsexActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbsexActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbsexActionPerformed

    private void txcontactnumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txcontactnumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txcontactnumberActionPerformed

    private void txlastnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txlastnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txlastnameActionPerformed

    private void txmiddlenameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txmiddlenameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txmiddlenameActionPerformed

    private void txfirstnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txfirstnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txfirstnameActionPerformed

    private void txageKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txageKeyTyped
        char character=evt.getKeyChar();
        if(!(Character.isDigit(character)|| character==KeyEvent.VK_BACKSPACE|| character==KeyEvent.VK_DELETE))
        {
            getToolkit().beep();
            evt.consume();
        }
        
        String number=txage.getText();
        int length=number.length();
        
        if (evt.getKeyChar()>='0' && evt.getKeyChar()<='3')
        {
            if (length<3)
            {
               txage.setEditable(true);
            }
            else
            {
                getToolkit().beep();
                txage.setEditable(false);
            }
        }else 
        {
            if(evt.getExtendedKeyCode()==KeyEvent.VK_BACKSPACE || evt.getExtendedKeyCode()==KeyEvent.VK_DELETE)
            {
                txage.setEditable(true);
            }else 
            {
                getToolkit().beep();
                txage.setEditable(false);
            }
        }
        
        
        
    }//GEN-LAST:event_txageKeyTyped

    private void txcontactnumberKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txcontactnumberKeyTyped
       char character=evt.getKeyChar();
        if(!(Character.isDigit(character)|| character==KeyEvent.VK_BACKSPACE|| character==KeyEvent.VK_DELETE))
        {
            getToolkit().beep();
            evt.consume();
        }     
    }//GEN-LAST:event_txcontactnumberKeyTyped

    private void txcpcontactnumberKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txcpcontactnumberKeyTyped
        char character=evt.getKeyChar();
        if(!(Character.isDigit(character)|| character==KeyEvent.VK_BACKSPACE|| character==KeyEvent.VK_DELETE))
        {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txcpcontactnumberKeyTyped

    private void txpatientnumberKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txpatientnumberKeyTyped
        char character=evt.getKeyChar();
        if(!(Character.isDigit(character)|| character==KeyEvent.VK_BACKSPACE|| character==KeyEvent.VK_DELETE))
        {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txpatientnumberKeyTyped

    private void txageKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txageKeyPressed
         String number=txage.getText();
        int length=number.length();
        
        if (evt.getKeyChar()>='0' && evt.getKeyChar()<='3')
        {
            if (length<3)
            {
               txage.setEditable(true);
            }
            else
            {
                getToolkit().beep();
                txage.setEditable(false);
            }
        }else 
        {
            if(evt.getExtendedKeyCode()==KeyEvent.VK_BACKSPACE || evt.getExtendedKeyCode()==KeyEvent.VK_DELETE)
            {
                txage.setEditable(true);
            }else 
            {
                getToolkit().beep();
                txage.setEditable(false);
            }
        }
    }//GEN-LAST:event_txageKeyPressed

    private void txcontactnumberKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txcontactnumberKeyPressed
        String number=txcontactnumber.getText();
        int length=number.length();
        
        if (evt.getKeyChar()>='0' && evt.getKeyChar()<='9')
        {
            if (length<11)
            {
               txcontactnumber.setEditable(true);
            }
            else
            {
                getToolkit().beep();
                txcontactnumber.setEditable(false);
            }
        }
        else 
        {
            if(evt.getExtendedKeyCode()==KeyEvent.VK_BACKSPACE || evt.getExtendedKeyCode()==KeyEvent.VK_DELETE)
            {
                txcontactnumber.setEditable(true);
            }
            else 
            {
                getToolkit().beep();
                txcontactnumber.setEditable(false);
            }
        }
    }//GEN-LAST:event_txcontactnumberKeyPressed

    private void txcpcontactnumberKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txcpcontactnumberKeyPressed
        String number=txcpcontactnumber.getText();
        int length=number.length();
        
        if (evt.getKeyChar()>='0' && evt.getKeyChar()<='9')
        {
            if (length<11)
            {
               txcpcontactnumber.setEditable(true);
            }
            else
            {
                getToolkit().beep();
                txcpcontactnumber.setEditable(false);
            }
        }
        else 
        {
            if(evt.getExtendedKeyCode()==KeyEvent.VK_BACKSPACE || evt.getExtendedKeyCode()==KeyEvent.VK_DELETE)
            {
                txcpcontactnumber.setEditable(true);
            }
            else 
            {
               getToolkit().beep();
               txcpcontactnumber.setEditable(false);
            }
        }
    }//GEN-LAST:event_txcpcontactnumberKeyPressed

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
            java.util.logging.Logger.getLogger(EditPatientRecord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditPatientRecord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditPatientRecord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditPatientRecord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditPatientRecord().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbbloodtype1;
    private javax.swing.JComboBox<String> cbmaritalstatus;
    private javax.swing.JComboBox<String> cbpatientnumber;
    private javax.swing.JComboBox<String> cbsex;
    private com.toedter.calendar.JDateChooser dcbirthday;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTextArea taallergies;
    private javax.swing.JTextArea taevent;
    private javax.swing.JTextArea talastoralintake;
    private javax.swing.JTextArea tamedication;
    private javax.swing.JTextArea tapassillness;
    private javax.swing.JTextArea tasignandsymtoms;
    private javax.swing.JTextField txaddress;
    private javax.swing.JTextField txage;
    private javax.swing.JTextField txcontactnumber;
    private javax.swing.JTextField txcpaddress;
    private javax.swing.JTextField txcpcontactnumber;
    private javax.swing.JTextField txcpfirstname;
    private javax.swing.JTextField txcplastname;
    private javax.swing.JTextField txcpmiddlename;
    private javax.swing.JTextField txcprelationwithpatient;
    private javax.swing.JTextField txfirstname;
    private javax.swing.JTextField txlastname;
    private javax.swing.JTextField txmiddlename;
    private javax.swing.JTextField txpatientnumber;
    // End of variables declaration//GEN-END:variables
}
