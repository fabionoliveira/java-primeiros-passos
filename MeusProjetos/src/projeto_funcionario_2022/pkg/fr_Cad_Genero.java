/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto_funcionario_2022.pkg;

import javax.swing.JOptionPane;

/**
 *
 * @author FO
 */
public class fr_Cad_Genero extends javax.swing.JFrame {

    private int cod;

    /**
     * Creates new form fr_Cad_Genero
     */
    public fr_Cad_Genero() {
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

        lb_cd_Genero = new javax.swing.JLabel();
        tf_cd_Genero = new javax.swing.JTextField();
        lb_ds_Genero = new javax.swing.JLabel();
        tf_ds_Genero = new javax.swing.JTextField();
        lb_abr_Genero = new javax.swing.JLabel();
        tf_abr_Genero = new javax.swing.JTextField();
        bt_Limpar_Genero = new javax.swing.JButton();
        bt_valida_Genero = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Genero");

        lb_cd_Genero.setText("Código:");

        lb_ds_Genero.setText("Descrição:");

        lb_abr_Genero.setText("Abreviatura:");

        bt_Limpar_Genero.setText("Limpar");
        bt_Limpar_Genero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_Limpar_GeneroActionPerformed(evt);
            }
        });

        bt_valida_Genero.setText("Valida");
        bt_valida_Genero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_valida_GeneroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(bt_Limpar_Genero)
                        .addGap(32, 32, 32)
                        .addComponent(bt_valida_Genero))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(lb_cd_Genero))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(lb_ds_Genero))
                            .addComponent(lb_abr_Genero))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tf_abr_Genero, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_ds_Genero, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_cd_Genero, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(117, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_cd_Genero)
                    .addComponent(tf_cd_Genero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_ds_Genero)
                    .addComponent(tf_ds_Genero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_abr_Genero)
                    .addComponent(tf_abr_Genero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_Limpar_Genero)
                    .addComponent(bt_valida_Genero))
                .addContainerGap(111, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bt_Limpar_GeneroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_Limpar_GeneroActionPerformed

        LimparCampos();

    }//GEN-LAST:event_bt_Limpar_GeneroActionPerformed

    private void bt_valida_GeneroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_valida_GeneroActionPerformed
        if (Validacao()) {

            LimparCampos();

        }
    }//GEN-LAST:event_bt_valida_GeneroActionPerformed

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
            java.util.logging.Logger.getLogger(fr_Cad_Genero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(fr_Cad_Genero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(fr_Cad_Genero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(fr_Cad_Genero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new fr_Cad_Genero().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_Limpar_Genero;
    private javax.swing.JButton bt_valida_Genero;
    private javax.swing.JLabel lb_abr_Genero;
    private javax.swing.JLabel lb_cd_Genero;
    private javax.swing.JLabel lb_ds_Genero;
    private javax.swing.JTextField tf_abr_Genero;
    private javax.swing.JTextField tf_cd_Genero;
    private javax.swing.JTextField tf_ds_Genero;
    // End of variables declaration//GEN-END:variables

    private boolean validaCodGenero() {
        boolean saida = true;

        try {
            cod = Integer.parseInt(tf_cd_Genero.getText().trim());

        } catch (NumberFormatException erro) {
            JOptionPane.showMessageDialog(null, "Digite apenas valores Inteiros para CÓDIGO.", "ERRO", JOptionPane.ERROR_MESSAGE);

        }

        return saida;
    }

    private boolean validaNomeGenero() {
        boolean saida = true;

        if (tf_ds_Genero.getText().trim().length() < 4) {
            saida = false;
        }

        return saida;
    }

    private boolean validaAbrGenero() {
        boolean saida = true;
        if ((tf_abr_Genero.getText().trim().length() < 3) || (tf_abr_Genero.getText().trim().length() > 3)) {
            saida = false;
        }
        return saida;

    }

    private boolean Validacao() {
        boolean saida = true;

        try {

            if (!validaCodGenero()) {
                throw new Exception("Digite apenas valores Inteiros para CÓDIGO.");

            }

            if (!validaNomeGenero()) {
                throw new Exception("O NOME tem que ter no minimo 4 caracteres!!!");
            }

            if (!validaAbrGenero()) {
                throw new Exception("A ABREVIATURA tem que ter 3 caracteres!!!");
            }

        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "Erro de Validação de Campos: " + erro.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);

        }

        return saida;
    }

    private void LimparCampos() {

        tf_cd_Genero.setText(null);
        tf_ds_Genero.setText(null);
        tf_abr_Genero.setText(null);

    }

}////////////////////////////////////////
