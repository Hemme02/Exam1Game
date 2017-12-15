import java.util.ArrayList;

public class Mage extends PlayerCharacter{

    private int mana;
    private int maxMana;
    private ArrayList<Skill> listOfSkills;

    public Mage(String name, int level, int experience, int armour, int money, int maxHp, int hp, char gender, String race, int maxMana) {
        super(name, level, experience, armour, money, maxHp, hp, gender, race);
        this.maxMana = maxMana;
        this.mana = maxMana;
        this.listOfSkills = new ArrayList<>();
    }

    public void addSkill(Skill skilltoadd){
        listOfSkills.add(skilltoadd);

    }

    public boolean decreaMana(int value){
        if(mana-value<=0){
            return false;
        }else{
            mana-=value;
            return true;
        }

    }
    public void increaMana(int value){
        this.maxMana+=value;

    }

    public void refillMana(int amountToRefill){
        if((this.mana += amountToRefill) > maxMana){
            this.mana = maxMana;
        }else{
            this.mana += amountToRefill;
        }
    }
}
