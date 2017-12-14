import java.util.ArrayList;

public class Market implements MarketToAdmin{

    private ArrayList<Item> listOfItems;

    public Market(ArrayList<Item> listOfItems) {

        this.listOfItems = listOfItems;
    }

    @Override
    public void changeItem(Item itemToChange){

    }

    @Override
    public void setPrice(int newPrice){         //har inte denna price från trade eller kan man ändra?

    }
}
