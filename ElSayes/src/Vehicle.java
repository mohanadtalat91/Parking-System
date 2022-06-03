
public class Vehicle {
	private int idNum ; 
	private int modelYear ; 
	private String modelName ; 
	private int width ;
	private int depth ; 

	public Vehicle(int idNum, int modelYear, String modelName, int width, int depth) {
		this.idNum = idNum ;
		this.modelYear = modelYear ; 
		this.modelName = modelName ; 
		this.width = width ; 
		this.depth = depth ; 
	}
	
	public int getWidth() {
		return this.width ; 
	}
	
	public int getDepth() {
		return this.depth ; 
	}
	
	public int getIDnum() {
		return idNum ; 
	}
	
}
