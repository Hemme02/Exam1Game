public class Weapon extends Item{

    private int damageMin;
    private int damageMax;
    private boolean twoHand;
    private int range;
    private String type;
    private String slot;

    public Weapon(String name, int ID, int levelRequirement, int rarity, int price, int damageMin, int damageMax, boolean twoHand, int range, String type, String slot) {
        super(name, ID, levelRequirement, rarity, price);
        this.damageMin = damageMin;
        this.damageMax = damageMax;
        this.twoHand = twoHand;
        this.range = range;
        this.type = type;
        this.slot = slot;
    }

    public int getDamageMin() {
        return damageMin;
    }

    public void setDamageMin(int damageMin) {
        this.damageMin = damageMin;
    }

    public int getDamageMax() {
        return damageMax;
    }

    public void setDamageMax(int damageMax) {
        this.damageMax = damageMax;
    }

    public boolean isTwoHand() {
        return twoHand;
    }

    public void setTwoHand(boolean twoHand) {
        this.twoHand = twoHand;
    }

    public int getRange() {
        return range;
    }

    public void setRange(int range) {
        this.range = range;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSlot() {
        return slot;
    }

    public void setSlot(String slot) {
        this.slot = slot;
    }
}
