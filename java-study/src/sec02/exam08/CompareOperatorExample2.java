package sec02.exam08;

public class CompareOperatorExample2 {

	public static void main(String[] args) {
		// ㅣ비교연산자2
		int v2 = 1;
		double v3 = 1.0;
		System.out.println(v2 == v3);
		
		double v4 = 0.1;
		double v5 = 0.1f;
		System.out.println(v4 == v5);
		System.out.println((float)v4 == v5);
	}

}