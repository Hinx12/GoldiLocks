import java.util.ArrayList;


public class Goldilocks {
	
	private ArrayList<Position> positions;
	private int maxWeight;
	private int maxTemp;
	
	public Goldilocks(int maxWeight, int maxTemp) {
		this.maxWeight = maxWeight;
		this.maxTemp = maxTemp;
	}

	public static void main(String[] args) {
		
		Goldilocks goldi = new Goldilocks(0, 0);
		goldi.createPositions();
		goldi.printPositions();
		goldi.checkPositionsForGoldi();
	}
	
	public void createPositions() {
		
		positions = new ArrayList<Position>();
		
		for (int i = 1; i <= 100; i++) {
			Chair chair = new Chair();
			Porridge porridge = new Porridge();
			Position position = new Position(i, chair, porridge);
			positions.add(position);
		}
	}
	
	public void printPositions() {
		
		for (Position position : positions) {
			System.out.println(position);
		}
	}
	
	public void checkPositionsForGoldi() {
		
		System.out.println("Available Seats for Goldi");
		
		for (Position position : positions) {
			if (maxWeight <= position.getChairWeight() && maxTemp <= position.getPorridgeTemp()) {
				System.out.println(position);
			} else {
				continue;
			}
		}
	}

}
