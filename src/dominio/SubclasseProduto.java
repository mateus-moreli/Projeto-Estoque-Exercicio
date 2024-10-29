package dominio;

import java.time.LocalDate;

public class SubclasseProduto extends BaseParam{
    private int codigoClasse;

    public int getCodigoClasse() {
        return codigoClasse;
    }

    public void setCodigoClasse(int codigoClasse) {
        this.codigoClasse = codigoClasse;
    }

    public SubclasseProduto() {
        super();
    }

    public SubclasseProduto(int codigo, String descricao, LocalDate data, int codigoClasse) {
        super(codigo, descricao, data);
        this.codigoClasse = codigoClasse;
    }
    
}
