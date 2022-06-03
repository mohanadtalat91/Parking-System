import java.util.Scanner;

public class SlotsNum implements Choice{

	@Override
	public int getChoice() {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in) ; 
		int numOfSlots = -1 ; 
		while(numOfSlots == -1) {
			System.out.println("Hi Sir, Plz enter the number of slots do you want : ");
			numOfSlots = scanner.nextInt() ;
			if(numOfSlots < 1) {
				System.out.println("You entered a invalid number, plz try again:- ");
				numOfSlots = -1 ; 
			}
		}
		return numOfSlots ; 
	}

}
