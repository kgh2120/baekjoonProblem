package �迭;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;

public class ������с��� {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
	
		for(int i = 0; i<count; i++) {
			int student = sc.nextInt();
			int[]arr = new int[student];
			// �迭 ä���
			double sum = 0.0;
			double avg = 0.0;
			for(int j =0; j<student;j++) {
				arr[j] = sc.nextInt();
				sum += arr[j];
			}
			// �迭 ��� ���ϱ�
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
