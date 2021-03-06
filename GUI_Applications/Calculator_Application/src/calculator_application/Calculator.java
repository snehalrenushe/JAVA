/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator_application;

/**
 *
 * @author 91842
 */
public class Calculator extends javax.swing.JFrame {
    /**
     * Creates new form Calculator
     */
    
    double iNum , iAns;
    int Operation;
    
    public Calculator() {
        initComponents();
        
        jRadioButton1.setEnabled(false);     // ON button Disabled
    }
    
    public void Arithmatic_Operation()
    {
        switch(Operation)
        {
            case 1 -> {
                // Addition
                iAns = iNum + Double.parseDouble(jTextField1.getText());
                jTextField1.setText(Double.toString(iAns));
            }
                
            case 2 -> {
                // Substraction
                iAns = iNum - Double.parseDouble(jTextField1.getText());
                jTextField1.setText(Double.toString(iAns));
            }

            case 3 -> {
                // Multiplication
                iAns = iNum * Double.parseDouble(jTextField1.getText());
                jTextField1.setText(Double.toString(iAns));
            }
                
            case 4 -> {
                // Division
                iAns = iNum / Double.parseDouble(jTextField1.getText());
                jTextField1.setText(Double.toString(iAns));
            }

                
                
        }
    }

    public void enable()
    {
        jTextField1.setEnabled(true);
        
        jRadioButton1.setEnabled(false);        //ON button Disable
        jRadioButton2.setEnabled(true);         //OFF button Enable
        
        btn_Back.setEnabled(true);
        btn_C.setEnabled(true);
        btn_Divide.setEnabled(true);
        btn_Dot.setEnabled(true);
        btn_Eight.setEnabled(true);
        btn_Equal.setEnabled(true);
        btn_Five.setEnabled(true);
        btn_Four.setEnabled(true);
        btn_Minus.setEnabled(true);
        btn_Multiply.setEnabled(true);
        btn_Nine.setEnabled(true);
        btn_One.setEnabled(true);
        btn_Plus.setEnabled(true);
        btn_Seven.setEnabled(true);
        btn_Six.setEnabled(true);
        btn_Three.setEnabled(true);
        btn_Two.setEnabled(true);
        btn_Zero.setEnabled(true);
    }
            
    
    public void Disable()
    {
        jTextField1.setEnabled(false);
        
        jRadioButton1.setEnabled(true);           //ON button Enabled
        jRadioButton2.setEnabled(false);            //OFF button Disabled
        
        btn_Back.setEnabled(false);
        btn_C.setEnabled(false);
        btn_Divide.setEnabled(false);
        btn_Dot.setEnabled(false);
        btn_Eight.setEnabled(false);
        btn_Equal.setEnabled(false);
        btn_Five.setEnabled(false);
        btn_Four.setEnabled(false);
        btn_Minus.setEnabled(false);
        btn_Multiply.setEnabled(false);
        btn_Nine.setEnabled(false);
        btn_One.setEnabled(false);
        btn_Plus.setEnabled(false);
        btn_Seven.setEnabled(false);
        btn_Six.setEnabled(false);
        btn_Three.setEnabled(false);
        btn_Two.setEnabled(false);
        btn_Zero.setEnabled(false);
       
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
        jTextField1 = new javax.swing.JTextField();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        btn_Plus = new javax.swing.JButton();
        btn_One = new javax.swing.JButton();
        btn_C = new javax.swing.JButton();
        btn_Two = new javax.swing.JButton();
        btn_Three = new javax.swing.JButton();
        btn_Divide = new javax.swing.JButton();
        btn_Back = new javax.swing.JButton();
        btn_Zero = new javax.swing.JButton();
        btn_Dot = new javax.swing.JButton();
        btn_Equal = new javax.swing.JButton();
        btn_Seven = new javax.swing.JButton();
        btn_Eight = new javax.swing.JButton();
        btn_Nine = new javax.swing.JButton();
        btn_Minus = new javax.swing.JButton();
        btn_Four = new javax.swing.JButton();
        btn_Five = new javax.swing.JButton();
        btn_Six = new javax.swing.JButton();
        btn_Multiply = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculator");
        setBackground(javax.swing.UIManager.getDefaults().getColor("Button.darkShadow"));
        setLocation(new java.awt.Point(500, 250));
        setResizable(false);
        setType(java.awt.Window.Type.UTILITY);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField1.setEditable(false);
        jTextField1.setBackground(new java.awt.Color(204, 255, 204));
        jTextField1.setFont(new java.awt.Font("Tahoma", 1, 23)); // NOI18N
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 360, 70));

        jRadioButton1.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jRadioButton1.setForeground(new java.awt.Color(255, 0, 0));
        jRadioButton1.setText("ON");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, -1));

        jRadioButton2.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jRadioButton2.setForeground(new java.awt.Color(255, 0, 0));
        jRadioButton2.setText("OFF");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, -1, -1));

        btn_Plus.setBackground(new java.awt.Color(204, 204, 255));
        btn_Plus.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        btn_Plus.setText("+");
        btn_Plus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_PlusActionPerformed(evt);
            }
        });
        getContentPane().add(btn_Plus, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 120, 90, 40));

        btn_One.setBackground(new java.awt.Color(204, 204, 255));
        btn_One.setFont(new java.awt.Font("Tahoma", 1, 28)); // NOI18N
        btn_One.setText("1");
        btn_One.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_OneActionPerformed(evt);
            }
        });
        getContentPane().add(btn_One, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, 70, 50));

        btn_C.setBackground(new java.awt.Color(204, 204, 255));
        btn_C.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btn_C.setText("C");
        btn_C.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CActionPerformed(evt);
            }
        });
        getContentPane().add(btn_C, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 120, 90, 40));

        btn_Two.setBackground(new java.awt.Color(204, 204, 255));
        btn_Two.setFont(new java.awt.Font("Tahoma", 1, 28)); // NOI18N
        btn_Two.setText("2");
        btn_Two.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_TwoActionPerformed(evt);
            }
        });
        getContentPane().add(btn_Two, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 300, 70, 50));

        btn_Three.setBackground(new java.awt.Color(204, 204, 255));
        btn_Three.setFont(new java.awt.Font("Tahoma", 1, 28)); // NOI18N
        btn_Three.setText("3");
        btn_Three.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ThreeActionPerformed(evt);
            }
        });
        getContentPane().add(btn_Three, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 300, 70, 50));

        btn_Divide.setBackground(new java.awt.Color(204, 204, 255));
        btn_Divide.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btn_Divide.setText("/");
        btn_Divide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_DivideActionPerformed(evt);
            }
        });
        getContentPane().add(btn_Divide, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 300, 70, 50));

        btn_Back.setBackground(new java.awt.Color(204, 204, 255));
        btn_Back.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_Back.setText("<--");
        btn_Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_BackActionPerformed(evt);
            }
        });
        getContentPane().add(btn_Back, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 120, 90, 40));

        btn_Zero.setBackground(new java.awt.Color(204, 204, 255));
        btn_Zero.setFont(new java.awt.Font("Tahoma", 1, 28)); // NOI18N
        btn_Zero.setText("0");
        btn_Zero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ZeroActionPerformed(evt);
            }
        });
        getContentPane().add(btn_Zero, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, 70, 50));

        btn_Dot.setBackground(new java.awt.Color(204, 204, 255));
        btn_Dot.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        btn_Dot.setText(".");
        btn_Dot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_DotActionPerformed(evt);
            }
        });
        getContentPane().add(btn_Dot, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 360, 70, 50));

        btn_Equal.setBackground(new java.awt.Color(204, 204, 255));
        btn_Equal.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        btn_Equal.setText("=");
        btn_Equal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_EqualActionPerformed(evt);
            }
        });
        getContentPane().add(btn_Equal, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 360, 170, 50));

        btn_Seven.setBackground(new java.awt.Color(204, 204, 255));
        btn_Seven.setFont(new java.awt.Font("Tahoma", 1, 28)); // NOI18N
        btn_Seven.setText("7");
        btn_Seven.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SevenActionPerformed(evt);
            }
        });
        getContentPane().add(btn_Seven, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 70, 50));

        btn_Eight.setBackground(new java.awt.Color(204, 204, 255));
        btn_Eight.setFont(new java.awt.Font("Tahoma", 1, 28)); // NOI18N
        btn_Eight.setText("8");
        btn_Eight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_EightActionPerformed(evt);
            }
        });
        getContentPane().add(btn_Eight, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 180, 70, 50));

        btn_Nine.setBackground(new java.awt.Color(204, 204, 255));
        btn_Nine.setFont(new java.awt.Font("Tahoma", 1, 28)); // NOI18N
        btn_Nine.setText("9");
        btn_Nine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_NineActionPerformed(evt);
            }
        });
        getContentPane().add(btn_Nine, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 180, 70, 50));

        btn_Minus.setBackground(new java.awt.Color(204, 204, 255));
        btn_Minus.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        btn_Minus.setText("-");
        btn_Minus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_MinusActionPerformed(evt);
            }
        });
        getContentPane().add(btn_Minus, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 180, 70, 50));

        btn_Four.setBackground(new java.awt.Color(204, 204, 255));
        btn_Four.setFont(new java.awt.Font("Tahoma", 1, 28)); // NOI18N
        btn_Four.setText("4");
        btn_Four.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_FourActionPerformed(evt);
            }
        });
        getContentPane().add(btn_Four, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 70, 50));

        btn_Five.setBackground(new java.awt.Color(204, 204, 255));
        btn_Five.setFont(new java.awt.Font("Tahoma", 1, 28)); // NOI18N
        btn_Five.setText("5");
        btn_Five.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_FiveActionPerformed(evt);
            }
        });
        getContentPane().add(btn_Five, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 240, 70, 50));

        btn_Six.setBackground(new java.awt.Color(204, 204, 255));
        btn_Six.setFont(new java.awt.Font("Tahoma", 1, 28)); // NOI18N
        btn_Six.setText("6");
        btn_Six.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SixActionPerformed(evt);
            }
        });
        getContentPane().add(btn_Six, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 240, 70, 50));

        btn_Multiply.setBackground(new java.awt.Color(204, 204, 255));
        btn_Multiply.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        btn_Multiply.setText("*");
        btn_Multiply.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_MultiplyActionPerformed(evt);
            }
        });
        getContentPane().add(btn_Multiply, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 240, 70, 50));

        jLabel1.setForeground(new java.awt.Color(204, 0, 102));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 20, 60, 20));

        setSize(new java.awt.Dimension(394, 462));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_OneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_OneActionPerformed
        jTextField1.setText(jTextField1.getText() + "1");
    }//GEN-LAST:event_btn_OneActionPerformed

    private void btn_TwoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_TwoActionPerformed
        jTextField1.setText(jTextField1.getText() + "2");
    }//GEN-LAST:event_btn_TwoActionPerformed

    private void btn_ThreeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ThreeActionPerformed
        jTextField1.setText(jTextField1.getText() + "3");
    }//GEN-LAST:event_btn_ThreeActionPerformed

    private void btn_FourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_FourActionPerformed
        jTextField1.setText(jTextField1.getText() + "4");
    }//GEN-LAST:event_btn_FourActionPerformed

    private void btn_FiveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_FiveActionPerformed
        jTextField1.setText(jTextField1.getText() + "5");
    }//GEN-LAST:event_btn_FiveActionPerformed

    private void btn_SixActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SixActionPerformed
        jTextField1.setText(jTextField1.getText() + "6");
    }//GEN-LAST:event_btn_SixActionPerformed

    private void btn_SevenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SevenActionPerformed
        jTextField1.setText(jTextField1.getText() + "7");
    }//GEN-LAST:event_btn_SevenActionPerformed

    private void btn_EightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_EightActionPerformed
        jTextField1.setText(jTextField1.getText() + "8");
    }//GEN-LAST:event_btn_EightActionPerformed

    private void btn_NineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_NineActionPerformed
        jTextField1.setText(jTextField1.getText() + "9");
    }//GEN-LAST:event_btn_NineActionPerformed

    private void btn_ZeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ZeroActionPerformed
        jTextField1.setText(jTextField1.getText() + "0");
    }//GEN-LAST:event_btn_ZeroActionPerformed

    private void btn_DotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_DotActionPerformed
        jTextField1.setText(jTextField1.getText() + ".");
    }//GEN-LAST:event_btn_DotActionPerformed

    private void btn_EqualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_EqualActionPerformed
        Arithmatic_Operation();
        jLabel1.setText("");
    }//GEN-LAST:event_btn_EqualActionPerformed

    private void btn_DivideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_DivideActionPerformed
        iNum = Double.parseDouble(jTextField1.getText());
        Operation = 4;
        jTextField1.setText("");
        jLabel1.setText(iNum + "/");
    }//GEN-LAST:event_btn_DivideActionPerformed

    private void btn_MultiplyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_MultiplyActionPerformed
        iNum = Double.parseDouble(jTextField1.getText());
        Operation = 3;
        jTextField1.setText("");
        jLabel1.setText(iNum + "*");
    }//GEN-LAST:event_btn_MultiplyActionPerformed

    private void btn_MinusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_MinusActionPerformed
        iNum = Double.parseDouble(jTextField1.getText());
        Operation = 2;
        jTextField1.setText("");
        jLabel1.setText(iNum + "-");
    }//GEN-LAST:event_btn_MinusActionPerformed

    private void btn_PlusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_PlusActionPerformed
        iNum = Double.parseDouble(jTextField1.getText());
        Operation = 1;
        jTextField1.setText("");
        jLabel1.setText(iNum + "+");
    }//GEN-LAST:event_btn_PlusActionPerformed

    private void btn_CActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CActionPerformed
        jTextField1.setText("");
    }//GEN-LAST:event_btn_CActionPerformed

    private void btn_BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_BackActionPerformed
        int len = jTextField1.getText().length();
        int number = jTextField1.getText().length() - 1;
        String store;
        
        if(len > 0)
        {
            StringBuilder back = new StringBuilder(jTextField1.getText());
            back.deleteCharAt(number);
            store = back.toString();
            jTextField1.setText(store);
        }
    }//GEN-LAST:event_btn_BackActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        Disable();            //Call Disable Method
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        enable();            //Call Enable Method
    }//GEN-LAST:event_jRadioButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Back;
    private javax.swing.JButton btn_C;
    private javax.swing.JButton btn_Divide;
    private javax.swing.JButton btn_Dot;
    private javax.swing.JButton btn_Eight;
    private javax.swing.JButton btn_Equal;
    private javax.swing.JButton btn_Five;
    private javax.swing.JButton btn_Four;
    private javax.swing.JButton btn_Minus;
    private javax.swing.JButton btn_Multiply;
    private javax.swing.JButton btn_Nine;
    private javax.swing.JButton btn_One;
    private javax.swing.JButton btn_Plus;
    private javax.swing.JButton btn_Seven;
    private javax.swing.JButton btn_Six;
    private javax.swing.JButton btn_Three;
    private javax.swing.JButton btn_Two;
    private javax.swing.JButton btn_Zero;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
