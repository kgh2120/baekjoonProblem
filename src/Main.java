import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testCase = sc.nextInt();
		
		for(int i = 0; i<testCase; i++) {
			
			String condition = sc.nextLine();
			String [] conditions = condition.split(" ");
			int x = Integer.parseInt(conditions[0]);
			int y = Integer.parseInt(conditions[1]);
			
			int range = y-x;
			
			
		}
		

	}

}
