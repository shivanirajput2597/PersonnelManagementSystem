import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;

import javax.swing.JOptionPane;






/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * salarystatus.java
 *
 * Created on Oct 18, 2014, 11:12:54 AM
 */

/**
 *
 * @author 2
 */
public class salarystatus extends javax.swing.JFrame {

    /** Creates new form salarystatus */
    public salarystatus() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        year = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        c1 = new javax.swing.JComboBox();
        c2 = new javax.swing.JComboBox();
        c3 = new javax.swing.JComboBox();
        t1 = new javax.swing.JTextField();
        b2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        c4 = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        b1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SALARY STATUS");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial Black", 3, 11)); // NOI18N
        jLabel1.setText("Status");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 230, 80, -1));

        jLabel2.setFont(new java.awt.Font("Arial Black", 3, 11)); // NOI18N
        jLabel2.setText("Month");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 110, 50, -1));

        year.setFont(new java.awt.Font("Arial Black", 3, 11)); // NOI18N
        year.setText("Year");
        getContentPane().add(year, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 150, 50, 20));

        jLabel4.setFont(new java.awt.Font("Arial Black", 3, 11)); // NOI18N
        jLabel4.setText("Payment Mode");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 190, 130, -1));

        c1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Paid", "Delayed" }));
        c1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c1ActionPerformed(evt);
            }
        });
        getContentPane().add(c1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 230, 140, -1));

        c2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "JAN", "FEB", "MAR", "APR", "MAY", "JUNE", "JULY", "AUG", "SEP", "OCT", "NOV", "DEC", " " }));
        getContentPane().add(c2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 110, 140, -1));

        c3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019", "2020", " " }));
        c3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c3ActionPerformed(evt);
            }
        });
        getContentPane().add(c3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 150, 140, -1));

        t1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t1ActionPerformed(evt);
            }
        });
        getContentPane().add(t1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 70, 140, -1));

        b2.setFont(new java.awt.Font("Arial Black", 3, 11)); // NOI18N
        b2.setText("ADD");
        b2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b2ActionPerformed(evt);
            }
        });
        getContentPane().add(b2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 300, 120, -1));

        jLabel3.setFont(new java.awt.Font("Arial Black", 3, 11)); // NOI18N
        jLabel3.setText("Employee id");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 60, 110, 30));

        c4.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "By Cash", "Online" }));
        c4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c4ActionPerformed(evt);
            }
        });
        getContentPane().add(c4, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 190, 140, -1));

        jLabel6.setFont(new java.awt.Font("Arial Black", 3, 18)); // NOI18N
        jLabel6.setText("SALARY STATUS");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 20, 280, 20));

        b1.setFont(new java.awt.Font("Arial Black", 3, 11)); // NOI18N
        b1.setText("Back to Aboutsalary");
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });
        getContentPane().add(b1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 300, 230, -1));

        jLabel5.setFont(new java.awt.Font("Arial Black", 3, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 204, 204));
        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\DELL\\Desktop\\images\\images.jpg")); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 560, 400));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void c1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c1ActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_c1ActionPerformed

    private void c3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c3ActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_c3ActionPerformed

    private void t1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t1ActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_t1ActionPerformed

    private void b2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b2ActionPerformed
           try
{
    //code for connectivity
    Class.forName("java.sql.DriverManager");
    Connection C=DriverManager.getConnection("jdbc:mysql://localhost:3306/factory","root","qwerty");
    Statement s=(Statement)C.createStatement();
    int eid=Integer.parseInt(t1.getText());
     String a,b,c,d;
     a=(String)c1.getSelectedItem();
     b=(String)c2.getSelectedItem();
     c=(String)c3.getSelectedItem();
     d=(String)c4.getSelectedItem();
 String A="insert into salstatus values("+eid+",'"+b+"','"+c+"','"+a+"','"+d+"');";
    s.executeUpdate(A);
 JOptionPane.showMessageDialog(null,"entry added");
}
   catch(Exception e)
  {
    JOptionPane.showMessageDialog(this,e);
  }


    }//GEN-LAST:event_b2ActionPerformed

    private void c4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c4ActionPerformed
  
  
  
}//GEN-LAST:event_c4ActionPerformed

    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1ActionPerformed
new aboutsalary ().setVisible(true);
                        this.dispose();      
    }//GEN-LAST:event_b1ActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new salarystatus().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b1;
    private javax.swing.JButton b2;
    private javax.swing.JComboBox c1;
    private javax.swing.JComboBox c2;
    private javax.swing.JComboBox c3;
    private javax.swing.JComboBox c4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField t1;
    private javax.swing.JLabel year;
    // End of variables declaration//GEN-END:variables

}
