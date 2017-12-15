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

    //TODO Förslag på level up, Variablar istället för hårdkodat
    public void levelUp(){
        increaCost(10);
        increaMax(50);
        increaMin(50);
        increaRange(5);
        this.level+=1;

    }
    public void increaRange(int value){
        this.range+=value;

    }
}
