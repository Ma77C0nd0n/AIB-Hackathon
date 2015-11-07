import java.awt.Color;
import java.io.File;
import java.util.Set;

import javax.swing.*;

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
		
		JFrame mainFrame = new JFrame("Home A-Loan");
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainFrame.setSize(800, 600);
		
		mainFrame.setVisible(true);

	}
	
}
