package review04_2;

import java.util.Scanner;

public class ex07 {

	public static void main(String[] args) {
		// 예금, 출금, 조회, 종료 기능 구현	
		boolean run = true;
		int balance = 0;
		Scanner sc = new Scanner(System.in);
		
		while(run) {
			System.out.println("------------------------------------");
			System.out.println("1.예금 | 2.출고 | 3.잔고 | 4.종료");
			System.out.println("------------------------------------");
			System.out.print("선택> ");
			
			int menuNum = Integer.parseInt(sc.nextLine());
			switch(menuNum) {
			case 1 : 
				System.out.println("예금액> ");
				balance += Integer.parseInt(sc.nextLine());
				break;
			case 2 : 
				System.out.println("출금액> ");
				balance -= Integer.parseInt(sc.nextLine());
				break;
			case 3 :
				System.out.println("잔고> ");
				System.out.println(balance);
				break;
			case 4 : 
				run = false;
				
				break;
			}
			System.out.println();
			
		}
		System.out.println("프로그램 종료");
		
	}

}
