package sec04.exam02;

public class KeyCodeExample {

	public static void main(String[] args) throws Exception{
		// 입력된 키코드를 변수에 저장
		int keyCode;
		
		keyCode = System.in.read();
		System.out.println("kyeCode: " + keyCode);
		
		keyCode = System.in.read();
		System.out.println("kyeCode: " + keyCode);
		
		keyCode = System.in.read();
		System.out.println("kyeCode: " + keyCode);
	}

}
