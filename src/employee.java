import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.util.Calendar;
import javax.swing.JOptionPane;




/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * employee.java
 *
 * Created on Jul 15, 2014, 9:40:16 PM
 */

/**
 *
 * @author 2
 */
public class employee extends javax.swing.JFrame {

    /** Creates new form employee */
    public employee()
    {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        l2 = new javax.swing.JLabel();
        l3 = new javax.swing.JLabel();
        l4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        l1 = new javax.swing.JLabel();
        l5 = new javax.swing.JLabel();
        l6 = new javax.swing.JLabel();
        l7 = new javax.swing.JLabel();
        l8 = new javax.swing.JLabel();
        l9 = new javax.swing.JLabel();
        l10 = new javax.swing.JLabel();
        l11 = new javax.swing.JLabel();
        l12 = new javax.swing.JLabel();
        l13 = new javax.swing.JLabel();
        t1 = new javax.swing.JTextField();
        t2 = new javax.swing.JTextField();
        t3 = new javax.swing.JTextField();
        r1 = new javax.swing.JRadioButton();
        r2 = new javax.swing.JRadioButton();
        r3 = new javax.swing.JRadioButton();
        r4 = new javax.swing.JRadioButton();
        t4 = new javax.swing.JTextField();
        t5 = new javax.swing.JTextField();
        t6 = new javax.swing.JTextField();
        t7 = new javax.swing.JTextField();
        t8 = new javax.swing.JTextField();
        t9 = new javax.swing.JTextField();
        l14 = new javax.swing.JLabel();
        l15 = new javax.swing.JLabel();
        l16 = new javax.swing.JLabel();
        l17 = new javax.swing.JLabel();
        t11 = new javax.swing.JTextField();
        t10 = new javax.swing.JTextField();
        t12 = new javax.swing.JTextField();
        b1 = new javax.swing.JButton();
        b2 = new javax.swing.JButton();
        b3 = new javax.swing.JButton();
        b4 = new javax.swing.JButton();
        b5 = new javax.swing.JButton();
        b6 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        ta1 = new javax.swing.JTextArea();
        t13 = new javax.swing.JTextField();
        c1 = new datechooser.beans.DateChooserCombo();
        jLabel1 = new javax.swing.JLabel();

        jMenu3.setText("File");
        jMenuBar2.add(jMenu3);

        jMenu4.setText("Edit");
        jMenuBar2.add(jMenu4);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("EMPLOYEE INFORMATION");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        l2.setFont(new java.awt.Font("Tahoma", 3, 15)); // NOI18N
        l2.setForeground(new java.awt.Color(255, 255, 255));
        l2.setText("First name");
        getContentPane().add(l2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 100, 20));

