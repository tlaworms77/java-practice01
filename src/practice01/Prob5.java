package practice01;

public class Prob5 {
	final static int MAX = 100;
	public static void main(String[] args) {
		System.out.println("[문제 5] 반복문을 이용하여 369게임에서 박수를 쳐야 하는 경우의 수를 순서대로 화면에 출력해보세요. 1부터 99까지만 실행하세요.");

		for (int i = 1; i < MAX; i++) {
			if (i % 10 == 3 || i % 10 == 6 || i % 10 == 9) {
				System.out.print(i + " ");
				clappingCall();
				if (i / 10 == 3 || i / 10 == 6 || i / 10 == 9)
					clappingCall();

				System.out.println();
			} else if (i / 10 == 3 || i / 10 == 6 || i / 10 == 9) {
				System.out.print(i + " ");
				clappingCall();

				System.out.println();
			}
		}
	}

	public static void clappingCall() {
		System.out.print("짝");
	}

}
