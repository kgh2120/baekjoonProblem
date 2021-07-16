package 기본수학1;

import java.util.Scanner;

public class 분수찾기 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int target = sc.nextInt();
		int depth = findPath(target,0);
	
		int count = target - (depth * (depth-1)/2);
		String result = "";
		if(depth%2 == 0) {
		
			result = count + "/"+(depth+1-count);
			
		}else {
			 result = (depth+1-count) + "/"+count;
		} 
			
		System.out.println(result);
	}
	
	public static int findPath(int target, int depth) {
		if(target<=0)
			return -1;
		if((depth * (depth-1)/2) < target && (depth * (depth+1)/2)>= target)
			return depth;
		else{
			return findPath(target, depth+1);
		}
	}
}
