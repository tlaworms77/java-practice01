package practice01;

import java.util.Scanner;

public class Prob4 {
	public static void main(String[] args) {
		System.out.println("[문제 4] 문자열을 입력 받아서 아래와 같은 실행결과가 나타나도록 Prob1 클래스의 main 메쏘드를 완성 하세요. 입력 받은 문자열을 한 글자씩 증가시키며 출력하는 프로그램입니다.");
		
		Scanner sc = new Scanner(System.in);
		String inputStr = new String();
		
		System.out.print("문자열을 입력하세요. : ");
		inputStr = sc.nextLine();
		for(int i=inputStr.length(); i>=0; i--) {
			for(int j=0; j<inputStr.length()-i; j++) {
				System.out.print(inputStr.charAt(j));
			}
			System.out.println();
		}
		
		sc.close();
	}
}
