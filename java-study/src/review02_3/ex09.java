package review02_3;

public class ex09 {

	public static void main(String[] args) {
		long var1 = 2L;
		float var2 = 1.8f;
		double var3 = 2.5;
		String var4 = "3.9";
		// 9로 출력하려면 int형으로 출력해야 함
		int result = (int)var1 + (int)(var2 + var3) + (int)Double.parseDouble(var4);
		System.out.println(result);
	}

}
