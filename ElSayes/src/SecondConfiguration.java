import java.util.ArrayList;

public class SecondConfiguration implements Configuration{

	@Override
	public int getIndexSlot(ArrayList<Slot> slots, Vehicle vehcile) {
		int ans = 0 ; 
		Slot eachSlot ; 
		for(int i=0; i<slots.size(); i++) {
			eachSlot = slots.get(i) ; 
			if(eachSlot.getWidth() >= vehcile.getWidth() && eachSlot.getDepth() >= vehcile.getDepth() && eachSlot.getVehicleID() == -1) {
				return i+1 ; 
			}
		}
		return ans ; 
	}

}
