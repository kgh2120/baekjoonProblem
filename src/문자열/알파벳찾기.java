package ���ڿ�;

import java.util.Scanner;

public class ���ĺ�ã�� {
	public static void main(String[] args) {
		// ���� �Է� �ޱ�
		Scanner sc = new Scanner(System.in);
		String word = sc.next();
		
		// ���ĺ� ���� �迭 �ʱⰪ ����
		int[] alphaA = new int [26];
		for(int i = 0; i<alphaA.length;i++)
			alphaA[i] = -1;
		// �Է¹��� ������ ��ġ�� �迭�� �־��ش�.
		// ��ġ�� charAt���� ���ϰ�, ���ĺ��� ����(a~z)�� �ش� ���ĺ��� �ƽ�Ű�ڵ尪 - 97('a')�� ������.
		for(int i = 0; i<word.length();i++) {
			char ascii = word.charAt(i);
			int ascN = ascii;
			// ���ĺ� �ߺ�ó��
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
