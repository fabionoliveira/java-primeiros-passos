/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto_funcionario_2022.pkg;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author FO
 */
public class fr_Cad_Tel_Residencial extends javax.swing.JFrame {

    private Tab_TelResidencial tab_telresidencial;
    private fr_Relatorio_Tel_Residencial local_fr_Relatorio_Tel_Residencial;

    private ArrayList<Tab_TelResidencial> lista_ta_telresidencial = new ArrayList();

    private int cod;
    private int nr;

    /**
     * Creates new form fr_Cad_Tel_Residencial
     */
    public fr_Cad_Tel_Residencial() {
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

        lb_cd_Tel_Residencial = new javax.swing.JLabel();
        tf_cd_Tel_Residencial = new javax.swing.JTextField();
        lb_nr_Tel_Residencial = new javax.swing.JLabel();
        tf_nr_Tel_Residencial = new javax.swing.JTextField();
        bt_Limpar_Tel_Residencial = new javax.swing.JButton();
        bt_valida_Tel_Residencial = new javax.swing.JButton();
        bt_Relatorio = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro Tel. Residencial");

        lb_cd_Tel_Residencial.setText("Código:");

        lb_nr_Tel_Residencial.setText("Número:");

        bt_Limpar_Tel_Residencial.setText("Limpar");
        bt_Limpar_Tel_Residencial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_Limpar_Tel_ResidencialActionPerformed(evt);
            }
        });

        bt_valida_Tel_Residencial.setText("Valida");
        bt_valida_Tel_Residencial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_valida_Tel_ResidencialActionPerformed(evt);
            }
        });

        bt_Relatorio.setText("Relatório");
        bt_Relatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_RelatorioActionPerformed(evt);
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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lb_cd_Tel_Residencial)
                            .addComponent(lb_nr_Tel_Residencial))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tf_nr_Tel_Residencial, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE)
                            .addComponent(tf_cd_Tel_Residencial, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(154, 154, 154))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(bt_Limpar_Tel_Residencial)
                        .addGap(27, 27, 27)
                        .addComponent(bt_valida_Tel_Residencial)
                        .addGap(26, 26, 26)
                        .addComponent(bt_Relatorio)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_cd_Tel_Residencial)
                    .addComponent(tf_cd_Tel_Residencial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_nr_Tel_Residencial)
                    .addComponent(tf_nr_Tel_Residencial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_Limpar_Tel_Residencial)
                    .addComponent(bt_valida_Tel_Residencial)
                    .addComponent(bt_Relatorio))
                .addContainerGap(162, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void bt_Limpar_Tel_ResidencialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_Limpar_Tel_ResidencialActionPerformed
        LimparCampos();
    }//GEN-LAST:event_bt_Limpar_Tel_ResidencialActionPerformed

    private void bt_valida_Tel_ResidencialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_valida_Tel_ResidencialActionPerformed
        Carrega_TabTelTelResidencial();
        if (Validacao()) {

            LimparCampos();

        }
    }//GEN-LAST:event_bt_valida_Tel_ResidencialActionPerformed

    private void bt_RelatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_RelatorioActionPerformed
        if (!lista_ta_telresidencial.isEmpty()) {
            local_fr_Relatorio_Tel_Residencial = new fr_Relatorio_Tel_Residencial();
            local_fr_Relatorio_Tel_Residencial.MontaRelatorio_TelResidencial(lista_ta_telresidencial);
            local_fr_Relatorio_Tel_Residencial.setVisible(true);

        } else {

            JOptionPane.showMessageDialog(null, "Sem Registros para Exibir", "Erro", JOptionPane.ERROR_MESSAGE);
        }


    }//GEN-LAST:event_bt_RelatorioActionPerformed

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
            java.util.logging.Logger.getLogger(fr_Cad_Tel_Residencial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(fr_Cad_Tel_Residencial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(fr_Cad_Tel_Residencial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(fr_Cad_Tel_Residencial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new fr_Cad_Tel_Residencial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_Limpar_Tel_Residencial;
    private javax.swing.JButton bt_Relatorio;
    private javax.swing.JButton bt_valida_Tel_Residencial;
    private javax.swing.JLabel lb_cd_Tel_Residencial;
    private javax.swing.JLabel lb_nr_Tel_Residencial;
    private javax.swing.JTextField tf_cd_Tel_Residencial;
    private javax.swing.JTextField tf_nr_Tel_Residencial;
    // End of variables declaration//GEN-END:variables

    private boolean validaCodTelRes() {
        boolean saida = true;

        try {
            cod = Integer.parseInt(tf_cd_Tel_Residencial.getText().trim());

        } catch (NumberFormatException erro) {
            JOptionPane.showMessageDialog(null, "Digite apenas valores Inteiros para CÓDIGO.", "ERRO", JOptionPane.ERROR_MESSAGE);

        }

        return saida;
    }

    private boolean validaNrTelRes() {
        boolean saida = true;

        if (tf_nr_Tel_Residencial.getText().trim().length() < 10) {
            saida = false;
        }

        return saida;
    }

    private boolean Validacao() {
        boolean saida = true;

        try {

            if (!validaCodTelRes()) {
                throw new Exception("Digite apenas valores Inteiros para CÓDIGO.");

            }

            if (!validaNrTelRes()) {
                throw new Exception("O NÚMERO DO Tel. Residencial deve ter 10 Dígitos!!!");

            }
            lista_ta_telresidencial.add(tab_telresidencial);

        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "Erro de Validação de Campos: " + erro.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);

        }

        return saida;
    }

    public void Carrega_TabTelTelResidencial() {

        try {
            cod = Integer.parseInt(tf_cd_Tel_Residencial.getText().trim());

        } catch (NumberFormatException erro) {
            JOptionPane.showMessageDialog(null, "Digite apenas valores Inteiros em CÓDIGO. ", "ERRO", JOptionPane.ERROR_MESSAGE);

        }

        tab_telresidencial = new Tab_TelResidencial();

        tab_telresidencial.setCod_TelResidencial(cod);
        tab_telresidencial.setNr_TelResidencial(tf_nr_Tel_Residencial.getText().trim());

    }

    private void LimparCampos() {
        tf_cd_Tel_Residencial.setText(null);
        tf_nr_Tel_Residencial.setText(null);

    }

}///////////////////////////////////////
