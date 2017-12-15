import java.util.Date;

public class Auction extends Trade{

    private int highestBid;
    private Date lastDateToBid;
    private Character highestBidder;

    public Auction(int price, Character seller, Character buyer, Item item, int highestBid, Date lastDateToBid, Character highestBidder) {
        super(price, seller, buyer, item);
        this.highestBid = highestBid;
        this.lastDateToBid = lastDateToBid;
        this.highestBidder = highestBidder;
    }

    // Buyer ?



    public boolean bid(Character character, int newBid){
        // character remove money
        // Old highbid get money back
        return true;
    }

    public void wonAuction(){
        //Winner gets item to inventory
        //Buyer.getItem
        //Seller.getMoney
    }
}
