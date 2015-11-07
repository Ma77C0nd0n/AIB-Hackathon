import java.util.Set;
public class User {
	
	Set<Rating> givenRatings;
	Set<Rating> receivedGuestRatings;
	public Integer userId;

	public Integer getUserId() {
		return userId;
	}	
	
	public User(final Integer uid){
		this.userId = uid;
	}
	
}
