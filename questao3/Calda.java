package questao3;

public class Calda extends Complemento {

    private static final double preco = 2.50;

    public Calda(iBebida bebida) {
        super(bebida);
    }

    @Override
    protected String nomeComplemento() {
        return "Calda";
    }

    @Override
    protected double precoComplemento() {
        return preco;
    }
}
