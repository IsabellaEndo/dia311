package segundoSemestre;
import java.util.Scanner;
public class atividade01 {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);

		int venda =0,valor;
		
		
		for(int i=0; i<4;i++) {
			System.out.println("informe o valor da semana");
			valor = ler.nextInt();
			venda = valor+venda;
		}

		switch (venda) {
		case 1: 
			System.out.println("sem bonus ");
			break;
		case 2: 
			System.out.println("sem bonus "); 
			break;
		case 3:
			System.out.println("sem bonus "); 
			break;
		case 4:
			System.out.println("sem bonus "); 
			break;
		case 5:
			System.out.println("sem bonus "); 
			break;
		case 6:
			System.out.println("sem bonus "); 
			break;
		case 7:
			System.out.println("sem bonus "); 
			break;
		case 8:
			System.out.println("sem bonus "); 
			break;
		case 9:
			System.out.println("sem bonus"); 
			break;
		case 10:
			System.out.println("sem bonus"); 
			break;
		case 11:
			System.out.println("bonus de 100"); 
			break;
		case 12:
			System.out.println("bonus de 100"); 
			break;
		case 13:
			System.out.println("bonus de 100"); 
			break;
		case 14:
			System.out.println("bonus de 100"); 
			break;
		case 15:
			System.out.println("bonus de 300"); 
			break;
		case 16:
			System.out.println("bonus de 300"); 
			break;
		case 17:
			System.out.println("bonus de 300"); 
			break;
		case 18:
			System.out.println("bonus de 300"); 
			break;
		case 19:
			System.out.println("bonus de 300"); 
			break;
		case 20:
			System.out.println("bonus de 300"); 
			break;
		default:
			System.out.println ("bonus de 500");

		}
		ler.close();
	}
}
