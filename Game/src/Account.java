import java.util.ArrayList;

public class Account {

    private String password;
    private String email;
    private ArrayList<Character> listOfCharacters;
    private ArrayList<Account> listOfFriends;

    public Account(String password, String email) {
        this.password = password;
        this.email = email;
        this.listOfCharacters = new ArrayList<>();
        this.listOfFriends = new ArrayList<>();
    }

    public boolean logIn(){
        return true;
    }
    public boolean logOut(){
        return true;
    }
    public boolean selectCharacter(){
        return true;
    }
    public boolean deleteCharacter(){
        return true;
    }
    //public Character createCharacter(){

    //}
    public boolean changePassword(){
        return true;
    }

}
