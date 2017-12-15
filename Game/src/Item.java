public abstract class Item {

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

    public int getLevelRequirement() {
        return levelRequirement;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setLevelRequirement(int levelRequirement) {
        this.levelRequirement = levelRequirement;
    }

    public int getRarity() {
        return rarity;
    }

    public void setRarity(int rarity) {
        this.rarity = rarity;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
