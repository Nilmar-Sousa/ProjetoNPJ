package modelBeans;

import java.util.Date;

/**
 *
 * @author Nilmar
 */
public class BeansAcompanhamento {
    
    private int acompanhamentoCod;
    private String cpfCliente;
    private String nomeUsuario;
    private Date data;
    private String narracao;
    private String pesquisa;

    public int getAcompanhamentoCod() {
        return acompanhamentoCod;
    }

    public void setAcompanhamentoCod(int acompanhamentoCod) {
        this.acompanhamentoCod = acompanhamentoCod;
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getNarracao() {
        return narracao;
    }

    public void setNarracao(String narracao) {
        this.narracao = narracao;
    }

    public String getPesquisa() {
        return pesquisa;
    }

    public void setPesquisa(String pesquisa) {
        this.pesquisa = pesquisa;
    }

    public String getCpfCliente() {
        return cpfCliente;
    }

    public void setCpfCliente(String cpfCliente) {
        this.cpfCliente = cpfCliente;
    }
    
}
