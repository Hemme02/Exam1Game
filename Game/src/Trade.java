import java.util.ArrayList;

public class Trade {

    private int price;
    private Character seller;
    private Character buyer;
    private Item item;

    public Trade(int price, Character seller, Character buyer, Item item) {
        this.price = price;
        this.seller = seller;
        this.buyer = buyer;
        this.item = item;
    }

    public int sellItem(){
        return 0;
    }
    //public Item buyItem(){

    //}
}
