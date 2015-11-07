
public class Rating {

	private double rating;
	private String comment;

	public Rating(double r,String s) {
		changeRating(r,s);
	}
	
	public void changeRating(double r,String s) {
		rating = r;
		if (rating < 1.0) {
			rating = 1.0;
		}
		if (rating > 5.0) {
			rating = 5.0;
		}
		comment = s;
	}
	
	public double getRating() {
		return rating;
	}
	
	public String getComment() {
		return comment;
	}
	
}
