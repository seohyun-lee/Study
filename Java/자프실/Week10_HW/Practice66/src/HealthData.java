
public class HealthData<W, H> {
	private String name;
	private W weight;
	private H height;
	
	public HealthData(String name, W weight, H height) {
		this.setName(name);
		this.setW(weight);
		this.setH(height);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	void setW(W w) {
		this.weight = w;
	}
	W getW() {
		return weight;
	}

	void setH(H h) {
		this.height = h;
	}
	H getH() {
		return height;
	}
	
	public String toString() {
		return "("+getName()+", "+getH()+", "+getW()+")";
	}
}
