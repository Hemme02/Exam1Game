import java.util.ArrayList;

public class Character {

    private String name;
    private int level;
    private int experience;
    private int minDamage;
    private int maxDamage;
    private int range;
    private int armour;
    private int money;
    private int maxHp;
    private int hp;
    private char gender;
    private String race;
    private boolean alive;

    public ArrayList<Item> listOfItems;

    public Character(String name, int level, int experience, int armour, int money, int maxHp, int hp, char gender, String race) {
        this.name = name;
        this.level = level;
        this.experience = experience;
        this.armour = armour;
        this.money = money;
        this.maxHp = maxHp;
        this.hp = hp;
        this.gender = gender;
        this.race = race;
        this.listOfItems = new ArrayList<>();
        this.alive = true;
    }

    public void useSkill(){

    }

    //Decrease hp if you have enough else you are dead
    public boolean decreaHp(int decrease){
        if(this.hp-decrease<0){
            //player is dead
            return false;
        }
        else{
            this.hp-=decrease;
            return true;
        }
    }

    public void dealDamage(int damage, Npc target){
        if(!target.isFriendly()){
            target.takeDamage(damage);
        }
    }

//Takes damage
    public void takeDamage(int damage){
        decreaHp(damage);
    }

// Refills hp when healing
    public void refillHP(int amountToRefill){
        if((this.hp += amountToRefill) > maxHp){
            this.hp = maxHp;
        }else{
            this.hp += amountToRefill;
        }

    }


    public int getHp() {
        return hp;
    }

    public int getExperience() {
        return experience;
    }

    public int getMoney() {
        return money;
    }

    public ArrayList<Item> getListOfItems() {
        return listOfItems;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public void setArmour(int armour) {
        this.armour = armour;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public void setMaxHp(int maxHp) {
        this.maxHp = maxHp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public void setListOfItems(ArrayList<Item> listOfItems) {
        this.listOfItems = listOfItems;
    }

    public int getLevel() {
        return level;
    }

    public int getArmour() {
        return armour;
    }

    public int getMaxHp() {
        return maxHp;
    }

    public char getGender() {
        return gender;
    }

    public String getRace() {
        return race;
    }

    public int getMinDamage() {
        return minDamage;
    }

    public void setMinDamage(int minDamage) {
        this.minDamage = minDamage;
    }

    public int getMaxDamage() {
        return maxDamage;
    }

    public void setMaxDamage(int maxDamage) {
        this.maxDamage = maxDamage;
    }

    public int getRange() {
        return range;
    }

    public void setRange(int range) {
        this.range = range;
    }

    public boolean isAlive() {
        return alive;
    }

    public void setAlive(boolean alive) {
        this.alive = alive;
    }
}
