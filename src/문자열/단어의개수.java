package 문자열;

import java.util.Scanner;

public class 단어의개수 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		String word = sc.nextLine();
		// 공백을 기준으로 문자열을 배열의 형태로 나누었음.
		String[] wordA = word.split(" ");
		// 단어 앞에 공백이 들어간 경우를 체크를 해줌. 
		// split으로 인해 문자 앞에 공백이 들어간 경우도 단어로 체크를 하기 떄문.
		int count = 0;
		for(int i = 0; i<wordA.length;i++) {
			if(wordA[i] == "") {
				count +=1;
			}
		}
		// 단어의 개수(wordA.length)와 예외처리(count)를 뺀 값을 출력.
		System.out.println(wordA.length-count);
		
		
	}
}
