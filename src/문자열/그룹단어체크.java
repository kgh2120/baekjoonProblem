package 문자열;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class 그룹단어체크 {
public static void main(String[] args) {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		
		try {
			String count;
			count = br.readLine();
			int countN = Integer.parseInt(count);
			
			int seqNum = 0;
			for(int i = 0; i<countN;i++) {
				boolean isSeq = true;
				String seqWord = br.readLine();
				ArrayList<String> seqList = new ArrayList<>();
				seqList.add(seqWord.charAt(0)+"");
				for(int j = 1; j<seqWord.length();j++) {
					if(seqList.contains(seqWord.charAt(j)+"")) {
						if(seqWord.charAt(j)!=seqWord.charAt(j-1)) {
							isSeq = false;
							break;
						}
					}else {
						seqList.add(seqWord.charAt(j)+"");
					}
				}
				
				if(isSeq) {
					seqNum++;
				}
			}
			
			bw.write(seqNum+"");
			bw.flush();
			br.close();
			bw.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		
		
	}
}
