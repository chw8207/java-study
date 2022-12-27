package sec02.exam01;

public class StringOperatorExample {

	public static void main(String[] args) {
		// 부호 연산자
		int x = -100;
		int result1 = +x;
		int result2 = -x;
		System.out.println("result1=" + result1);
		System.out.println("result2=" + result2);
		
		byte b = 100;
//		byte result3 = -b; 연산결과가 int형으로 나오기 때문에 컴파일 에러 발생!
		int result3 = -b;
		System.out.println("result=3" + result3);
	}

}
