import java.util.ArrayList;

public class Mage {

    private int mana;
    private ArrayList<Skill> listOfSkills;

    public Mage(int mana, ArrayList<Skill> listOfSkills) {
        this.mana = mana;
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
        this.mana+=value;

    }
    //TODO
    public void refillMana(){

    }
}
