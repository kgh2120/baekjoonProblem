package �Լ�;

public class �����ѹ� {

	public static void main(String[] args) {
		�����ѹ� m = new �����ѹ�();
		boolean tf = false;
		int[]arr = new int[10000];
		for(int i = 0; i<arr.length;i++)
			arr[i] = m.selfNum(i+1);
		
		for(int j = 1; j<=10000;j++) {
			
		
			for(int i =0; i<arr.length;i++) {
				if(j==arr[i]) {
					tf = false;
					break;
				}else {
					tf = true;
				}
			}
			if(tf) {
				System.out.println(j);
			}
		}	
	}
	
	int selfNum(int a) {
		int rtv = a;
		String aNum = Integer.toString(a);
		String[] aNums = aNum.split(""); 
		for(int i = 0; i<aNums.length;i++) {
			rtv += Integer.parseInt(aNums[i]);
		}
		return rtv;
	}
}
