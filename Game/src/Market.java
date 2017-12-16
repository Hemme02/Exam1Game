import java.util.ArrayList;

public class Market extends Trade implements MarketToAdmin{

    private ArrayList<Item> listOfItems;

    public Market(int price, PlayerCharacter seller, PlayerCharacter buyer, Item item, ArrayList<Item> listOfItems) {
        super(price, seller, buyer, item);
        this.listOfItems.add(item);
    }




    @Override
    public void addItem(Item itemToAdd){
        listOfItems.add(itemToAdd);

    }

    @Override
    public void changePrice(int newPrice,Item itemToChange){
        listOfItems.get(0).setPrice(newPrice);


    }
    //TODO ska jag kolla i listan om itemet finns där eller behövs det verkligen?
    @Override
    public void marketSellItem(PlayerCharacter buyer){
        if(buyer.getMoney()>=this.getPrice()){
            buyer.decreaMoney(this.getPrice());
            buyer.addItem(this.getItem());

        }

    }
    @Override
    public void marketBuyItem(PlayerCharacter seller, Item itemToBuy){
        seller.increaMoney(itemToBuy.getPrice());
        seller.getListOfItems().remove(itemToBuy);

    }
    @Override
    public void removeItem(Item itemToAdd){
        listOfItems.remove(itemToAdd);

    }
}
