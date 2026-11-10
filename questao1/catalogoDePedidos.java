package questao1;

import java.util.Map;
import java.util.HashMap;

public class catalogoDePedidos {
    private final Map<String, pedido> modelos = new HashMap<>();

    public void registrar(String chave, pedido modelo){
        modelos.put(chave, modelo);
    }

    public pedido criar(String chave){
        pedido modelo = modelos.get(chave);

        if(modelo == null){
            throw new IllegalArgumentException("Chave não registrada: " + chave);
        }

        return modelo.clonar();
    }
}

