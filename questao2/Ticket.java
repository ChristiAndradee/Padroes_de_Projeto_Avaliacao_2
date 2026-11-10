package questao2;

public class Ticket {

    private String placa;
    private int minutosPermanencia;
    private iPerfilCobranca perfil;

    public Ticket(String placa, int minutosPermanencia, iPerfilCobranca perfil) {
        if (minutosPermanencia < 0) {
            throw new IllegalArgumentException("Nao ha permanencia negativa: " + minutosPermanencia);
        }
        this.placa = placa;
        this.minutosPermanencia = minutosPermanencia;
        this.perfil = perfil;
    }

    public void setPerfil(iPerfilCobranca perfil) {
        this.perfil = perfil;
    }

    public double calcularValor() {
        return perfil.calcular(minutosPermanencia);
    }

    public String resumo() {
        return "Ticket " + placa + " | " + minutosPermanencia + " min | perfil " + perfil.nome()
             + " | valor R$ " + String.format("%,.2f", calcularValor());
    }
}
