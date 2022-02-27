package application;

import java.util.Scanner;

import service.PrintService;

public class Program {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		PrintService<Integer> ps = new PrintService<Integer>();
		
		System.out.print("How many values? ");
		int n = sc.nextInt();
		
		//Com type safety n�o ir� permitir passar objeto diferete do tipo
		//ps.addValue("Mary");
		
		for(int i = 0; i < n; i++) {
			Integer value = sc.nextInt();
			ps.addValue(value);
		}
		
		ps.print();
		Integer x = ps.first();
		System.out.println("First: " + x );
		
		
	}
}
