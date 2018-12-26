package practice01;

import java.util.Scanner;

public class Prob3 {
	public static void main(String[] args) {
		System.out.println("[문제 3] 숫자를 입력 받아서 아래와 같은 실행결과가 나타나도록 Prob1 클래스의 main 메쏘드를 완성하세요.");
		
		Scanner sc = new Scanner(System.in);
		int result;
		
		int n=3;
		while(n>0) {
			n--;
			System.out.print("숫자를 입력하세요: ");
			int val1 = sc.nextInt();
			
			result = 0;
			if(val1%2==0) {
				for(int i=0;i<=val1/2;i++)
					result += 2*i;
			}else {
				for(int i=0;i<=val1/2;i++)
					result += 2*i+1;
			}
			System.out.println("결과 값 : " + result);
		}
		
		sc.close();
	}
}
