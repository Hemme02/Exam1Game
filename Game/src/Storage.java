import java.util.ArrayList;

public class Storage {

    private int size;
    private PlayerCharacter character;
    private ArrayList<Item> listOfItems;

    public Storage(int size, PlayerCharacter character) {
        this.size = size;
        this.character = character;
        this.listOfItems = new ArrayList<>();
    }

    public void addToStorage(Item itemToAdd){
        if(listOfItems.size() < this.size){
            listOfItems.add(itemToAdd);
            character.removeItem(itemToAdd);
        }

    }
    public void removeFromStorage(Item itemToRemove){
        listOfItems.remove(itemToRemove);
        character.addItem(itemToRemove);

    }
    public void changeSizeOfStorage(int newSize){
        size = newSize;

    }

    public int getSize() {
        return size;
    }

    public ArrayList<Item> getListOfItems() {
        return listOfItems;
    }

    public PlayerCharacter getCharacter() {
        return character;
    }
}
