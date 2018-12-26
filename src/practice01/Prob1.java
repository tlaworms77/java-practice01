package practice01;

import java.util.Scanner;

public class Prob1 {
	public static void main(String[] args) {
		System.out.println("[문제1] java.util.Scanner 클래스를 이용하여 입력된 수가 3의 배수인지 판별하는 프로그램을 작성하세요.");
		
		Scanner sc = new Scanner(System.in);
		System.out.print("수를 입력하시오 : ");
		int val = sc.nextInt();
		if(val%3==0) {
			System.out.println("3의 배수입니다.");
		}else {
			System.out.println("3의 배수가 아닙니다.");
		}
		
		sc.close();
	}
}