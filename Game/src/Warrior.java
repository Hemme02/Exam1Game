import java.util.ArrayList;

public class Warrior extends Character {

    private int maxStamina;
    private int stamina;
    private ArrayList<Skill> listOfSkills;

    public Warrior(String name, int level, int experience, int armour, int money, int hp, char gender, String race, ArrayList<Item> listOfItems, ArrayList<Item> listOfEquipedItems, int maxStamina, ArrayList<Skill> listOfSkills) {
        super(name, level, experience, armour, money, hp, gender, race, listOfItems, listOfEquipedItems);

        this.maxStamina = maxStamina;
        this.stamina = this.maxStamina;
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
        maxStamina+=value;

    }

    public void refillStamina(int amountToRefill){
        if((this.stamina += amountToRefill) > maxStamina){
            this.stamina = maxStamina;
        }else{
            this.stamina += amountToRefill;
        }

    }
}
