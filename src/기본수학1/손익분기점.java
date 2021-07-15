package 기본수학1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class 손익분기점 {
public static void main(String[] args) {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		try {
			String condition = br.readLine();
			String[]conditions = condition.split(" ");
			int fixed = Integer.parseInt(conditions[0]);
			int varied = Integer.parseInt(conditions[1]);
			int price = Integer.parseInt(conditions[2]);
			int diff = 0;
			if(price>varied) {
				diff = fixed/(price-varied);
				diff++;
				bw.write(diff+"");

			}else {
				bw.write(-1+"");
			}
			bw.flush();
			bw.close();
			br.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
