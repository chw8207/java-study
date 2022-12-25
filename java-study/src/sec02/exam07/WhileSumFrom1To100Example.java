package sec02.exam07;

public class WhileSumFrom1To100Example {

	public static void main(String[] args) {
		// while문 사용해서 1부터 100까지 합 출력하기
		int sum = 0;
		int i = 1;
		
		while(i<=100) {
			sum += i;
			i++;
		}
		System.out.println("1~" + (i-1) + "합 : " + sum);
	}

}
