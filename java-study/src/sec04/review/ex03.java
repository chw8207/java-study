package sec04.review;

import java.util.Scanner;

public class ex03 {

	public static void main(String[] args) {
		// 이름, 주민번호 앞 6자리, 전화번호를 
		// 키보드에서 입력받고 출력하기
		Scanner sc = new Scanner(System.in);
		System.out.println("[필수 정보 입력]");
		
		// 1. 이름
		System.out.print("이름: ");
		String name = sc.nextLine();
		
		// 2. 주민번호 앞 6자리
		System.out.print("주민번호 앞 6자리: ");
		String bdn = sc.nextLine();
		
		// 3. 전화번호
		System.out.print("전화번호: ");
		String tel = sc.nextLine();
		
		System.out.println("[입력한 내용]");
		System.out.println(name);
		System.out.println(bdn);
		System.out.println(tel);
	}

}
