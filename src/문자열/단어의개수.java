package ���ڿ�;

import java.util.Scanner;

public class �ܾ��ǰ��� {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		String word = sc.nextLine();
		// ������ �������� ���ڿ��� �迭�� ���·� ��������.
		String[] wordA = word.split(" ");
		// �ܾ� �տ� ������ �� ��츦 üũ�� ����. 
		// split���� ���� ���� �տ� ������ �� ��쵵 �ܾ�� üũ�� �ϱ� ����.
		int count = 0;
		for(int i = 0; i<wordA.length;i++) {
			if(wordA[i] == "") {
				count +=1;
			}
		}
		// �ܾ��� ����(wordA.length)�� ����ó��(count)�� �� ���� ���.
		System.out.println(wordA.length-count);
		
		
	}
}
