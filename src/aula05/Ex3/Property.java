package aula05.Ex3;

import aula05.Ex1.DateYMD;

public class Property {
	private final int id;
    private final String address;
    private final int rooms;
    private final int price;
    private boolean availability;
    private DateYMD auctionBegin;
    private DateYMD auctionEnd;

	 public Property(int id, String address, int rooms, int price) {
        this.id = id; // fazer com que começe por 1000
        this.address = address;
        this.rooms = rooms;
        this.price = price;
        this.availability = true;
        this.auctionBegin = null;
        this.auctionEnd = null;
    }


	public void setAvailability(boolean availability) {
		this.availability = availability;
	}

	public boolean getAvailability() {
		return this.availability;
	}


	public void setAuction(DateYMD date, DateYMD end) {
		this.auctionBegin = date;
		this.auctionEnd = end;
	}


	public int getId() {
		return this.id;
	}


	
}
