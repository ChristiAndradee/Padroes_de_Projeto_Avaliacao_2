package questao3;

public class Espresso implements iBebida {

    private static final double preco = 7.75;

    @Override
    public String descricao() {
        return "Espresso";
    }

    @Override
    public double preco() {
        return preco;
    }
}
