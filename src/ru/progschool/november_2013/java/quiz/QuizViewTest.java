/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package my.QuizView;

/**
 *
 * @author rushano4ka1987
 */
public class QuizViewTest extends javax.swing.JFrame {

    /**
     * Creates new form QuizViewTest
     */
    public QuizViewTest() {
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

        PanelTest = new javax.swing.JPanel();
        LabelofNumberOfQuestion = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TextAreaWriteQuestion = new javax.swing.JTextArea();
        jRadioButtonAnswer1 = new javax.swing.JRadioButton();
        jRadioButtonAnswer2 = new javax.swing.JRadioButton();
        jRadioButtonAnswer3 = new javax.swing.JRadioButton();
        jRadioButtonAnswer4 = new javax.swing.JRadioButton();
        LabelOfTime = new javax.swing.JLabel();
        TextFieldTime = new javax.swing.JTextField();
        ButtonContinueTest = new javax.swing.JButton();
        ButtonClose = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        LabelofNumberOfQuestion.setText("������ � 1.");

        TextAreaWriteQuestion.setColumns(20);
        TextAreaWriteQuestion.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        TextAreaWriteQuestion.setRows(5);
        TextAreaWriteQuestion.setText("����� �������");
        jScrollPane1.setViewportView(TextAreaWriteQuestion);

        jRadioButtonAnswer1.setText("����� 1");
        jRadioButtonAnswer1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonAnswer1ActionPerformed(evt);
            }
        });

        jRadioButtonAnswer2.setText("����� 2");

        jRadioButtonAnswer3.setText("����� 3");

        jRadioButtonAnswer4.setText("����� 4");
        jRadioButtonAnswer4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonAnswer4ActionPerformed(evt);
            }
        });

        LabelOfTime.setText("�����, ����������� �� ����, �.");

        ButtonContinueTest.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        ButtonContinueTest.setText("��������� ������");
        ButtonContinueTest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonContinueTestActionPerformed(evt);
            }
        });

        ButtonClose.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        ButtonClose.setText("��������� ������������");
        ButtonClose.setPreferredSize(new java.awt.Dimension(143, 25));

        javax.swing.GroupLayout PanelTestLayout = new javax.swing.GroupLayout(PanelTest);
        PanelTest.setLayout(PanelTestLayout);
        PanelTestLayout.setHorizontalGroup(
            PanelTestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelTestLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jScrollPane1))
            .addGroup(PanelTestLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LabelofNumberOfQuestion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(PanelTestLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jRadioButtonAnswer1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(PanelTestLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jRadioButtonAnswer2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(PanelTestLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jRadioButtonAnswer3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelTestLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jRadioButtonAnswer4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(PanelTestLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelTestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelTestLayout.createSequentialGroup()
                        .addComponent(ButtonContinueTest, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ButtonClose, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelTestLayout.createSequentialGroup()
                        .addComponent(LabelOfTime, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TextFieldTime, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 18, Short.MAX_VALUE))
        );
        PanelTestLayout.setVerticalGroup(
            PanelTestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelTestLayout.createSequentialGroup()
                .addComponent(LabelofNumberOfQuestion, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButtonAnswer1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRadioButtonAnswer2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButtonAnswer3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButtonAnswer4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelTestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(TextFieldTime)
                    .addComponent(LabelOfTime, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(PanelTestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ButtonContinueTest, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButtonClose, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(43, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PanelTest, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PanelTest, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioButtonAnswer1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonAnswer1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButtonAnswer1ActionPerformed

    private void jRadioButtonAnswer4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonAnswer4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButtonAnswer4ActionPerformed

    private void ButtonContinueTestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonContinueTestActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ButtonContinueTestActionPerformed

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
            java.util.logging.Logger.getLogger(QuizViewTest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QuizViewTest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QuizViewTest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QuizViewTest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QuizViewTest().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonClose;
    private javax.swing.JButton ButtonContinueTest;
    private javax.swing.JLabel LabelOfTime;
    private javax.swing.JLabel LabelofNumberOfQuestion;
    private javax.swing.JPanel PanelTest;
    private javax.swing.JTextArea TextAreaWriteQuestion;
    private javax.swing.JTextField TextFieldTime;
    private javax.swing.JRadioButton jRadioButtonAnswer1;
    private javax.swing.JRadioButton jRadioButtonAnswer2;
    private javax.swing.JRadioButton jRadioButtonAnswer3;
    private javax.swing.JRadioButton jRadioButtonAnswer4;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
