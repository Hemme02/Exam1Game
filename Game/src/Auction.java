import java.util.Date;

public class Auction {

    private int highestBid;
    private Date lastDateToBid;     //lägg till rätt datatyp
    private Character highestBidder;

    public Auction(int highestBid, Date lastDateToBid, Character highestBidder) {
        this.highestBid = highestBid;
        this.lastDateToBid = lastDateToBid;
        this.highestBidder = highestBidder;
    }

    public boolean bid(){
        return true;
    }
}
