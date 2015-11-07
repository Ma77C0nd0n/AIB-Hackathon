import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class DatasetReader {
	private String dataFile;
	private ArrayList<String> data = null;

	
	public DatasetReader(final String dataFileAddr){
		this.dataFile = dataFileAddr;
	}
	
	public void loadAllUsers() throws Exception{
		loadUsers(dataFile);
	}

	private void loadUsers(final String dataFile) throws IOException {
		BufferedReader in = new BufferedReader(new FileReader(new File(dataFile)));
		String line;
		data = new ArrayList<String>();
		while ((line = in.readLine()) != null) {
			data.add(line);
			System.out.println(line);
		}
		in.close();
	}
}
