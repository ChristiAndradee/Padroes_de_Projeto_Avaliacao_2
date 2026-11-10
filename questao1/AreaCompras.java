package questao1;

public class AreaCompras implements iAreaInteressada {

    private static final int estoqueMinimo = 5;

    @Override
    public void atualizar(String nomeProduto, int quantidadeAnterior, int novaQuantidade) {
        if (novaQuantidade < estoqueMinimo) {
            System.out.println("    [Compras] ALERTA: " + nomeProduto + " abaixo de " + estoqueMinimo
                    + " unidades (agora " + novaQuantidade + "). Providenciar reposicao.");
        }
    }

    @Override
    public String nome() {
        return "Compras";
    }
}
