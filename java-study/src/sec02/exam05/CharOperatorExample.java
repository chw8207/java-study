package sec02.exam05;

public class CharOperatorExample {

	public static void main(String[] args) {
		// char타입의 산술 연산
		char c1 = 'A' + 1;
		char c2 = 'A';
//		char c3 = c2 + 1; 결과가 int타입인데 char로 지정해서 컴파일 에러 발생!!
		System.out.println("c1: " + c1);
		System.out.println("c2: " + c2);
	}

}
