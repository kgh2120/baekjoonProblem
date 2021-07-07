package while문제;

import java.util.Scanner;

public class 더하기사이클 {

	public static void main(String[] args) {
	/*
		0. 한자리 수 인지 두자리 수 인지 체크를하고 한자리수라면 앞에 0을 붙혀준다.
		if(num<10)
			??
		
		1. 두자리 수 에서 앞자리 수와 뒷자리 수를 더해줌.
		앞 자리 수 a는 값을 10으로 나눈 뒤 floor해서 얻은 값.
		뒷 자리 수 b의 값은 %10으로 해서 남은 나머지를 통해서 얻은 값.
		합산한 C값은 a+b를 통해서 도출한 값.
		다시 연산에 들어가는 값 d는 b와 c%10을 한 값을 String 형태로 더해주고, 다시 parseInt한 값.
		
		2. 뒷자리 수와 합산 값의 뒷자리 수를 String형태로 더해줌.
		3. count를 ++해주고 반복. 
		4. 원래 숫자에 찾아가면 반복은 종료, count값 반환.
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
