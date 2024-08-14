package segundoSemestre;
import java.util.Scanner;
import java.util.ArrayList;
public class atividade1 {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		ArrayList<Integer> numero = new ArrayList<>();
		int num;
		int soma = 0;

		do {
			System.out.println("informe o numero, por favor:");
			num = ler.nextInt();
			numero.add(num);

		} while  (num !=0);
		for (int a : numero) {
			soma = soma + a;

		}
		System.out.println(soma);
	}
}