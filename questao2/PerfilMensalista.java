package questao2;

public class PerfilMensalista implements iPerfilCobranca {

    private static final double precoFixo = 180.00;

    @Override
    public String nome() {
        return "Mensalista";
    }

    @Override
    public double calcular(int minutosPermanencia) {
        return precoFixo;
    }
}
