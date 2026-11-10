package questao1;

import java.util.ArrayList;
import java.util.List;

public class AreaAluguel implements iAreaInteressada {

    private List<String> registros = new ArrayList<String>();

    @Override
    public void atualizar(String nomeProduto, int quantidadeAnterior, int novaQuantidade) {
        String registro = nomeProduto + ": " + quantidadeAnterior + " -> " + novaQuantidade;
        registros.add(registro);
        System.out.println("    [Aluguel] registrado: " + registro);
    }

    @Override
    public String nome() {
        return "Aluguel";
    }

    public void imprimirHistorico() {
        System.out.println("Historico da Auditoria (" + registros.size() + " alteracoes):");
        for (int i = 0; i < registros.size(); i++) {
            System.out.println("  " + (i + 1) + ". " + registros.get(i));
        }
    }
}
