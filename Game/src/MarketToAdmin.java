public interface MarketToAdmin {
    void addItem(Item item);
    void changePrice(int newPrice,Item itemToChange);
    void marketSellItem(PlayerCharacter buyer);
    void marketBuyItem(PlayerCharacter seller, Item itemToBuy);
    void removeItem(Item itemToAdd);
}
