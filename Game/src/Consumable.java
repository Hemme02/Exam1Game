public class Consumable extends Item{

    private String type;
    private int refill;

    public Consumable(String name, int ID, int levelRequirement, int rarity, int price, String type, int refill) {
        super(name, ID, levelRequirement, rarity, price);
        this.type = type;
        this.refill = refill;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getRefill() {
        return refill;
    }

    public void setRefill(int refill) {
        this.refill = refill;
    }
}
