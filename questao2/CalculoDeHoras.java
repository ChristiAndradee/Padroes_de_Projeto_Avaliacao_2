package questao2;

public class CalculoDeHoras {

    private static final int minutosHora = 60;

    public static int horasIniciadas(int minutos) {
        return (minutos + minutosHora - 1) / minutosHora;
    }
}
