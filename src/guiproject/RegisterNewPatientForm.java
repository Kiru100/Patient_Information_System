package guiproject;
import com.sun.glass.events.KeyEvent;
import com.toedter.calendar.JTextFieldDateEditor;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.Random;
public class RegisterNewPatientForm extends javax.swing.JFrame {
    ArrayList<RegisterNewPatient> patients;
    JTextFieldDateEditor editor;    
    public RegisterNewPatientForm() {
        initComponents(); 
        DateEdit();
        patients= new ArrayList<>();
        populateArrayList();
        txpatientnumber.setEditable(false);
        Random ran=new Random();
        int idnumber=ran.nextInt(100000);
        txpatientnumber.setText(""+idnumber+"");
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
                    endofFile=true;
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
            JOptionPane.showMessageDialog(null, "Succesfully Created  New Patient");
            this.dispose();
        }
        catch(IOException e)
        {
            JOptionPane.showMessageDialog(null, e.getMessage());  
        }
    }
    
    public int setRandomNumberID()
    {
        Random ran=new Random();
        int ranumber=ran.nextInt(10000);
        return ranumber;
    }
    
    
    private void DateEdit()
    {
        editor=(JTextFieldDateEditor)dcbirthday.getDateEditor();
        editor.setEditable(false);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        jDialog1 = new javax.swing.JDialog();
        jTextField5 = new javax.swing.JTextField();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTextArea6 = new javax.swing.JTextArea();
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
        txpatientnumber = new javax.swing.JTextField();

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("jRadioButtonMenuItem1");

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });

        jTextArea6.setColumns(20);
        jTextArea6.setRows(5);
        jScrollPane6.setViewportView(jTextArea6);

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
                .addContainerGap(201, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(160, 160, 160))
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
        jLabel2.setText("Register New Patient");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Patient Number");

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
        txfirstname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txfirstnameKeyPressed(evt);
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
        tasignandsymtoms.setLineWrap(true);
        tasignandsymtoms.setRows(5);
        jScrollPane2.setViewportView(tasignandsymtoms);

        taallergies.setColumns(20);
        taallergies.setLineWrap(true);
        taallergies.setRows(5);
        jScrollPane4.setViewportView(taallergies);

        jLabel25.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("Medication");

        tamedication.setColumns(20);
        tamedication.setLineWrap(true);
        tamedication.setRows(5);
        jScrollPane5.setViewportView(tamedication);

        jLabel26.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setText("Past Illnesses");

        talastoralintake.setColumns(20);
        talastoralintake.setLineWrap(true);
        talastoralintake.setRows(5);
        jScrollPane7.setViewportView(talastoralintake);

        jLabel27.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setText("Last Oral Intake");

        tapassillness.setColumns(20);
        tapassillness.setLineWrap(true);
        tapassillness.setRows(5);
        jScrollPane8.setViewportView(tapassillness);

        jLabel28.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setText("Events  lead to Injury or Illness");

        taevent.setColumns(20);
        taevent.setLineWrap(true);
        taevent.setRows(5);
        jScrollPane9.setViewportView(taevent);

        jButton1.setText("Save");
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

        txpatientnumber.setBackground(new java.awt.Color(0, 0, 51));
        txpatientnumber.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txpatientnumber.setForeground(new java.awt.Color(255, 255, 255));
        txpatientnumber.setBorder(null);
        txpatientnumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txpatientnumberActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addGap(241, 241, 241))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6)
                            .addComponent(jLabel15))
                        .addGap(9, 9, 9))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel12)
                            .addComponent(jLabel18)
                            .addComponent(jLabel17))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txmiddlename, javax.swing.GroupLayout.DEFAULT_SIZE, 261, Short.MAX_VALUE)
                    .addComponent(txfirstname)
                    .addComponent(txlastname, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 261, Short.MAX_VALUE)
                    .addComponent(txaddress)
                    .addComponent(txcpfirstname)
                    .addComponent(txcpmiddlename)
                    .addComponent(txcplastname)
                    .addComponent(txcpaddress, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel20)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txcprelationwithpatient))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel19)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txcpcontactnumber))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel24)
                            .addComponent(jLabel16)
                            .addComponent(jLabel14)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txcontactnumber)
                            .addComponent(dcbirthday, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cbmaritalstatus, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cbbloodtype1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txage, javax.swing.GroupLayout.DEFAULT_SIZE, 63, Short.MAX_VALUE)
                                    .addComponent(cbsex, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                .addGap(24, 24, 24))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txpatientnumber, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(193, 193, 193)
                        .addComponent(jLabel8)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addGap(205, 205, 205))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 599, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel28)
                            .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 599, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel27)
                            .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 599, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel26)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 599, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 599, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel22)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 599, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel25)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap(195, Short.MAX_VALUE)
                    .addComponent(jLabel21)
                    .addGap(138, 138, 138)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txpatientnumber, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txfirstname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(dcbirthday, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txmiddlename, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbmaritalstatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txlastname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbbloodtype1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cbsex, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txaddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txcontactnumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(64, 64, 64)
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
                .addGap(18, 18, 18)
                .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
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
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap())
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(322, 322, 322)
                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(790, Short.MAX_VALUE)))
        );

        jScrollPane1.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 711, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 590, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txlastnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txlastnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txlastnameActionPerformed

    private void txmiddlenameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txmiddlenameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txmiddlenameActionPerformed

    private void txfirstnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txfirstnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txfirstnameActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void txcontactnumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txcontactnumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txcontactnumberActionPerformed

    private void cbsexActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbsexActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbsexActionPerformed

    private void txageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txageActionPerformed

    private void txaddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txaddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txaddressActionPerformed

    private void txcpfirstnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txcpfirstnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txcpfirstnameActionPerformed

    private void txcpmiddlenameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txcpmiddlenameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txcpmiddlenameActionPerformed

    private void txcplastnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txcplastnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txcplastnameActionPerformed

    private void txcpaddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txcpaddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txcpaddressActionPerformed

    private void txcprelationwithpatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txcprelationwithpatientActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txcprelationwithpatientActionPerformed

    private void txcpcontactnumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txcpcontactnumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txcpcontactnumberActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      
        SimpleDateFormat Format = new SimpleDateFormat("MMMM dd, yyyy");
        DecimalFormat decimalFormat = new DecimalFormat("00000000000");
         String myStringRepOfInt = String.format("%011d", 0);
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
            getToolkit().beep();
            JOptionPane.showMessageDialog(null," Please Enter All Fields");
        }else
        {
            
            String firstname=txfirstname.getText().trim();
            String middlename=txmiddlename.getText().trim();
            String lastname=txlastname.getText().trim();
            String address=txaddress.getText().trim();           
            String age=txage.getText().trim();
            String sex=cbsex.getItemAt(cbsex.getSelectedIndex());
            String birthday=Format.format(dcbirthday.getDate());
            String contactnumber=txcontactnumber.getText();
            String bloodtype=cbbloodtype1.getItemAt(cbbloodtype1.getSelectedIndex());
            String maritalstatus=cbmaritalstatus.getItemAt(cbmaritalstatus.getSelectedIndex());
            String cpfirstname=txcpfirstname.getText();
            String cpmiddlename=txcpmiddlename.getText();
            String cplastname=txcplastname.getText();
            String cpadddress=txcpaddress.getText();
            String relationshiptopatient=txcprelationwithpatient.getText();
            String cpcontactnumber=txcpcontactnumber.getText();
            String signsymptoms=tasignandsymtoms.getText();
            String allergies=taallergies.getText();
            String medication=tamedication.getText();
            String pastillness=tapassillness.getText();
            String lastoralintake=talastoralintake.getText();
            String event=taevent.getText();
            String patientnumber=txpatientnumber.getText();
           
            RegisterNewPatient registernewpatient=new RegisterNewPatient
                                        (cpfirstname,cpmiddlename,cplastname,
                                        relationshiptopatient,cpadddress,signsymptoms,allergies,
                                        medication,pastillness,lastoralintake,event,Long.parseLong(cpcontactnumber),bloodtype,
                                        maritalstatus,Long.parseLong(contactnumber),Long.parseLong(patientnumber),
                                        firstname,lastname,middlename,sex,address,birthday,Integer.parseInt(age)
                                        );
            patients.add(registernewpatient);
            saveAccount();           
            this.dispose();     
        }
            
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.dispose();
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txpatientnumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txpatientnumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txpatientnumberActionPerformed

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

    private void txageKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txageKeyTyped
        char character=evt.getKeyChar();
        if(!(Character.isDigit(character)|| character==KeyEvent.VK_BACKSPACE|| character==KeyEvent.VK_DELETE))
        {
            getToolkit().beep();
            evt.consume();
        } 
    }//GEN-LAST:event_txageKeyTyped

    private void txageKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txageKeyPressed
        String number=txage.getText();
        int length=number.length();
        
        if (evt.getKeyChar()>='0' && evt.getKeyChar()<='9')
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
        }
        else 
        {
            if(evt.getExtendedKeyCode()==KeyEvent.VK_BACKSPACE || evt.getExtendedKeyCode()==KeyEvent.VK_DELETE)
            {
                txage.setEditable(true);
            }
            else 
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

    private void txfirstnameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfirstnameKeyPressed

    }//GEN-LAST:event_txfirstnameKeyPressed

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
            java.util.logging.Logger.getLogger(RegisterNewPatientForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegisterNewPatientForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegisterNewPatientForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegisterNewPatientForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegisterNewPatientForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbbloodtype1;
    private javax.swing.JComboBox<String> cbmaritalstatus;
    private javax.swing.JComboBox<String> cbsex;
    private com.toedter.calendar.JDateChooser dcbirthday;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JDialog jDialog1;
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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTextArea jTextArea6;
    private javax.swing.JTextField jTextField5;
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