        l3.setFont(new java.awt.Font("Tahoma", 3, 15)); // NOI18N
        l3.setForeground(new java.awt.Color(255, 255, 255));
        l3.setText("Last name");
        getContentPane().add(l3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 90, 20));

        l4.setFont(new java.awt.Font("Tahoma", 3, 15)); // NOI18N
        l4.setForeground(new java.awt.Color(255, 255, 255));
        l4.setText("D.O.B");
        getContentPane().add(l4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 60, 20));

        jLabel7.setFont(new java.awt.Font("Tahoma", 3, 15)); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, -1, 20));

        l1.setFont(new java.awt.Font("Tahoma", 3, 15)); // NOI18N
        l1.setForeground(new java.awt.Color(255, 255, 255));
        l1.setText("Employee ID");
        getContentPane().add(l1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 120, 20));

        l5.setFont(new java.awt.Font("Tahoma", 3, 15)); // NOI18N
        l5.setForeground(new java.awt.Color(255, 255, 255));
        l5.setText("Gender");
        getContentPane().add(l5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, -1, 20));

        l6.setFont(new java.awt.Font("Tahoma", 3, 15)); // NOI18N
        l6.setForeground(new java.awt.Color(255, 255, 255));
        l6.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        l6.setText("Marital Status");
        getContentPane().add(l6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 130, 20));

        l7.setFont(new java.awt.Font("Tahoma", 3, 15)); // NOI18N
        l7.setForeground(new java.awt.Color(255, 255, 255));
        l7.setText("Phone No.");
        getContentPane().add(l7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, 120, 20));

        l8.setFont(new java.awt.Font("Tahoma", 3, 15)); // NOI18N
        l8.setForeground(new java.awt.Color(255, 255, 255));
        l8.setText("Qualification");
        getContentPane().add(l8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, 120, 20));

        l9.setFont(new java.awt.Font("Tahoma", 3, 13)); // NOI18N
        l9.setForeground(new java.awt.Color(255, 255, 255));
        l9.setText("High School (year)");
        getContentPane().add(l9, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 300, 120, -1));

        l10.setFont(new java.awt.Font("Tahoma", 3, 13)); // NOI18N
        l10.setForeground(new java.awt.Color(255, 255, 255));
        l10.setText("Intermediate(year)");
        getContentPane().add(l10, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 330, 130, -1));

        l11.setFont(new java.awt.Font("Tahoma", 3, 13)); // NOI18N
        l11.setForeground(new java.awt.Color(255, 255, 255));
        l11.setText("Graduation(year)");
        getContentPane().add(l11, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 360, 120, -1));

        l12.setFont(new java.awt.Font("Tahoma", 3, 13)); // NOI18N
        l12.setForeground(new java.awt.Color(255, 255, 255));
        l12.setText("Post Graduation(year)");
        getContentPane().add(l12, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 390, 160, -1));

        l13.setFont(new java.awt.Font("Tahoma", 3, 13)); // NOI18N
        l13.setForeground(new java.awt.Color(255, 255, 255));
        l13.setText("Technical(year) ");
        getContentPane().add(l13, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 420, 110, 20));

        t1.setToolTipText("Type Your ID");
        t1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t1ActionPerformed(evt);
            }
        });
        getContentPane().add(t1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 30, 130, -1));

        t2.setToolTipText("Type Your Name");
        t2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t2ActionPerformed(evt);
            }
        });
        getContentPane().add(t2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 110, 130, -1));

        t3.setToolTipText("Type Your Sir Name");
        t3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t3ActionPerformed(evt);
            }
        });
        getContentPane().add(t3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 140, 130, -1));

        buttonGroup1.add(r1);
        r1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        r1.setText("Male");
        r1.setToolTipText(" ");
        r1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r1ActionPerformed(evt);
            }
        });
        getContentPane().add(r1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 180, 70, -1));

        buttonGroup1.add(r2);
        r2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        r2.setText("Female");
        getContentPane().add(r2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 180, 70, -1));

        buttonGroup2.add(r3);
        r3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        r3.setText("Married");
        r3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r3ActionPerformed(evt);
            }
        });
        getContentPane().add(r3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 220, 70, -1));

        buttonGroup2.add(r4);
        r4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        r4.setText("Single");
        r4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r4ActionPerformed(evt);
            }
        });
        getContentPane().add(r4, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 220, 70, -1));

        t4.setToolTipText("Type Your Current Mobile Number");
        getContentPane().add(t4, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 260, 190, -1));

        t5.setToolTipText("Type From Where You Have Done 10th Standard");
        t5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t5ActionPerformed(evt);
            }
        });
        getContentPane().add(t5, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 300, 150, -1));

        t6.setToolTipText("Type From Where You Have Done 12th Standerd");
        t6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t6ActionPerformed(evt);
            }
        });
        getContentPane().add(t6, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 330, 150, -1));

        t7.setToolTipText("Type From Where You Have Done Graduation");
        t7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t7ActionPerformed(evt);
            }
        });
        getContentPane().add(t7, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 360, 150, -1));

        t8.setToolTipText("Type From Where You have Done Post Graduation");
        getContentPane().add(t8, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 390, 150, -1));

        t9.setToolTipText("Type What You Have  Done Other Than Graduation / Post Graduation ");
        getContentPane().add(t9, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 420, 150, -1));

        l14.setFont(new java.awt.Font("Tahoma", 3, 15)); // NOI18N
        l14.setForeground(new java.awt.Color(255, 255, 255));
        l14.setText("Address");
        getContentPane().add(l14, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 40, 80, 20));

        l15.setFont(new java.awt.Font("Tahoma", 3, 15)); // NOI18N
        l15.setForeground(new java.awt.Color(255, 255, 255));
        l15.setText("Experience");
        getContentPane().add(l15, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 150, 100, 20));

        l16.setFont(new java.awt.Font("Tahoma", 3, 15)); // NOI18N
        l16.setForeground(new java.awt.Color(255, 255, 255));
        l16.setText("P.P.W");
        getContentPane().add(l16, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 200, 60, 20));

        l17.setFont(new java.awt.Font("Tahoma", 3, 15)); // NOI18N
        l17.setForeground(new java.awt.Color(255, 255, 255));
        l17.setText("Department");
        getContentPane().add(l17, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 250, 100, 20));

        t11.setToolTipText("Type where you worked previously");
        getContentPane().add(t11, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 200, 170, -1));

        t10.setToolTipText("Type How Many Year You Already Worked");
        getContentPane().add(t10, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 150, 170, 20));

        t12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t12ActionPerformed(evt);
            }
        });
        getContentPane().add(t12, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 250, 170, -1));

        b1.setBackground(new java.awt.Color(255, 255, 255));
        b1.setFont(new java.awt.Font("Tahoma", 3, 13)); // NOI18N
        b1.setText("ADD");
        b1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                b1MouseEntered(evt);
            }
        });
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });
        getContentPane().add(b1, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 340, 90, -1));

        b2.setBackground(new java.awt.Color(255, 255, 255));
        b2.setFont(new java.awt.Font("Tahoma", 3, 13)); // NOI18N
        b2.setText("DELETE");
        b2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b2ActionPerformed(evt);
            }
        });
        getContentPane().add(b2, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 340, 90, -1));

        b3.setBackground(new java.awt.Color(255, 255, 255));
        b3.setFont(new java.awt.Font("Tahoma", 3, 13)); // NOI18N
        b3.setText("UPDATE");
        b3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b3ActionPerformed(evt);
            }
        });
        getContentPane().add(b3, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 340, 100, -1));

        b4.setBackground(new java.awt.Color(255, 255, 255));
        b4.setFont(new java.awt.Font("Tahoma", 3, 13)); // NOI18N
        b4.setText("SEARCH");
        b4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b4ActionPerformed(evt);
            }
        });
        getContentPane().add(b4, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 390, 90, -1));

        b5.setBackground(new java.awt.Color(255, 255, 255));
        b5.setFont(new java.awt.Font("Tahoma", 3, 13)); // NOI18N
        b5.setText("RESET");
        b5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b5ActionPerformed(evt);
            }
        });
        getContentPane().add(b5, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 390, 90, -1));

        b6.setBackground(new java.awt.Color(255, 255, 255));
        b6.setFont(new java.awt.Font("Tahoma", 3, 13)); // NOI18N
        b6.setText("BACK");
        b6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b6ActionPerformed(evt);
            }
        });
        getContentPane().add(b6, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 390, 100, -1));

        ta1.setColumns(20);
        ta1.setRows(5);
        ta1.setToolTipText("Type Your Permanent Address");
        jScrollPane1.setViewportView(ta1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 20, 190, -1));

        t13.setEditable(false);
        t13.setToolTipText("ENTER DATE IN CALENDER TO UPDATE");
        t13.setEnabled(false);
        t13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t13ActionPerformed(evt);
            }
        });
        getContentPane().add(t13, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 70, 130, -1));
        getContentPane().add(c1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 70, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\DELL\\Desktop\\images\\Fotolia_48083225_L-e1369987921841.jpg")); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 890, 460));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1ActionPerformed
String eid, fname,lname,gen=null,marsts=null,
Qh,phno,Qs,Qg,Qpg,Qt,addr,ppw,dept,exp;
int d,m,y;
eid=t1.getText();
fname=t2.getText();
lname=t3.getText();
phno=(t4.getText());
Qh=t5.getText();
Qs=t6.getText();
Qg=t7.getText();
Qpg=t8.getText();
Qt=t9.getText();
addr=ta1.getText();
exp=t10.getText();
ppw=t11.getText();
dept=t12.getText();
Calendar C=c1.getSelectedDate();
d=C.get(C.DAY_OF_MONTH);
m=C.get(C.MONTH)+1;
y=C.get(C.YEAR);
String dob=(y+"-"+m+"-"+d);
if(r1.isSelected())
{
    gen="M";
}
if(r2.isSelected())
{
    gen="F";
}
if(r3.isSelected())
{
  marsts="Married";
}
if(r4.isSelected())
{
    marsts="Unmarried";
}

{try
{
    //code for connectivity
    Class.forName("java.sql.DriverManager");
    Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/factory","root","qwerty");
    Statement s=(Statement)c.createStatement();
    

   String A="Insert into emp values('"+eid+"','"+fname+"','"+lname+"','"+dob+"',"
           + "'"+gen+"','"+marsts+"','"+phno+"','"+Qh+"','"+Qs+"','"+Qg+"','"+Qpg+"',"
           + "'"+Qt+"','"+exp+"','"+ppw+"','"+
            dept+"','"+addr+"');";
   JOptionPane.showMessageDialog(null,"entry added");
   s.executeUpdate(A);
    
}
   catch(Exception e)
  {
    JOptionPane.showMessageDialog(this,e);
  }

}


}//GEN-LAST:event_b1ActionPerformed

    private void b1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b1MouseEntered
        // TODO add your handling code here:
}//GEN-LAST:event_b1MouseEntered

    private void r4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r4ActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_r4ActionPerformed

    private void b6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b6ActionPerformed
 new homepage ().setVisible(true);
                        this.dispose();
 // TODO add your handling code here:
}//GEN-LAST:event_b6ActionPerformed

    private void t5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t5ActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_t5ActionPerformed

    private void t6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t6ActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_t6ActionPerformed

    private void t12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t12ActionPerformed

    private void b5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b5ActionPerformed
