import java.util.ArrayList;

public class Character {

    private String name;
    private int level;
    private int experience;
    private int armour;
    private int money;
    private int hp;
    private char gender;
    private String race;

    private ArrayList<Item> listOfItems;
    private ArrayList<Item> listOfEquipedItems;

    public Character(String name, int level, int experience, int armour, int money, int hp, char gender, String race, ArrayList<Item> listOfItems, ArrayList<Item> listOfEquipedItems) {
        this.name = name;
        this.level = level;
        this.experience = experience;
        this.armour = armour;
        this.money = money;
        this.hp = hp;
        this.gender = gender;
        this.race = race;
        this.listOfItems = listOfItems;
        this.listOfEquipedItems = listOfEquipedItems;
    }


//Add one level to the player if the play issent level 60
    public void gainLevel(){
        if(this.level !=60) {
            this.level += 1;
        }
    }

//Adds exp if expGain exceeds the limit it will add and level and add the remaining exp
    public void gainExperience(int expGain){
        int expleft=0;

        if(this.level==60) {
            return;
        }

        if(this.experience+expGain>10000) {

            expleft = experience + expGain - 10000;
            gainLevel();
        }
        else{
            this.experience+=expGain;
        }

    }

//Add one item to the inventory
    public void addItem(Item itemtoadd){
        this.listOfItems.add(itemtoadd);

    }

    public void useSkill(){

    }

//Checks If the item is in the inventory and the character dont have to same type equipped and if the levelREQ is reached it adds it to the equipped list
//TODO visst ska man använda == när vi jämnför här? Ska vi ha ITEM type så man inte kan equippa samma itemTYPE?

    public void equipItem(Item itemtoequip){
        int itemlevel=itemtoequip.getLevelRequirement();
        if (itemlevel<this.level){
            return;
        }

        for(int i=0;i<listOfItems.size();i++){
            if(listOfItems.get(i)==itemtoequip){
                equipItem(itemtoequip);
                return;

            }

        }
    }

//Increase money
    public void increaMoney(int increase){
        this.money+=increase;

    }

//Decrease money if you have enough
    public boolean decreaMoney(int decrease){
        if(this.money-decrease<0){
            return false;
        }
        else;{
            this.money-=decrease;
            return true;
        }

    }

//Increase hp of your character
    //TODO Har vi något max hp? och hur markerar vi att någon är död?
    public void increaHP(int increase){
        this.hp+=increase;

    }

    //Decrease hp if you have enough else you are dead
    public boolean decreaHp(int decrease){
        if(this.hp-decrease<0){
            //player is dead
            return false;
        }
        else;{
            this.hp-=decrease;
            return true;
        }

    }
    //TODO Ska vi ha NPC som extend av character så kan vi göra först en check om den är friedly eller inte
    public void dealDamageToNpc(int damage, Npc target){

        if(target.isFriendly()==true){
            return;
        }
        else;{
            target.takeDamage(damage);
        }


    }

//dealDamage on an Character
    public void dealDamage(int damage, Character target){
        target.takeDamage(damage);
    }

//Takes damage
    public void takeDamage(int damage){
        this.hp-=damage;

    }

    public void refillHP(){

    }

    //Checks if item is equipped or in backpack then removes it
    public void removeItem(Item itemtoremove) {


        int inbackack;
        int equipped;
        for (int i = 0; i < listOfItems.size(); i++) {
            if (listOfItems.get(i) == itemtoremove) {
                listOfItems.remove(itemtoremove);
                return;

            }

            for (i = 0; i < listOfEquipedItems.size(); i++) {
                if (listOfEquipedItems.get(i) == itemtoremove) {
                    listOfEquipedItems.remove(itemtoremove);
                    return;

                }
            }

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
}
