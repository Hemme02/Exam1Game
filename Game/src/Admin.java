public class Admin {

    private Account account;
    private MarketToAdmin marketInterfaceToAdmin;
    private BankToAdmin bankInterfaceToAdmin;

    public Admin(Account account, MarketToAdmin marketInterfaceToAdmin,BankToAdmin bankInterfaceToAdmin) {
        this.account = account;
        this.marketInterfaceToAdmin = marketInterfaceToAdmin;
        this.bankInterfaceToAdmin = bankInterfaceToAdmin;
    }

    public Account getAccount() {
        return account;
    }

    public MarketToAdmin getInterfaceToAdmin() {
        return marketInterfaceToAdmin;
    }

    public BankToAdmin bankInterfaceToAdmin() {
        return bankInterfaceToAdmin;
    }
}

