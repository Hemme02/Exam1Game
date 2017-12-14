import java.util.ArrayList;

public class Npc extends Character {

    private boolean friendly;
    private int rarity;
    private int damageMax;
    private int damageMin;
    private int range;
    private ArrayList<Skill> listOfSkills;

    public Npc(String name, int level, int experience, int armour, int money, int hp, char gender, String race, ArrayList<Item> listOfItems, ArrayList<Item> listOfEquipedItems, boolean friendly, int rarity, int damageMax, int damageMin, int range, ArrayList<Skill> listOfSkills) {
        super(name, level, experience, armour, money, hp, gender, race, listOfItems, listOfEquipedItems);
        this.friendly = friendly;
        this.rarity = rarity;
        this.damageMax = damageMax;
        this.damageMin = damageMin;
        this.range = range;
        this.listOfSkills = listOfSkills;

    }

    //public Npc(boolean friendly, int rarity, int damageMax, int damageMin, int range, ArrayList<Skill> listOfSkills) {
    //    this.friendly = friendly;
    //    this.rarity = rarity;
    //    this.damageMax = damageMax;
    //    this.damageMin = damageMin;
    //    this.range = range;
    //    this.listOfSkills = listOfSkills;
   //}


    //TODO Gjort denna till en void och all som npc man dödar har i invetory får den som dödat
    public void dropItem(Character target){
        if(this.getHp()<=0){
            for(int i =0;i<this.getListOfItems().size();i++){
                target.addItem(this.getListOfItems().get(i));
            }

        }


    }

    //Check if npc is dead if the its true then give exp to killer
    public void giveExp(Character target){
        if(this.getHp()<=0){
            target.gainExperience(this.getExperience());

        }


    }

    //Give money to killer if target is dead
    public void dropMoney(Character target){
        if(this.getHp()<=0){
            target.increaMoney(this.getMoney());

        }




    }
    //TODO Vet inte riktigt hur vi ska göra med denna
    public String speak(){
    return "Hej";
    }

    public boolean isFriendly() {
        return friendly;
    }

}
