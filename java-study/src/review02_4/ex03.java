package review02_4;

import java.util.Scanner;

public class ex03 {

	public static void main(String[] args) {
		// 이름, 주민번호 앞 6자리, 전화번호 입력받고 출력하기
		Scanner sc = new Scanner(System.in);
		
		System.out.println("[필수 정보 입력");
		
		System.out.print("1. 이름: ");
		String name = sc.nextLine();
		
		System.out.print("2. 주민번호 앞 6자리: ");
		String idn = sc.nextLine();
		
		System.out.print("3. 전화번호: ");
		String tel = sc.nextLine();
		
		System.out.println();
		
		System.out.println("[입력한 내용]");
		System.out.println(name);
		System.out.println(idn);
		System.out.println(tel);
		
	}

}
