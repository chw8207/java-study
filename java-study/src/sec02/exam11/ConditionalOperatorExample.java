package sec02.exam11;

public class ConditionalOperatorExample {

	public static void main(String[] args) {
		// 삼항 연산자
		int score = 85;
		char grade = (score>90)? 'A' : ((score>80)? 'B' : 'C');
		System.out.println(score + "점은 " + grade + "등급입니다.");
	}

}
