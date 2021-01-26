package modeloDao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import modelBeans.BeansPasta;
import modeloConection.ConexaoBD;

/**
 *
 * @author 44314298839
 */
public class DAOPasta {

    ConexaoBD conex = new ConexaoBD();
    BeansPasta mod = new BeansPasta();

    // METÓDO PARA SALVAR NOVOS USUÁRIOS NO BANCO DE DADOS
    public void salvar(BeansPasta mod) {
        conex.getConnection();
        try {
            PreparedStatement pst = conex.con.prepareStatement("insert into pastas(cpf_assistido, titulo_pasta, data_inicio, data_fim, status) values (?,?,?,?,?)");
            pst.setString(1, mod.getCpf_assistido());
            pst.setString(2, mod.getTitulo_Pasta());
            pst.setDate(3, new java.sql.Date(mod.getData_Inicio().getTime()));
            pst.setDate(4, new java.sql.Date(mod.getData_Fim().getTime()));
            pst.setString(5, mod.getStatus());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Pasta cadastrado com sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar Pasta " + ex.getMessage());
        }
        conex.desconectar();
    }

    // METÓDO PARA EXCLUIR PROFESSORES DO BANCO DE DADOS
    public void excluir(BeansPasta mod) {
        conex.getConnection();
        try {
            PreparedStatement pst = conex.con.prepareStatement("delete from pastas where cpf_assistido=?");
            pst.setString(1, mod.getCpf_assistido());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Pasta excluido com sucesso ");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir pasta " + ex.getMessage());
        }
        conex.desconectar();
    }
    
    // METÓDO PARA BUSCAR DADOS NO BANCO DE DADOS
    public BeansPasta busca_pasta(BeansPasta mod) {
        conex.getConnection();
        conex.executasql("select *from pastas where cpf_assistido like'%" + mod.getCpf_assistido() + "%'");
        try {
            conex.rs.first();
            mod.setId_Pasta(conex.rs.getInt("id_pasta"));
            mod.setTitulo_Pasta(conex.rs.getString("titulo_pasta"));
            mod.setData_Inicio(conex.rs.getDate("data_inicio"));
            mod.setData_Fim(conex.rs.getDate("data_fim"));
            mod.setStatus(conex.rs.getString("status"));
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Assistido não cadastrado ");
        }
        conex.desconectar();
        return mod;
    }
}
