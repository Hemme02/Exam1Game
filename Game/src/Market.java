import java.util.ArrayList;

public class Market extends Trade implements MarketToAdmin{

    private ArrayList<Item> listOfItems;

    public Market(int price, PlayerCharacter seller, PlayerCharacter buyer, Item item, ArrayList<Item> listOfItems) {
        super(price, seller, buyer, item);
        this.listOfItems.add(item);
    }



    @Override
    public void changeItem(Item itemToChange){

    }

    @Override
    public void setPrice(int newPrice){         //har inte denna price från trade eller kan man ändra?

    }

    public void marketSellItem(PlayerCharacter buyer){
        if(buyer.getMoney()>=this.getPrice()){
            buyer.decreaMoney(this.getPrice());
            buyer.addItem(this.getItem());

        }

    }

    public void marketBuyItem(PlayerCharacter seller, Item itemToBuy){

    }
}
