import java.util.Calendar;
import java.util.Date;


public class Auction extends Trade{

    private int highestBid;
    private Date lastDateToBid;


    public Auction(int price, PlayerCharacter seller, PlayerCharacter buyer, Item item, int highestBid, int hours) {
        super(price, seller, buyer, item);
        lastDateToBid=getDate(hours);
        this.highestBid = highestBid;
        this.lastDateToBid = lastDateToBid;

    }

    // Buyer ?

    public Date getDate(int hours){
        Calendar cal = Calendar.getInstance();
        Date timeToReturn = cal.getTime();
        timeToReturn.setHours(hours);
        return timeToReturn;
    }



    public boolean bid(PlayerCharacter character, int newBid){
        if(highestBid<newBid) {
            //Give money back to current highestbidder
            this.getBuyer().increaMoney(highestBid);


            highestBid=newBid;
            this.setBuyer(character);
            return true;

        }

        else{
            return false;

        }

    }


    public void wonAuction(PlayerCharacter buyer, PlayerCharacter seller){
        Calendar cal = Calendar.getInstance();
        Date timenow = cal.getTime();
        //Winner gets item to inventory if auction went out
        if(timenow.after(lastDateToBid)) {
            this.getSeller().increaMoney(highestBid);
            this.getBuyer().addItem(this.getItem());

        }
        else{
         return;
        }


    }
}
