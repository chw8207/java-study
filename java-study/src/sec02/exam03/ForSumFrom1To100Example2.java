package sec02.exam03;

public class ForSumFrom1To100Example2 {

	public static void main(String[] args) {
		// 1부터 100까지 합 출력하기2
		int sum = 0;
		
		int i = 0;
		for(i = 1; i <= 100; i++) {
			sum += i;
		}
		
		System.out.println("1~" + (i-1) + "합 : " + sum);
	}

}
