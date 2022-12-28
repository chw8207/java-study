package review03_2;

public class ex04 {

	public static void main(String[] args) {
		int pecils = 534;
		int students = 30;
		
		// 학생 1명이 가지는 연필 개수
		int pencilPerStudent = (534/30);
		System.out.println(pencilPerStudent);
		
		// 남은 연필 개수
		int pencilsLeft = (534%30);
		System.out.println(pencilsLeft);
	}

}
