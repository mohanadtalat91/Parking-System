import java.util.ArrayList;

public class FirstConfiguration implements Configuration {

	@Override
	public int getIndexSlot(ArrayList<Slot> slots, Vehicle vehicle) {
		int ans = 0 ; 
		
		for(int i=0; i<slots.size(); i++) {
			if(slots.get(i).getArrivalTimeSec() == -1) {
				return i+1 ; 
			}
		}
		return ans ;  
	}

}
