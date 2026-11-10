package questao2;

public class PerfilRotativo implements iPerfilCobranca {

    private static final double valorHora = 6.50;

    @Override
    public String nome() {
        return "Rotativo";
    }

    @Override
    public double calcular(int minutosPermanencia) {
        return CalculoDeHoras.horasIniciadas(minutosPermanencia) * valorHora;
    }
}