this.dispose();
new employee().setVisible(true);
t13.setText(" ");

        // TODO add your handling code here:
    }//GEN-LAST:event_b5ActionPerformed

    private void r1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_r1ActionPerformed

    private void b2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b2ActionPerformed

{ try
{
    //code for connectivity
    Class.forName("java.sql.DriverManager");
    Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/factory","root","qwerty");
    Statement s=(Statement)c.createStatement();
   String A=("delete from emp where eid="+t1.getText()+";");
   JOptionPane.showMessageDialog(null,"entry deleted");
   s.executeUpdate(A);
}
   catch(Exception e)
  {
    JOptionPane.showMessageDialog(this,e);
  }

    }//GEN-LAST:event_b2ActionPerformed
this.dispose();
new employee().setVisible(true);
t13.setText(" ");
    }
    private void b3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b3ActionPerformed
String eid, fname,lname,dob,gen=null,marsts=null,
        Qh,phno,Qs,Qg,Qpg,Qt,addr,ppw,dept,exp;

eid=t1.getText();
fname=t2.getText();
lname=t3.getText();
phno=(t4.getText());
Qh=t5.getText();
Qs=t6.getText();
Qg=t7.getText();
Qpg=t8.getText();
Qt=t9.getText();
addr=ta1.getText();
exp=t10.getText();
ppw=t11.getText();
dept=t12.getText();
Calendar C=c1.getSelectedDate();
 int d=C.get(C.DAY_OF_MONTH);
 int m=C.get(C.MONTH)+1;
 int y=C.get(C.YEAR);
 dob=(y+"-"+m+"-"+d);
