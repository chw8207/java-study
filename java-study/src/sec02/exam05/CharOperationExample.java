package sec02.exam05;

public class CharOperationExample {

	public static void main(String[] args) {
		// Char타입의 산술연산
		char c1 = 'A' + 1;   // char c1이 66으로 컴파일(A=65)
		char c2 = 'A';
		
//		char c3 = c2 + 1;    // 결과가 int인데 char로 지정해서 에러 발생
		//char로 지정하고 싶으면 char타입으로 강제 형변환
		char c3 = (char) (c2 + 1);
		
		System.out.println("c1: " + c1);
		System.out.println("c2: " + c2);
		System.out.println("c3: " + c3);
	}

}
