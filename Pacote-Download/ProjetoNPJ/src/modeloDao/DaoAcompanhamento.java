package modeloDao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import modelBeans.BeansAcompanhamento;
import modeloConection.ConexaoBD;

/**
 *
 * @author Nilmar
 */
public class DaoAcompanhamento {
    
    BeansAcompanhamento acomp = new BeansAcompanhamento();
    ConexaoBD conex = new ConexaoBD();
    ConexaoBD conexCliente = new ConexaoBD();
    ConexaoBD conexUsuario = new ConexaoBD();
    
    int codCliente;
    int codUsuario;
    
    
    // METÓDO PARA INSERIR AGENDAMENTOS NO BANCO DE DADOS
    public void Salvar(BeansAcompanhamento acomp){
        BuscarUsuario(acomp.getNomeUsuario());
        BuscarCliente(acomp.getCpfCliente()); 
        conex.getConnection();
        try {
            PreparedStatement pst = conex.con.prepareStatement("insert into acompanhamento (acompanhamento_idcliente,acompanhamento_idusuario,acompanhamento_data,acompanhamento_descricao) values (?,?,?,?)");
            pst.setString(1, acomp.getCpfCliente()); 
            pst.setInt(2, codUsuario);
            pst.setDate(3, new java.sql.Date(acomp.getData().getTime()));
            pst.setString(4, acomp.getNarracao());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Acompanhamento atualizado com sucesso ");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao executar agendamento "+ex);
        }
        conex.desconectar();
    }
    
    
    //   METÓDO PARA BUSCAR O USUÁRIO PELO CÓDIGO
    public void BuscarUsuario(String nomeUsuario){
        conexUsuario.getConnection();
        conexUsuario.executasql("select *from usuarios where nome_usuario='"+nomeUsuario+"'");
        try {
            conexUsuario.rs.first();
            codUsuario = conexUsuario.rs.getInt("cod_usuario");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Usuario não cadastrado "+ex);
        }
        conexUsuario.desconectar();
    }
    
    //   METÓDO PARA BUSCAR OS CLIENTES PELO CÓDIGO
    public void BuscarCliente(String cpfCliente){
        conexCliente.getConnection();
        conexCliente.executasql("select *from clientes where cpf_cliente='"+cpfCliente+"'");
        try {
            conexCliente.rs.first();
            codCliente = conexCliente.rs.getInt("id_cliente");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Cliente não cadastrado ");
        }
        conexCliente.desconectar();
    }
    
}
