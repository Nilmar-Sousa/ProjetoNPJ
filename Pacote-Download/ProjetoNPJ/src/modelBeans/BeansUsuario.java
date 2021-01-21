package modelBeans;
public class BeansUsuario {
    private Integer codUsu;
    private String usu_nome;
    private String usu_tipo;
    private String usu_senha;

    public Integer getCodUsu() {
        return codUsu;
    }

    public void setCodUsu(Integer codUsu) {
        this.codUsu = codUsu;
    }

    public String getUsu_nome() {
        return usu_nome;
    }

    public void setUsu_nome(String usu_nome) {
        this.usu_nome = usu_nome;
    }

    public String getUsu_senha() {
        return usu_senha;
    }

    public void setUsu_senha(String usu_senha) {
        this.usu_senha = usu_senha;
    }

    public String getUsu_tipo() {
        return usu_tipo;
    }

    public void setUsu_tipo(String usu_tipo) {
        this.usu_tipo = usu_tipo;
    }
}
