package player;

public class Player {
	private int hp;
	private int power;
	public String name;
	private String imgFile;

	public Player() {
	}

	public Player(String name, int hp, int power, String imgFile) {
		this.name = name;
		this.hp = hp;
		this.power = power;
		this.imgFile = "./file/" + imgFile;
	}

	public void attack(Player target) {
		System.out.printf("%s이 %s을 공격합니다.\n", this.name, target.name);
		if(target.hp>0) {
			target.hp -= this.power;
			target.show();
		} else {
			System.out.println("배틀이 끝났습니다. 공격할 수 없습니다.");
		}
	}

	public void show() {
		System.out.printf("%20s : %10d  %10d\n", this.name, this.hp, this.power);

	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getPower() {
		return power;
	}

	public void setPower(int power) {
		this.power = power;
	}

	public String getImgFile() {
		return this.imgFile;
	}

	public void setImgFile(String imgFile) {
		this.imgFile = "./file/" + imgFile;
	}

}
