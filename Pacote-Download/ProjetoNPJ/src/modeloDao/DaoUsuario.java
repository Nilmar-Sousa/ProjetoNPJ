package modeloDao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import modelBeans.BeansUsuario;
import modeloConection.ConexaoBD;

public class DaoUsuario {
    ConexaoBD conex = new ConexaoBD();
    BeansUsuario mod = new BeansUsuario();
      
    // METÓDO PARA SALVAR NOVOS USUÁRIOS NO BANCO DE DADOS
    public void salvar(BeansUsuario mod){
        conex.getConnection();
        try {
            PreparedStatement pst = conex.con.prepareStatement("insert into usuarios(nome_usuario,senha_usuario,tipo_usuario) values(?,?,?)");
            pst.setString(1, mod.getUsu_nome()); 
            pst.setString(2, mod.getUsu_senha());
            pst.setString(3, mod.getUsu_tipo());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Usuário inserido com sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir usário "+ex.getMessage());
        }
        conex.desconectar();
    }
    
    // METÓDO PARA EXCLUIR USUÁRIOS DO BANCO DE DADOS
    public void excluir(BeansUsuario mod){
        conex.getConnection();
        try {
            PreparedStatement pst = conex.con.prepareStatement("delete from usuarios where cod_usuario=? ");
            pst.setInt(1, mod.getCodUsu());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Usuário excluido com sucesso ");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir usuário "+ex.getMessage());
        }
        conex.desconectar();
    }
    
    // METÓDO PARA O BANCO DE DADOS EDITAR OS REGISTROS
     public void alterar(BeansUsuario mod){
        conex.getConnection();
        try {
            PreparedStatement pst = conex.con.prepareStatement("update usuarios set nome_usuario=?,senha_usuario=?, tipo_usuario=? where cod_usuario=?");
            pst.setString(1, mod.getUsu_nome());
            pst.setString(2, mod.getUsu_senha());
            pst.setString(3, mod.getUsu_tipo());
            pst.setInt(4, mod.getCodUsu());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Usuário alterado com sucesso ");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro na alteração do usuário "+ex.getMessage());
        }
        conex.desconectar();
    }
    
}
