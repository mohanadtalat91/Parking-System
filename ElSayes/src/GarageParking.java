import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Scanner;


public class GarageParking {
	private static Choice chMenu ;
	private static Configuration conf ; 
	private static ArrayList<Slot> slots ; 
	private static int NumOfSlots ; 
	
	GarageParking(){
		slots = new ArrayList<Slot>() ;
		NumOfSlots = 0 ; 
		chMenu = null ; 
		conf = null ; 
	}
	public void Run() {
		System.out.println("Welcome to garage parking application:-");
		while(true) {
			chMenu = new RunChoice() ; 
			int choice = chMenu.getChoice() ; 
			if(choice == 1) {
				Admin() ; 
			}
			else if(choice == 2) {
				User() ; 
			}
			else {
				System.out.println("Thanks for using applicatin")  ;
				break ; 
			}
		}
		
	}
	
	public static void Admin() {
		while(true) {
			chMenu = new AdminChoice() ; 
			int choice = chMenu.getChoice() ; 
			if(choice == 1) {
				setSlots() ; 
			}
			else if(choice == 2) {
				totalIncome() ; 
			}
			else if(choice == 3) {
				disAvailableSlots() ; 
			}
			else {
				System.out.println("Thanks for using applicatin")  ;
				break ; 
			}
		}
	}
	
	public static void User() {
		while(true) {
			chMenu = new UserChoice() ; 
			int choice = chMenu.getChoice() ; 
			if(choice == 1) {
				parkIn() ; 
			}
			else if(choice == 2) {
				parkOut() ; 
			}
			else {
				System.out.println("Thanks for using applicatin")  ;
				break ; 
			}
		}
	}
	
	public static void setSlots() {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in) ; 
		chMenu = new SlotsNum() ; 
		NumOfSlots = chMenu.getChoice() ; 
		for(int i=0; i<NumOfSlots; i++) {
			System.out.println("Please sir enter the width & depth of " + (i+1) + " Slot");
			int wid = scanner.nextInt() ; 
			int dep = scanner.nextInt() ; 
			slots.add(new Slot(wid, dep)) ; 
		}
		System.out.println("The slots added successfully !!");

	}
	
	public static void totalIncome() {
		int totalFees = 0 ; 
		for(int i=0; i<slots.size(); i++) {
			if(slots.get(i).getArrivalTimeHour() != -1) {
				int getLeaveHour = getLocalTimeInHour(LocalTime.now().toString()) + 1 ;
				totalFees = 5*(getLeaveHour-slots.get(i).getArrivalTimeHour()) ; 
			}
		}
		System.out.println("The total income is " + totalFees) ; 
	}
	
	public static void disAvailableSlots() {
		Slot oneSlot ; 
		for(int i=0; i<NumOfSlots; i++) {
			oneSlot = slots.get(i) ; 
			if(oneSlot.getArrivalTimeSec() == -1) {
				System.out.println("The " + (i+1) + " slot with width & depth -->" + oneSlot.getWidth() + " & " + oneSlot.getDepth()) ; 
			}
		}
	}
	
	public static void parkIn() {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in) ; 
		System.out.println("Hi, Sir Plz enter the vehicle's (Id num, model year, width, depth, model name") ; 
		int idNum = scanner.nextInt(), modelYear = scanner.nextInt(), width = scanner.nextInt(), depth = scanner.nextInt() ; 
		String modelName = scanner.nextLine() ; 
		Vehicle vehicle = new Vehicle(idNum, modelYear, modelName, width, depth) ; 
		
		conf = new FirstConfiguration() ; 
		int firstConf = conf.getIndexSlot(slots, vehicle) ; 
		conf = new SecondConfiguration() ; 
		int secondConf = conf.getIndexSlot(slots, vehicle) ; 
		int emptySlot = secondConf ; 
		
		if(firstConf == 0) {
			System.out.println("Sorry, Sir we don't have enough space.") ; 
		}
		else if(secondConf == 0) {
			System.out.println("Sorry, Sir we don't have any slot to fit your car."); 
		}
		else {
			emptySlot-- ; 
			slots.get(emptySlot).setVehicleID(idNum);
			int getArrivalSec = getLocalTimeInSec(LocalTime.now().toString()) ; 
			slots.get(emptySlot).setArrivalTimeSec(getArrivalSec);
			int getArrivalMin = getLocalTimeInMin(LocalTime.now().toString()) ; 
			slots.get(emptySlot).setArrivalTimeMin(getArrivalMin);
			int getArrivalHour = getLocalTimeInHour(LocalTime.now().toString()) ; 
			slots.get(emptySlot).setArrivalTimeHour(getArrivalHour);
			
			System.out.println("congrate Sir, you successfully park in") ; 
		}
	}
	public static void parkOut() {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in) ; 
		System.out.println("Hi, Sir Plz enter the vehicle's (Id num)") ; 
		int idNum = scanner.nextInt() ;
		int totalFees = 0 ;
		boolean isFound = false ; 
		
		for(int i=0; i<slots.size(); i++) {
			if(slots.get(i).getVehicleID() == idNum) {
				int getLeaveHour = getLocalTimeInHour(LocalTime.now().toString()) + 1 ;
				totalFees = 5*Math.abs(getLeaveHour-slots.get(i).getArrivalTimeHour()) ; 
				
				slots.get(i).setArrivalTimeHour(-1) ;
				slots.get(i).setArrivalTimeMin(-1);
				slots.get(i).setArrivalTimeSec(-1);
				slots.get(i).setVehicleID(-1);
				isFound = true ; 
				break ;
			}
		}
		if(isFound) {
			System.out.println("You park out successefully plz pay : " + totalFees) ; 
		}
		else {
			System.out.println("The vehicle with ID " + idNum + " is not found !!") ; 
		}
	}
	
	static int getLocalTimeInHour(String LocalTime) {
		String str = "" ;
		str += LocalTime.charAt(0) ;
		str += LocalTime.charAt(1) ;
		return Integer.parseInt(str) ; 
	}
	
	static int getLocalTimeInMin(String LocalTime) {
		String str = "" ;
		str += LocalTime.charAt(3) ;
		str += LocalTime.charAt(4) ;
		return Integer.parseInt(str) ; 
	}
	
	static int getLocalTimeInSec(String LocalTime) {
		String str = "" ;
		str += LocalTime.charAt(6) ;
		str += LocalTime.charAt(7) ;
		return Integer.parseInt(str) ; 
	}
}
