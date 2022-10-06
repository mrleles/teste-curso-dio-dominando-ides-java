package hello_world;

import java.util.Scanner;

public class FirstClass {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Primeiro número:");
		int a = scan.nextInt();
		System.out.println("Primeiro número:");
		int b = scan.nextInt();
		
		System.out.println("Soma: " + (a + b));
		System.out.println("Subtração: " + (a - b));
		System.out.println("Divisão: " + (a / b));
		System.out.println("Multiplicação: " + (a * b));

	}
}
