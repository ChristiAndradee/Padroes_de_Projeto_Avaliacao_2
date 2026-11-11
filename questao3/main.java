package questao3;

public class main {

    public static void main(String[] args) {

        iBebida pedido1 = new Espresso();
        pedido1 = new Leite(pedido1);
        imprimirPedido(1, pedido1);

        iBebida pedido2 = new Cha();
        pedido2 = new Calda(pedido2);
        pedido2 = new Chantilly(pedido2);
        imprimirPedido(2, pedido2);

        iBebida pedido3 = new Espresso();
        pedido3 = new Chantilly(pedido3);
        pedido3 = new Chantilly(pedido3);
        pedido3 = new Leite(pedido3);
        imprimirPedido(3, pedido3);

        imprimirPedido(4, new Cha());
    }

    private static void imprimirPedido(int numero, iBebida pedido) {
        System.out.println("Pedido " + numero + ": " + pedido.descricao()
                + " | total R$ " + String.format("%,.2f", pedido.preco()));
    }
}
