package questao3;

public abstract class Complemento implements iBebida {

    private iBebida bebida;

    public Complemento(iBebida bebida) {
        this.bebida = bebida;
    }

    protected abstract String nomeComplemento();

    protected abstract double precoComplemento();

    @Override
    public String descricao() {
        return bebida.descricao() + " + " + nomeComplemento();
    }

    @Override
    public double preco() {
        return bebida.preco() + precoComplemento();
    }
}
