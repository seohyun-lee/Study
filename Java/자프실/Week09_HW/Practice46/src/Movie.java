
public class Movie {
	private String title;
	private String director;
	private int score;
	private int year;

	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String toString() {
		return "�Է��� ��ȭ�� �����Դϴ�."+"\n����: "+this.getTitle()+"\n����: "+this.getScore()
			+"\n����: "+this.getDirector()+"\n�����⵵: "+this.getYear()+"\n";
	}
}
