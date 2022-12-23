package sec3_2review;

import java.util.Scanner;

public class ex11 {

	public static void main(String[] args) {
		// 아이디 비밀번호 비교
		Scanner sc = new Scanner(System.in);
		
		System.out.print("아이디:");
		String name = sc.nextLine();
		
		System.out.println("패스워드:");
		String strPassword = sc.nextLine();
		int password = Integer.parseInt(strPassword);
		
		if(name.equals("java")) {
			if(password == 12345) {
				
			}
		}
	}

}
