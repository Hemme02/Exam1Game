public class Weapon {

    private int damageMin;
    private int damageMax;
    private boolean twoHand;
    private int range;
    private String type;
    private String slot;

    public Weapon(int damageMin, int damageMax, boolean twoHand, int range, String type, String slot) {
        this.damageMin = damageMin;
        this.damageMax = damageMax;
        this.twoHand = twoHand;
        this.range = range;
        this.type = type;
        this.slot = slot;

    }


}
