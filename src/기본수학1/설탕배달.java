package 기본수학1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class 설탕배달 {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		try {
			int sugarWeight = Integer.parseInt(br.readLine());
			int fiveNum = sugarWeight/5;
			int result = calculate(fiveNum,sugarWeight);
			bw.write(Integer.toString(result));
			bw.flush();
			bw.close();
			br.close();
			
		} catch (NumberFormatException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	
	}
	
	public static int calculate(int five, int sugar) {
		if(five < 0)
			return -1;

		int elss = sugar-(five*5);
		if(elss % 3 != 0) {
			return calculate(five-1,sugar);
		}else {
			return five + elss/3;
		}
	}
}
