/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import modelBeans.BeansAcompanhamento;
import modelBeans.ModeloTabela;
import modeloConection.ConexaoBD;
import modeloDao.DaoAcompanhamento;

/**
 *
 * @author Nilmar
 */
public class Acompanhamento extends javax.swing.JFrame {

    ConexaoBD conex = new ConexaoBD();
    BeansAcompanhamento acomp = new BeansAcompanhamento();
    
    public Acompanhamento() {
        initComponents();
        this.setIconImage(new javax.swing.ImageIcon(getClass().getResource("/imagens/icone_justica.png")).getImage());
        preencherUsuario();
    }
    
    // METÓDO PARA BUSCAR O USUÁRIO NO BANCO DE DADOS
    public void preencherUsuario(){
        conex.getConnection();
        conex.executasql("select *from usuarios order by nome_usuario"); 
        try {
            conex.rs.first();
            jComboBoxUsuarios.removeAllItems();
            do{
                jComboBoxUsuarios.addItem(conex.rs.getString("nome_usuario"));
            }while(conex.rs.next());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, "Erro ao preencher o usuário "+ex);
        }
        conex.desconectar();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabelCliente = new javax.swing.JLabel();
        jLabelUsuario = new javax.swing.JLabel();
        jLabelData = new javax.swing.JLabel();
        jButtonBuscar = new javax.swing.JButton();
        jComboBoxUsuarios = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableClientes = new javax.swing.JTable();
        jButtonFInalizar = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jLabelDescricao = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextAreaDescricao = new javax.swing.JTextArea();
        jFormattedCPF = new javax.swing.JFormattedTextField();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabelCliente.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabelCliente.setText("Cliente:");

        jLabelUsuario.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabelUsuario.setText("Usuário:");

        jLabelData.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabelData.setText("Data:");

