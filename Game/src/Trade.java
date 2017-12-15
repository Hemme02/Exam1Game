

public class Trade {

    private int price;
    private PlayerCharacter seller;
    private PlayerCharacter buyer;
    private Item item;

    public Trade(int price, PlayerCharacter seller, PlayerCharacter buyer, Item item) {
        this.price = price;
        this.seller = seller;
        this.buyer = buyer;
        this.item = item;
    }


    public int getPrice() {
        return price;
    }

    public PlayerCharacter getSeller() {
        return seller;
    }

    public PlayerCharacter getBuyer() {
        return buyer;
    }

    public Item getItem() {
        return item;
    }

    public void setBuyer(PlayerCharacter buyer) {
        this.buyer = buyer;
    }



}
