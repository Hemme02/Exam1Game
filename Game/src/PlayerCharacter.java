import java.util.ArrayList;

public class PlayerCharacter extends Character{
    private Item head;
    private Item arms;
    private Item legs;
    private Item chest;
    private Item boots;
    private Item leftHand;
    private Item rightHand;

    public PlayerCharacter(String name, int level, int experience, int armour, int money, int maxHp, int hp, char gender, String race) {
        super(name, level, experience, armour, money, maxHp, hp, gender, race);
    }

    public void gainLevel(){
        if(this.getLevel() !=60) {
            super.setLevel(this.getLevel()+1);
        }
    }

    public void gainExperience(int expGain){
        int expleft=0;
        int playerExp = this.getExperience();

        if(this.getLevel()==60) {
            return;
        }

        if(playerExp+expGain>10000) {
            expleft = playerExp + expGain - 10000;
            gainLevel();
            this.setExperience(expleft);
        }
        else{
            this.setExperience(playerExp + expGain);
        }

    }

    //Increase money
    public void increaMoney(int increase){
        this.setMoney(this.getMoney() + increase);

    }

    //Decrease money if you have enough
    public boolean decreaMoney(int decrease) {
        if (this.getMoney() - decrease < 0) {
            return false;
        } else {
            this.setMoney(this.getMoney() - decrease);
            return true;
        }
    }

    public void increaMaxHP(int increase){
        this.setMaxHp(this.getMaxHp()+increase);
    }

    //Checks if item is equipped or in backpack then removes it
    public void removeItem(Item itemToRemove) {
        this.listOfItems.remove(itemToRemove);
    }

    //Add one item to the inventory
    public void addItem(Item itemToAdd){
        this.listOfItems.add(itemToAdd);
    }

    public void equipItem(Armour armourToEquip){
        // TODO Fixa equip
    }

    public void equipWeapon(Weapon weaponToEquip){
       // TODO Fixa equip
    }

    public Item getHead() {
        return head;
    }

    public Item getArms() {
        return arms;
    }

    public Item getLegs() {
        return legs;
    }

    public Item getChest() {
        return chest;
    }

    public Item getBoots() {
        return boots;
    }

    public Item getLeftHand() {
        return leftHand;
    }

    public Item getRightHand() {
        return rightHand;
    }

}
