
public class Rating {

	private double rating;
	private String comment;
	private int ratedID;
	private int raterID;

	public Rating(int raterID,int ratedID,double r,String s) {
		changeRating(raterID,ratedID,r,s);
	}
	
	public void changeRating(int rID,int ID,double r,String s) {
		raterID = rID;
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
	public int getRaterID() {
		return raterID;
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
	
	public String toString() {
		String s = (raterID + " Has rated " + ratedID + " with " + rating + "/5.");
		s+= ("\nComment: " + comment);
		return s;
	}
	
}
