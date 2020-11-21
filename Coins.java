public class Coins {
	
	private int year;
	private String country;
	
	
	public Coins() {}
	public Coins (String country, int year) {
		this.country = country;
		this.year = year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	public int getYear() {
		return year;
	}
	
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
}