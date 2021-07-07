package 배열;

import java.util.Scanner;

public class 나머지 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[10];
		for(int i =0; i<arr.length;i++)
			arr[i] = sc.nextInt()%42;
		int count = 10;
		
		for(int i = 0; i<arr.length;i++) {
			for(int j =i+1; j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					count--;
					break;
				}	
			}
		}
		System.out.println(count);
	}
}
