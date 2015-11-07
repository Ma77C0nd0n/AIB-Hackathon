import java.io.*;
import java.nio.file.Path;
public class Guest_Writer {
	Rating rating;
	File file = new File("../HouseRental/src/u.user");
	public Guest_Writer(Rating r) {
		rating = r;
		if(file.exists()) {
			System.out.println("YAY");
		}
		else{
			System.out.println("DAM TIS SUKKS");
		}
	}
	private void appendFile() {
		
	}
}
