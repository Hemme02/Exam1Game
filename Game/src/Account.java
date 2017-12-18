import java.util.ArrayList;

public class Account {

    private String password;
    private final String email;
    private ArrayList<PlayerCharacter> listOfCharacters;
    private ArrayList<Account> listOfFriends;

    public Account(String password, String email) {
        this.password = password;
        this.email = email;
        this.listOfCharacters = new ArrayList<>();
        this.listOfFriends = new ArrayList<>();
    }

    public Character selectCharacter (String name){
        for(PlayerCharacter playerCharacter : listOfCharacters){
            if(playerCharacter.getName().equals(name)){
                return playerCharacter;
            }
        }
        throw new ArrayIndexOutOfBoundsException();
    }

    public void deleteCharacter(String name){
        for(PlayerCharacter playerCharacter : listOfCharacters){
            if(playerCharacter.getName().equals(name)){
                listOfCharacters.remove(playerCharacter);
            }
        }
    }

    public void createCharacter(PlayerCharacter newCharacter){
        if(newCharacter instanceof Warrior){
            Warrior newWarrior = (Warrior) newCharacter;
            listOfCharacters.add(newWarrior);
        }
        else if(newCharacter instanceof Hunter){
            Hunter newHunter = (Hunter) newCharacter;
            listOfCharacters.add(newCharacter);
        }
        else if(newCharacter instanceof Mage){
            Mage newMage = (Mage) newCharacter;
        }
    }

    public void addFriend(Account friendAccount){
        listOfFriends.add(friendAccount);
    }

    public void changePassword(String newPassword){
        this.password = newPassword;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public ArrayList<PlayerCharacter> getListOfCharacters() {
        return listOfCharacters;
    }

    public ArrayList<Account> getListOfFriends() {
        return listOfFriends;
    }
}
