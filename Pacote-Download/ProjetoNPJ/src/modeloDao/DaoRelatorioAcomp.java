package modeloDao;

import javax.swing.JOptionPane;
import modelBeans.BeansRelatorioAcomp;
import modeloConection.ConexaoBD;

/**
 *
 * @author Nilmar
 */
public class DaoRelatorioAcomp {
    
    BeansRelatorioAcomp acomp = new BeansRelatorioAcomp();
    ConexaoBD conex = new ConexaoBD();

    // METÓDO PARA BUSCAR O RELATÓRIO DE ACOMPANHAMENTO MAIS RECENTE
    public BeansRelatorioAcomp buscar_acomp(BeansRelatorioAcomp mod){
        conex.getConnection();
        conex.executasql("select distinct acompanhamento_data,acompanhamento_descricao,cod_acompanhamento from acompanhamento where acompanhamento_idcliente like '%"+mod.getPesquisa()+"%'");
        try{
            conex.rs.last();
            mod.setAcompanhamentoCod(conex.rs.getInt("cod_acompanhamento"));
            mod.setData(conex.rs.getDate("acompanhamento_data"));
            mod.setNarracao(conex.rs.getString("acompanhamento_descricao"));
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Cliente não cadastrado "+ex);              
        }
        conex.desconectar();
        return mod;
    }
    
}
