package ¹è¿­;

import java.util.Scanner;

public class oxÄûÁî {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		String[] oxArr = new String[count];
		for(int i = 0; i<count; i++)
			oxArr[i] = sc.next();
		
		
		for(int i = 0; i<oxArr.length;i++) {
			int score = 0;
			String[] tests = oxArr[i].split("X");
			for(int a =0; a<tests.length;a++) {
				for(int j =0; j<tests[a].length();j++) {
					score += (j+1);
				}
			}
			System.out.println(score);
		}	
		
	}
}
