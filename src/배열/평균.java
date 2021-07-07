package ¹è¿­;

import java.util.Scanner;

public class Æò±Õ {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[]arr = new int[sc.nextInt()];
		
		for(int i =0; i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		int max = arr[0];
		
		for(int i =1; i<arr.length;i++) {
			if(max<arr[i])
				max = arr[i];
		}
		
		double sum = 0.0;
		for(int i =0; i<arr.length;i++)
			sum += arr[i];
		
		
		System.out.println(((sum/max)*100)/arr.length);
	}
}
