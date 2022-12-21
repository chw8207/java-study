package sec04.review;

import java.util.Scanner;

public class numberplus {

	public static void main(String[] args) {
		// 키보드로 입력한 두 수 덧셈결과 출력하기
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫 번째 수: ");
		String strNum1 = sc.nextLine();
		
		System.out.print("두 번째 수: ");
		String strNum2 = sc.nextLine();
		
		// 문자열 정수로 변환
		int num1 = Integer.parseInt(strNum1);
		int num2 = Integer.parseInt(strNum2);
		int result = num1 + num2;
		System.out.println("덧셈 결과:" + result);
	}

}
