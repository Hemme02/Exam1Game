import java.util.ArrayList;

public class Npc extends Character {

    private boolean friendly;
    private int rarity;
    private ArrayList<Skill> listOfSkills;

    public Npc(String name, int level, int experience, int armour, int money, int maxHp, int hp, char gender, String race, boolean friendly, int rarity, ArrayList<Skill> listOfSkills) {
        super(name, level, experience, armour, money, maxHp, hp, gender, race);
        this.friendly = friendly;
        this.rarity = rarity;
        this.listOfSkills = listOfSkills;
    }

    public void deadNpc(PlayerCharacter player){
        if(!this.isAlive()){
            dropItem(player);
            giveExp(player);
            dropMoney(player);
        }

    }

    public void dropItem(PlayerCharacter target){
            for(int i =0;i<this.getListOfItems().size();i++){
                target.addItem(this.getListOfItems().get(i));
            }
    }

    //Check if npc is dead if the its true then give exp to killer
    public void giveExp(PlayerCharacter target){
            target.gainExperience(this.getExperience());

    }

    //Give money to killer if target is dead
    public void dropMoney(PlayerCharacter target){
            target.increaMoney(this.getMoney());
    }

    //TODO Vet inte riktigt hur vi ska göra med denna
    public String speak(){
    return "Hej";
    }

    public boolean isFriendly() {
        return friendly;
    }
}
