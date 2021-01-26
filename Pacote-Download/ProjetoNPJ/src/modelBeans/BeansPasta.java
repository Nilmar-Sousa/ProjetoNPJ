package modelBeans;

import java.util.Date;

/**
 *
 * @author 44314298839
 */
public class BeansPasta {
    private Integer id_Pasta;
    private String titulo_Pasta;
    private Date data_Inicio;
    private Date data_Fim;
    private String status;
    private String nome_Assistido;
    private String telefone_Assistido;
    private String cpf_assistido;
    private String professor_responsavel;
    private String telefone_Professor;
    private String pesquisa;

    public String getPesquisa() {
        return pesquisa;
    }

    public void setPesquisa(String pesquisa) {
        this.pesquisa = pesquisa;
    }

    public Integer getId_Pasta() {
        return id_Pasta;
    }

    public void setId_Pasta(Integer id_Pasta) {
        this.id_Pasta = id_Pasta;
    }

    public String getTitulo_Pasta() {
        return titulo_Pasta;
    }

    public void setTitulo_Pasta(String titulo_Pasta) {
        this.titulo_Pasta = titulo_Pasta;
    }

    public Date getData_Inicio() {
        return data_Inicio;
    }

    public void setData_Inicio(Date data_Inicio) {
        this.data_Inicio = data_Inicio;
    }

    public Date getData_Fim() {
        return data_Fim;
    }

    public void setData_Fim(Date data_Fim) {
        this.data_Fim = data_Fim;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getNome_Assistido() {
        return nome_Assistido;
    }

    public void setNome_Assistido(String nome_Assistido) {
        this.nome_Assistido = nome_Assistido;
    }

    public String getTelefone_Assistido() {
        return telefone_Assistido;
    }

    public void setTelefone_Assistido(String telefone_Assistido) {
        this.telefone_Assistido = telefone_Assistido;
    }

    public String getCpf_assistido() {
        return cpf_assistido;
    }

    public void setCpf_assistido(String cpf_assistido) {
        this.cpf_assistido = cpf_assistido;
    }

    public String getProfessor_responsavel() {
        return professor_responsavel;
    }

    public void setProfessor_responsavel(String professor_responsavel) {
        this.professor_responsavel = professor_responsavel;
    }

    public String getTelefone_Professor() {
        return telefone_Professor;
    }

    public void setTelefone_Professor(String telefone_Professor) {
        this.telefone_Professor = telefone_Professor;
    }
    
    
    
}
