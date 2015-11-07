import java.io.File;
import java.util.Set;

public class main {
	
	public static void main(String[] args) throws Exception{
		
		Guest test_user = new Guest(13523107);
	
		test_user.Rate(13523107,4.5,"Very gud");
		
		Guest_Writer gw = new Guest_Writer(test_user.getRatingFor(13523107));
		
		System.out.println(test_user.getUserID() + " " + test_user.getRatingFor(13523107).getRating() + " " + test_user.getRatingFor(13523107).getComment());
		
		DatasetReader data = new DatasetReader("src/u.data");
		data.loadAllUsers();
		
		Set<Rating> ratingsSet = data.getAllRatings();
		for(Rating r:ratingsSet) {
			System.out.println(r.toString());
		}
	}
	
}
