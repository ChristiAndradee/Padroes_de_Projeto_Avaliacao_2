package questao1;

public class AreaVendas implements iAreaInteressada {

    @Override
    public void atualizar(String nomeProduto, int quantidadeAnterior, int novaQuantidade) {
        if (quantidadeAnterior == 0 && novaQuantidade > 0) {
            System.out.println("    [Vendas] ALERTA: " + nomeProduto + " voltou ao estoque ("
                    + novaQuantidade + " unidades). disponivel para venda.");
        }
    }

    @Override
    public String nome() {
        return "Vendas";
    }
}
