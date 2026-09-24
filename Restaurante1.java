package restaurante1;

public class Restaurante1 {

    public static void main(String[] args) {

        itemconsumacao item1 = new itemconsumacao();

        item1.setNome("Coca-Cola");
        item1.setPreco(6.00);
        item1.setQuant(2);

        itemconsumacao item2 = new itemconsumacao();

        item2.setNome("Hamburguer");
        item2.setPreco(15.00);
        item2.setQuant(1);

        Comanda comanda = new Comanda(1, 10);

        comanda.AddItem(item1);
        comanda.AddItem(item2);

        Pedido pedido = new Pedido(1);

        pedido.adicionarComanda(comanda);

        System.out.println("Total da comanda: " + comanda.CalcularTotal());
        System.out.println("Total do pedido: " + pedido.CalcularTotalPedido());
    }
}
