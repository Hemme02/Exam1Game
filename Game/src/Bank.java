import java.util.ArrayList;

public class Bank implements BankToAdmin {

    private ArrayList<Storage> listOfStorages;

    public Bank(Storage playerStorage) {
        this.listOfStorages.add(playerStorage);
    }

    public boolean addToStorage(PlayerCharacter whichPlayerStorage,Item itemToAdd){
        for(int i=0;i<listOfStorages.size();i++){
            if(listOfStorages.get(i).getCharacter()==whichPlayerStorage){
                listOfStorages.get(i).addToStorage(itemToAdd);
                return true;

            }

        }



        return false;
    }
    public boolean removeFromStorage(PlayerCharacter whichPlayerStorage,Item itemToRemove){
        for(int i=0;i<listOfStorages.size();i++){
            if(listOfStorages.get(i).getCharacter()==whichPlayerStorage){
                listOfStorages.get(i).removeFromStorage(itemToRemove);
                return true;

            }

        }
        return false;
    }
}
