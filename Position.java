
public class Position {
	
	private int ID;
	private Chair chair;
	private Porridge porridge;
	
	public Position(int ID, Chair chair, Porridge porridge) {
		this.ID = ID;
		this.chair = chair;
		this.porridge = porridge;
	}
	
	public int getChairWeight() {
		return chair.getWeight();
	}
	
	public int getPorridgeTemp() {
		return porridge.getTemp();
	}
	
	public String toString() {
		return "ID: " + ID + ", Chair Weight " + chair.getWeight() + ", Porirdge Temp: " + porridge.getTemp(); 
	}	
}
