package 배열;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;

public class 평균은넘곘지 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
	
		for(int i = 0; i<count; i++) {
			int student = sc.nextInt();
			int[]arr = new int[student];
			// 배열 채우기
			double sum = 0.0;
			double avg = 0.0;
			for(int j =0; j<student;j++) {
				arr[j] = sc.nextInt();
				sum += arr[j];
			}
			// 배열 평균 구하기
			avg = sum/student;
			
			double upStudent = 0.0;
			
			for(int j =0; j<student;j++) {
				if(arr[j]>avg)
					upStudent = upStudent +1;
			}
			
			double perc = upStudent/student*100;
			
			DecimalFormat df = new DecimalFormat("0.000");
			df.setRoundingMode(RoundingMode.HALF_EVEN);
			String percent = df.format(perc);
			System.out.println(percent+"%");
			
		}
		
	}
}
