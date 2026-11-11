package questao3;

public class Cha implements iBebida {

    private static final double preco = 5.00;

    @Override
    public String descricao() {
        return "Cha";
    }

    @Override
    public double preco() {
        return preco;
    }
}
