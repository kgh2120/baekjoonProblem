package ���ڿ�;

import java.util.Scanner;

public class �ܾ���� {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String word = sc.next();
		// ��� ���ĺ��� �빮�ڷ��ؼ� ��,�ҹ��ڸ� ���Ͻ����־���.
		String upperWord = word.toUpperCase();
		// ���ĺ��� countüũ
		int[]countA = new int[26];
		for(int i = 0; i<upperWord.length();i++) {
			char c = upperWord.charAt(i);
			int ascii = c;
			
			countA[ascii-65] += 1;
		}
		
		// max�� ã��
		int max = countA[0];
		int index = 0;
	
		for(int i = 1; i<countA.length;i++) {
			if(max<countA[i]) {
				max = countA[i];
				index = i;
			}
		}
		// �ߺ�üũ
		boolean duplicate = false;
		for(int i = 0; i<countA.length;i++) {
			// max�� ��ġ�� �ƴѵ�, max�� count�� ���� ���� �ִٸ� �ߺ��̶�� üũ���ֱ�.
			if(max==countA[i]) {
				if(i != index)
				duplicate=true;
			}
		}
		// ���ĺ�ī��Ʈ �迭�� index�� 65�� ���ؼ� �빮�� ���ĺ��� ������.
		char alphabet = (char) (index+65);
		if(duplicate)
			System.out.println('?');
		else
			System.out.println(alphabet);
		
	}
}
