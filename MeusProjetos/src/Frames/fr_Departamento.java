/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frames;

import DAO.DAO_Departamento;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import Objetos.Departamento;

/**
 *
 * @author FO
 */
public class fr_Departamento extends javax.swing.JFrame {

    private Departamento tab_departamento;
    private fr_Relatorio_Departamento local_fr_Relatorio_Departamento;

    private ArrayList<Departamento> lista_tab_departamento = new ArrayList();

    DAO_Departamento dao = new DAO_Departamento();
    Departamento linha;

    private int cod;
    private String operacao;

    /**
     * Creates new form fr_Cad_Departamento
     */
    public fr_Departamento() {
        initComponents();
        Habilitar(false);
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
        tf_ds_Departamento = new javax.swing.JTextField();
        lb_sgl_Departamento = new javax.swing.JLabel();
        tf_abr_Departamento = new javax.swing.JTextField();
        bt_Limpar_Departamento = new javax.swing.JButton();
        bt_Incluir = new javax.swing.JButton();
        bt_Excluir = new javax.swing.JButton();
        bt_Salvar = new javax.swing.JButton();
        bt_Alterar = new javax.swing.JButton();
        bt_RelatorioG = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Departamento");

        lb_cd_Departamento.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lb_cd_Departamento.setText("Código:");

        tf_cd_Departamento.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tf_cd_DepartamentoFocusLost(evt);
            }
        });

        lb_nm_Departamento.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lb_nm_Departamento.setText("Nome:");

        lb_sgl_Departamento.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lb_sgl_Departamento.setText("Sigla:");

        bt_Limpar_Departamento.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        bt_Limpar_Departamento.setText("Limpar");
        bt_Limpar_Departamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_Limpar_DepartamentoActionPerformed(evt);
            }
        });

        bt_Incluir.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        bt_Incluir.setText("Incluir");
        bt_Incluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_IncluirActionPerformed(evt);
            }
        });

        bt_Excluir.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        bt_Excluir.setText("Excluir");
        bt_Excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_ExcluirActionPerformed(evt);
            }
        });

        bt_Salvar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        bt_Salvar.setText("Salvar");
        bt_Salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_SalvarActionPerformed(evt);
            }
        });

        bt_Alterar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        bt_Alterar.setText("Alterar");
        bt_Alterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_AlterarActionPerformed(evt);
            }
        });

        bt_RelatorioG.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        bt_RelatorioG.setText("Relatório");
        bt_RelatorioG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_RelatorioGActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lb_sgl_Departamento)
                            .addComponent(lb_cd_Departamento)
                            .addComponent(lb_nm_Departamento))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(tf_ds_Departamento, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(tf_cd_Departamento, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(tf_abr_Departamento, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(bt_Limpar_Departamento)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bt_RelatorioG)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bt_Incluir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bt_Alterar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bt_Salvar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bt_Excluir)))
                .addContainerGap(100, Short.MAX_VALUE))
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
                    .addComponent(tf_ds_Departamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_abr_Departamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_sgl_Departamento))
                .addGap(83, 83, 83)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_Limpar_Departamento)
                    .addComponent(bt_Incluir)
                    .addComponent(bt_Excluir)
                    .addComponent(bt_RelatorioG)
                    .addComponent(bt_Alterar)
                    .addComponent(bt_Salvar))
                .addContainerGap(93, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void bt_Limpar_DepartamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_Limpar_DepartamentoActionPerformed
        LimparCampos();
    }//GEN-LAST:event_bt_Limpar_DepartamentoActionPerformed


    private void bt_IncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_IncluirActionPerformed
        operacao = "I";
        tf_ds_Departamento.setEnabled(true);
        tf_abr_Departamento.setEnabled(true);
        
    }//GEN-LAST:event_bt_IncluirActionPerformed

    private void tf_cd_DepartamentoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tf_cd_DepartamentoFocusLost
        try {
            int Codigo = Integer.parseInt((tf_cd_Departamento.getText().trim()));
           

            MontaTela(Codigo);

            if (operacao.equals("E")) {
                int resp = JOptionPane.showConfirmDialog(null, "Confirma Exclusão?", "Confirmação", JOptionPane.YES_NO_CANCEL_OPTION);

                if (resp == 0) {
                    Exclusao(Codigo);
                }
                LimparCampos();
            }

            if (operacao.equals("A")) {
                Habilitar(true);
                tf_cd_Departamento.setEnabled(false);

            }

        } catch (NumberFormatException err) {
            JOptionPane.showMessageDialog(null, "Informe o Código Corretamente", "Erro", JOptionPane.ERROR_MESSAGE);
            LimparCampos();
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_cd_DepartamentoFocusLost

    private void bt_ExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_ExcluirActionPerformed
        tf_cd_Departamento.setEnabled(true);
        operacao = "E";// TODO add your handling code here:
    }//GEN-LAST:event_bt_ExcluirActionPerformed

    private void bt_SalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_SalvarActionPerformed
        if (ConsisteCampos()) {

            if (operacao.equals("I")) {

                try {
                    if (dao.incluir_Departamento(linha)) {
                        JOptionPane.showMessageDialog(null, "Registro Incluido com sucesso", "Messagem", JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        JOptionPane.showMessageDialog(null, "Registro NÃO foi Incluido.", "Erro dados", JOptionPane.ERROR_MESSAGE);
                    }

                } catch (Exception erro) {
                    JOptionPane.showMessageDialog(null, "Erro ao Incluir  Registro. BD." + erro.getMessage(), "Erro BD", JOptionPane.ERROR_MESSAGE);
                } finally {
                    LimparCampos();
                }

            }

            if (operacao.equals("A")) {

                try {

                    if (dao.altera_Departamento(linha)) {
                        JOptionPane.showMessageDialog(null, "Registro Alterado com sucesso", "Messagem", JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        JOptionPane.showMessageDialog(null, "Registro NÃO foi Alterado.", "Erro dados", JOptionPane.ERROR_MESSAGE);
                    }

                } catch (Exception erro) {
                    JOptionPane.showMessageDialog(null, "Erro ao Alterar Registro. BD." + erro.getMessage(), "Erro BD", JOptionPane.ERROR_MESSAGE);
                } finally {
                    LimparCampos();
                }

            }

        } else {

            JOptionPane.showMessageDialog(null, "Informe todos os Campos.", "Erro", JOptionPane.ERROR_MESSAGE);
        }// TODO add your handling code here:
    }//GEN-LAST:event_bt_SalvarActionPerformed

    private void bt_AlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_AlterarActionPerformed
        tf_cd_Departamento.setEnabled(true);
        operacao = "A";// TODO add your handling code here:
    }//GEN-LAST:event_bt_AlterarActionPerformed

    private void bt_RelatorioGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_RelatorioGActionPerformed
        fr_DepartamentoRelatorioGeral fr_RelGeral = new fr_DepartamentoRelatorioGeral();

        fr_RelGeral.setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_bt_RelatorioGActionPerformed

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
            java.util.logging.Logger.getLogger(fr_Departamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(fr_Departamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(fr_Departamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(fr_Departamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new fr_Departamento().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_Alterar;
    private javax.swing.JButton bt_Excluir;
    private javax.swing.JButton bt_Incluir;
    private javax.swing.JButton bt_Limpar_Departamento;
    private javax.swing.JButton bt_RelatorioG;
    private javax.swing.JButton bt_Salvar;
    private javax.swing.JLabel lb_cd_Departamento;
    private javax.swing.JLabel lb_nm_Departamento;
    private javax.swing.JLabel lb_sgl_Departamento;
    private javax.swing.JTextField tf_abr_Departamento;
    private javax.swing.JTextField tf_cd_Departamento;
    private javax.swing.JTextField tf_ds_Departamento;
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

        if (tf_ds_Departamento.getText().trim().length() < 4) {
            saida = false;
        }

        return saida;
    }

    private boolean validaSglDepartamento() {
        boolean saida = true;
        if ((tf_abr_Departamento.getText().trim().length() < 3) || (tf_abr_Departamento.getText().trim().length() > 3)) {
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
                throw new Exception("A Abreviatura tem que ter 3 caracteres!!!");
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

        tab_departamento = new Departamento();

        tab_departamento.setCod_Departamento(cod);

        tab_departamento.setDs_Departamento(tf_ds_Departamento.getText().trim());

        tab_departamento.setAbr_Departamento(tf_abr_Departamento.getText().trim());
        //tab_departamento.setSalario_cargo(salario);

    }

    private boolean ConsisteCampos() {

        boolean saida = true;
        String msg = "";

        if ((!tf_ds_Departamento.getText().trim().isEmpty())
                && (!tf_abr_Departamento.getText().trim().isEmpty())) {

            linha = new Departamento();

            msg = linha.is_ds_DepartamentoValido(tf_ds_Departamento.getText().trim());
            if (!msg.isEmpty()) {
                JOptionPane.showMessageDialog(null, msg, "Erro", JOptionPane.ERROR_MESSAGE);
                saida = false;
            }

            msg = linha.is_abr_DepartamentoValido(tf_abr_Departamento.getText().trim());
            if (!msg.isEmpty()) {
                JOptionPane.showMessageDialog(null, msg, "Erro", JOptionPane.ERROR_MESSAGE);
                saida = false;

            }

            if (saida) {
                linha.setDs_Departamento(tf_ds_Departamento.getText().trim());
                linha.setAbr_Departamento(tf_abr_Departamento.getText().trim());

                if (operacao.equals("A")) {
                    linha.setCod_Departamento(Integer.parseInt(tf_cd_Departamento.getText().trim()));
                }
            }

        } else {
            saida = false;
        }

        return saida;
    }

    private void LimparCampos() {

        tf_cd_Departamento.setText(null);
        tf_ds_Departamento.setText(null);
        tf_abr_Departamento.setText(null);
        Habilitar(false);
        operacao = "";

    }

    private void Habilitar(boolean arg) {
        tf_cd_Departamento.setEnabled(arg);
        tf_ds_Departamento.setEnabled(arg);
        tf_abr_Departamento.setEnabled(arg);
    }

    private void MontaTela(int cod) {

        linha = new Departamento();
        try {
            linha = dao.Consulta_Departamento_Unitaria(cod);

            tf_cd_Departamento.setText(String.valueOf(linha.getCod_Departamento()));
            tf_ds_Departamento.setText(linha.getDs_Departamento());
            tf_abr_Departamento.setText(linha.getAbr_Departamento());

        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "Erro na Montagem tela - Acesso a BD\n" + erro.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
        }

    }

    private void Exclusao(int cod) {

        try {
            boolean saida = dao.exclui_Departamento(cod);
            if (saida) {
                JOptionPane.showMessageDialog(null, "Exclusão Concluída com sucesso!", "Mensagem", JOptionPane.ERROR_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Exclusão não Concluída. Verifique.", "Mensagem", JOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "Erro na Exclusão - Acesso a BD\n" + erro.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }

}//////////////////////////////
