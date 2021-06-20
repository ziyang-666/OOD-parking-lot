
public enum VehicleSize {
	Compact(1),
	Large(2);
	
	private int size;
	
	private VehicleSize(int size) {
		this.size = size;
	}
	
	public int getSize() {
		return this.size;
	}
}
