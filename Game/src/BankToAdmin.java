public interface BankToAdmin {
    boolean addToStorage(PlayerCharacter whichPlayerStorage,Item itemToAdd);
    boolean removeFromStorage(PlayerCharacter whichPlayerStorage,Item itemToRemove);
    boolean removeStorage(PlayerCharacter whichPlayerStorage);
    boolean addStorage(PlayerCharacter whichPlayer,int size);
}
