
public class main {
	
	public static void main(String[] args){
		
		Guest test_user = new Guest(13523107);
	
		test_user.Rate(13523107,4.5,"Very gud");
		
		System.out.println(test_user.getUserId() + " " + test_user.getRatingFor(13523107).getRating() + " " + test_user.getRatingFor(13523107).getComment());
	}
	
}
