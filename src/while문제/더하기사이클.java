package while����;

import java.util.Scanner;

public class ���ϱ����Ŭ {

	public static void main(String[] args) {
	/*
		0. ���ڸ� �� ���� ���ڸ� �� ���� üũ���ϰ� ���ڸ������ �տ� 0�� �����ش�.
		if(num<10)
			??
		
		1. ���ڸ� �� ���� ���ڸ� ���� ���ڸ� ���� ������.
		�� �ڸ� �� a�� ���� 10���� ���� �� floor�ؼ� ���� ��.
		�� �ڸ� �� b�� ���� %10���� �ؼ� ���� �������� ���ؼ� ���� ��.
		�ջ��� C���� a+b�� ���ؼ� ������ ��.
		�ٽ� ���꿡 ���� �� d�� b�� c%10�� �� ���� String ���·� �����ְ�, �ٽ� parseInt�� ��.
		
		2. ���ڸ� ���� �ջ� ���� ���ڸ� ���� String���·� ������.
		3. count�� ++���ְ� �ݺ�. 
		4. ���� ���ڿ� ã�ư��� �ݺ��� ����, count�� ��ȯ.
		*/
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int a,b,c,d = -1;
		int count = 0;
		a = (int) Math.floor(num/10);
		b = num%10;
		while(num != d) {
			count++;

			c = a+b;
			d =Integer.parseInt(Integer.toString(b) + Integer.toString(c%10)); 
			
			a = (int) Math.floor(d/10);
			b = d%10;
		
		}
		System.out.println(count);
	}
}
