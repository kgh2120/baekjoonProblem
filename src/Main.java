import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int length  = sc.nextInt();
		
		int[] arr = new int[length];
		for(int i = 0; i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		
		int max = arr[0];
		int min = arr[0];
		
		for(int i =1; i<arr.length;i++) {
			if(max<arr[i])
				max = arr[i];
			if(min>arr[i])
				min=arr[i];
		}
		
		System.out.println(min + " "+ max);
		
	}
}
