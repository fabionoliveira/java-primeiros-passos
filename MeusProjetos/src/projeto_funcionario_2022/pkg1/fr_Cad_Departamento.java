/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto_funcionario_2022.pkg1;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author FO
 */
public class fr_Cad_Departamento extends javax.swing.JFrame {

    private Tab_Departamento tab_departamento;
    private fr_Relatorio_Departamento local_fr_Relatorio_Departamento;

    private ArrayList<Tab_Departamento> lista_tab_departamento = new ArrayList();

    private int cod;

    /**
     * Creates new form fr_Cad_Departamento
     */
    public fr_Cad_Departamento() {
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

        lb_cd_Departamento = new javax.swing.JLabel();
        tf_cd_Departamento = new javax.swing.JTextField();
        lb_nm_Departamento = new javax.swing.JLabel();
        tf_nm_Departamento = new javax.swing.JTextField();
        lb_sgl_Departamento = new javax.swing.JLabel();
        tf_sgl_Departamento = new javax.swing.JTextField();
        lb_funGer_Departamento = new javax.swing.JLabel();
        bt_Limpar_Departamento = new javax.swing.JButton();
        bt_valida_Departamento = new javax.swing.JButton();
        bt_Relatorio = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Departamento");

        lb_cd_Departamento.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lb_cd_Departamento.setText("Código:");

        lb_nm_Departamento.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lb_nm_Departamento.setText("Nome:");

        lb_sgl_Departamento.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lb_sgl_Departamento.setText("Sigla:");

        lb_funGer_Departamento.setText("Funcionario Gerente: (FK)");

        bt_Limpar_Departamento.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        bt_Limpar_Departamento.setText("Limpar");
        bt_Limpar_Departamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_Limpar_DepartamentoActionPerformed(evt);
            }
        });

        bt_valida_Departamento.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        bt_valida_Departamento.setText("Valida");
        bt_valida_Departamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_valida_DepartamentoActionPerformed(evt);
            }
        });

        bt_Relatorio.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
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
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lb_funGer_Departamento)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(bt_Limpar_Departamento)
                            .addGap(18, 18, 18)
                            .addComponent(bt_valida_Departamento)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bt_Relatorio))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(lb_sgl_Departamento)
                                .addComponent(lb_cd_Departamento)
                                .addComponent(lb_nm_Departamento))
                            .addGap(28, 28, 28)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(tf_nm_Departamento, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tf_cd_Departamento, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(tf_sgl_Departamento, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(128, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_cd_Departamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_cd_Departamento))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_nm_Departamento)
                    .addComponent(tf_nm_Departamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_sgl_Departamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_sgl_Departamento))
                .addGap(18, 18, 18)
                .addComponent(lb_funGer_Departamento)
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_Limpar_Departamento)
                    .addComponent(bt_valida_Departamento)
                    .addComponent(bt_Relatorio))
                .addContainerGap(99, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void bt_Limpar_DepartamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_Limpar_DepartamentoActionPerformed
        LimparCampos();
    }//GEN-LAST:event_bt_Limpar_DepartamentoActionPerformed

    private void bt_valida_DepartamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_valida_DepartamentoActionPerformed

        Carrega_TabDepartamento();
        if (Validacao()) {

            LimparCampos();

        }// TODO add your handling code here:
    }//GEN-LAST:event_bt_valida_DepartamentoActionPerformed

    private void bt_RelatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_RelatorioActionPerformed
        if (!lista_tab_departamento.isEmpty()) {

            local_fr_Relatorio_Departamento = new fr_Relatorio_Departamento();
            local_fr_Relatorio_Departamento.MontaRelatorio_Departamento(lista_tab_departamento);
            local_fr_Relatorio_Departamento.setVisible(true);

        } else {

            JOptionPane.showMessageDialog(null, "Sem Registros para Exibir", "Erro", JOptionPane.ERROR_MESSAGE);
        }
        // TODO add your handling code here:
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
            java.util.logging.Logger.getLogger(fr_Cad_Departamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(fr_Cad_Departamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(fr_Cad_Departamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(fr_Cad_Departamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new fr_Cad_Departamento().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_Limpar_Departamento;
    private javax.swing.JButton bt_Relatorio;
    private javax.swing.JButton bt_valida_Departamento;
    private javax.swing.JLabel lb_cd_Departamento;
    private javax.swing.JLabel lb_funGer_Departamento;
    private javax.swing.JLabel lb_nm_Departamento;
    private javax.swing.JLabel lb_sgl_Departamento;
    private javax.swing.JTextField tf_cd_Departamento;
    private javax.swing.JTextField tf_nm_Departamento;
    private javax.swing.JTextField tf_sgl_Departamento;
    // End of variables declaration//GEN-END:variables

    private boolean validaCodDepartamento() {
        boolean saida = true;

        try {
            cod = Integer.parseInt(tf_cd_Departamento.getText().trim());

        } catch (NumberFormatException erro) {
            JOptionPane.showMessageDialog(null, "Digite apenas valores Inteiros para CÓDIGO.", "ERRO", JOptionPane.ERROR_MESSAGE);

        }

        return saida;
    }

    private boolean validaNomeDepartamento() {
        boolean saida = true;

        if (tf_nm_Departamento.getText().trim().length() < 4) {
            saida = false;
        }

        return saida;
    }

    private boolean validaSglDepartamento() {
        boolean saida = true;
        if ((tf_sgl_Departamento.getText().trim().length() < 3) || (tf_sgl_Departamento.getText().trim().length() > 3)) {
            saida = false;
        }
        return saida;

    }

    private boolean Validacao() {
        boolean saida = true;

        try {

            if (!validaCodDepartamento()) {
                throw new Exception("Digite apenas valores Inteiros para CÓDIGO.");

            }

            if (!validaNomeDepartamento()) {
                throw new Exception("O NOME tem que ter no minimo 4 caracteres!!!");
            }

            if (!validaSglDepartamento()) {
                throw new Exception("A SIGLA tem que ter 3 caracteres!!!");
            }
            lista_tab_departamento.add(tab_departamento);

        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "Erro de Validação de Campos: " + erro.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);

        }

        return saida;
    }

    public void Carrega_TabDepartamento() {

        try {
            cod = Integer.parseInt(tf_cd_Departamento.getText().trim());

        } catch (NumberFormatException erro) {
            JOptionPane.showMessageDialog(null, "Digite apenas valores Inteiros em CÓDIGO. ", "ERRO", JOptionPane.ERROR_MESSAGE);

        }

        tab_departamento = new Tab_Departamento();

        tab_departamento.setCod_Departamento(cod);

        tab_departamento.setNm_Departamento(tf_nm_Departamento.getText().trim());

        tab_departamento.setSi_Departamento(tf_sgl_Departamento.getText().trim());
        //tab_departamento.setSalario_cargo(salario);

    }

    private void LimparCampos() {

        tf_cd_Departamento.setText(null);
        tf_nm_Departamento.setText(null);
        tf_sgl_Departamento.setText(null);

    }

}//////////////////////////////
