package modeloDao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import modelBeans.BeansClientes;
import modeloConection.ConexaoBD;

public class DaoClientes {
    ConexaoBD conex = new ConexaoBD();
    BeansClientes mod = new BeansClientes();
    
    // METÓDO PARA SALVAR NOVOS USUÁRIOS NO BANCO DE DADOS
    public void salvar(BeansClientes mod){
        conex.getConnection();
        try {
            PreparedStatement pst = conex.con.prepareStatement("insert into clientes(nome_cliente,estadocivil_cliente,profissao_cliente,rg_cliente,cpf_cliente,telefone_cliente,email_cliente,nome_responsavel,parentesco_responsavel,estadocivil_responsavel,profissao_responsavel,rendafamiliar_responsavel,rg_responsavel,cpf_responsavel,bairro_responsavel,numerocasa_responsavel,cidade_responsavel,estado_responsavel,telefone_responsavel,celular_responsavel,narracao,endereco_responsavel) values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
            pst.setString(1, mod.getNome_Cliente()); 
            pst.setString(2, mod.getEstadoCivil_Cliente());
            pst.setString(3, mod.getProfissao_Cliente());
            pst.setString(4, mod.getRG_Cliente());
            pst.setString(5, mod.getCPF_Cliente());
            pst.setString(6, mod.getTelefone_Cliente());
            pst.setString(7, mod.getEmail_Cliente());
            pst.setString(8, mod.getNome_Responsavel());
            pst.setString(9, mod.getParentesco_Responsavel());
            pst.setString(10, mod.getEstadoCivil_Responsavel());
            pst.setString(11, mod.getProfisao_Responsavel());
            pst.setString(12, mod.getRenda_Responsavel());
            pst.setString(13, mod.getRG_Responsavel());
            pst.setString(14, mod.getCPF_Responsavel());
            pst.setString(15, mod.getBairro_Responsavel());
            pst.setString(16, mod.getNumeroCasa_Responsavel());
            pst.setString(17, mod.getCidade_Responsavel());
            pst.setString(18, mod.getEstado_Responsavel());
            pst.setString(19, mod.getTelefone_Responsavel());
            pst.setString(20, mod.getCelular_Responsavel());
            pst.setString(21, mod.getNarracaoFatos());
            pst.setString(22, mod.getEndereco_Responsavel());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Cliente cadastrado com sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar cliente "+ex.getMessage());
        }
        conex.desconectar();
    }
    
    // METÓDO PARA EXCLUIR USUÁRIOS DO BANCO DE DADOS
    public void excluir(BeansClientes mod){
        conex.getConnection();
        try {
            PreparedStatement pst = conex.con.prepareStatement("delete from clientes where cpf_cliente=?");
            pst.setString(1, mod.getCPF_Cliente());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Cliente excluido com sucesso ");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir cliente "+ex.getMessage());
        }
        conex.desconectar();
    }
    
    // METÓDO PARA O BANCO DE DADOS EDITAR OS REGISTROS
    public void alterar(BeansClientes mod){
        conex.getConnection();
        try {
            PreparedStatement pst = conex.con.prepareStatement("update clientes set nome_cliente=?,estadocivil_cliente=?, profissao_cliente=?, rg_cliente=?, cpf_cliente=?, telefone_cliente=?, email_cliente=?, nome_responsavel=?, parentesco_responsavel=?, estadocivil_responsavel=?, profissao_responsavel=?,rendafamiliar_responsavel=?, rg_responsavel=?, cpf_responsavel=?, bairro_responsavel=?, numerocasa_responsavel=?, cidade_responsavel=?, estado_responsavel=?, telefone_responsavel=?, celular_responsavel=?, narracao=?, endereco_responsavel=? where id_cliente=?");
            pst.setString(1, mod.getNome_Cliente()); 
            pst.setString(2, mod.getEstadoCivil_Cliente());
            pst.setString(3, mod.getProfissao_Cliente());
            pst.setString(4, mod.getRG_Cliente());
            pst.setString(5, mod.getCPF_Cliente());
            pst.setString(6, mod.getTelefone_Cliente());
            pst.setString(7, mod.getEmail_Cliente());
            pst.setString(8, mod.getNome_Responsavel());
            pst.setString(9, mod.getParentesco_Responsavel());
            pst.setString(10, mod.getEstadoCivil_Responsavel());
            pst.setString(11, mod.getProfisao_Responsavel());
            pst.setString(12, mod.getRenda_Responsavel());
            pst.setString(13, mod.getRG_Responsavel());
            pst.setString(14, mod.getCPF_Responsavel());
            pst.setString(15, mod.getBairro_Responsavel());
            pst.setString(16, mod.getNumeroCasa_Responsavel());
            pst.setString(17, mod.getCidade_Responsavel());
            pst.setString(18, mod.getEstado_Responsavel());
            pst.setString(19, mod.getTelefone_Responsavel());
            pst.setString(20, mod.getCelular_Responsavel());
            pst.setString(21, mod.getNarracaoFatos());
            pst.setString(22, mod.getEndereco_Responsavel());
            pst.setInt(23, mod.getId_Cliente());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Usuário alterado com sucesso ");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro na alteração do usuário "+ex.getMessage());
        }
        conex.desconectar();
    }
    
        // METÓDO PARA BUSCAR DADOS NO BANCO DE DADOS
        public BeansClientes busca_clientes(BeansClientes mod){
            conex.getConnection();
            conex.executasql("select *from clientes where cpf_cliente like'%"+mod.getPesquisa()+"%'");
        try {
            conex.rs.first();
            mod.setId_Cliente(conex.rs.getInt("id_cliente"));
            mod.setNome_Cliente(conex.rs.getString("nome_cliente"));
            mod.setEstadoCivil_Cliente(conex.rs.getString("estadocivil_cliente"));
            mod.setProfissao_Cliente(conex.rs.getString("profissao_cliente"));
            mod.setRG_Cliente(conex.rs.getString("rg_cliente"));
            mod.setCPF_Cliente(conex.rs.getString("cpf_cliente"));
            mod.setTelefone_Cliente(conex.rs.getString("telefone_cliente"));
            mod.setEmail_Cliente(conex.rs.getString("email_cliente"));
            mod.setNome_Responsavel(conex.rs.getString("nome_responsavel"));
            mod.setParentesco_Responsavel(conex.rs.getString("parentesco_responsavel"));
            mod.setEstadoCivil_Responsavel(conex.rs.getString("estadocivil_responsavel"));
            mod.setProfisao_Responsavel(conex.rs.getString("profissao_responsavel"));
            mod.setRenda_Responsavel(conex.rs.getString("rendafamiliar_responsavel"));
            mod.setRG_Responsavel(conex.rs.getString("rg_responsavel"));
            mod.setCPF_Responsavel(conex.rs.getString("cpf_responsavel"));
            mod.setEndereco_Responsavel(conex.rs.getString("endereco_responsavel"));
            mod.setBairro_Responsavel(conex.rs.getString("bairro_responsavel"));
            mod.setNumeroCasa_Responsavel(conex.rs.getString("numerocasa_responsavel"));
            mod.setCidade_Responsavel(conex.rs.getString("cidade_responsavel"));
            mod.setEstado_Responsavel(conex.rs.getString("estado_responsavel"));
            mod.setTelefone_Responsavel(conex.rs.getString("telefone_responsavel"));
            mod.setCelular_Responsavel(conex.rs.getString("celular_responsavel"));
            mod.setNarracaoFatos(conex.rs.getString("narracao"));
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Cliente não cadastrado ");
        }    
            conex.desconectar();
            return mod;
        }
    
}
