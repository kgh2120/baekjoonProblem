package 문자열;

import java.util.Scanner;

public class 전화다이얼 {
public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String wordA = sc.next();
		
		int time = 0;
		for(int i = 0; i<wordA.length();i++) {
			char word = wordA.charAt(i);
			
			int index = word - 65;
			
			int button = (index/3)+2;
			
			if(index>=18) {
				if(index%3 == 0 || index == 25)
					button = index/3 +1;
			}
			time += button+1;
		}
		System.out.println(time);
	}
}
