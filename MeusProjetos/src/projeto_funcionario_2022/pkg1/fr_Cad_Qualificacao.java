/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto_funcionario_2022.pkg1;

import javax.swing.JOptionPane;

/**
 *
 * @author FO
 */
public class fr_Cad_Qualificacao extends javax.swing.JFrame {

    private int cod;

    /**
     * Creates new form fr_Cad_Qualificacao
     */
    public fr_Cad_Qualificacao() {
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

        lb_cd_Qualificacao = new javax.swing.JLabel();
        tf_cd_Qualificacao = new javax.swing.JTextField();
        lb_ds_Qualificacao = new javax.swing.JLabel();
        tf_ds_Qualificacao = new javax.swing.JTextField();
        lb_cargo_Qualificacao = new javax.swing.JLabel();
        bt_Limpar_Qualificacao = new javax.swing.JButton();
        bt_valida_Qualificacao = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Qualificação");

        lb_cd_Qualificacao.setText("Código:");

        lb_ds_Qualificacao.setText("Descrição:");

        lb_cargo_Qualificacao.setText("Cargo: (FK)");

        bt_Limpar_Qualificacao.setText("Limpar");
        bt_Limpar_Qualificacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_Limpar_QualificacaoActionPerformed(evt);
            }
        });

        bt_valida_Qualificacao.setText("Valida");
        bt_valida_Qualificacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_valida_QualificacaoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(bt_Limpar_Qualificacao)
                        .addGap(29, 29, 29)
                        .addComponent(bt_valida_Qualificacao))
                    .addComponent(lb_cargo_Qualificacao)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lb_ds_Qualificacao)
                            .addComponent(lb_cd_Qualificacao))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tf_cd_Qualificacao, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)
                            .addComponent(tf_ds_Qualificacao))))
                .addContainerGap(150, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_cd_Qualificacao)
                    .addComponent(tf_cd_Qualificacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_ds_Qualificacao)
                    .addComponent(tf_ds_Qualificacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addComponent(lb_cargo_Qualificacao)
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_Limpar_Qualificacao)
                    .addComponent(bt_valida_Qualificacao))
                .addContainerGap(105, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bt_Limpar_QualificacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_Limpar_QualificacaoActionPerformed
        LimparCampos();
    }//GEN-LAST:event_bt_Limpar_QualificacaoActionPerformed

    private void bt_valida_QualificacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_valida_QualificacaoActionPerformed
        if (Validacao()) {

            LimparCampos();

        }// TODO add your handling code here:
    }//GEN-LAST:event_bt_valida_QualificacaoActionPerformed

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
            java.util.logging.Logger.getLogger(fr_Cad_Qualificacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(fr_Cad_Qualificacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(fr_Cad_Qualificacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(fr_Cad_Qualificacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new fr_Cad_Qualificacao().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_Limpar_Qualificacao;
    private javax.swing.JButton bt_valida_Qualificacao;
    private javax.swing.JLabel lb_cargo_Qualificacao;
    private javax.swing.JLabel lb_cd_Qualificacao;
    private javax.swing.JLabel lb_ds_Qualificacao;
    private javax.swing.JTextField tf_cd_Qualificacao;
    private javax.swing.JTextField tf_ds_Qualificacao;
    // End of variables declaration//GEN-END:variables
private boolean validaCodQualificacao() {
        boolean saida = true;

        try {
            cod = Integer.parseInt(tf_cd_Qualificacao.getText().trim());

        } catch (NumberFormatException erro) {
            JOptionPane.showMessageDialog(null, "Digite apenas valores Inteiros para CÓDIGO.", "ERRO", JOptionPane.ERROR_MESSAGE);

        }

        return saida;
    }

    private boolean validaDsQualificacao() {
        boolean saida = true;

        if (tf_ds_Qualificacao.getText().trim().length() < 4) {
            saida = false;
        }

        return saida;
    }

    private boolean Validacao() {
        boolean saida = true;

        try {

            if (!validaCodQualificacao()) {
                throw new Exception("Digite apenas valores Inteiros para CÓDIGO.");

            }

            if (!validaDsQualificacao()) {
                throw new Exception("A DESCRIÇÃO tem que ter no minimo 4 caracteres!!!");
            }

        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "Erro de Validação de Campos: " + erro.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);

        }

        return saida;
    }

    private void LimparCampos() {

        tf_cd_Qualificacao.setText(null);
        tf_ds_Qualificacao.setText(null);

    }

}/////////////////////////////////
