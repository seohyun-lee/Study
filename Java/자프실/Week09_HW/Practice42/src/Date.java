
public class Date {
	int year;
	int month;
	int day;

	public String toString(){
		String rslt = ""+this.year+"�� "+this.month+"�� "+this.day+"��";
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
}
