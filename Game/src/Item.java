public class Item {

    private String name;
    private int ID;
    private int levelRequirement;
    private int rarity;
    private int price;



    public Item(String name, int ID, int levelRequirement, int rarity, int price) {
        this.name = name;
        this.ID = ID;
        this.levelRequirement = levelRequirement;
        this.rarity = rarity;
        this.price = price;
    }

    public void increaPrice(int increment){
        this.price+=increment;

    }

    public void decreaPrice(int decrement){
        if(this.price-decrement<=0){
            return;
        }
        else{
            this.price-=decrement;

        }

    }
    //TODO
    public void passive(){
       // Ta bort?

    }

    public int getLevelRequirement() {
        return levelRequirement;
    }

}
