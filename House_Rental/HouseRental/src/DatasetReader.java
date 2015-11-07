import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;

public class DatasetReader {
	private String dataFile;
	private ArrayList<String> data = null;

	
	public DatasetReader(final String dataFileAddr){
		this.dataFile = dataFileAddr;
	}
	
	public void loadAllUsers() throws Exception{
		loadUsers(dataFile);
	}

	public Set<Rating> getAllRatings() {
		Set<Rating> set = new HashSet<Rating>();
		for(String s:data) {
			String[] a = s.split("\t");
			int rater = Integer.parseInt(a[0]);
			int rated = Integer.parseInt(a[1]);
			double rating = Double.parseDouble(a[2]);
			Rating r = new Rating(rater,rated,rating,a[3]);
			set.add(r);
		}
		return set;
	}
	
	private void loadUsers(final String dataFile) throws IOException {
		BufferedReader in = new BufferedReader(new FileReader(new File(dataFile)));
		String line;
		data = new ArrayList<String>();
		while ((line = in.readLine()) != null) {
			data.add(line);
		}
		in.close();
	}
	
	
}
