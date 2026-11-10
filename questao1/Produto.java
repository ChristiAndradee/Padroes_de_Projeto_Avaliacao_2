package questao1;

import java.util.ArrayList;
import java.util.List;

public class Produto {

    private String nome;
    private int quantidade;

    private List<iAreaInteressada> areasInteressadas = new ArrayList<iAreaInteressada>();

    public Produto(String nome, int quantidadeInicial) {
        if (quantidadeInicial < 0) {
            throw new IllegalArgumentException("Quantidade nao pode ser negativa: " + quantidadeInicial);
        }
        this.nome = nome;
        this.quantidade = quantidadeInicial;
    }

    public void inscrever(iAreaInteressada area) {
        areasInteressadas.add(area);
        System.out.println("  + " + area.nome() + " passou a acompanhar " + nome);
    }

    public void remover(iAreaInteressada area) {
        areasInteressadas.remove(area);
        System.out.println("  - " + area.nome() + " deixou de acompanhar " + nome);
    }

    public void setQuantidade(int novaQuantidade) {
        if (novaQuantidade < 0) {
            throw new IllegalArgumentException("Quantidade nao pode ser negativa: " + novaQuantidade);
        }

        if (novaQuantidade == quantidade) {
            System.out.println("  (" + nome + " continua com " + quantidade + " unidades: ninguem e avisado)");
            return;
        }

        int quantidadeAnterior = quantidade;
        quantidade = novaQuantidade;
        notificarAreas(quantidadeAnterior);
    }

    private void notificarAreas(int quantidadeAnterior) {
        for (iAreaInteressada area : areasInteressadas) {
            area.atualizar(nome, quantidadeAnterior, quantidade);
        }
    }


}
