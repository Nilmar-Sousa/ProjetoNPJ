/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modeloDao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import modelBeans.BeansProfessores;
import modeloConection.ConexaoBD;

/**
 *
 * @author 44314298839
 */
public class DAOProfessor {

    ConexaoBD conex = new ConexaoBD();
    BeansProfessores mod = new BeansProfessores();

    // METÓDO PARA SALVAR NOVOS PROFESSORES NO BANCO DE DADOS
    public void salvar(BeansProfessores mod) {
        conex.getConnection();
        try {
            PreparedStatement pst = conex.con.prepareStatement("insert into professores(nome_professor,cpf_professor,telefone_professor,endereco_professor,bairro_professor,estado_professor,cidade_professor,numerocasa_professor) values (?,?,?,?,?,?,?,?)");
            pst.setString(1, mod.getNome_Professor());
            pst.setString(2, mod.getCpf_Professor());
            pst.setString(3, mod.getTelefone_Professor());
            pst.setString(4, mod.getEndereco_Professor());
            pst.setString(5, mod.getBairro_Professor());
            pst.setString(6, mod.getEstado_Professor());
            pst.setString(7, mod.getCidade_Professor());
            pst.setString(8, mod.getNumerocasa_Professor());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Professor cadastrado com sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar Professor " + ex.getMessage());
        }
        conex.desconectar();
    }

    // METÓDO PARA EXCLUIR PROFESSORES DO BANCO DE DADOS
    public void excluir(BeansProfessores mod) {
        conex.getConnection();
        try {
            PreparedStatement pst = conex.con.prepareStatement("delete from professores where cpf_professor=?");
            pst.setString(1, mod.getCpf_Professor());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Professor excluido com sucesso ");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir professor " + ex.getMessage());
        }
        conex.desconectar();
    }

    // METÓDO PARA O BANCO DE DADOS EDITAR OS REGISTROS
    public void alterar(BeansProfessores mod) {
        conex.getConnection();
        try {
            PreparedStatement pst = conex.con.prepareStatement("update professores set nome_professor=?, telefone_professor=?, endereco_professor=?, bairro_professor=?, estado=professor=?, cidade_professor=?, numerocasa_professor=? where cpf_professor=?");
            pst.setString(1, mod.getNome_Professor());
            pst.setString(2, mod.getTelefone_Professor());
            pst.setString(3, mod.getEndereco_Professor());
            pst.setString(4, mod.getBairro_Professor());
            pst.setString(5, mod.getEstado_Professor());
            pst.setString(6, mod.getCidade_Professor());
            pst.setString(7, mod.getNumerocasa_Professor());
            pst.setString(8, mod.getCpf_Professor());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Dados do professor alterado com sucesso ");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro na alteração dos dados do professor " + ex.getMessage());
        }
        conex.desconectar();
    }

    // METÓDO PARA BUSCAR DADOS NO BANCO DE DADOS
    public BeansProfessores busca_professores(BeansProfessores mod) {
        conex.getConnection();
        conex.executasql("select *from professores where cpf_professor like'%" + mod.getPesquisa_Professor() + "%'");
        try {
            conex.rs.first();
            mod.setId_Professor(conex.rs.getInt("id_professor"));
            mod.setNome_Professor(conex.rs.getString("nome_professor"));
            mod.setCpf_Professor(conex.rs.getString("cpf_professor"));
            mod.setTelefone_Professor(conex.rs.getString("telefone_professor"));
            mod.setEndereco_Professor(conex.rs.getString("endereco_professor"));
            mod.setBairro_Professor(conex.rs.getString("bairro_professor"));
            mod.setEstado_Professor(conex.rs.getString("estado_professor"));
            mod.setCidade_Professor(conex.rs.getString("cidade_professor"));
            mod.setNumerocasa_Professor(conex.rs.getString("numerocasa_professor"));

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Professor não cadastrado ");
        }
        conex.desconectar();
        return mod;
    }
}
