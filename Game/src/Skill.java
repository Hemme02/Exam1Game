public class Skill {

    private String name;
    private int cost;
    private int level;
    private boolean damage;
    private int range;
    private int cooldown;
    private int damageMax;
    private int damageMin;

    public Skill(String name, int cost, int level, boolean damage, int range, int cooldown, int damageMax, int damageMin) {
        this.name = name;
        this.cost = cost;
        this.level = level;
        this.damage = damage;
        this.range = range;
        this.cooldown = cooldown;
        this.damageMax = damageMax;
        this.damageMin = damageMin;
    }

    public void increaMax(int value){
        this.damageMax+=value;

    }
    public void increaMin(int value){
        this.damageMin+=value;

    }
    public void increaCost(int value){
        this.cost+=value;

    }

    public void levelUp(int increaseCost, int increaseMax, int increaseMin, int increaseRange){
        this.increaCost(increaseCost);
        this.increaMax(increaseMax);
        this.increaMin(increaseMin);
        this.increaRange(increaseRange);
        this.level+=1;

    }
    public void increaRange(int value){
        this.range+=value;

    }

    public String getName() {
        return name;
    }

    public int getCost() {
        return cost;
    }

    public int getLevel() {
        return level;
    }

    public boolean isDamage() {
        return damage;
    }

    public int getRange() {
        return range;
    }

    public int getCooldown() {
        return cooldown;
    }

    public int getDamageMax() {
        return damageMax;
    }

    public int getDamageMin() {
        return damageMin;
    }
}
