package 기본수학1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class 큰수 {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		try {

			String condition = br.readLine();
			String[] conditions = condition.split(" ");

			int size = Math.max(conditions[0].length(), conditions[1].length());
			int[] container = new int[size+1];

			for (int i = 0; i < size; i++) {
				int a = 0;
				if (conditions[0].length() <= i) {
					a = Integer.parseInt(conditions[1].charAt(conditions[1].length() - i-1) + "");
				}
				else if (conditions[1].length() <= i) {
					a = Integer.parseInt(conditions[0].charAt(conditions[0].length() - i-1) + "");
				}else if(conditions[0].length() <= i && conditions[1].length() <= i) {
					a = 0;
				}
				else {
					a = Integer.parseInt(conditions[0].charAt(conditions[0].length() - i-1) + "") +
							Integer.parseInt(conditions[1].charAt(conditions[1].length() - i-1) + "");
					
				}
				int b = container[i] + a;
				container[i] = b%10;
				if(b>=10) {
					container[i+1] += 1;
				}
			}
			
			String result = "";
			for(int i = container.length-1; i>=0;i--) {
				result += container[i];
				
			}
			if(result.charAt(0) == '0') {
				result = result.substring(1);
			}
			
			bw.write(result);
			
			bw.flush();
			bw.close();
			br.close();

		} catch (NumberFormatException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
