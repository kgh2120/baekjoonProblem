package 문자열;

import java.util.Scanner;

public class 단어공부 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String word = sc.next();
		// 모든 알파벳을 대문자로해서 대,소문자를 통일시켜주었음.
		String upperWord = word.toUpperCase();
		// 알파벳별 count체크
		int[]countA = new int[26];
		for(int i = 0; i<upperWord.length();i++) {
			char c = upperWord.charAt(i);
			int ascii = c;
			
			countA[ascii-65] += 1;
		}
		
		// max값 찾기
		int max = countA[0];
		int index = 0;
	
		for(int i = 1; i<countA.length;i++) {
			if(max<countA[i]) {
				max = countA[i];
				index = i;
			}
		}
		// 중복체크
		boolean duplicate = false;
		for(int i = 0; i<countA.length;i++) {
			// max의 위치가 아닌데, max와 count가 같은 것이 있다면 중복이라고 체크해주기.
			if(max==countA[i]) {
				if(i != index)
				duplicate=true;
			}
		}
		// 알파벳카운트 배열의 index에 65를 더해서 대문자 알파벳을 추출함.
		char alphabet = (char) (index+65);
		if(duplicate)
			System.out.println('?');
		else
			System.out.println(alphabet);
		
	}
}
