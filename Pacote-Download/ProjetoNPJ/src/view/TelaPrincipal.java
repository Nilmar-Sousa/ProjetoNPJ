package view;

import java.sql.SQLException;
import javax.swing.JOptionPane;
import modeloConection.ConexaoBD;
import static modeloConection.ConexaoBD.con;

/**
 *
 * @author Nilmar
 */
public class TelaPrincipal extends javax.swing.JFrame {
    
    ConexaoBD conecta = new ConexaoBD();
    FichaCadastroUsuarios telaUser = new FichaCadastroUsuarios();
    FichaCadastroClientes telaCliente = new FichaCadastroClientes();
    Acompanhamento telaAcompanhamento = new Acompanhamento();
    Relatorio telaRelatorioAcomp = new Relatorio();
    TelaAssistidos telaAssistidos = new TelaAssistidos();
    TelaPesquisa telaPesquisa = new TelaPesquisa();

    public TelaPrincipal(String usuario) {
        initComponents();
        this.setIconImage(new javax.swing.ImageIcon(getClass().getResource("/imagens/icone_justica.png")).getImage());
        jLabelUsuario.setText(usuario);
        conecta.getConnection();
    }
    
    public TelaPrincipal() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabelUsuario = new javax.swing.JLabel();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jLabelFundoTelaPrincipal = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuCadastro = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItemClientes = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItemUsuarios = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuAcompanhamento = new javax.swing.JMenu();
        jMenuItemAcompanhar = new javax.swing.JMenuItem();
        jMenuItemRelatorios = new javax.swing.JMenuItem();
        jMenu_Pesquisa = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuSair = new javax.swing.JMenu();
        jMenuItemSair = new javax.swing.JMenuItem();

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("<html><b>USUÁRIO:");

        jLabelUsuario.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jMenuItem1.setText("jMenuItem1");

        jMenuItem6.setText("jMenuItem6");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(null);

        jLabelFundoTelaPrincipal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/TELA PRINCIPAL (1).png"))); // NOI18N
        jLabelFundoTelaPrincipal.setText("jLabel2");
        getContentPane().add(jLabelFundoTelaPrincipal);
        jLabelFundoTelaPrincipal.setBounds(0, 0, 1010, 560);

        jMenuBar1.setForeground(new java.awt.Color(102, 102, 102));

        jMenuCadastro.setText("<html><b>CADASTRO");

        jMenuItem2.setText("ALUNO(A)");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenuCadastro.add(jMenuItem2);

