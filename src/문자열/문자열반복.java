package ���ڿ�;

import java.util.Scanner;

public class ���ڿ��ݺ� {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		
		for(int i = 0; i<count; i++) {
			int repeat = sc.nextInt();
			String word = sc.next();
			String[]wordA = word.split("");
			String result = "";
			// ������ ����
			for(int k = 0; k<wordA.length;k++)
				// �ݺ�
				for(int j = 0; j<repeat; j++)
					result += wordA[k];
			
			System.out.println(result);
		}
	}
}
