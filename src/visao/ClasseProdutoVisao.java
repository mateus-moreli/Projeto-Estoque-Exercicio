package visao;

import java.time.LocalDate;

import dominio.ClasseProduto;

public class ClasseProdutoVisao {
    public void Exibir(){
        ClasseProduto cp1 = new ClasseProduto();
        cp1.setCodigo(1);
        cp1.setDescricao("Carnes");
        cp1.setDataDeInclusao(LocalDate.now());
        
        System.out.println("Classe de Produto: ");
        System.out.println("Código: " + cp1.getCodigo());
        System.out.println("Descrição: " + cp1.getDescricao());
        System.out.println("Data de Inclusão: " + cp1.getDataDeInclusao());
    }
}
