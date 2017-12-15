import java.util.ArrayList;

public class Warrior extends PlayerCharacter {

    private int maxStamina;
    private int stamina;
    private ArrayList<Skill> listOfSkills;

    public Warrior(String name, int level, int experience, int armour, int money, int maxHp, int hp, char gender, String race, int maxStamina) {
        super(name, level, experience, armour, money, maxHp, hp, gender, race);
        this.maxStamina = maxStamina;
        this.stamina = maxStamina;
        this.listOfSkills = new ArrayList<>();
    }

    public void addSkill(Skill skilltoadd){
        listOfSkills.add(skilltoadd);

    }
    public boolean decreaStamina(int value){
        if(stamina - value <= 0){
            return false;
        }else{
            stamina -= value;
            return true;
        }

    }
    public void increaStamina(int value){
        maxStamina += value;

    }

    public void refillStamina(int amountToRefill){
        if((this.stamina += amountToRefill) > maxStamina){
            this.stamina = maxStamina;
        }else{
            this.stamina += amountToRefill;
        }

    }
}
