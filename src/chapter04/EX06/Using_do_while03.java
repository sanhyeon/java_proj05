package chapter04.EX06;

import java.util.Scanner;

public class Using_do_while03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean run = true;
		int nu = 0;	// 스캐너에서 정수를 인풋
		
		do {
			System.out.println("==================================================");
			System.out.println("1. 19단 출력 | 2. 홀수단 출력 | 3. 3의 배수단 출력 | 4. 종료");
			System.out.println("==================================================");
			System.out.println("원하는 숫자를 선택 하세요 >>>");
			nu = sc.nextInt();
			if (nu == 1) {
				//1. 19 단 출력
				System.out.println("==1. 19단 출력==");
				for (int i = 1; i < 19 ; i++) {		// 5번 반복 : 0, 1, 2, 3, 4
					for (int j=1 ; j<19 ; j++) {	// 10번 반복
						System.out.print(i + " * " + j  + " = " + i*j);
						System.out.print("\t");
					}System.out.println();
				}
			}else if (nu == 2) { 
				//2. 홀수단 출력
				System.out.println("==2. 홀수단 출력==");
				for (int i = 1; i < 19 ; i++) {		// 5번 반복 : 0, 1, 2, 3, 4
					for (int j=1 ; j<19 ; j++) {	// 10번 반복
						if (i%2 != 0)
						System.out.print(i + " * " + j  + " = " + i*j);
						System.out.print("\t");
					}if (i%2==0) {System.out.println();}
				}
			}else if (nu == 3) {
				//3. 3의 배수단 출력
				System.out.println("==3. 3의 배수단 출력==");

				for (int i = 3; i < 20 ; i+=3) {		// 5번 반복 : 0, 1, 2, 3, 4
					for (int j=1 ; j<20 ; j++) {	// 10번 반복
						if (i%3 == 0) {
						System.out.print(i + " * " + j  + " = " + i*j);
						System.out.print("\t");
						}if (i%3==0) {System.out.println();}
					}
				}
				}else if (nu == 4) {
				break;
			}
			
		}while(run);	//무한 루프
		System.out.println("프로그램 종료");

	}

}
