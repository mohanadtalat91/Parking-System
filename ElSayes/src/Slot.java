
public class Slot {
	private int width ; 
	private int depth ; 
	private int arrivalTimeSec ;
	private int arrivalTimeHour ;
	private int arrivalTimeMin ;
	private int leaveTime ;
	private int VehicleID ; 
	
	Slot(int width, int depth){
		this.width = width ; 
		this.depth = depth ; 
		this.arrivalTimeSec = -1 ;
		this.arrivalTimeHour = -1 ;
		this.arrivalTimeMin = -1 ;
		this.leaveTime = -1 ;
		this.VehicleID = -1 ; 
	}
	
	public void setArrivalTimeSec(int arrivalTimeSec) {
		this.arrivalTimeSec = arrivalTimeSec ; 
	}
	public void setArrivalTimeHour(int arrivalTimeHour) {
		this.arrivalTimeHour = arrivalTimeHour ; 
	}
	public void setArrivalTimeMin(int arrivalTimeMin) {
		this.arrivalTimeMin = arrivalTimeMin ; 
	}
	
	public void setVehicleID(int vehicleID) {
		this.VehicleID = vehicleID ; 
	}
	
	public int getArrivalTimeSec() {
		return this.arrivalTimeSec ; 
	}
	public int getArrivalTimeHour() {
		return this.arrivalTimeHour ; 
	}
	public int getArrivalTimeMin() {
		return this.arrivalTimeMin ; 
	}
	
	public void setLeaveTime(int leaveTime) {
		this.leaveTime = leaveTime  ; 
	}
	
	public int getLeaveTime() {
		return this.leaveTime ; 
	}
	
	public int getWidth() {
		return this.width ; 
	}
	
	public int getDepth() {
		return this.depth ; 
	}
	
	public int getVehicleID() {
		return this.VehicleID ; 
	}
	
}
