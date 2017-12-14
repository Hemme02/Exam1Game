import java.util.ArrayList;

public class Unitest {
    public static void main(String[] args) {
        Item item1 = new Item("Helmet", 16, 16, 6, 100);
        Item item2 = new Item("Helmet", 16, 16, 6, 100);
        Item item3 = new Item("Helmet", 16, 16, 6, 100);
        Item item4 = new Item("Helmet", 16, 16, 6, 100);
        Item item5 = new Item("Helmet", 16, 16, 6, 100);

        ArrayList<Item> items = new ArrayList<>();
        items.add(item1);
        items.add(item2);
        items.add(item3);
        items.add(item4);
        items.add(item5);

        Account account1 = new Account("1234", "test");
        Market market = new Market(items);
        Admin admin = new Admin(account1, market);
        admin.getInterfaceToAdmin().setPrice(10);
    }
}
