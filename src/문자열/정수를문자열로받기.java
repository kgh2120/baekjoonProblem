package ���ڿ�;

import java.util.Scanner;

public class ���������ڿ��ιޱ� {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int count = sc.nextInt();
		
		String numberS = sc.next();
		String[]numA = numberS.split("");
		int sum = 0;
		for(int i = 0; i<count; i++)
			sum += Integer.parseInt(numA[i]);
		
		System.out.println(sum);
	}
}
