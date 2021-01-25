package modeloDao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import modelBeans.BeansAlunos;
import modeloConection.ConexaoBD;

/**
 *
 * @author 44314298839
 */
public class DAOAluno {
    ConexaoBD conex = new ConexaoBD();
    BeansAlunos mod = new BeansAlunos();
    ConexaoBD conexCliente = new ConexaoBD();
    ConexaoBD conexProfessor = new ConexaoBD();
    
    int codCliente;
    int codUsuario;
    
    // METÓDO PARA SALVAR NOVOS PROFESSORES NO BANCO DE DADOS
    public void salvar(BeansAlunos mod){
        conex.getConnection();
        try {
            PreparedStatement pst = conex.con.prepareStatement("insert into alunos(nome_aluno,cpf_aluno,telefone_aluno,endereco_aluno,bairro_aluno,estado_aluno,cidade_aluno,numerocasa_aluno,professorvinculado_aluno) values (?,?,?,?,?,?,?,?,?)");
            pst.setString(1, mod.getNome_aluno()); 
            pst.setString(2, mod.getCpf_Aluno());
            pst.setString(3, mod.getTelefone_Aluno());
            pst.setString(4, mod.getEndereco_Aluno());
            pst.setString(5, mod.getBairro_Aluno());
            pst.setString(6, mod.getEstado_Aluno());
            pst.setString(7, mod.getCidade_Aluno());
            pst.setString(8, mod.getNumerocasa_Aluno());
            pst.setString(9, mod.getNomeProfessor());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Aluno cadastrado com sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar aluno "+ex.getMessage());
        }
        conex.desconectar();
    }
    
    // METÓDO PARA EXCLUIR ALUNOS DO BANCO DE DADOS
    public void excluir(BeansAlunos mod){
        conex.getConnection();
        try {
            PreparedStatement pst = conex.con.prepareStatement("delete from alunos where cpf_aluno=?");
            pst.setString(1, mod.getCpf_Aluno());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Aluno excluido com sucesso ");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir aluno "+ex.getMessage());
        }
        conex.desconectar();
    }
    
    //METÓDO PARA BUSCAR O USUÁRIO PELO CÓDIGO
    public void BuscarProfessores(String nomeUsuario){
        conexProfessor.getConnection();
        conexProfessor.executasql("select *from professores where nome_professor='"+nomeUsuario+"'");
        try {
            conexProfessor.rs.first();
            codUsuario = conexProfessor.rs.getInt("id_professor");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Professor não cadastrado "+ex);
        }
        conexProfessor.desconectar();
    }
}
