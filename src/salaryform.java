import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.DriverManager;
import javax.swing.JOptionPane;







/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * salaryform.java
 *
 * Created on Aug 14, 2014, 10:57:28 PM
 */

/**
 *
 * @author 2
 */
public class salaryform extends javax.swing.JFrame {

    /** Creates new form salaryform */
    public salaryform() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
RRMPS     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        t1 = new javax.swing.JTextField();
        t3 = new javax.swing.JTextField();
        t4 = new javax.swing.JTextField();
        t5 = new javax.swing.JTextField();
        t6 = new javax.swing.JTextField();
        t7 = new javax.swing.JTextField();
        t9 = new javax.swing.JTextField();
        t10 = new javax.swing.JTextField();
        t8 = new javax.swing.JTextField();
        b2 = new javax.swing.JButton();
        b5 = new javax.swing.JButton();
        b1 = new javax.swing.JButton();
        b6 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        t2 = new javax.swing.JTextField();
        b4 = new javax.swing.JButton();
        b3 = new javax.swing.JButton();
        b7 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Salary form");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Batang", 3, 12)); // NOI18N
        jLabel2.setText("Employee ID");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, -1, 20));

        jLabel3.setFont(new java.awt.Font("Batang", 3, 12)); // NOI18N
        jLabel3.setText("Basic Salary");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, -1, -1));

        jLabel4.setFont(new java.awt.Font("Batang", 3, 12)); // NOI18N
        jLabel4.setText("Dearly Allowance");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, -1, -1));

        jLabel5.setFont(new java.awt.Font("Batang", 3, 12)); // NOI18N
        jLabel5.setText("House Rent Allowance");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, -1, -1));

        jLabel7.setFont(new java.awt.Font("Batang", 3, 12)); // NOI18N
        jLabel7.setText("Provident Fund");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, -1, -1));

        jLabel8.setFont(new java.awt.Font("Batang", 3, 11)); // NOI18N
        jLabel8.setText("Leave Travel Allowance");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, -1, -1));

        jLabel9.setFont(new java.awt.Font("Batang", 3, 12)); // NOI18N
        jLabel9.setText("Medical Allowance");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, -1, 20));

        jLabel10.setFont(new java.awt.Font("Batang", 3, 12)); // NOI18N
        jLabel10.setText("Net Payable Sallary");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 400, -1, -1));

        jLabel11.setFont(new java.awt.Font("Batang", 3, 12)); // NOI18N
        jLabel11.setText("Account Number");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 440, 140, 20));

        t1.setText(" ");
        t1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t1ActionPerformed(evt);
            }
        });
        getContentPane().add(t1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 70, 140, 20));

        t3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t3ActionPerformed(evt);
            }
        });
        getContentPane().add(t3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 150, 140, -1));

        t4.setEditable(false);
        t4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t4ActionPerformed(evt);
            }
        });
        getContentPane().add(t4, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 190, 140, -1));

        t5.setEditable(false);
        t5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t5ActionPerformed(evt);
            }
        });
        getContentPane().add(t5, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 230, 140, 20));

        t6.setEditable(false);
        t6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t6ActionPerformed(evt);
            }
        });
        getContentPane().add(t6, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 270, 140, -1));
        getContentPane().add(t7, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 310, 140, -1));

        t9.setEnabled(false);
        getContentPane().add(t9, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 400, 140, -1));

        t10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t10ActionPerformed(evt);
            }
        });
        getContentPane().add(t10, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 440, 140, -1));
        getContentPane().add(t8, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 350, 140, -1));

        b2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        b2.setText("ADD");
        b2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b2ActionPerformed(evt);
            }
        });
        getContentPane().add(b2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 160, 70, 20));

        b5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        b5.setText("DELETE");
        b5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b5ActionPerformed(evt);
            }
        });
        getContentPane().add(b5, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 280, -1, -1));

        b1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        b1.setText("TOTAL");
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });
        getContentPane().add(b1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 120, -1, 20));

        b6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        b6.setText("RESET");
        b6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b6ActionPerformed(evt);
            }
        });
        getContentPane().add(b6, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 320, -1, -1));

        jLabel6.setFont(new java.awt.Font("BatangChe", 3, 14)); // NOI18N
        jLabel6.setText("Employee name");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 120, -1));

        t2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t2ActionPerformed(evt);
            }
        });
        getContentPane().add(t2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 110, 140, -1));

        b4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        b4.setText("SHOW");
        b4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b4ActionPerformed(evt);
            }
        });
        getContentPane().add(b4, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 240, -1, -1));

        b3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        b3.setText("UPDATE");
        b3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b3ActionPerformed(evt);
            }
        });
        getContentPane().add(b3, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 200, 80, -1));

        b7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        b7.setText("<<GO BACK");
        b7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b7ActionPerformed(evt);
            }
        });
        getContentPane().add(b7, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 360, -1, -1));

        jLabel12.setFont(new java.awt.Font("Segoe Script", 3, 28)); // NOI18N
        jLabel12.setText("SALARY FORM");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, 240, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\DELL\\Desktop\\images\\foriegninvestment1.jpg")); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 550, 490));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void t5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t5ActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_t5ActionPerformed

    private void t6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t6ActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_t6ActionPerformed

    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1ActionPerformed

        t4.setEnabled(true);
        t5.setEnabled(true);
        t6.setEnabled(true);       
        t9.setEnabled(true);       
        Double bs=Double.parseDouble(t3.getText());
        Double lta=Double.parseDouble(t7.getText());
        Double ma=Double.parseDouble(t8.getText());
        double gs,da=0,pf=0,hra=0,ca,
                d,h,p,b,l,m,ns;
     {try
{
    //code for connectivity
    Class.forName("java.sql.DriverManager");
    Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/factory","root","qwerty");
    Statement s=(Statement)c.createStatement();
    String A=("Select * from fixs;");
     ResultSet rs=s.executeQuery(A);
 while(rs.next())
 {
     t4.setText(rs.getString("da"));
     t5.setText(rs.getString("hra"));
     t6.setText(rs.getString("pf"));
 
d=(da*bs)/100;
h=(hra*bs)/100;
p=(pf*(bs+d))/100;
l=(lta*bs)/100;
m=(ma*bs)/100;
gs=bs+d+h+l+m;
ns=gs-p;
t9.setText(Double.toString(ns));
   JOptionPane.showMessageDialog(null,"total done");
   
 }
         }
   catch(Exception e)
  {
    JOptionPane.showMessageDialog(this,e);
  }

}
        
    }//GEN-LAST:event_b1ActionPerformed

    private void b2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b2ActionPerformed
    
