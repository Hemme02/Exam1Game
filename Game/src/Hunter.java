import java.util.ArrayList;

public class Hunter extends Character {

    private int stamina;
    private ArrayList<Skill> listOfSkills;

    public Hunter(String name, int level, int experience, int armour, int money, int hp, char gender, String race, ArrayList<Item> listOfItems, ArrayList<Item> listOfEquipedItems, int stamina, ArrayList<Skill> listOfSkills) {
        super(name, level, experience, armour, money, hp, gender, race, listOfItems, listOfEquipedItems);
        this.stamina = stamina;
        this.listOfSkills = listOfSkills;
    }



    public void addSkill(Skill skilltoadd){
        listOfSkills.add(skilltoadd);

    }
    public boolean decreaStamina(int value){
        if(stamina-value<=0){
            return false;
        }else{
            stamina-=value;
            return true;
        }

    }
    public void increaStamina(int value){
        stamina+=value;

    }

    //TODO
    public void refillStamina(){

    }
}
