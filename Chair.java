
public class Chair {
	
	private int weight;
	
	public Chair() {
		this.weight = (int) (Math.random() * (200 - 1)) + 1;
	}
	
	public int getWeight() {
		return weight;
	}
}
