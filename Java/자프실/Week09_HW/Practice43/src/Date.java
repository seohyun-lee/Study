
public class Date {
	private int year;
	private int month;
	private int day;

	public String toString(){
		String rslt = ""+this.year+"³â "+this.month+"¿ù "+this.day+"ÀÏ";
		return rslt;
	}

	public void setYear(int y) {
		this.year = y;
	}

	public void setMonth(int m) {
		this.month = m;
	}
	
	public void setDay(int d) {
		this.day = d;
	}

	public int getYear() {
		return this.year;
	}

	public int getMonth() {
		return this.month;
	}
	
	public int getDay() {
		return this.day;
	}
}
