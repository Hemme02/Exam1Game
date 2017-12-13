public class Weapon {

    private int damageMin;
    private int damageMax;
    private boolean twoHand;
    private int range;
    private String type;

    public Weapon(int damageMin, int damageMax, boolean twoHand, int range, String type) {
        this.damageMin = damageMin;
        this.damageMax = damageMax;
        this.twoHand = twoHand;
        this.range = range;
        this.type = type;
    }


}
