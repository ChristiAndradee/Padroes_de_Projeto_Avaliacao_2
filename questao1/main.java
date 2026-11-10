package questao1;

public class main {

    public static void main(String[] args) {

        AreaCompras compras = new AreaCompras();
        AreaVendas vendas = new AreaVendas();
        AreaAluguel auditoria = new AreaAluguel();

        Produto gravel = new Produto("Bike_Gravel", 10);
        Produto mtb = new Produto("Mountain_Bike", 20);

        System.out.println("Inscrevendo areas:");
        gravel.inscrever(compras);
        gravel.inscrever(vendas);
        gravel.inscrever(auditoria);
        mtb.inscrever(auditoria);

        System.out.println("\nBike_Gravel: 10 -> 8");
        gravel.setQuantidade(8);

        System.out.println("\nBike_Gravel: 8 -> 3");
        gravel.setQuantidade(3);

        System.out.println("\nBike_Gravel: 3 -> 3");
        gravel.setQuantidade(3);

        System.out.println("\nBike_Gravel: 3 -> 0");
        gravel.setQuantidade(0);

        System.out.println("\nBike_Gravel: 0 -> 12");
        gravel.setQuantidade(12);

        System.out.println("\nMountain_Bike: 20 -> 2");
        mtb.setQuantidade(2);

        System.out.println("\nRemovendo Compras do gravel:");
        gravel.remover(compras);

        System.out.println("\nBike_Gravel: 12 -> 1");
        gravel.setQuantidade(1);

        System.out.println();
        auditoria.imprimirHistorico();
    }
}
