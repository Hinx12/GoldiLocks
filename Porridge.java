
public class Porridge {
	
	private int temp;
	
	public Porridge() {
		this.temp = (int) (Math.random() * (200 - 1)) + 1;
	}
	
	public int getTemp() {
		return temp;
	}
}
