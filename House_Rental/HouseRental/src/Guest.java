import java.util.Set;
public class Guest extends User {

	private boolean confirmedBooking;
	private int hostID;

	public Guest(int uid) {
		super(uid);
		confirmedBooking = false;
	}

	public void confirmBooking(int host) {
		if(confirmedBooking = false) {
			confirmedBooking = true;
			hostID = host;
		}
	}

	public void endBooking() {
		confirmedBooking = false;
		hostID = -1;
	}

	public boolean checkBooking() {
		return confirmedBooking;
	}

	public int checkHost() {
		return hostID;
	}
	
	public Set<Rating> getRatings() {
		return super.givenRatings;
	}
	
	public void Rate(int ID,double rating,String comment) {
		Rating r = new Rating(ID,rating,comment);
		super.givenRatings.add(r);
	}
}
