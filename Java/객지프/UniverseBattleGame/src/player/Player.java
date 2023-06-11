package player;


public class Player {
	private int hp;
	private int power;
	public String name;
	private String imgFile; // �̹���ȭ���̸��� ������ ���ڿ�
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
		System.out.printf("%s�� %s�� �����մϴ�.\n", this.name, target.name);
		
		//target�� ���� �Ǻ�
		if(target.dfsReady==true) {
			this.power/=2;
		}		
		//this�� special�� �� ���� �Ǻ�
		if(this.spcReady==true) {
			this.power*=4;
		}
		
		//���� ��� �� ���
		target.hp -= this.power;
		target.show();
		
		//�������
		if(target.dfsReady==true) {
			target.dfsReady=false;
			this.power*=2;
		}
		if(this.spcReady==true) {
			this.spcReady=false;
			this.power/=4;
		}
		
		//target�� hp�� 0������ ���
		if(target.hp<=0) {
			target.hp=0;
			target.show();
			System.out.println(target.name+"(��)�� ��������!");
		}		
	}
	
	public void defense() {
		System.out.printf(this.name + "�� ������ ����� �غ� �մϴ�.\n");
		this.dfsReady=true;
	}
	
	public void rest() {
		System.out.printf(this.name + "�� �޽��� ���� ü���� ȸ���մϴ�.\n");
		this.hp += this.power/4;
		this.show();
	}
	
	public void special(Player target) {
		System.out.printf(this.name + "�� Ư�� ��ų�� ����մϴ�.\n");
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
