package review04_2;

public class ex03 {

	public static void main(String[] args) {
		// 2개의 주사위를 던졌을 때 나오는 눈 (눈1, 눈2)형태로 출력
		// 눈의 합이 5가 아니면 주사위 계속 던지기
		// 눈의 합이 5이면 실행을 멈추기
		while(true) {
			int num1 = (int)(Math.random()*6)+1;
			int num2 = (int)(Math.random()*6)+1;
			System.out.println("(" + num1 + ", " + num2 + ")");
			if((num1+num2) == 5) {
				break;
			}
		}
	}

}
