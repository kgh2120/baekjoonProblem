package 함수;

import java.util.Scanner;

public class 한수 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		한수 m = new 한수();
		int score = 0;
		int count = sc.nextInt();
		
		for(int i = 1; i<=count;i++)
			score += m.check(i);
		
		System.out.println(score);
	}
	
	int check(int number) {
		boolean tf = true;
		String numS = Integer.toString(number);
		String[] numA = numS.split("");
		int [] intA = new int[numA.length-1];
		for(int i =0; i<intA.length;i++) {
			intA[i] = Integer.parseInt(numA[i])-Integer.parseInt(numA[i+1]);
		}
		
		outter : for(int i = 0; i<intA.length;i++)
			for(int j =i; j<intA.length;j++) {
				if(intA[i]!=intA[j]) {
					tf = false;
					break outter;
				}
			}
		
		if(tf) {
			return 1;
		}else {
		return 0;
		}
	}
}
