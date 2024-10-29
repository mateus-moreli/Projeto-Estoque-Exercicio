package dominio;

import java.time.LocalDate;

public abstract class BaseParam {
    protected int codigo;
    protected String descricao;
    protected LocalDate dataDeInclusao;
    
    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public LocalDate getDataDeInclusao() {
        return dataDeInclusao;
    }
    public void setDataDeInclusao(LocalDate data) {
        this.dataDeInclusao = data;
    }

    public BaseParam() {
    }
    public BaseParam(int codigo, String descricao, LocalDate data) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.dataDeInclusao = data;
    }
    
}
