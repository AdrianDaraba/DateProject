package projectDate;

public class Date {
	private int year;
	private int month;
	private int day;

	public Date(int year, int month, int day) {
		this.year = year;
		this.month = month;
		this.day = day;
	}

	public void addDays(int days) {
		if(days < 0)
			throw new IllegalArgumentException();
		
		this.day += days;
		this.month += day / 31;
		this.year += month / 12 + day / 365;
		
		this.day = day % 31;
		this.month = month % 12;
	}
	
	public String toString() {
		return year+"/"+month+"/"+day;
	}
}