package segundoSemestre;

import java.util.ArrayList;
import java.util.Scanner;

public class atividade04 {
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		ArrayList<Integer> numero = new ArrayList<>();

		int num;
		int pares = 0;
		do {
			System.out.println("informe o numero, por favor:");
			num = ler.nextInt();
			numero.add(num);

		} while  (num !=0);
		for (int a : numero) {
			if (a> 0 && a != 0) {

			}
			System.out.println(a);
		}
	}
}