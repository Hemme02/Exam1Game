import java.util.ArrayList;

public class Character {

    private String name;
    private int level;
    private int experience;
    private int armour;
    private int money;
    private int HP;
    private char gender;
    private String race;

    private ArrayList<Item> listOfItems;
    private ArrayList<Item> listOfEquipedItems;

    public Character(String name, int level, int experience, int armour, int money, int HP, char gender, String race, ArrayList<Item> listOfItems, ArrayList<Item> listOfEquipedItems) {
        this.name = name;
        this.level = level;
        this.experience = experience;
        this.armour = armour;
        this.money = money;
        this.HP = HP;
        this.gender = gender;
        this.race = race;
        this.listOfItems = listOfItems;
        this.listOfEquipedItems = listOfEquipedItems
    }

    public void gainLevel(){

    }

    public void gainExperience(){

    }

    public void addItem(){

    }

    public void useSkill(){

    }

    public void equipItem(){

    }

    public void increaMoney(){

    }

    public boolean decreaMoney(){

    }

    public void increaHP(){

    }

    public boolean decreaHP(){

    }

    public void dealDamage(){

    }

    public void takeDamage(){

    }

    public void refillHP(){

    }

    public void removeItem(){

    }
}
