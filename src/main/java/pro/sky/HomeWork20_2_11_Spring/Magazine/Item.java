package pro.sky.HomeWork20_2_11_Spring.Magazine;

public class Item {
    private final int idItem;
    private final String nameItem;
    private final double priceItem;


    public Item(int idItem, String nameItem, double priceItem) {
        this.idItem = idItem;
        this.nameItem = nameItem;
        this.priceItem = priceItem;
    }

    public double getIdItem() {
        return idItem;
    }

    public String getNameItem() {
        return nameItem;
    }

    public double getPriceItem() {
        return priceItem;
    }


}
