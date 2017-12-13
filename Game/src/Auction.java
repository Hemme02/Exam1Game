public class Auction {

    private int highestBid;
    private DATETIME lastDateToBid;     //lägg till rätt datatyp
    private Character highestBidder;

    public Auction(int highestBid, DATETIME lastDateToBid, Character highestBidder) {
        this.highestBid = highestBid;
        this.lastDateToBid = lastDateToBid;
        this.highestBidder = highestBidder;
    }

    public boolean bid(){

    }
}
