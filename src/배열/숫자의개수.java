package 배열;

import java.util.Scanner;

public class 숫자의개수 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		
		int target = A*B*C;
	
		int [] arr = new int[10];
		while(target>=1) {
			switch(target%10) {
			
			case 0 :
				arr[0]++;
				break;
			case 1 :
				arr[1]++;
				break;
			case 2 :
				arr[2]++;
				break;
			case 3 :
				arr[3]++;
				break;
			case 4 :
				arr[4]++;
				break;
			case 5 :
				arr[5]++;
				break;
			case 6 :
				arr[6]++;
				break;
			case 7 :
				arr[7]++;
				break;
			case 8 :
				arr[8]++;
				break;
			case 9 :
				arr[9]++;
				break;		
			}
			target /= 10;
		}
		for(int i =0; i<arr.length;i++)
			System.out.println(arr[i]);
		
	}
}
