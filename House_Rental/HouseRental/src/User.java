import java.util.Set;
import java.util.HashSet;
public class User {
	
	private Set<Rating> givenRatings = new HashSet<Rating>();
	private Set<Rating> receivedGuestRatings = new HashSet<Rating>();
	private Integer userId;

	public Integer getUserID() {
		return userId;
	}	
	
	public User(final Integer uid){
		this.userId = uid;
	}
	
	public Rating getRatingFor(int id) {
		for(Rating r:givenRatings) {
			if (r.getRatedID() == id) {
				return r;
			}
		}
		return null;
	}
	
	public void Rate(int ID, double rating, String comment) {
		Rating r = new Rating(getUserID(),ID,rating,comment);
		givenRatings.add(r);
	}
	
	public Set<Rating> getRatingsList() {
		return givenRatings;
	}
	
}
