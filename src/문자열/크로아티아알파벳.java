package ���ڿ�;

import java.util.Scanner;

public class ũ�ξ�Ƽ�ƾ��ĺ� {
public static void main(String[] args) {
		
		String[] croatiaAlpha = {"c=", "c-","dz=","d-","lj","nj","s=","z="};
		
		Scanner sc = new Scanner(System.in);
		String base = sc.next();
		
		for(int i = 0, len = croatiaAlpha.length; i<len;i++ ) {
			base = base.replaceAll(croatiaAlpha[i], "0");
		}
		System.out.println(base.length());
		
	}
}
