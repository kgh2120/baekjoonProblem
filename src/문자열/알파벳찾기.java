package 문자열;

import java.util.Scanner;

public class 알파벳찾기 {
	public static void main(String[] args) {
		// 문제 입력 받기
		Scanner sc = new Scanner(System.in);
		String word = sc.next();
		
		// 알파벳 순서 배열 초기값 설정
		int[] alphaA = new int [26];
		for(int i = 0; i<alphaA.length;i++)
			alphaA[i] = -1;
		// 입력받은 문자의 위치를 배열에 넣어준다.
		// 위치는 charAt으로 구하고, 알파벳의 순서(a~z)는 해당 알파벳의 아스키코드값 - 97('a')로 구했음.
		for(int i = 0; i<word.length();i++) {
			char ascii = word.charAt(i);
			int ascN = ascii;
			// 알파벳 중복처리
			if(alphaA[ascN-97] == -1) {
				alphaA[ascN-97] = i;
			}
		}
		String answer = "";
		for(int i =0; i<alphaA.length;i++)
			answer += alphaA[i] + " ";
		
		System.out.println(answer);
	}
}