try
{
    //code for connectivity
    Class.forName("java.sql.DriverManager");
    Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/factory","root","qwerty");
    Statement s=(Statement)c.createStatement();
    int eid=Integer.parseInt(t1.getText());
        Double bsal=Double.parseDouble(t3.getText());
        String ename=t2.getText();
        Double lta=Double.parseDouble(t7.getText());
        Double ma=Double.parseDouble(t8.getText());
        Double ns=Double.parseDouble(t9.getText());
        String an=(t10.getText());
        //JOptionPane.showMessageDialog(null,"entry added2");
String A="Insert into salary values("+eid+","+bsal+","+lta+","+ma+",'"+an+"','"+ename+"',"+ns+");";
s.executeUpdate(A);
JOptionPane.showMessageDialog(null,"entry added");
 }
   catch(Exception e)
  {
    JOptionPane.showMessageDialog(this,e);
  }





    }//GEN-LAST:event_b2ActionPerformed

    private void t3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t3ActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_t3ActionPerformed

    private void t10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t10ActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_t10ActionPerformed

    private void t1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t1ActionPerformed

    private void b5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b5ActionPerformed
         try
{
    //code for connectivity
    Class.forName("java.sql.DriverManager");
    Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/factory","root","qwerty");
    Statement s=(Statement)c.createStatement();
     String A=("delete from salary where eid="+t1.getText()+";");
    JOptionPane.showMessageDialog(null,"entry deleted");
   s.executeUpdate(A);
 
}
   catch(Exception e)
  {
    JOptionPane.showMessageDialog(this,e);
  }
                
    }//GEN-LAST:event_b5ActionPerformed

    private void b6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b6ActionPerformed
