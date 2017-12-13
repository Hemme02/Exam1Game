import java.util.ArrayList;

public class Npc {

    private boolean friendly;
    private int rarity;
    private int damageMax;
    private int damageMin;
    private int range;
    private ArrayList<Skill> listOfSkills;

    public Npc(boolean friendly, int rarity, int damageMax, int damageMin, int range, ArrayList<Skill> listOfSkills) {
        this.friendly = friendly;
        this.rarity = rarity;
        this.damageMax = damageMax;
        this.damageMin = damageMin;
        this.range = range;
        this.listOfSkills = listOfSkills;
    }

    public Item dropItem(){

    }
    public void giveExp(){

    }
    public void dropMoney(){

    }
    public String speak(){

    }
}
