package questao3;

public class Chantilly extends Complemento {

    private static final double preco = 4.50;

    public Chantilly(iBebida bebida) {
        super(bebida);
    }

    @Override
    protected String nomeComplemento() {
        return "Chantilly";
    }

    @Override
    protected double precoComplemento() {
        return preco;
    }
}
