package questao3;

public class Leite extends Complemento {

    private static final double preco = 2.40;

    public Leite(iBebida bebida) {
        super(bebida);
    }

    @Override
    protected String nomeComplemento() {
        return "Leite";
    }

    @Override
    protected double precoComplemento() {
        return preco;
    }
}
