package player;


public class Player {
	private int hp;
	private int power;
	public String name;
	private String imgFile; // 이미지화일이름을 저장할 문자열
	boolean spcReady=false;
	boolean dfsReady=false;

	public Player() {
	}

	public Player(String name, int hp, int power, String imgFile) {
		this.name = name;
		this.hp = hp;
		this.power = power;
		this.imgFile = "./src/file/" + imgFile;
	}

	public void attack(Player target) {
		System.out.printf("%s가 %s를 공격합니다.\n", this.name, target.name);
		
		//target의 방어여부 판별
		if(target.dfsReady==true) {
			this.power/=2;
		}		
		//this가 special을 쓴 건지 판별
		if(this.spcReady==true) {
			this.power*=4;
		}
		
		//공격 계산 및 출력
		target.hp -= this.power;
		target.show();
		
		//원래대로
		if(target.dfsReady==true) {
			target.dfsReady=false;
			this.power*=2;
		}
		if(this.spcReady==true) {
			this.spcReady=false;
			this.power/=4;
		}
		
		//target의 hp가 0이하인 경우
		if(target.hp<=0) {
			target.hp=0;
			target.show();
			System.out.println(target.name+"(이)가 쓰러졌다!");
		}		
	}
	
	public void defense() {
		System.out.printf(this.name + "이 공격을 방어할 준비를 합니다.\n");
		this.dfsReady=true;
	}
	
	public void rest() {
		System.out.printf(this.name + "이 휴식을 취해 체력을 회복합니다.\n");
		this.hp += this.power/4;
		this.show();
	}
	
	public void special(Player target) {
		System.out.printf(this.name + "이 특수 스킬을 사용합니다.\n");
		this.spcReady=true;
		attack(target);
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
		this.imgFile = "./src/file/" + imgFile;
	}

}
