package review04_2;

public class ex04 {

	public static void main(String[] args) {
		// 4x +5y =60의 해 (x, y)형태로 출력
		for(int x=1; x<=10; x++) {
			for(int y=1; y<=10; y++) {
				if((4*x+5*y)==60) {
					System.out.println("(" + x + ", " + y + ")");
				}
			}
		}
	}

}
