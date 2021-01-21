package modeloConection;

// CLASSE PARA CONEXÃO DO SISTEMA COM O BANCO DE DADOS
import java.sql.*;      
import javax.swing.JOptionPane;

public class ConexaoBD {
    
   public Statement stm;
   public ResultSet rs;
   private static String driver = "org.postgresql.Driver"; // PADRÃO POSTGREE
   private static String caminho = "jdbc:postgresql://127.0.0.1/ProjetoNPJ"; // DEFINIR CAMINHO DO BANCO DE DADOS 
   private static final String usuario = "postgres"; // USUARIO PADRÃO DO BANCO DE DADOS
   private static final String senha = "Vai5a3eR";   // SENHA DO BANCO DE DADOS
   public static Connection con;
   
    // METÓDO PARA CONECTAR AO BANCO DE DADOS
    public static Connection getConnection(){  
        try {
           System.setProperty("jdbc.Drivers", driver); // SETAR OS DRIVERS DE CONEXÃO
           con = DriverManager.getConnection(caminho, usuario, senha);
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "Erro ao conectar "+ ex.getMessage());
        }
        return con;
    }
    
    // METÓDO PARA EXECUTAR STRINGS EM SQL 
    public void executasql(String sql){  
        try {
            stm = con.createStatement(rs.TYPE_SCROLL_INSENSITIVE, rs.CONCUR_READ_ONLY);
            rs = stm.executeQuery(sql);
        } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Erro ao executar sql "+ ex.getMessage());}
    }
    
    // METÓDO PARA DESCONECTAR COM O BANCO DE DADOS
    public void desconectar(){  
        try {
           con.close();
        } catch (SQLException ex) {  
           JOptionPane.showMessageDialog(null, "Erro ao desconectar o banco de dados " + ex.getMessage());
        }
    }
   
}
