package restaurante1;

public class Pedido {

    private int id;
    private Comanda[] comanda;

    public Pedido(int id) {
        this.id = id;
        this.comanda = new Comanda[10];
    }

    public int getId() {
        return id;
    }

    public void adicionarComanda(Comanda comanda) {

        for (int i = 0; i < 10; i++) {

            if (this.comanda[i] == null) {
                this.comanda[i] = comanda;
                break;
            }
        }
    }

    public double CalcularTotalPedido() {

        double total = 0;

        for (int i = 0; i < 10; i++) {

            if (comanda[i] != null) {
                total = total + comanda[i].CalcularTotal();
            }
        }

        return total;
    }
}