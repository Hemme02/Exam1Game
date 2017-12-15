public class Admin {

    private Account account;
    private MarketToAdmin interfaceToAdmin;

    public Admin(Account account, MarketToAdmin interfaceToAdmin) {
        this.account = account;
        this.interfaceToAdmin = interfaceToAdmin;
    }

    public Account getAccount() {
        return account;
    }

    public MarketToAdmin getInterfaceToAdmin() {
        return interfaceToAdmin;
    }
}
// Banken också
