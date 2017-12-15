import java.util.ArrayList;

public class Mage {

    private int mana;
    private int maxMana;
    private ArrayList<Skill> listOfSkills;

    public Mage(int maxMana, ArrayList<Skill> listOfSkills) {
        this.maxMana = maxMana;
        this.mana = maxMana;
        this.listOfSkills = listOfSkills;
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
    //TODO
    public void refillMana(int amountToRefill){
        if((this.mana += amountToRefill) > maxMana){
            this.mana = maxMana;
        }else{
            this.mana += amountToRefill;
        }
    }
}
