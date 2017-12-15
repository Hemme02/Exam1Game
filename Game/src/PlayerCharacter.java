import java.util.ArrayList;

public class PlayerCharacter extends Character{
    private Armour head;
    private Armour arms;
    private Armour legs;
    private Armour chest;
    private Armour boots;
    private Weapon leftHand;
    private Weapon rightHand;

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
        String slotToEquip = armourToEquip.getSlot();
        if(!(armourToEquip.getLevelRequirement() > this.getLevel())) {
            if (slotToEquip.equals("head")) {
                if (this.head != null) {
                    addItem(head);
                    head = armourToEquip;
                } else {
                    head = armourToEquip;
                }
            } else if (slotToEquip.equals("arms")) {
                if (this.arms != null) {
                    addItem(arms);
                    arms = armourToEquip;
                } else {
                    arms = armourToEquip;
                }
            } else if (slotToEquip.equals("legs")) {
                if (this.legs != null) {
                    addItem(legs);
                    legs = armourToEquip;
                } else {
                    legs = armourToEquip;
                }
            } else if (slotToEquip.equals("chest")) {
                if (this.chest != null) {
                    addItem(chest);
                    chest = armourToEquip;
                } else {
                    chest = armourToEquip;
                }
            } else if (slotToEquip.equals("boots")) {
                if (this.boots != null) {
                    addItem(boots);
                    boots = armourToEquip;
                } else {
                    boots = armourToEquip;
                }
            }
        }

    }

    public void equipWeapon(Weapon weaponToEquip){
       if(!(weaponToEquip.getLevelRequirement() > this.getLevel())){
            if(weaponToEquip.getType().equals("Shield")){
                if(this.rightHand != null){
                    addItem(rightHand);
                    rightHand = weaponToEquip;
                }else{
                    rightHand = weaponToEquip;
                }
            }
            else if(weaponToEquip.getType().equals("One hand")){
                if(this.leftHand != null){
                    addItem(leftHand);
                    leftHand = weaponToEquip;
                }else{
                    leftHand = weaponToEquip;
                }
            }
            else if(weaponToEquip.isTwoHand()){
                if(this.rightHand != null){
                    addItem(rightHand);
                }
                if(this.leftHand != null){
                    addItem(leftHand);
                    leftHand = weaponToEquip;
                }else{
                    leftHand = weaponToEquip;
                }
            }

       }
    }

    public void addArmour(){
        ArrayList<Armour> armorList= new ArrayList<>();
        this.setArmour(head.getArmourValue()+arms.getArmourValue()+chest.getArmourValue()+legs.getArmourValue()+boots.getArmourValue());

    }

    public void addMinMaxDamage(){
        this.

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
