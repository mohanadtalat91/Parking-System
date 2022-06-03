
import java.util.Scanner;

public class UserChoice implements Choice{

	@Override
	public int getChoice() {
		int choice2 = -1 ;
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in) ; 
		while(choice2 == -1) {
			System.out.println("choose a valid choice,");
			System.out.println("1.Park In");
			System.out.println("2.Park Out");
			System.out.println("3.Exit") ; 
			choice2 = scanner.nextInt() ; 
			
			if(choice2 < 1 || choice2 > 3) {
				System.out.println("Ivalid choice, please try agian") ; 
				choice2 = -1 ; 
			}
		}
		return choice2 ;
	}

}