t1.setText(" ");
t2.setText(" ");
t3.setText(" ");
t4.setText(" ");
t5.setText(" ");
t6.setText(" ");
t7.setText(" ");
t8.setText(" ");
t9.setText(" ");
t10.setText(" ");        // TODO add your handling code here:
    }//GEN-LAST:event_b6ActionPerformed

    private void b3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b3ActionPerformed
   
         try
         {
             //code for connectivity
    Class.forName("java.sql.DriverManager");
    Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/factory","root","qwerty");
    Statement s=(Statement)c.createStatement();
    int eid=Integer.parseInt(t1.getText().trim());

     Double bsal=Double.parseDouble(t3.getText());
     String ename=t2.getText();
     Double lta=Double.parseDouble(t7.getText());
     Double ma=Double.parseDouble(t8.getText());
     Double ns=Double.parseDouble(t9.getText());
     String an=(t10.getText());
     String B=("delete from salary where eid= "+t1.getText()+";");
     String A="Insert into salary values("+eid+","+bsal+","+lta+","
             + ""+ma+",'"+an+"','"+ename+"',"+ns+");";
     s.executeUpdate(B);
     s.executeUpdate(A);
     JOptionPane.showMessageDialog(null,"changes saved.");
         }
   catch(Exception e)
  {
    JOptionPane.showMessageDialog(this,e);
  }
       
    }//GEN-LAST:event_b3ActionPerformed

    private void b4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b4ActionPerformed
        t9.setEnabled(true);
        t4.setEnabled(true);
        t5.setEnabled(true);
        t6.setEnabled(true);   
         try
{
    //code for connectivity
    Class.forName("java.sql.DriverManager");
    Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/factory","root","qwerty");
    Statement s=(Statement)c.createStatement();
Statement s1=(Statement)c.createStatement();

    double bsal=0,lta=0,ma=0,ns=0,da=0,hra=0,pf=0;
    String A=("Select * from salary where eid="+t1.getText().trim()+";");
String B=("Select * from fixs");
ResultSet RS=s.executeQuery(A);
ResultSet RS1=s1.executeQuery(B);
  
while (RS.next())
{
t1.setText(RS.getString("eid"));
t3.setText(RS.getString("bsal"));
t7.setText(RS.getString("lta"));
t8.setText(RS.getString("ma"));
t10.setText(RS.getString("ac"));
t2.setText(RS.getString("ename"));
t9.setText(RS.getString("ns"));
}
   RS1.next();
   {
t4.setText(RS1.getString("da"));
t5.setText(RS1.getString("hra"));
t6.setText(RS1.getString("pf"));
}
 JOptionPane.showMessageDialog(null,"detail found");
          }
    catch(Exception e)
  {
    JOptionPane.showMessageDialog(this,e);
  }
          
    }//GEN-LAST:event_b4ActionPerformed

  private void t2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t2ActionPerformed
      // TODO add your handling code here:
}//GEN-LAST:event_t2ActionPerformed

  private void t4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t4ActionPerformed
      // TODO add your handling code here:
  }//GEN-LAST:event_t4ActionPerformed

  private void b7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b7ActionPerformed
new aboutsalary().setVisible(true);
                        this.dispose();       // TODO add your handling code here:
  }//GEN-LAST:event_b7ActionPerformed
          


    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new salaryform().setVisible(true);
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
    private javax.swing.JButton b7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField t1;
    private javax.swing.JTextField t10;
    private javax.swing.JTextField t2;
    private javax.swing.JTextField t3;
    private javax.swing.JTextField t4;
    private javax.swing.JTextField t5;
    private javax.swing.JTextField t6;
    private javax.swing.JTextField t7;
    private javax.swing.JTextField t8;
    private javax.swing.JTextField t9;
    // End of variables declaration//GEN-END:variables

}
