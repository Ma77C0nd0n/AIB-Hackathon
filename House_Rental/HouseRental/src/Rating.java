
public class Rating {

	private double rating;
	private String comment;
	private int ratedID;

	public Rating(int ID,double r,String s) {
		changeRating(ID,r,s);
	}
	
	public void changeRating(int ID,double r,String s) {
		ratedID = ID;
		rating = r;
		if (rating < 1.0) {
			rating = 1.0;
		}
		if (rating > 5.0) {
			rating = 5.0;
		}
		comment = s;
	}
	public int getRatedID() {
		return ratedID;
	}
	
	public double getRating() {
		return rating;
	}
	
	public String getComment() {
		return comment;
	}
	
}