if(r1.isSelected())
{
    gen="M";
}
if(r2.isSelected())
{
    gen="F";
}
if(r3.isSelected())
{
    marsts="Married";
}
if(r4.isSelected())
{
    marsts="Unmarried";
}
{ try
{
    //code for connectivity
    Class.forName("java.sql.DriverManager");
    Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/factory","root","qwerty");
    Statement s=(Statement)c.createStatement();
   String B=("delete from emp where eid= "+t1.getText()+";");
   String A=("Insert into emp values('"+eid+"','"+fname+"','"+lname+"','"+dob+"'"
           + ",'"+gen+"','"+marsts+"','"+phno+"','"+Qh+"','"+Qs+"','"+Qg+"',"
           + "'"+Qpg+"','"+Qt+"','"+exp+"','"+ppw+"','"+ dept+"','"+addr+"');");
   JOptionPane.showMessageDialog(null,"changes saved.");
   s.executeUpdate(B);
   s.executeUpdate(A);
}
   catch(Exception e)
  {
    JOptionPane.showMessageDialog(this,e);
  }
  this.dispose();
  new employee().setVisible(true);
  t13.setText(" ");
}

    }//GEN-LAST:event_b3ActionPerformed

    private void b4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b4ActionPerformed
t13.setEnabled(true);
String eid, fname,lname,gen=null,marsts=null,Qh,phno,
Qs,Qg,Qpg,Qt,addr,ppw,dept,exp,h,h1,h2,n;
int dob;
n=t1.getText();
String A;
{ try
    {
    //code for connectivity
    Class.forName("java.sql.DriverManager");
    Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/factory",
    "root","qwerty");
    Statement s=(Statement)c.createStatement();
    if (n.equals(""))
    {
    A="Select * from emp where fname like'%"+ t2.getText()+"%' AND Lname like '%"+ t3.getText()+"%';";
    }
    else
     A=("Select * from emp where eid="+t1.getText()+" ;");
    JOptionPane.showMessageDialog(null,"detail found");
    ResultSet RS=s.executeQuery(A);
while (RS.next())
{
t1.setText(RS.getString("eid"));
t2.setText(RS.getString("fname"));
t3.setText(RS.getString("lname"));
t4.setText(RS.getString("phno"));
t5.setText(RS.getString("Qh"));
t6.setText(RS.getString("Qi"));
t7.setText(RS.getString("Qg"));
t8.setText(RS.getString("Qpg"));
t9.setText(RS.getString("Qt"));
ta1.setText(RS.getString("addr"));
t10.setText(RS.getString("exp"));
t11.setText(RS.getString("ppw"));
t12.setText(RS.getString("dept"));
t13.setText(RS.getString("dob"));
h=RS.getString("gen");
System.out.print(h);
h1=RS.getString("marsts");
h=h.trim();
if(h.equals("M"))
   r1.setSelected(true);
else
   r2.setSelected(true);
if(h1.equals("Married"))
   r3.setSelected(true);
else
   r4.setSelected(true);
}
 }
