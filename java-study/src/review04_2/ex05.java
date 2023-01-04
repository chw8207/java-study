package review04_2;

public class ex05 {

	public static void main(String[] args) {
		// 이등변삼각형1
		for(int i=1; i<5; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print('*');
				if(i==j) {
					System.out.println();
				}
			}
		}
	}

}
