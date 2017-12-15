public class Armour extends Item{

    private String type;
    private String slot;
    private int armourValue;

    public Armour(String name, int ID, int levelRequirement, int rarity, int price, String type, String slot, int armourValue) {
        super(name, ID, levelRequirement, rarity, price);
        this.type = type;
        this.slot = slot;
        this.armourValue = armourValue;
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

    public int getArmourValue() {
        return armourValue;
    }

    public void setArmourValue(int armourValue) {
        this.armourValue = armourValue;
    }
}
