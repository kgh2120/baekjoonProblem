package 문자열;

import java.util.Scanner;

public class 상수 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String wordA = sc.next();
		String wordB = sc.next();
		
		String newA = "";
		String newB = "";
		for(int i = 2; i>=0; i--) {
			newA += wordA.charAt(i);
			newB += wordB.charAt(i);
		}
		int numA = Integer.parseInt(newA);
		int numB = Integer.parseInt(newB);
		
		System.out.println(numA > numB ? numA : numB);
		
	}



}
