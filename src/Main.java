import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;


public class Main {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		try {
			String condition = br.readLine();
			String[] conditions =condition.split(" ");
			int dayH = Integer.parseInt(conditions[0]);
			int nightH = Integer.parseInt(conditions[1]);
			int goal = Integer.parseInt(conditions[2]);
			
			System.out.println(findPath(dayH,nightH,goal,0));
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
	}
	
	public static int findPath(int dayH,int nightH, int goal, int depth) {
		if(goal<=0) {
			return -1;
		}
		if( (dayH-nightH)*(depth-1)+nightH < goal && (depth)*(dayH-nightH)+nightH >= goal) {
			return depth;
		}else {
			return findPath(dayH,nightH,goal,depth+1);
		}
		
		
	}

}
