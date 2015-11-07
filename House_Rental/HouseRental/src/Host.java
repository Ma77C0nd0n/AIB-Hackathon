
public class Host extends User {

	public Host(Integer uid) {
		super(uid);
		//address, price, available, userHostRating
		}
		
	private String Address(){
		return default_address;
	}
	
	private double Price(){
		return default_price;
	}
	
	private boolean Availability(){
		return availability;
	}
	
	private double UserHostRating(){
		return -1;	//-1 implies no rating is available for this user
	}

	
	private static double MIN_RATING = 1;
	private static double MAX_RATING = 5;
	private double default_price = 0;
	private String default_address = "My House";
	private boolean availability = false;
	
}
