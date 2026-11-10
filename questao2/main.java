package questao2;

public class main {

    public static void main(String[] args) {

        int tempoPermanencia = 150;

        System.out.println("Mesmo tempo de permanencia (" + tempoPermanencia + " min) nos tres perfis:");

        Ticket rotativo = new Ticket("ENC7Q61", tempoPermanencia, new PerfilRotativo());
        Ticket mensalista = new Ticket("RYA4N62", tempoPermanencia, new PerfilMensalista());
        Ticket conveniado = new Ticket("KEL1V97", tempoPermanencia, new PerfilConveniado());

        System.out.println("  " + rotativo.resumo());
        System.out.println("  " + mensalista.resumo());
        System.out.println("  " + conveniado.resumo());

        System.out.println("\nTrocando o perfil do mesmo ticket:");

        Ticket ticket = new Ticket("RYA4N62", 25, new PerfilRotativo());
        System.out.println("  " + ticket.resumo());

        ticket.setPerfil(new PerfilMensalista());
        System.out.println("  " + ticket.resumo());

        ticket.setPerfil(new PerfilConveniado());
        System.out.println("  " + ticket.resumo());
    }
}
