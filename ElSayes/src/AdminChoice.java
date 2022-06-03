
import java.util.Scanner;

public class AdminChoice implements Choice {

	@Override
	public int getChoice() {
		int choice = -1 ;
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in) ; 
		while(choice == -1) {
			System.out.println("choose a valid choice,");
			System.out.println("1.Set Slot");
			System.out.println("2.Total Income");
			System.out.println("3.Display available slots") ; 			
			System.out.println("4.Exit") ; 
			choice = scanner.nextInt() ; 
			
			if(choice < 1 || choice > 4) {
				System.out.println("Ivalid choice, please try agian") ; 
				choice = -1 ; 
			}
		}
		return choice ;
	}

}
