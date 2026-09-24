package restaurante1;

public class Comanda {

    private int id;
    private int numComanda;
    private itemconsumacao[] itemConsumacao;

    public Comanda(int id, int numComanda) {
        this.id = id;
        this.numComanda = numComanda;
        this.itemConsumacao = new itemconsumacao[10];
    }

    public int getId() {
        return id;
    }

    public int getNumComanda() {
        return numComanda;
    }

    public void AddItem(itemconsumacao item) {

        for (int i = 0; i < 10; i++) {

            if (itemConsumacao[i] == null) {
                itemConsumacao[i] = item;
                break;
            }
        }
    }

    public double CalcularTotal() {

        double total = 0;

        for (int i = 0; i < 10; i++) {

            if (itemConsumacao[i] != null) {
                total = total + itemConsumacao[i].getSubtotal();
            }
        }

        return total;
    }

    public itemconsumacao[] getItens() {
        return itemConsumacao;
    }
}