catch(Exception e)
  {
    JOptionPane.showMessageDialog(this,e);
  }
         }
              
    }//GEN-LAST:event_b4ActionPerformed

    private void r3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_r3ActionPerformed

    private void t1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t1ActionPerformed

    private void t2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t2ActionPerformed

    private void t7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t7ActionPerformed

    private void t13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t13ActionPerformed

    private void t3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t3ActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new employee().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b1;
    private javax.swing.JButton b2;
    private javax.swing.JButton b3;
    private javax.swing.JButton b4;
    private javax.swing.JButton b5;
    private javax.swing.JButton b6;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private datechooser.beans.DateChooserCombo c1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel l1;
    private javax.swing.JLabel l10;
    private javax.swing.JLabel l11;
    private javax.swing.JLabel l12;
    private javax.swing.JLabel l13;
    private javax.swing.JLabel l14;
    private javax.swing.JLabel l15;
    private javax.swing.JLabel l16;
    private javax.swing.JLabel l17;
    private javax.swing.JLabel l2;
    private javax.swing.JLabel l3;
    private javax.swing.JLabel l4;
    private javax.swing.JLabel l5;
    private javax.swing.JLabel l6;
    private javax.swing.JLabel l7;
    private javax.swing.JLabel l8;
    private javax.swing.JLabel l9;
    private javax.swing.JRadioButton r1;
    private javax.swing.JRadioButton r2;
    private javax.swing.JRadioButton r3;
    private javax.swing.JRadioButton r4;
    private javax.swing.JTextField t1;
    private javax.swing.JTextField t10;
    private javax.swing.JTextField t11;
    private javax.swing.JTextField t12;
    private javax.swing.JTextField t13;
    private javax.swing.JTextField t2;
    private javax.swing.JTextField t3;
    private javax.swing.JTextField t4;
    private javax.swing.JTextField t5;
    private javax.swing.JTextField t6;
    private javax.swing.JTextField t7;
    private javax.swing.JTextField t8;
    private javax.swing.JTextField t9;
    private javax.swing.JTextArea ta1;
    // End of variables declaration//GEN-END:variables

}