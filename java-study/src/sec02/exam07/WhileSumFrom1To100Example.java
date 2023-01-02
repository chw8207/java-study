package sec02.exam07;

public class WhileSumFrom1To100Example {

	public static void main(String[] args) {
		// 1~100합 출력하기
		int sum = 0;
		
		int i = 0;
		
		while(i<=100) {
			sum += i;
			i++;
		}
		
		System.out.println("1~" + (i-1) + " 합 : " + sum);
	}

}
