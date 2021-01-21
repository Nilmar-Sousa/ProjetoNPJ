package modelBeans;

import java.util.Date;

/**
 *
 * @author Nilmar
 */
public class BeansRelatorioAcomp {
    private int acompanhamentoCod;
    private int id_cliente;
    private Date data;
    private String narracao;
    private String pesquisa;

    public int getAcompanhamentoCod() {
        return acompanhamentoCod;
    }

    public void setAcompanhamentoCod(int acompanhamentoCod) {
        this.acompanhamentoCod = acompanhamentoCod;
    }

    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
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
    
}
