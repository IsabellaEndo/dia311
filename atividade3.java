package segundoSemestre;

import java.util.Scanner;

public class atividade3 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner (System.in);
		
	        System.out.print("Digite um número: ");
	        int num = ler.nextInt();

	        if(num > 0) {
	            System.out.printf("O número é POSITIVO.", num);
	        } else if (num == 0) {
	            System.out.printf("Número neutro ", num);
	        } else {
	            System.out.printf("O número é NEGATIVO.", num);
	        }
	    }
	

	}


