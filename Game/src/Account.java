import java.util.ArrayList;

public class Account {

    private String password;
    private String email;
    private ArrayList<Character> listOfCharacters;
    private ArrayList<Account> listOfFriends;

    public Account(String password, String email, ArrayList<Character> listOfCharacters, ArrayList<Account> listOfFriends) {
        this.password = password;
        this.email = email;
        this.listOfCharacters = listOfCharacters;
        this.listOfFriends = listOfFriends;
    }

    public boolean logIn(){

    }
    public boolean logOut(){

    }
    public boolean selectCharacter(){

    }
    public boolean deleteCharacter(){

    }
    public Character createCharacter(){

    }
    public boolean changePassword(){

    }

}
