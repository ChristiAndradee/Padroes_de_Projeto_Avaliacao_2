package questao2;

public class PerfilConveniado implements iPerfilCobranca {

    private static final int minutosGratis = 30;
    private static final double valorHora = 5.00;
    private static final double descontoPercentual = 0.20;

    @Override
    public double calcular(int minutosPermanencia) {
        int minutosCobrados = minutosPermanencia - minutosGratis;

        if (minutosCobrados <= 0) {
            return 0.0;
        }

        double valorSemDesconto = CalculoDeHoras.horasIniciadas(minutosCobrados) * valorHora;
        return valorSemDesconto * (1 - descontoPercentual);
    }

    @Override
    public String nome() {
        return "Conveniado";
    }
}
