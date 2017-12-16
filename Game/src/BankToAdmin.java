public interface BankToAdmin {
    boolean addToStorage(PlayerCharacter whichPlayerStorage,Item itemToAdd);
    boolean removeFromStorage(PlayerCharacter whichPlayerStorage,Item itemToRemove);
}