        jMenuItemClientes.setText("ASSISTIDOS");
        jMenuItemClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemClientesActionPerformed(evt);
            }
        });
        jMenuCadastro.add(jMenuItemClientes);

        jMenuItem4.setText("PROFESSOR(A)");
        jMenuCadastro.add(jMenuItem4);

        jMenuItemUsuarios.setText("USUÁRIOS");
        jMenuItemUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemUsuariosActionPerformed(evt);
            }
        });
        jMenuCadastro.add(jMenuItemUsuarios);

        jMenuBar1.add(jMenuCadastro);

        jMenu1.setText("PASTAS");

        jMenuItem5.setText("NOVA PASTA");
        jMenu1.add(jMenuItem5);

        jMenuItem7.setText("CONSULTAR PASTA");
        jMenu1.add(jMenuItem7);

        jMenuBar1.add(jMenu1);

        jMenuAcompanhamento.setText("<html><b>DIÁRIO DE ATENDIMENTO");

        jMenuItemAcompanhar.setText("ACOMPANHAMENTO PROCESSUAL");
        jMenuItemAcompanhar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemAcompanharActionPerformed(evt);
            }
        });
        jMenuAcompanhamento.add(jMenuItemAcompanhar);

        jMenuItemRelatorios.setText("RELATÓRIO DE ACOMPANHAMENTO");
        jMenuItemRelatorios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemRelatoriosActionPerformed(evt);
            }
        });
        jMenuAcompanhamento.add(jMenuItemRelatorios);

        jMenuBar1.add(jMenuAcompanhamento);

        jMenu_Pesquisa.setText("<html> <b> RELATÓRIOS");

        jMenuItem3.setText("RELATÓRIO DO ALUNO");
        jMenu_Pesquisa.add(jMenuItem3);

        jMenuItem9.setText("RELATÓRIO DO ASSISTIDO");
        jMenu_Pesquisa.add(jMenuItem9);

        jMenuItem8.setText("RELATÓRIO DO PROFESSOR");
        jMenu_Pesquisa.add(jMenuItem8);

        jMenuBar1.add(jMenu_Pesquisa);

        jMenuSair.setText("<html><b>SAIR");

        jMenuItemSair.setText("SAIR");
        jMenuItemSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemSairActionPerformed(evt);
            }
        });
        jMenuSair.add(jMenuItemSair);

        jMenuBar1.add(jMenuSair);

        setJMenuBar(jMenuBar1);

        setSize(new java.awt.Dimension(1014, 619));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

     
    //  AÇÃO AO CLICAR NO BOTÃO DE CADASTAR CLIENTES
    private void jMenuItemClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemClientesActionPerformed
      /*  try {
            conecta.executasql("select *from usuarios where nome_usuario='"+jLabelUsuario.getText()+"'");
            conecta.rs.first();
            if(conecta.rs.getString("tipo_usuario").equals("Atendente") || conecta.rs.getString("tipo_usuario").equals("Administrador")){
                telaCliente.setVisible(true);
            }else{
                JOptionPane.showMessageDialog(rootPane, "Você não tem permissão para realizar esta operação!");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, "Você não tem permissão para realizar esta operação!");
        }*/
        telaCliente.setVisible(true);
    }//GEN-LAST:event_jMenuItemClientesActionPerformed

    
    // AÇÃO DO BOTÃO DE CADASTRAR USUÁRIOS
    private void jMenuItemUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemUsuariosActionPerformed
     /*   try {
            conecta.executasql("select *from usuarios where nome_usuario='"+jLabelUsuario.getText()+"'");
            conecta.rs.first();
            if(conecta.rs.getString("tipo_usuario").equals("Administrador")){
                telaUser.setVisible(true);
            }else{
                JOptionPane.showMessageDialog(rootPane, "Você não tem permissão para realizar esta operação!");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, "Você não tem permissão para realizar esta operação!");
        }*/
        telaUser.setVisible(true);
    }//GEN-LAST:event_jMenuItemUsuariosActionPerformed

    
    // AÇÃO DO BOTÃO ACOMPANHAMENTO DO CLIENTE
    private void jMenuItemAcompanharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemAcompanharActionPerformed
     /*   try {
            conecta.executasql("select *from usuarios where nome_usuario='"+jLabelUsuario.getText()+"'");
            conecta.rs.first();
            if(conecta.rs.getString("tipo_usuario").equals("Atendente") || conecta.rs.getString("tipo_usuario").equals("Administrador")){
                telaAcompanhamento.setVisible(true);
            }else{
                JOptionPane.showMessageDialog(rootPane, "Você não tem permissão para realizar esta operação!");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, "Você não tem permissão para realizar esta operação!");
        }*/
        telaAcompanhamento.setVisible(true);
    }//GEN-LAST:event_jMenuItemAcompanharActionPerformed

    
    // AÇÃO DO BOTÃO SAIR
    private void jMenuItemSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItemSairActionPerformed

    
    private void jMenuItemRelatoriosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemRelatoriosActionPerformed
        telaRelatorioAcomp.setVisible(true);
    }//GEN-LAST:event_jMenuItemRelatoriosActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem2ActionPerformed

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
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelFundoTelaPrincipal;
    private javax.swing.JLabel jLabelUsuario;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenuAcompanhamento;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuCadastro;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JMenuItem jMenuItemAcompanhar;
    private javax.swing.JMenuItem jMenuItemClientes;
    private javax.swing.JMenuItem jMenuItemRelatorios;
    private javax.swing.JMenuItem jMenuItemSair;
    private javax.swing.JMenuItem jMenuItemUsuarios;
    private javax.swing.JMenu jMenuSair;
    private javax.swing.JMenu jMenu_Pesquisa;
    // End of variables declaration//GEN-END:variables
}
