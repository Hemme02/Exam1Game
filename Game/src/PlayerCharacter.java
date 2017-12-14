import java.util.ArrayList;

public class PlayerCharacter extends Character{
    private ArrayList<Item> listOfItems;
    private ArrayList<Item> listOfEquipedItems;

    public PlayerCharacter(String name, int level, int experience, int armour, int money, int maxHp, char gender, String race, ArrayList<Item> listOfItems, ArrayList<Item> listOfEquipedItems) {
        super(name, level, experience, armour, money, maxHp, gender, race);
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
            // TODO Ska vi lägga tillbaka det som är över 10000 exp på experience. T.ex. om man har 8000 exp och tjänar 4000
            // TODO Ska man då ha 2000 efter att man levlat upp? Då borde vi lägga till koden nedan.

            // TODO this.experience = expleft;
        }
        else{
            this.experience+=expGain;
        }

    }

    //Add one item to the inventory
    public void addItem(Item itemToAdd){
        this.listOfItems.add(itemToAdd);

    }

    //Checks If the item is in the inventory and the character dont have to same type equipped and if the levelREQ is reached it adds it to the equipped list
//TODO visst ska man använda == när vi jämnför här? Ska vi ha ITEM type så man inte kan equippa samma itemTYPE?

    public void equipItem(Item itemToEquip){
        int itemlevel=itemToEquip.getLevelRequirement();
        if (itemlevel<this.level){
            return;
        }

        //TODO Varför har vi denna forloop? Om jag fattar rätt så kör den ju bara funktionen igen. Blir en infinityloop.
        for(int i=0;i<listOfItems.size();i++){
            if(listOfItems.get(i)==itemToEquip){
                equipItem(itemToEquip);
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
        else{
            this.money-=decrease;
            return true;
        }

    }

    //Increase hp of your character
    //TODO Har vi något max hp? och hur markerar vi att någon är död?
    public void increaMaxHP(int increase){
        this.maxHp+=increase;

    }

}
