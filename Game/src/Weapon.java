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
}
