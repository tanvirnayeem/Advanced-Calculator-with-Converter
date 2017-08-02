/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package calculatorAndConverter;

import javax.swing.JComboBox;

/**
 *
 * @author Dell
 */
public class Academic extends javax.swing.JFrame {
    public MianFrame mainmenu;
    final static double combo1Relation[]={1,3600,0.03731136907,37.31136907,37311.36907};
    final static double combo2Relation[]={3600,1,0.03731136907,37.31136907,37311.36907};
    static double relation1=1/3600,fromel=1,toel=3600;
    final static double combo3Relation[]={1,.001,.000001,.00134048,0.2390057,3.412141286};
    final static double combo4Relation[]={.001,1,.000001,.00134048,0.2390057,3.412141286};
    static double relation2=1/.001,frompow=1,topow=.001;
     final static double combo5Relation[]={1,0.101971};
    final static double combo6Relation[]={0.101971,1};
    static double relation3=1/0.101971,fromacc=1,toacc=0.101971;
     final static double combo7Relation[]={1,.0001,1550.0031,10.76391,0.0002471};
    final static double combo8Relation[]={.0001,1,1550.0031,10.76391,0.0002471};
    static double relation4=1/0.0001,fromar=1,toar=.0001;
    final static double combo9Relation[]={1,.1019716213,100000};
    final static double combo10Relation[]={.1019716213,1,100000};
    static double relation5=1/.1019716213,fromfor=1,tofor=.1019716213;
    final static double combo11Relation[]={1,1000,100,0.001,39.37007874,3.280839895,1.093613298,0.006213711922};
    final static double combo12Relation[]={1000,1,100,0.001,39.37007874,3.280839895,1.093613298,0.006213711922};
    static double relation6=1/1000,fromlen=1,tolen=1000;
     final static double combo13Relation[]={1,1,0.0929030436};
    final static double combo14Relation[]={1,1,0.0929030436};
    static double relation7=1/1,fromlght=1,tolght=1;
     final static double combo15Relation[]={1,1,0.0929030436};
    final static double combo16Relation[]={1,1,0.0929030436};
    static double relation8=1/1,frommass=1,tomass=1;
    final static double combo17Relation[]={1,.001,.000001,.00134048,0.2390057,3.412141286};
    final static double combo18Relation[]={.001,1,.000001,.00134048,0.2390057,3.412141286};
    static double relation9=1/.001,frompow2=1,topow2=.001;
    final static double combo19Relation[]={1,.001,7.50061505,0.01};
    final static double combo20Relation[]={.001,1,7.50061505,0.01};
    static double relation10=1/.001,frompns=1,topns=.001;
    final static double combo23Relation[]={1,0.1019716213,8.850748065,0.7375621212};
    final static double combo24Relation[]={0.1019716213,1,8.850748065,0.7375621212};
    static double relation12=1/0.1019716213,fromtorq=1,totorq=0.1019716213;
    final static double combo25Relation[]={1,3.6,3.280839895,2.236936292,1.943844492,3.335640952e-9};
    final static double combo26Relation[]={3.6,1,3.280839895,2.236936292,1.943844492,3.335640952e-9};
    static double relation13=1/3.6,fromvns=1,tovns=3.6;
     final static double combo27Relation[]={1,.001,61.02375899,0.03531466247,0.2641720373};
    final static double combo28Relation[]={.001,1,61.02375899,0.03531466247,0.2641720373};
    static double relation14=1/.001,fromvnc=1,tovnc=0.001;
      final static double combo29Relation[]={1,16,0.0714,.008928,0.0004464};
    final static double combo30Relation[]={16,1,0.0714,.008928,0.0004464};
    static double relation15=1/16,frommass2=1,tomass2=16;
     final static double combo31Relation[]={1,1,2.25,.05,.00333,.001667,2.66,0.5565,.06,10666.667};
    final static double combo32Relation[]={1,1,2.25,.05,.00333,.001667,2.66,0.5565,.06,10666.667};
    static double relation16=1/1,fromar2=1,toar2=1;
    final static double combo33Relation[]={1,660,10,40,.125,.2,.1085526,1000,110};
    final static double combo34Relation[]={660,1,10,40,.125,.2,.1085526,1000,110};
    static double relation17=1/660,fromlen2=1,tolen2=660;
     final static double combo35Relation[]={1,.001,15.85032224,0.03531466247,2.118880197};
    final static double combo36Relation[]={.001,1,15.85032224,0.03531466247,2.118880197};
    static double relation18=1/.001,fromvolf=1,tovolf=.001;
    final static double combo39Relation[]={1,0.1591549431,57.29577952};
    final static double combo40Relation[]={0.1591549431,1,57.29577952};
    static double relation20=1/0.1591549431,fromangle=1,toangle=0.1591549431;
     final static double combo41Relation[]={1,.0001,1550.0031,10.76391,0.0002471};
    final static double combo42Relation[]={.0001,1,1550.0031,10.76391,0.0002471};
    static double relation21=1/0.0001,fromar3=1,toar3=.0001;
    final static double combo45Relation[]={1,0.125,1.2207e-4,1.1921e-7,1.1642e-10,1.1369e-13,1.1102e-16};
    final static double combo46Relation[]={0.125,1,1.2207e-4,1.1921e-7,1.1642e-10,1.1369e-13,1.1102e-16};
    static double relation23=1/0.125,fromds=1,tods=.125;
     final static double combo47Relation[]={1,3600,0.03731136907,37.31136907,37311.36907};
    final static double combo48Relation[]={3600,1,0.03731136907,37.31136907,37311.36907};
    static double relation24=1/3600,fromel2=1,toel2=3600;
    final static double combo49Relation[]={1,.001,.000001,.00134048,0.2390057,3.412141286};
    final static double combo50Relation[]={.001,1,.000001,.00134048,0.2390057,3.412141286};
    static double relation25=1/.001,frompow3=1,topow3=.001;
    /**
     * Creates new form Academic
     */
    public Academic(MianFrame mian) {
        mainmenu = mian;
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel8 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel6 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jComboBox5 = new javax.swing.JComboBox();
        jComboBox6 = new javax.swing.JComboBox();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jComboBox7 = new javax.swing.JComboBox();
        jComboBox8 = new javax.swing.JComboBox();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jComboBox9 = new javax.swing.JComboBox();
        jComboBox10 = new javax.swing.JComboBox();
        jTextField9 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jComboBox11 = new javax.swing.JComboBox();
        jComboBox12 = new javax.swing.JComboBox();
        jTextField11 = new javax.swing.JTextField();
        jTextField12 = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jComboBox13 = new javax.swing.JComboBox();
        jComboBox14 = new javax.swing.JComboBox();
        jTextField13 = new javax.swing.JTextField();
        jTextField14 = new javax.swing.JTextField();
        jButton7 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jComboBox15 = new javax.swing.JComboBox();
        jComboBox16 = new javax.swing.JComboBox();
        jTextField15 = new javax.swing.JTextField();
        jTextField16 = new javax.swing.JTextField();
        jButton8 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jComboBox17 = new javax.swing.JComboBox();
        jComboBox18 = new javax.swing.JComboBox();
        jTextField17 = new javax.swing.JTextField();
        jTextField18 = new javax.swing.JTextField();
        jButton9 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jComboBox19 = new javax.swing.JComboBox();
        jComboBox20 = new javax.swing.JComboBox();
        jTextField19 = new javax.swing.JTextField();
        jTextField20 = new javax.swing.JTextField();
        jButton10 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jComboBox21 = new javax.swing.JComboBox();
        jTextField21 = new javax.swing.JTextField();
        jComboBox22 = new javax.swing.JComboBox();
        jTextField22 = new javax.swing.JTextField();
        jButton11 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jComboBox23 = new javax.swing.JComboBox();
        jComboBox24 = new javax.swing.JComboBox();
        jTextField23 = new javax.swing.JTextField();
        jTextField24 = new javax.swing.JTextField();
        jButton12 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jComboBox25 = new javax.swing.JComboBox();
        jComboBox26 = new javax.swing.JComboBox();
        jTextField25 = new javax.swing.JTextField();
        jTextField26 = new javax.swing.JTextField();
        jButton13 = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jComboBox27 = new javax.swing.JComboBox();
        jComboBox28 = new javax.swing.JComboBox();
        jTextField27 = new javax.swing.JTextField();
        jTextField28 = new javax.swing.JTextField();
        jButton14 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jComboBox29 = new javax.swing.JComboBox();
        jComboBox30 = new javax.swing.JComboBox();
        jTextField29 = new javax.swing.JTextField();
        jTextField30 = new javax.swing.JTextField();
        jButton15 = new javax.swing.JButton();
        jComboBox31 = new javax.swing.JComboBox();
        jLabel16 = new javax.swing.JLabel();
        jComboBox32 = new javax.swing.JComboBox();
        jTextField31 = new javax.swing.JTextField();
        jTextField32 = new javax.swing.JTextField();
        jButton16 = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        jComboBox33 = new javax.swing.JComboBox();
        jComboBox34 = new javax.swing.JComboBox();
        jTextField33 = new javax.swing.JTextField();
        jTextField34 = new javax.swing.JTextField();
        jButton17 = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        jComboBox35 = new javax.swing.JComboBox();
        jComboBox36 = new javax.swing.JComboBox();
        jTextField35 = new javax.swing.JTextField();
        jTextField36 = new javax.swing.JTextField();
        jButton18 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jComboBox37 = new javax.swing.JComboBox();
        jComboBox38 = new javax.swing.JComboBox();
        jTextField37 = new javax.swing.JTextField();
        jTextField38 = new javax.swing.JTextField();
        jButton19 = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();
        jComboBox39 = new javax.swing.JComboBox();
        jComboBox40 = new javax.swing.JComboBox();
        jTextField39 = new javax.swing.JTextField();
        jTextField40 = new javax.swing.JTextField();
        jButton20 = new javax.swing.JButton();
        jLabel21 = new javax.swing.JLabel();
        jComboBox41 = new javax.swing.JComboBox();
        jComboBox42 = new javax.swing.JComboBox();
        jTextField41 = new javax.swing.JTextField();
        jTextField42 = new javax.swing.JTextField();
        jButton21 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jComboBox43 = new javax.swing.JComboBox();
        jComboBox44 = new javax.swing.JComboBox();
        jTextField43 = new javax.swing.JTextField();
        jTextField44 = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jComboBox45 = new javax.swing.JComboBox();
        jComboBox46 = new javax.swing.JComboBox();
        jTextField45 = new javax.swing.JTextField();
        jTextField46 = new javax.swing.JTextField();
        jButton22 = new javax.swing.JButton();
        jButton23 = new javax.swing.JButton();
        jLabel24 = new javax.swing.JLabel();
        jComboBox47 = new javax.swing.JComboBox();
        jComboBox48 = new javax.swing.JComboBox();
        jTextField47 = new javax.swing.JTextField();
        jTextField48 = new javax.swing.JTextField();
        jButton24 = new javax.swing.JButton();
        jLabel25 = new javax.swing.JLabel();
        jComboBox49 = new javax.swing.JComboBox();
        jComboBox50 = new javax.swing.JComboBox();
        jTextField49 = new javax.swing.JTextField();
        jTextField50 = new javax.swing.JTextField();
        jButton25 = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jButton26 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox();
        jButton1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox();
        jComboBox4 = new javax.swing.JComboBox();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 395, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 272, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jTabbedPane1.setForeground(new java.awt.Color(204, 0, 51));

        jLabel3.setText("Accelaretion");

        jComboBox5.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "m/sec-square", "G force" }));
        jComboBox5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox5ActionPerformed(evt);
            }
        });

        jComboBox6.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "G force", "m/sec-square", " " }));
        jComboBox6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox6ActionPerformed(evt);
            }
        });

        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });

        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });

        jButton3.setForeground(new java.awt.Color(0, 0, 255));
        jButton3.setText("CONVERT");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel4.setText("area");

        jComboBox7.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "square metre", "hectre", "square inch", "square foot", "acre", "" }));
        jComboBox7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox7ActionPerformed(evt);
            }
        });

        jComboBox8.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "hectre", "square metre", "square inch", "square foot", "acre" }));
        jComboBox8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox8ActionPerformed(evt);
            }
        });

        jTextField7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField7ActionPerformed(evt);
            }
        });

        jTextField8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField8ActionPerformed(evt);
            }
        });

        jButton4.setForeground(new java.awt.Color(0, 0, 255));
        jButton4.setText("CONVERT");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel5.setText("force");

        jComboBox9.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "newton", "kg force", "dyne" }));
        jComboBox9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox9ActionPerformed(evt);
            }
        });

        jComboBox10.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "kg force", "newton", "dyne" }));
        jComboBox10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox10ActionPerformed(evt);
            }
        });

        jTextField9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField9ActionPerformed(evt);
            }
        });

        jTextField10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField10ActionPerformed(evt);
            }
        });

        jButton5.setForeground(new java.awt.Color(0, 0, 255));
        jButton5.setText("CONVERT");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel6.setText("length");

        jComboBox11.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "meter", "milimeter", "centimeter", "kilometer", "inch", "foot", "yard", "mile" }));
        jComboBox11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox11ActionPerformed(evt);
            }
        });

        jComboBox12.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "milimeter", "meter", "centimeter", "kilometer", "inch", "foot", "yard", "mile" }));
        jComboBox12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox12ActionPerformed(evt);
            }
        });

        jTextField11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField11ActionPerformed(evt);
            }
        });

        jTextField12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField12ActionPerformed(evt);
            }
        });

        jButton6.setForeground(new java.awt.Color(0, 0, 255));
        jButton6.setText("CONVERT");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jLabel7.setText("light");

        jComboBox13.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "lux", "lumen/sq.meter", "foot-candle" }));
        jComboBox13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox13ActionPerformed(evt);
            }
        });

        jComboBox14.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "lumen/sq.meter", "lux", "foot-candle" }));
        jComboBox14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox14ActionPerformed(evt);
            }
        });

        jTextField14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField14ActionPerformed(evt);
            }
        });

        jButton7.setForeground(new java.awt.Color(0, 0, 255));
        jButton7.setText("CONVERT");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jLabel8.setText("mass");

        jComboBox15.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "gram", "kilogram", "pound", "ozon", "ton" }));
        jComboBox15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox15ActionPerformed(evt);
            }
        });

        jComboBox16.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "kilogram", "gram", "mass", "ozon", "" }));
        jComboBox16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox16ActionPerformed(evt);
            }
        });

        jButton8.setForeground(new java.awt.Color(0, 0, 255));
        jButton8.setText("CONVERT");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jLabel9.setText("power");

        jComboBox17.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "watt", "kilowatt", "megawatt", "horsepower", "calorie/second", "BTU(SI)/hour" }));
        jComboBox17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox17ActionPerformed(evt);
            }
        });

        jComboBox18.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "kilowatt", "watt", "megawatt", "horsepower", "calorie/second", "BTU(SI)/hour" }));
        jComboBox18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox18ActionPerformed(evt);
            }
        });

        jTextField17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField17ActionPerformed(evt);
            }
        });

        jButton9.setForeground(new java.awt.Color(0, 0, 255));
        jButton9.setText("CONVERT");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jLabel10.setText("pressure and stress");

        jComboBox19.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "kilopascal", "megapascal", "milimeter murcury", "bar" }));
        jComboBox19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox19ActionPerformed(evt);
            }
        });

        jComboBox20.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "megapascal", "killopascal", "millimeter murcury", "bar" }));
        jComboBox20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox20ActionPerformed(evt);
            }
        });

        jButton10.setForeground(new java.awt.Color(0, 0, 255));
        jButton10.setText("CONVERT");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jLabel11.setText("tepmareture");

        jComboBox21.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "farenheit", "calcius", "kelvin" }));
        jComboBox21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox21ActionPerformed(evt);
            }
        });

        jTextField21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField21ActionPerformed(evt);
            }
        });

        jComboBox22.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "farenheit", "calcius", "kelvin" }));
        jComboBox22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox22ActionPerformed(evt);
            }
        });

        jButton11.setText("CONVERT");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jLabel12.setText("torque");

        jComboBox23.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "newton-meter", "kg force meter", "pound force-inch", "pound force foot" }));
        jComboBox23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox23ActionPerformed(evt);
            }
        });

        jComboBox24.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "kg force meter", "newton-meter", "pound force-inch", "pound force foot" }));
        jComboBox24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox24ActionPerformed(evt);
            }
        });

        jButton12.setText("CONVERT");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        jLabel13.setText("velocity and speed");

        jComboBox25.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "meter/sec", "killometer/hour", "foot/second", "mile/hour", "knot", "speed of light" }));
        jComboBox25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox25ActionPerformed(evt);
            }
        });

        jComboBox26.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "killometer/hour", "meter/sec", "foot/second", "mile/hour", "knot", "speed of light" }));
        jComboBox26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox26ActionPerformed(evt);
            }
        });

        jButton13.setText("CONVERT");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        jLabel14.setText("volume and capacity");

        jComboBox27.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "liter", "cubic meter", "cubic inch", "cubic foot", "gallon" }));
        jComboBox27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox27ActionPerformed(evt);
            }
        });

        jComboBox28.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "cubic meter", "liter", "cubic inch", "cubic foot", "gallon" }));
        jComboBox28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox28ActionPerformed(evt);
            }
        });

        jButton14.setText("CONVERT");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(231, 231, 231)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(224, 224, 224)
                        .addComponent(jLabel5))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(221, 221, 221)
                        .addComponent(jLabel6))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(220, 220, 220)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(212, 212, 212)
                        .addComponent(jLabel8))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(207, 207, 207)
                        .addComponent(jLabel9))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(202, 202, 202)
                        .addComponent(jLabel10))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(197, 197, 197)
                        .addComponent(jLabel11))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(202, 202, 202)
                        .addComponent(jLabel13))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(210, 210, 210)
                        .addComponent(jLabel12))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(187, 187, 187)
                        .addComponent(jLabel14))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(jPanel6Layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(jComboBox28, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jTextField28, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel6Layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(jComboBox26, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jTextField26))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel6Layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jComboBox24, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jComboBox23, javax.swing.GroupLayout.Alignment.LEADING, 0, 107, Short.MAX_VALUE))
                                    .addGap(18, 18, 18)
                                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jTextField23)
                                        .addComponent(jTextField24)))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel6Layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(jComboBox22, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jTextField22))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel6Layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(jComboBox21, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jTextField21))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel6Layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jComboBox20, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jComboBox19, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGap(18, 18, 18)
                                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jTextField19)
                                        .addComponent(jTextField20)))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel6Layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(jComboBox18, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jTextField18))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel6Layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(jComboBox17, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jTextField17))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel6Layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jComboBox16, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jComboBox15, javax.swing.GroupLayout.Alignment.LEADING, 0, 107, Short.MAX_VALUE))
                                    .addGap(18, 18, 18)
                                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jTextField15)
                                        .addComponent(jTextField16)))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel6Layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(jComboBox14, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jTextField14))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel6Layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(jComboBox13, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jTextField13))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel6Layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(jComboBox12, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jTextField12))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel6Layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(jComboBox11, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jTextField11))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel6Layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(jComboBox10, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jTextField10))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel6Layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(jComboBox9, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jTextField9))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel6Layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jComboBox8, javax.swing.GroupLayout.Alignment.LEADING, 0, 107, Short.MAX_VALUE)
                                        .addComponent(jComboBox7, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGap(18, 18, 18)
                                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jTextField7)
                                        .addComponent(jTextField8)))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel6Layout.createSequentialGroup()
                                    .addGap(215, 215, 215)
                                    .addComponent(jLabel3))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel6Layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(jComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel6Layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(jComboBox6, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jTextField6))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel6Layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(jComboBox25, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jTextField25)))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jComboBox27, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField27, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(59, 59, 59)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton14)
                            .addComponent(jButton3)
                            .addComponent(jButton4)
                            .addComponent(jButton5)
                            .addComponent(jButton6)
                            .addComponent(jButton7)
                            .addComponent(jButton8)
                            .addComponent(jButton9)
                            .addComponent(jButton10)
                            .addComponent(jButton11)
                            .addComponent(jButton12)
                            .addComponent(jButton13))))
                .addContainerGap(345, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jButton3)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBox8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jButton4)))
                .addGap(51, 51, 51)
                .addComponent(jLabel5)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBox9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jButton5)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addComponent(jLabel6)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBox11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jButton6)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addComponent(jLabel7)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBox13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBox14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jButton7)))
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBox15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jButton8)))
                .addGap(35, 35, 35)
                .addComponent(jLabel9)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBox17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jButton9)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addComponent(jLabel10)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBox19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBox20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jButton10)))
                .addGap(18, 18, 18)
                .addComponent(jLabel11)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jButton11))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBox21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(jButton12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel12)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)))
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addComponent(jButton13)
                .addGap(2, 2, 2)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel14)
                .addGap(26, 26, 26)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox27, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addComponent(jButton14)
                .addGap(5, 5, 5)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(554, Short.MAX_VALUE))
        );

        jScrollPane2.setViewportView(jPanel6);

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 998, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 552, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("PHYSICS", jPanel8);

        jLabel15.setText("Mass");

        jComboBox29.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "pound", "ozon", "stone", "cwt", "ton" }));
        jComboBox29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox29ActionPerformed(evt);
            }
        });

        jComboBox30.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "ozon", "pound", "stone", "cwt", "ton" }));
        jComboBox30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox30ActionPerformed(evt);
            }
        });

        jButton15.setForeground(new java.awt.Color(0, 0, 255));
        jButton15.setText("CONVERT");
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });

        jComboBox31.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "ganda", "sq. hat", "sq. foot", "catak", "katha", "bigha", "sq. yard", "decimal", "acre", "sq. mile" }));
        jComboBox31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox31ActionPerformed(evt);
            }
        });

        jLabel16.setText("Area");

        jComboBox32.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "sq. hat", "ganda", "sq. foot", "catak", "katha", "bigha", "sq. yard", "decimal", "acre", "sq. mile" }));
        jComboBox32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox32ActionPerformed(evt);
            }
        });

        jButton16.setForeground(new java.awt.Color(0, 0, 255));
        jButton16.setText("CONVERT");
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });

        jLabel17.setText("Length");

        jComboBox33.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "flurong", "foot", "gauntar-chain", "poles of rod", "mile", "kilometer", "nautical mile", "link", "fatom" }));
        jComboBox33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox33ActionPerformed(evt);
            }
        });

        jComboBox34.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "foot", "flurong", "gauntar-chain", "poles of rod", "mile", "kilometer", "nautical mile", "link", "fatom" }));
        jComboBox34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox34ActionPerformed(evt);
            }
        });

        jButton17.setForeground(new java.awt.Color(0, 0, 255));
        jButton17.setText("CONVERT");
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });

        jLabel18.setText("Volume Flow");

        jComboBox35.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "liter/sec", "cubic-meter/sec", "gallons", "cubic-foot/sec", "cubic-foot/min" }));
        jComboBox35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox35ActionPerformed(evt);
            }
        });

        jComboBox36.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "cubic-meter/sec", "liter/sec", "gallons", "cubic-foot/sec", "cubic-foot/min" }));
        jComboBox36.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox36ActionPerformed(evt);
            }
        });

        jButton18.setForeground(new java.awt.Color(0, 0, 255));
        jButton18.setText("CONVERT");
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(218, 218, 218)
                        .addComponent(jLabel17))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(220, 220, 220)
                        .addComponent(jLabel16))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(214, 214, 214)
                        .addComponent(jLabel15))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(213, 213, 213)
                        .addComponent(jLabel18))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jComboBox36, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBox35, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBox34, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBox33, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBox32, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBox31, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBox30, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBox29, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(32, 32, 32)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField30, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jTextField36, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField35, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField34, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField33, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField29, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 235, Short.MAX_VALUE)
                                    .addComponent(jTextField31, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField32, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(50, 50, 50)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton15)
                                    .addComponent(jButton16)
                                    .addComponent(jButton17)
                                    .addComponent(jButton18))))))
                .addContainerGap(340, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(jButton15))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addGap(17, 17, 17)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBox29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBox30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(13, 13, 13)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel16)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBox31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBox32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(jButton16)))
                .addGap(29, 29, 29)
                .addComponent(jLabel17)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBox33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBox34, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField34, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jButton17)))
                .addGap(37, 37, 37)
                .addComponent(jLabel18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBox35, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField35, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jButton18)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox36, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField36, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(1096, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("CIVIL ENGINEERING", jPanel4);

        jLabel19.setText("Number base");

        jComboBox37.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "decimal", "binary", "octal", "hexadecimal", "" }));
        jComboBox37.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox37ActionPerformed(evt);
            }
        });

        jComboBox38.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "decimal", "binary", "octal", "hexadecimal", " " }));
        jComboBox38.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox38ActionPerformed(evt);
            }
        });

        jTextField37.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField37ActionPerformed(evt);
            }
        });

        jButton19.setForeground(new java.awt.Color(0, 0, 255));
        jButton19.setText("CONVERT");
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });

        jLabel20.setText("Angles");

        jComboBox39.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "radian", "turns", "degree" }));
        jComboBox39.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox39ActionPerformed(evt);
            }
        });

        jComboBox40.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "turns", "radian", "degree" }));
        jComboBox40.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox40ActionPerformed(evt);
            }
        });

        jButton20.setForeground(new java.awt.Color(0, 0, 255));
        jButton20.setText("CONVERT");
        jButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton20ActionPerformed(evt);
            }
        });

        jLabel21.setText("  Area");

        jComboBox41.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "square metre", "hectre", "square inch", "square foot", "acre", "" }));
        jComboBox41.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox41ActionPerformed(evt);
            }
        });

        jComboBox42.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "hectre", "square metre", "square inch", "square foot", "acre" }));
        jComboBox42.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox42ActionPerformed(evt);
            }
        });

        jButton21.setForeground(new java.awt.Color(0, 0, 255));
        jButton21.setText("CONVERT");
        jButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton21ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jComboBox37, 0, 66, Short.MAX_VALUE)
                    .addComponent(jComboBox38, 0, 0, Short.MAX_VALUE))
                .addGap(60, 60, 60)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jTextField37, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jTextField38, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 327, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(53, 53, 53))))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(211, 211, 211)
                        .addComponent(jLabel19))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(221, 221, 221)
                        .addComponent(jLabel20))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jComboBox39, 0, 66, Short.MAX_VALUE)
                            .addComponent(jComboBox40, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(60, 60, 60)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField42, javax.swing.GroupLayout.DEFAULT_SIZE, 252, Short.MAX_VALUE)
                            .addComponent(jTextField41)
                            .addComponent(jTextField39)
                            .addComponent(jTextField40))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(218, 218, 218)
                        .addComponent(jLabel21))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jComboBox42, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBox41, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel19)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBox37, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField37, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBox38, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField38, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jButton19)))
                .addGap(32, 32, 32)
                .addComponent(jLabel20)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBox39, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField39, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jButton20)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox40, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField40, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(jLabel21)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBox41, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField41, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBox42, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField42, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jButton21)))
                .addContainerGap(1208, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("MATH", jPanel3);

        jLabel22.setText(" Number base");

        jComboBox43.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "decimal", "binary", "octal", "hexadecimal", "" }));

        jComboBox44.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "decimal", "binary", "octal", "hexadecimal", " " }));

        jTextField43.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField43ActionPerformed(evt);
            }
        });

        jLabel23.setText("Digital storage");

        jComboBox45.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "bit", "byte", "kilobyte", "megabyte", "gigabyte", "terabyte", "petabyte" }));
        jComboBox45.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox45ActionPerformed(evt);
            }
        });

        jComboBox46.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "byte", "bit", "kilobyte", "megabyte", "gigabyte", "terabyte", "petabyte" }));
        jComboBox46.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox46ActionPerformed(evt);
            }
        });

        jButton22.setForeground(new java.awt.Color(0, 0, 255));
        jButton22.setText("CONVERT");
        jButton22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton22ActionPerformed(evt);
            }
        });

        jButton23.setForeground(new java.awt.Color(0, 0, 255));
        jButton23.setText("CONVERT");
        jButton23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton23ActionPerformed(evt);
            }
        });

        jLabel24.setText("Electricity");

        jComboBox47.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "ampere hour(A hr)", "coulomb", "faraday", "milifaraday", "microfaraday", "" }));
        jComboBox47.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox47ActionPerformed(evt);
            }
        });

        jComboBox48.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "coulomb", "ampere hour(A hr)", "faraday", "milifaraday", "microfaraday", "" }));
        jComboBox48.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox48ActionPerformed(evt);
            }
        });

        jButton24.setForeground(new java.awt.Color(0, 0, 255));
        jButton24.setText("CONVERT");
        jButton24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton24ActionPerformed(evt);
            }
        });

        jLabel25.setText("Power");

        jComboBox49.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "watt", "kilowatt", "megawatt", "horsepower", "calorie/second", "BTU(SI)/hour" }));
        jComboBox49.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox49ActionPerformed(evt);
            }
        });

        jComboBox50.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "kilowatt", "watt", "megawatt", "horsepower", "calorie/second", "BTU(SI)/hour" }));
        jComboBox50.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox50ActionPerformed(evt);
            }
        });

        jButton25.setForeground(new java.awt.Color(0, 0, 255));
        jButton25.setText("CONVERT");
        jButton25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton25ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(209, 209, 209)
                        .addComponent(jLabel22))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(215, 215, 215)
                        .addComponent(jLabel23))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(220, 220, 220)
                        .addComponent(jLabel24))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(221, 221, 221)
                        .addComponent(jLabel25))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jComboBox50, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBox49, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBox48, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBox47, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBox46, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBox45, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBox44, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBox43, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(44, 44, 44)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField43)
                            .addComponent(jTextField44, javax.swing.GroupLayout.DEFAULT_SIZE, 197, Short.MAX_VALUE)
                            .addComponent(jTextField45)
                            .addComponent(jTextField46)
                            .addComponent(jTextField47)
                            .addComponent(jTextField48)
                            .addComponent(jTextField49)
                            .addComponent(jTextField50))
                        .addGap(67, 67, 67)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton22)
                            .addComponent(jButton23)
                            .addComponent(jButton24)
                            .addComponent(jButton25))))
                .addContainerGap(336, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jButton22)
                        .addGap(43, 43, 43)
                        .addComponent(jLabel23))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBox43, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField43, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField44, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox44, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBox45, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField45, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jButton23)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox46, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField46, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBox47, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField47, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jButton24)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox48, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField48, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBox49, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField49, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jButton25)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox50, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField50, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(1109, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("COMPUTER SCINCE AND  ENGINEERING", jPanel2);

        jLabel26.setFont(new java.awt.Font("Tahoma", 1, 25)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(0, 102, 102));
        jLabel26.setText("TANVIR AHAMED NAYEEM");

        jLabel27.setFont(new java.awt.Font("Trebuchet MS", 3, 20)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(0, 102, 102));
        jLabel27.setText("   REG. NO. 2012331016");

        jLabel28.setFont(new java.awt.Font("Yu Gothic UI", 3, 15)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(0, 102, 102));
        jLabel28.setText("Dept. of CSE, SUST");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(237, 237, 237)
                        .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(323, 323, 323)
                        .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(278, 278, 278)
                        .addComponent(jLabel27)))
                .addContainerGap(276, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(96, 96, 96)
                .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel27)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(1340, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("ABOUT DEVELOPER", jPanel9);

        jButton26.setFont(new java.awt.Font("Calibri", 3, 20)); // NOI18N
        jButton26.setForeground(new java.awt.Color(0, 51, 51));
        jButton26.setText("Back To Main Menu");
        jButton26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton26ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(339, Short.MAX_VALUE)
                .addComponent(jButton26, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(265, 265, 265))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(178, 178, 178)
                .addComponent(jButton26, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(1224, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("BACK TO MAIN MENU", jPanel7);

        jComboBox1.setForeground(new java.awt.Color(0, 51, 51));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "ampere hour(A hr)", "coulomb", "faraday", "milifaraday", "microfaraday", "" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jLabel1.setForeground(new java.awt.Color(51, 0, 0));
        jLabel1.setText("       Electricity");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jComboBox2.setForeground(new java.awt.Color(0, 51, 51));
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "coulomb", "ampere hour(A hr)", "faraday", "milifaraday", "microfaraday", "" }));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });

        jButton1.setForeground(new java.awt.Color(0, 0, 255));
        jButton1.setText("CONVERT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jLabel2.setForeground(new java.awt.Color(51, 0, 0));
        jLabel2.setText("POWER");

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "watt", "kilowatt", "megawatt", "horsepower", "calorie/second", "BTU(SI)/hour" }));
        jComboBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox3ActionPerformed(evt);
            }
        });

        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "kilowatt", "watt", "megawatt", "horsepower", "calorie/second", "BTU(SI)/hour" }));
        jComboBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox4ActionPerformed(evt);
            }
        });

        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });

        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });

        jButton2.setForeground(new java.awt.Color(0, 0, 255));
        jButton2.setText("CONVERT");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(270, 270, 270)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBox2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBox3, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBox4, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(66, 66, 66)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(83, 83, 83)
                                .addComponent(jLabel2))
                            .addComponent(jTextField3, javax.swing.GroupLayout.DEFAULT_SIZE, 219, Short.MAX_VALUE)
                            .addComponent(jTextField2)
                            .addComponent(jTextField1)
                            .addComponent(jTextField4))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 230, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(37, 37, 37))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22)
                        .addComponent(jLabel2)
                        .addGap(67, 67, 67)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(48, 48, 48)
                        .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(1129, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("ELECTRICAL  ENGINEERING", jPanel5);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1578, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 21, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField37ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField37ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField37ActionPerformed

    private void jComboBox38ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox38ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox38ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        try{
            String a1 = jTextField3.getText();
            double a2 = Double.parseDouble(a1);
            relation2=topow/frompow;
            double a3 = a2 *relation2;
            System.out.println(a3);
            String a4 = Double.toString(a3);
            if(a4.length()>25)
            {
                jTextField4.setText(a4.substring(0, 25));
                jTextField4.setEditable(false);}
            else{
                jTextField4.setText(a4);
                jTextField4.setEditable(false);
            }         }
            catch(NumberFormatException e){

                jTextField4.setText("Invalid");
                jTextField4.setEditable(false);
            }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jComboBox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox4ActionPerformed
        // TODO add your handling code here:
        int index;
        index=((JComboBox)evt.getSource()).getSelectedIndex();
        topow=combo4Relation[index];
    }//GEN-LAST:event_jComboBox4ActionPerformed

    private void jComboBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox3ActionPerformed
        // TODO add your handling code here:
        int index;
        index=((JComboBox)evt.getSource()).getSelectedIndex();
        frompow=combo3Relation[index];
    }//GEN-LAST:event_jComboBox3ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        try{
            String a1 = jTextField1.getText();
            double a2 = Double.parseDouble(a1);
            relation1=toel/fromel;
            double a3 = a2 *relation1;
            System.out.println(a3);
            String a4 = Double.toString(a3);
            if(a4.length()>25)
            {
                jTextField2.setText(a4.substring(0, 25));
                jTextField2.setEditable(false);}
            else{
                jTextField2.setText(a4);
                jTextField2.setEditable(false);
            }         }
            catch(NumberFormatException e){

                jTextField2.setText("Invalid");
                jTextField2.setEditable(false);
            }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:
        int index;
        index=((JComboBox)evt.getSource()).getSelectedIndex();
        toel=combo2Relation[index];
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
        int index;
        index=((JComboBox)evt.getSource()).getSelectedIndex();
        fromel=combo1Relation[index];
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jComboBox29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox29ActionPerformed
        // TODO add your handling code here:
        int index;
        index=((JComboBox)evt.getSource()).getSelectedIndex();
        frommass2=combo29Relation[index];
    }//GEN-LAST:event_jComboBox29ActionPerformed

    private void jComboBox30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox30ActionPerformed
        // TODO add your handling code here:
        int index;
        index=((JComboBox)evt.getSource()).getSelectedIndex();
        tomass2=combo30Relation[index];
    }//GEN-LAST:event_jComboBox30ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        // TODO add your handling code here:
         try{
            String a1 = jTextField29.getText();
            double a2 = Double.parseDouble(a1);
            relation15=tomass2/frommass2;
            double a3 = a2 *relation15;
            System.out.println(a3);
            String a4 = Double.toString(a3);
            if(a4.length()>25)
            {
                jTextField30.setText(a4.substring(0, 25));
                jTextField30.setEditable(false);}
            else{
                jTextField30.setText(a4);
                jTextField30.setEditable(false);
            }         }
            catch(NumberFormatException e){

                jTextField30.setText("Invalid");
                jTextField30.setEditable(false);
            }

    }//GEN-LAST:event_jButton15ActionPerformed

    private void jComboBox31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox31ActionPerformed
        // TODO add your handling code here:
         int index;
        index=((JComboBox)evt.getSource()).getSelectedIndex();
        fromar2=combo31Relation[index];
    }//GEN-LAST:event_jComboBox31ActionPerformed

    private void jComboBox32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox32ActionPerformed
        // TODO add your handling code here:
         int index;
        index=((JComboBox)evt.getSource()).getSelectedIndex();
        toar2=combo32Relation[index];
    }//GEN-LAST:event_jComboBox32ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        // TODO add your handling code here:
        try{
            String a1 = jTextField31.getText();
            double a2 = Double.parseDouble(a1);
            relation16=toar2/fromar2;
            double a3 = a2 *relation16;
            System.out.println(a3);
            String a4 = Double.toString(a3);
            if(a4.length()>25)
            {
                jTextField32.setText(a4.substring(0, 25));
                jTextField32.setEditable(false);}
            else{
                jTextField32.setText(a4);
                jTextField32.setEditable(false);
            }         }
            catch(NumberFormatException e){

                jTextField32.setText("Invalid");
                jTextField32.setEditable(false);
            }

    }//GEN-LAST:event_jButton16ActionPerformed

    private void jComboBox33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox33ActionPerformed
        // TODO add your handling code here:
         int index;
        index=((JComboBox)evt.getSource()).getSelectedIndex();
        fromlen2=combo33Relation[index];
    }//GEN-LAST:event_jComboBox33ActionPerformed

    private void jComboBox34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox34ActionPerformed
        // TODO add your handling code here:
         int index;
        index=((JComboBox)evt.getSource()).getSelectedIndex();
        tolen2=combo34Relation[index];
    }//GEN-LAST:event_jComboBox34ActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
        // TODO add your handling code here:
         try{
            String a1 = jTextField33.getText();
            double a2 = Double.parseDouble(a1);
            relation17=tolen2/fromlen2;
            double a3 = a2 *relation17;
            System.out.println(a3);
            String a4 = Double.toString(a3);
            if(a4.length()>25)
            {
                jTextField34.setText(a4.substring(0, 25));
                jTextField34.setEditable(false);}
            else{
                jTextField34.setText(a4);
                jTextField34.setEditable(false);
            }         }
            catch(NumberFormatException e){

                jTextField34.setText("Invalid");
                jTextField34.setEditable(false);
            }

    }//GEN-LAST:event_jButton17ActionPerformed

    private void jComboBox35ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox35ActionPerformed
        // TODO add your handling code here:
        int index;
        index=((JComboBox)evt.getSource()).getSelectedIndex();
        fromvolf=combo35Relation[index];
    }//GEN-LAST:event_jComboBox35ActionPerformed

    private void jComboBox36ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox36ActionPerformed
        // TODO add your handling code here:
        int index;
        index=((JComboBox)evt.getSource()).getSelectedIndex();
        tovolf=combo36Relation[index];
    }//GEN-LAST:event_jComboBox36ActionPerformed

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
        // TODO add your handling code here:
         try{
            String a1 = jTextField35.getText();
            double a2 = Double.parseDouble(a1);
            relation18=tovolf/fromvolf;
            double a3 = a2 *relation18;
            System.out.println(a3);
            String a4 = Double.toString(a3);
            if(a4.length()>25)
            {
                jTextField36.setText(a4.substring(0, 25));
                jTextField36.setEditable(false);}
            else{
                jTextField36.setText(a4);
                jTextField36.setEditable(false);
            }         }
            catch(NumberFormatException e){

                jTextField36.setText("Invalid");
                jTextField36.setEditable(false);
            }
    }//GEN-LAST:event_jButton18ActionPerformed

    private void jComboBox5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox5ActionPerformed
        // TODO add your handling code here:
        int index;
        index=((JComboBox)evt.getSource()).getSelectedIndex();
        fromacc=combo5Relation[index];
    }//GEN-LAST:event_jComboBox5ActionPerformed

    private void jComboBox6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox6ActionPerformed
        // TODO add your handling code here:
        int index;
        index=((JComboBox)evt.getSource()).getSelectedIndex();
        toacc=combo6Relation[index];
    }//GEN-LAST:event_jComboBox6ActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField6ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        try{
            String a1 = jTextField5.getText();
            double a2 = Double.parseDouble(a1);
            relation3=toacc/fromacc;
            double a3 = a2 *relation3;
            System.out.println(a3);
            String a4 = Double.toString(a3);
            if(a4.length()>25)
            {
                jTextField6.setText(a4.substring(0, 25));
                jTextField6.setEditable(false);}
            else{
                jTextField6.setText(a4);
                jTextField6.setEditable(false);
            }         }
            catch(NumberFormatException e){

                jTextField6.setText("Invalid");
                jTextField6.setEditable(false);
            }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jComboBox7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox7ActionPerformed
        // TODO add your handling code here:
        int index;
        index=((JComboBox)evt.getSource()).getSelectedIndex();
        fromar=combo7Relation[index];
    }//GEN-LAST:event_jComboBox7ActionPerformed

    private void jComboBox8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox8ActionPerformed
        // TODO add your handling code here:
        int index;
        index=((JComboBox)evt.getSource()).getSelectedIndex();
        toar=combo8Relation[index];
    }//GEN-LAST:event_jComboBox8ActionPerformed

    private void jTextField7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField7ActionPerformed

    private void jTextField8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField8ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        try{
            String a1 = jTextField7.getText();
            double a2 = Double.parseDouble(a1);
            relation4=toar/fromar;
            double a3 = a2 *relation4;
            System.out.println(a3);
            String a4 = Double.toString(a3);
            if(a4.length()>25)
            {
                jTextField8.setText(a4.substring(0, 25));
                jTextField8.setEditable(false);}
            else{
                jTextField8.setText(a4);
                jTextField8.setEditable(false);
            }         }
            catch(NumberFormatException e){

                jTextField8.setText("Invalid");
                jTextField8.setEditable(false);
            }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jComboBox9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox9ActionPerformed
        // TODO add your handling code here:
        int index;
        index=((JComboBox)evt.getSource()).getSelectedIndex();
        fromfor=combo9Relation[index];
    }//GEN-LAST:event_jComboBox9ActionPerformed

    private void jComboBox10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox10ActionPerformed
        // TODO add your handling code here:
        int index;
        index=((JComboBox)evt.getSource()).getSelectedIndex();
        tofor=combo10Relation[index];
    }//GEN-LAST:event_jComboBox10ActionPerformed

    private void jTextField9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField9ActionPerformed

    private void jTextField10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField10ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        try{
            String a1 = jTextField9.getText();
            double a2 = Double.parseDouble(a1);
            relation5=tofor/fromfor;
            double a3 = a2 *relation5;
            System.out.println(a3);
            String a4 = Double.toString(a3);
            if(a4.length()>25)
            {
                jTextField10.setText(a4.substring(0, 25));
                jTextField10.setEditable(false);}
            else{
                jTextField10.setText(a4);
                jTextField10.setEditable(false);
            }         }
            catch(NumberFormatException e){

                jTextField10.setText("Invalid");
                jTextField10.setEditable(false);
            }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jComboBox11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox11ActionPerformed
        // TODO add your handling code here:
        int index;
        index=((JComboBox)evt.getSource()).getSelectedIndex();
        fromlen=combo11Relation[index];
    }//GEN-LAST:event_jComboBox11ActionPerformed

    private void jComboBox12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox12ActionPerformed
        // TODO add your handling code here:
        int index;
        index=((JComboBox)evt.getSource()).getSelectedIndex();
        tolen=combo12Relation[index];
    }//GEN-LAST:event_jComboBox12ActionPerformed

    private void jTextField11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField11ActionPerformed

    private void jTextField12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField12ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        try{
            String a1 = jTextField11.getText();
            double a2 = Double.parseDouble(a1);
            relation6=tolen/fromlen;
            double a3 = a2 *relation6;
            System.out.println(a3);
            String a4 = Double.toString(a3);
            if(a4.length()>25)
            {
                jTextField12.setText(a4.substring(0, 25));
                jTextField12.setEditable(false);}
            else{
                jTextField12.setText(a4);
                jTextField12.setEditable(false);
            }         }
            catch(NumberFormatException e){

                jTextField12.setText("Invalid");
                jTextField12.setEditable(false);
            }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jComboBox13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox13ActionPerformed
        // TODO add your handling code here:
        int index;
        index=((JComboBox)evt.getSource()).getSelectedIndex();
        fromlght=combo13Relation[index];
    }//GEN-LAST:event_jComboBox13ActionPerformed

    private void jComboBox14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox14ActionPerformed
        // TODO add your handling code here:
        int index;
        index=((JComboBox)evt.getSource()).getSelectedIndex();
        tolght=combo14Relation[index];
    }//GEN-LAST:event_jComboBox14ActionPerformed

    private void jTextField14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField14ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        try{
            String a1 = jTextField13.getText();
            double a2 = Double.parseDouble(a1);
            relation6=tolght/fromlght;
            double a3 = a2 *relation6;
            System.out.println(a3);
            String a4 = Double.toString(a3);
            if(a4.length()>25)
            {
                jTextField14.setText(a4.substring(0, 25));
                jTextField14.setEditable(false);}
            else{
                jTextField14.setText(a4);
                jTextField14.setEditable(false);
            }         }
            catch(NumberFormatException e){

                jTextField14.setText("Invalid");
                jTextField14.setEditable(false);
            }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jComboBox15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox15ActionPerformed
        // TODO add your handling code here:
        int index;
        index=((JComboBox)evt.getSource()).getSelectedIndex();
        frommass=combo15Relation[index];
    }//GEN-LAST:event_jComboBox15ActionPerformed

    private void jComboBox16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox16ActionPerformed
        // TODO add your handling code here:
        int index;
        index=((JComboBox)evt.getSource()).getSelectedIndex();
        tomass=combo16Relation[index];
    }//GEN-LAST:event_jComboBox16ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        try{
            String a1 = jTextField15.getText();
            double a2 = Double.parseDouble(a1);
            relation8=tomass/frommass;
            double a3 = a2 *relation8;
            System.out.println(a3);
            String a4 = Double.toString(a3);
            if(a4.length()>25)
            {
                jTextField16.setText(a4.substring(0, 25));
                jTextField16.setEditable(false);}
            else{
                jTextField16.setText(a4);
                jTextField16.setEditable(false);
            }         }
            catch(NumberFormatException e){

                jTextField16.setText("Invalid");
                jTextField16.setEditable(false);
            }
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jComboBox17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox17ActionPerformed
        // TODO add your handling code here:
        int index;
        index=((JComboBox)evt.getSource()).getSelectedIndex();
        frompow2=combo17Relation[index];
    }//GEN-LAST:event_jComboBox17ActionPerformed

    private void jComboBox18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox18ActionPerformed
        // TODO add your handling code here:
        int index;
        index=((JComboBox)evt.getSource()).getSelectedIndex();
        topow2=combo18Relation[index];
    }//GEN-LAST:event_jComboBox18ActionPerformed

    private void jTextField17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField17ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField17ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
        try{
            String a1 = jTextField17.getText();
            double a2 = Double.parseDouble(a1);
            relation9=topow2/frompow2;
            double a3 = a2 *relation9;
            System.out.println(a3);
            String a4 = Double.toString(a3);
            if(a4.length()>25)
            {
                jTextField18.setText(a4.substring(0, 25));
                jTextField18.setEditable(false);}
            else{
                jTextField18.setText(a4);
                jTextField18.setEditable(false);
            }         }
            catch(NumberFormatException e){

                jTextField18.setText("Invalid");
                jTextField18.setEditable(false);
            }
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jComboBox19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox19ActionPerformed
        // TODO add your handling code here:
        int index;
        index=((JComboBox)evt.getSource()).getSelectedIndex();
        frompns=combo19Relation[index];
    }//GEN-LAST:event_jComboBox19ActionPerformed

    private void jComboBox20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox20ActionPerformed
        // TODO add your handling code here:
        int index;
        index=((JComboBox)evt.getSource()).getSelectedIndex();
        topns=combo20Relation[index];
    }//GEN-LAST:event_jComboBox20ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
        try{
            String a1 = jTextField19.getText();
            double a2 = Double.parseDouble(a1);
            relation10=topns/frompns;
            double a3 = a2 *relation10;
            System.out.println(a3);
            String a4 = Double.toString(a3);
            if(a4.length()>25)
            {
                jTextField20.setText(a4.substring(0, 25));
                jTextField20.setEditable(false);}
            else{
                jTextField20.setText(a4);
                jTextField20.setEditable(false);
            }         }
            catch(NumberFormatException e){

                jTextField20.setText("Invalid");
                jTextField20.setEditable(false);
            }
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jComboBox21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox21ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jComboBox21ActionPerformed

    private void jTextField21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField21ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField21ActionPerformed

    private void jComboBox22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox22ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jComboBox22ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        // TODO add your handling code here:
       try {
            double inp = Double.parseDouble(jTextField21.getText());//gettinh input
            int frm = jComboBox21.getSelectedIndex(); //converting form 
            int to = jComboBox22.getSelectedIndex();// converting to
            double res = inp; //result
        //calculation
            switch (frm) {
                case 0:
                    
                    switch (to) {
                        case 1:
                            res = 5.0 * (inp - 32.0) / 9.0; 
                            break;
                        case 2:
                            res = 273 + (5.0 * (inp - 32.0) / 9.0);
                            break;
                    }
                    break;
                case 1:
                    switch (to) {
                        case 0:
                            res = (9.0 * inp / 5.0) + 32.0;
                            break;
                        case 2:
                            res = inp + 273;
                            break;
                    }
                    break;
                case 2:
                    switch (to) {
                        case 0:
                            res = (9.0 * (inp - 273) / 5.0) + 32.0;
                            break;
                        case 1:
                            res = inp - 273;
                            break;
                    }
                    break;

            }

            String out =Double.toString(res);
            jTextField22.setText(out);
             jTextField22.setEditable(false);

        } catch (Exception ex) {
            jTextField22.setText("Invalid");
             jTextField22.setEditable(false);
        }
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jComboBox23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox23ActionPerformed
        // TODO add your handling code here:
        int index;
        index=((JComboBox)evt.getSource()).getSelectedIndex();
        fromtorq=combo23Relation[index];
    }//GEN-LAST:event_jComboBox23ActionPerformed

    private void jComboBox24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox24ActionPerformed
        // TODO add your handling code here:
        int index;
        index=((JComboBox)evt.getSource()).getSelectedIndex();
        totorq=combo24Relation[index];
    }//GEN-LAST:event_jComboBox24ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        // TODO add your handling code here:
        try{    String a1 = jTextField23.getText();
            double a2 = Double.parseDouble(a1);
            relation12=totorq/fromtorq;
            double a3 = a2 *relation12;
            System.out.println(a3);
            String a4 = Double.toString(a3);
            if(a4.length()>25)
            {
                jTextField24.setText(a4.substring(0, 25));
                jTextField24.setEditable(false);
            }
            else{
                jTextField24.setText(a4);
                jTextField24.setEditable(false);
            } }
            catch(NumberFormatException e){

                jTextField24.setText("Invalid");
                jTextField24.setEditable(false);
            }
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jComboBox25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox25ActionPerformed
        // TODO add your handling code here:
        int index;
        index=((JComboBox)evt.getSource()).getSelectedIndex();
        fromvns=combo25Relation[index];
    }//GEN-LAST:event_jComboBox25ActionPerformed

    private void jComboBox26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox26ActionPerformed
        // TODO add your handling code here:
        int index;
        index=((JComboBox)evt.getSource()).getSelectedIndex();
        tovns=combo26Relation[index];
    }//GEN-LAST:event_jComboBox26ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        // TODO add your handling code here:
        try{
            String a1 = jTextField25.getText();
            double a2 = Double.parseDouble(a1);
            relation13=tovns/fromvns;
            double a3 = a2 *relation13;
            System.out.println(a3);
            String a4 = Double.toString(a3);
            if(a4.length()>25)
            {
                jTextField26.setText(a4.substring(0, 25));
                jTextField26.setEditable(false);}
            else{
                jTextField26.setText(a4);
                jTextField26.setEditable(false);
            }         }
            catch(NumberFormatException e){

                jTextField26.setText("Invalid");
                jTextField26.setEditable(false);
            }
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jComboBox27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox27ActionPerformed
        // TODO add your handling code here:
        int index;
        index=((JComboBox)evt.getSource()).getSelectedIndex();
        fromvnc=combo27Relation[index];
    }//GEN-LAST:event_jComboBox27ActionPerformed

    private void jComboBox28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox28ActionPerformed
        // TODO add your handling code here:
        int index;
        index=((JComboBox)evt.getSource()).getSelectedIndex();
        tovnc=combo28Relation[index];
    }//GEN-LAST:event_jComboBox28ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        // TODO add your handling code here:
        try{    String a1 = jTextField27.getText();
            double a2 = Double.parseDouble(a1);
            relation14=tovnc/fromvnc;
            double a3 = a2 *relation14;
            System.out.println(a3);
            String a4 = Double.toString(a3);
            if(a4.length()>25)
            {
                jTextField28.setText(a4.substring(0, 25));
                jTextField28.setEditable(false);
            }
            else{
                jTextField28.setText(a4);
                jTextField28.setEditable(false);
            } }
            catch(NumberFormatException e){

                jTextField28.setText("Invalid");
                jTextField28.setEditable(false);
            }
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton26ActionPerformed
        // TODO add your handling code here:
        mainmenu.show();
        this.dispose();
        
    }//GEN-LAST:event_jButton26ActionPerformed

    private void jComboBox39ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox39ActionPerformed
        // TODO add your handling code here:
         int index;
        index=((JComboBox)evt.getSource()).getSelectedIndex();
        fromangle=combo39Relation[index];
    }//GEN-LAST:event_jComboBox39ActionPerformed

    private void jComboBox40ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox40ActionPerformed
        // TODO add your handling code here:
         int index;
        index=((JComboBox)evt.getSource()).getSelectedIndex();
        toangle=combo40Relation[index];
    }//GEN-LAST:event_jComboBox40ActionPerformed

    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton20ActionPerformed
        // TODO add your handling code here:
        try{    String a1 = jTextField39.getText();
            double a2 = Double.parseDouble(a1);
            relation20=toangle/fromangle;
            double a3 = a2 *relation20;
            System.out.println(a3);
            String a4 = Double.toString(a3);
            if(a4.length()>25)
            {
                jTextField40.setText(a4.substring(0, 25));
                jTextField40.setEditable(false);
            }
            else{
                jTextField40.setText(a4);
                jTextField40.setEditable(false);
            } }
            catch(NumberFormatException e){

                jTextField40.setText("Invalid");
                jTextField40.setEditable(false);
            }
    }//GEN-LAST:event_jButton20ActionPerformed

    private void jComboBox41ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox41ActionPerformed
        // TODO add your handling code here:
        int index;
        index=((JComboBox)evt.getSource()).getSelectedIndex();
        fromar3=combo41Relation[index];
    }//GEN-LAST:event_jComboBox41ActionPerformed

    private void jComboBox42ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox42ActionPerformed
        // TODO add your handling code here:
        int index;
        index=((JComboBox)evt.getSource()).getSelectedIndex();
        toar3=combo42Relation[index];
    }//GEN-LAST:event_jComboBox42ActionPerformed

    private void jButton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton21ActionPerformed
        // TODO add your handling code here:
        try{    String a1 = jTextField41.getText();
            double a2 = Double.parseDouble(a1);
            relation21=toar3/fromar3;
            double a3 = a2 *relation21;
            System.out.println(a3);
            String a4 = Double.toString(a3);
            if(a4.length()>25)
            {
                jTextField42.setText(a4.substring(0, 25));
                jTextField42.setEditable(false);
            }
            else{
                jTextField42.setText(a4);
                jTextField42.setEditable(false);
            } }
            catch(NumberFormatException e){

                jTextField42.setText("Invalid");
                jTextField42.setEditable(false);
            }
    }//GEN-LAST:event_jButton21ActionPerformed

    private void jComboBox45ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox45ActionPerformed
        // TODO add your handling code here:
         int index;
        index=((JComboBox)evt.getSource()).getSelectedIndex();
        fromds=combo45Relation[index];
    }//GEN-LAST:event_jComboBox45ActionPerformed

    private void jComboBox46ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox46ActionPerformed
        // TODO add your handling code here:
         int index;
        index=((JComboBox)evt.getSource()).getSelectedIndex();
        tods=combo46Relation[index];
    }//GEN-LAST:event_jComboBox46ActionPerformed

    private void jButton23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton23ActionPerformed
        // TODO add your handling code here:
        try{    String a1 = jTextField45.getText();
            double a2 = Double.parseDouble(a1);
            relation23=tods/fromds;
            double a3 = a2 *relation23;
            System.out.println(a3);
            String a4 = Double.toString(a3);
            if(a4.length()>25)
            {
                jTextField46.setText(a4.substring(0, 25));
                jTextField46.setEditable(false);
            }
            else{
                jTextField46.setText(a4);
                jTextField46.setEditable(false);
            } }
            catch(NumberFormatException e){

                jTextField46.setText("Invalid");
                jTextField46.setEditable(false);
            }
    }//GEN-LAST:event_jButton23ActionPerformed

    private void jComboBox47ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox47ActionPerformed
        // TODO add your handling code here:
         int index;
        index=((JComboBox)evt.getSource()).getSelectedIndex();
        fromel2=combo47Relation[index];
    }//GEN-LAST:event_jComboBox47ActionPerformed

    private void jComboBox48ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox48ActionPerformed
        // TODO add your handling code here:
         int index;
        index=((JComboBox)evt.getSource()).getSelectedIndex();
        toel2=combo48Relation[index];
    }//GEN-LAST:event_jComboBox48ActionPerformed

    private void jButton24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton24ActionPerformed
        // TODO add your handling code here:
           try{    String a1 = jTextField47.getText();
            double a2 = Double.parseDouble(a1);
            relation24=toel2/fromel2;
            double a3 = a2 *relation24;
            System.out.println(a3);
            String a4 = Double.toString(a3);
            if(a4.length()>25)
            {
                jTextField48.setText(a4.substring(0, 25));
                jTextField48.setEditable(false);
            }
            else{
                jTextField48.setText(a4);
                jTextField48.setEditable(false);
            } }
            catch(NumberFormatException e){

                jTextField48.setText("Invalid");
                jTextField48.setEditable(false);
            }
    }//GEN-LAST:event_jButton24ActionPerformed

    private void jComboBox49ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox49ActionPerformed
        // TODO add your handling code here:
        int index;
        index=((JComboBox)evt.getSource()).getSelectedIndex();
        frompow3=combo49Relation[index];
    }//GEN-LAST:event_jComboBox49ActionPerformed

    private void jComboBox50ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox50ActionPerformed
        // TODO add your handling code here:
        int index;
        index=((JComboBox)evt.getSource()).getSelectedIndex();
        topow3=combo50Relation[index];
    }//GEN-LAST:event_jComboBox50ActionPerformed

    private void jButton25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton25ActionPerformed
        // TODO add your handling code here:
        try{    String a1 = jTextField49.getText();
            double a2 = Double.parseDouble(a1);
            relation25=topow3/frompow3;
            double a3 = a2 *relation25;
            System.out.println(a3);
            String a4 = Double.toString(a3);
            if(a4.length()>25)
            {
                jTextField50.setText(a4.substring(0, 25));
                jTextField50.setEditable(false);
            }
            else{
                jTextField50.setText(a4);
                jTextField50.setEditable(false);
            } }
            catch(NumberFormatException e){

                jTextField50.setText("Invalid");
                jTextField50.setEditable(false);
            }
    }//GEN-LAST:event_jButton25ActionPerformed

    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton19ActionPerformed
        // TODO add your handling code here:
        try {
            String inp = jTextField37.getText();
            int frm = jComboBox37.getSelectedIndex();//converting form 
            int to = jComboBox38.getSelectedIndex();// converting to
         
         //   long d = Long.parseLong(inp);
            
           
        //calculation
            switch (frm) {
                case 0:
                    long d = Long.parseLong(inp);
                    switch (to) {
                        case 1:
                              jTextField38.setText(Long.toBinaryString(d));
            
            
                            break;
                        case 2:
                             jTextField38.setText(Long.toOctalString(d));
                            break;
                            case 3:
                             jTextField38.setText(Long.toHexString(d).toUpperCase());
                            break;
                    }
                    break;
                case 1:
                    long d1 = Long.parseLong(inp,2);
                    switch (to) {
                         case 0:
                              jTextField38.setText(Long.toString(d1));
            
            
                            break;
                        case 2:
                             jTextField38.setText(Long.toOctalString(d1));
                            break;
                            case 3:
                             jTextField38.setText(Long.toHexString(d1).toUpperCase());
                            break;
                    }
                    break;
                case 2:
                    long d2 = Long.parseLong(inp,8);
                    switch (to) {
                        case 0:
                              jTextField38.setText(Long.toString(d2));
                            break;
                        case 1:
                             jTextField38.setText(Long.toBinaryString(d2));
                            break;
                            case 3:
                             jTextField38.setText(Long.toHexString(d2).toUpperCase());
                            break;
                    }
                    break;
                    case 3:
                        long d3 = Long.parseLong(inp,16);
                    switch (to) {
                        case 0:
                              jTextField38.setText(Long.toString(d3));
                            break;
                        case 1:
                             jTextField38.setText(Long.toBinaryString(d3));
                            break;
                            case 2:
                             jTextField38.setText(Long.toOctalString(d3));
                            break;
                    }
                    break;

            }

           
             jTextField38.setEditable(false);

        } catch (Exception ex) {
            jTextField38.setText("Invalid");
             jTextField38.setEditable(false);
        }
    }//GEN-LAST:event_jButton19ActionPerformed

    private void jButton22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton22ActionPerformed
        // TODO add your handling code here:
         try {
            String inp = jTextField43.getText();
             
           int frm = jComboBox43.getSelectedIndex();//converting form 
            int to = jComboBox44.getSelectedIndex();// converting to
        //calculation
            switch (frm) {
                case 0:
                    long d = Long.parseLong(inp);
                    switch (to) {
                        case 1:
                              jTextField44.setText(Long.toBinaryString(d));
            
            
                            break;
                        case 2:
                             jTextField44.setText(Long.toOctalString(d));
                            break;
                            case 3:
                             jTextField44.setText(Long.toHexString(d).toUpperCase());
                            break;
                    }
                    break;
                case 1:
                    long d1 = Long.parseLong(inp,2);
                    switch (to) {
                         case 0:
                              jTextField44.setText(Long.toString(d1));
            
            
                            break;
                        case 2:
                             jTextField44.setText(Long.toOctalString(d1));
                            break;
                            case 3:
                             jTextField44.setText(Long.toHexString(d1).toUpperCase());
                            break;
                    }
                    break;
                case 2:
                    long d2 = Long.parseLong(inp,8);
                    switch (to) {
                        case 0:
                              jTextField44.setText(Long.toString(d2));
                            break;
                        case 1:
                             jTextField44.setText(Long.toBinaryString(d2));
                            break;
                            case 3:
                             jTextField44.setText(Long.toHexString(d2).toUpperCase());
                            break;
                    }
                    break;
                    case 3:
                        long d3 = Long.parseLong(inp,16);
                    switch (to) {
                        case 0:
                              jTextField44.setText(Long.toString(d3));
                            break;
                        case 1:
                             jTextField44.setText(Long.toBinaryString(d3));
                            break;
                            case 2:
                             jTextField44.setText(Long.toOctalString(d3));
                            break;
                    }
                    break;

            }

           
             jTextField44.setEditable(false);

        } catch (Exception ex) {
            jTextField44.setText("Invalid");
             jTextField44.setEditable(false);
        }
    }//GEN-LAST:event_jButton22ActionPerformed

    private void jTextField43ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField43ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField43ActionPerformed

    private void jComboBox37ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox37ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox37ActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton24;
    private javax.swing.JButton jButton25;
    private javax.swing.JButton jButton26;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox10;
    private javax.swing.JComboBox jComboBox11;
    private javax.swing.JComboBox jComboBox12;
    private javax.swing.JComboBox jComboBox13;
    private javax.swing.JComboBox jComboBox14;
    private javax.swing.JComboBox jComboBox15;
    private javax.swing.JComboBox jComboBox16;
    private javax.swing.JComboBox jComboBox17;
    private javax.swing.JComboBox jComboBox18;
    private javax.swing.JComboBox jComboBox19;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JComboBox jComboBox20;
    private javax.swing.JComboBox jComboBox21;
    private javax.swing.JComboBox jComboBox22;
    private javax.swing.JComboBox jComboBox23;
    private javax.swing.JComboBox jComboBox24;
    private javax.swing.JComboBox jComboBox25;
    private javax.swing.JComboBox jComboBox26;
    private javax.swing.JComboBox jComboBox27;
    private javax.swing.JComboBox jComboBox28;
    private javax.swing.JComboBox jComboBox29;
    private javax.swing.JComboBox jComboBox3;
    private javax.swing.JComboBox jComboBox30;
    private javax.swing.JComboBox jComboBox31;
    private javax.swing.JComboBox jComboBox32;
    private javax.swing.JComboBox jComboBox33;
    private javax.swing.JComboBox jComboBox34;
    private javax.swing.JComboBox jComboBox35;
    private javax.swing.JComboBox jComboBox36;
    private javax.swing.JComboBox jComboBox37;
    private javax.swing.JComboBox jComboBox38;
    private javax.swing.JComboBox jComboBox39;
    private javax.swing.JComboBox jComboBox4;
    private javax.swing.JComboBox jComboBox40;
    private javax.swing.JComboBox jComboBox41;
    private javax.swing.JComboBox jComboBox42;
    private javax.swing.JComboBox jComboBox43;
    private javax.swing.JComboBox jComboBox44;
    private javax.swing.JComboBox jComboBox45;
    private javax.swing.JComboBox jComboBox46;
    private javax.swing.JComboBox jComboBox47;
    private javax.swing.JComboBox jComboBox48;
    private javax.swing.JComboBox jComboBox49;
    private javax.swing.JComboBox jComboBox5;
    private javax.swing.JComboBox jComboBox50;
    private javax.swing.JComboBox jComboBox6;
    private javax.swing.JComboBox jComboBox7;
    private javax.swing.JComboBox jComboBox8;
    private javax.swing.JComboBox jComboBox9;
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
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField17;
    private javax.swing.JTextField jTextField18;
    private javax.swing.JTextField jTextField19;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField20;
    private javax.swing.JTextField jTextField21;
    private javax.swing.JTextField jTextField22;
    private javax.swing.JTextField jTextField23;
    private javax.swing.JTextField jTextField24;
    private javax.swing.JTextField jTextField25;
    private javax.swing.JTextField jTextField26;
    private javax.swing.JTextField jTextField27;
    private javax.swing.JTextField jTextField28;
    private javax.swing.JTextField jTextField29;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField30;
    private javax.swing.JTextField jTextField31;
    private javax.swing.JTextField jTextField32;
    private javax.swing.JTextField jTextField33;
    private javax.swing.JTextField jTextField34;
    private javax.swing.JTextField jTextField35;
    private javax.swing.JTextField jTextField36;
    private javax.swing.JTextField jTextField37;
    private javax.swing.JTextField jTextField38;
    private javax.swing.JTextField jTextField39;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField40;
    private javax.swing.JTextField jTextField41;
    private javax.swing.JTextField jTextField42;
    private javax.swing.JTextField jTextField43;
    private javax.swing.JTextField jTextField44;
    private javax.swing.JTextField jTextField45;
    private javax.swing.JTextField jTextField46;
    private javax.swing.JTextField jTextField47;
    private javax.swing.JTextField jTextField48;
    private javax.swing.JTextField jTextField49;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField50;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables
}