        jButtonBuscar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButtonBuscar.setText("Buscar");
        jButtonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarActionPerformed(evt);
            }
        });

        jComboBoxUsuarios.setEnabled(false);

        jTableClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTableClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableClientesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableClientes);

        jButtonFInalizar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButtonFInalizar.setText("Atualizar");
        jButtonFInalizar.setEnabled(false);
        jButtonFInalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFInalizarActionPerformed(evt);
            }
        });

        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.setEnabled(false);
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });

        jLabelDescricao.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelDescricao.setText("Descrição:");

        jTextAreaDescricao.setColumns(20);
        jTextAreaDescricao.setRows(5);
        jTextAreaDescricao.setEnabled(false);
        jScrollPane2.setViewportView(jTextAreaDescricao);

        try {
            jFormattedCPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedCPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormattedCPFActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabelData, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabelCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jFormattedCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButtonBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(53, 53, 53)
                                        .addComponent(jLabelUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jComboBoxUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jDateChooser1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabelDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(jButtonFInalizar, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 787, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonBuscar)
                    .addComponent(jComboBoxUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jFormattedCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelData, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonFInalizar)
                    .addComponent(jButtonCancelar))
                .addGap(15, 15, 15))
        );

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setText("ACOMPANHAMENTO DO PROCESSO");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(359, 359, 359)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(970, 584));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

     
    //   AÇÃO DO BOTÃO BUSCAR  
    private void jButtonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarActionPerformed
        preencheTabela("select id_cliente,nome_cliente,cpf_cliente from clientes where cpf_cliente like'%"+jFormattedCPF.getText()+"%'");
        jTableClientes.setVisible(true);
    }//GEN-LAST:event_jButtonBuscarActionPerformed

    
    //   EVENTO AO CLICAR DUAS VEZES NA TABELA
    private void jTableClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableClientesMouseClicked
        String cpf_cliente =""+jTableClientes.getValueAt(jTableClientes.getSelectedRow(), 1); 
        conex.getConnection();
        conex.executasql("select *from clientes where cpf_cliente='"+cpf_cliente+"'");
        try {
            conex.rs.first();
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Erro ao selecionar "+ex);
        }
        conex.desconectar();
        jComboBoxUsuarios.setEnabled(true);
        jDateChooser1.setEnabled(true);
        jTextAreaDescricao.setEnabled(true);
        jButtonFInalizar.setEnabled(true);
        jButtonCancelar.setEnabled(true);
        jTextAreaDescricao.setLineWrap(true);
    }//GEN-LAST:event_jTableClientesMouseClicked

    
    //    AÇÃO DO BOTÃO ATUALIZAR
    private void jButtonFInalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFInalizarActionPerformed
        acomp.setCpfCliente(jFormattedCPF.getText());
        acomp.setNomeUsuario((String) jComboBoxUsuarios.getSelectedItem());
        acomp.setData(jDateChooser1.getDate());
        acomp.setNarracao(jTextAreaDescricao.getText());
        DaoAcompanhamento dao = new DaoAcompanhamento();
        dao.Salvar(acomp);
        
        jDateChooser1.setEnabled(false);
        jTextAreaDescricao.setEnabled(false);
        jTextAreaDescricao.setText("");
        jFormattedCPF.setText("");
        jDateChooser1.setDate(null);
        jTextAreaDescricao.setText("");
        jButtonFInalizar.setEnabled(false);
        jButtonCancelar.setEnabled(false);
        jComboBoxUsuarios.setEnabled(false);
        jTableClientes.setVisible(false);
        dispose();
    }//GEN-LAST:event_jButtonFInalizarActionPerformed

    
    // AÇÃO DO BOTÃO CANCELAR
    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        jTextAreaDescricao.setEnabled(false);
        jDateChooser1.setEnabled(false);
        jButtonFInalizar.setEnabled(false);
        jButtonCancelar.setEnabled(false);
        
        jTextAreaDescricao.setText("");
        jDateChooser1.setDate(null);
        jFormattedCPF.setText("");
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jFormattedCPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormattedCPFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFormattedCPFActionPerformed

    //  METÓDO PARA PREENCHER A TABELA CLIENTES
    public void preencheTabela(String sql){
        ArrayList dados = new ArrayList();
        String [] colunas = new String []{"Nº da Pasta","Nome","CPF"};
        conex.getConnection();
        conex.executasql(sql);
        try{
            conex.rs.first();
            do{
            dados.add(new Object[]{conex.rs.getInt("id_cliente"),conex.rs.getString("nome_cliente"),conex.rs.getString("cpf_cliente")});
            }while(conex.rs.next());
        }catch(SQLException ex){
        JOptionPane.showMessageDialog(rootPane, "Busque por outro cliente para preencher a tabela");
    }
        ModeloTabela modelo = new ModeloTabela(dados, colunas);
        jTableClientes.setModel(modelo);
        jTableClientes.getColumnModel().getColumn(0).setPreferredWidth(92);
        jTableClientes.getColumnModel().getColumn(0).setResizable(false);
        jTableClientes.getColumnModel().getColumn(1).setPreferredWidth(440);
        jTableClientes.getColumnModel().getColumn(1).setResizable(false);
        jTableClientes.getColumnModel().getColumn(2).setPreferredWidth(250);
        jTableClientes.getColumnModel().getColumn(2).setResizable(false);
        jTableClientes.getTableHeader().setReorderingAllowed(false);
        jTableClientes.setAutoResizeMode(jTableClientes.AUTO_RESIZE_OFF);
        jTableClientes.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        conex.desconectar();
    }
   
    
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
            java.util.logging.Logger.getLogger(Acompanhamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Acompanhamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Acompanhamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Acompanhamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Acompanhamento().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBuscar;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonFInalizar;
    private javax.swing.JComboBox<String> jComboBoxUsuarios;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JFormattedTextField jFormattedCPF;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelCliente;
    private javax.swing.JLabel jLabelData;
    private javax.swing.JLabel jLabelDescricao;
    private javax.swing.JLabel jLabelUsuario;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableClientes;
    private javax.swing.JTextArea jTextAreaDescricao;
    // End of variables declaration//GEN-END:variables
}
