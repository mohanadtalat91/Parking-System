
import java.util.Scanner;

public class RunChoice implements Choice{

	@Override
	public int getChoice() {
		int choice1 = -1 ;
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in) ; 
		while(choice1 == -1) {
			System.out.println("choose a valid choice,");
			System.out.println("1.Admin");
			System.out.println("2.User");
			System.out.println("3.Exit") ; 
			choice1 = scanner.nextInt() ; 
			
			if(choice1 < 1 || choice1 > 3) {
				System.out.println("Ivalid choice, please try agian") ; 
				choice1 = -1 ; 
			}
		}
		return choice1 ;
	}

}
