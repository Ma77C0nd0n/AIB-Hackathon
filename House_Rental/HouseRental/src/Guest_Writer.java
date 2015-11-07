import java.io.*;
public class Guest_Writer {
	private String dataFile;
	private Writer output;
	Rating rating;
	File file = new File("src/u.user");
	public Guest_Writer(Rating r) throws IOException {
		output = new BufferedWriter(new FileWriter("src/u.data", true));
		output.append("\n"+r.toString());
		output.close();
	}
	private void appendFile() {
		
	}
}
