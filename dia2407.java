package segundoSemestre;

import java.util.Scanner;

public class dia2407 {

	public static void main(String[] args) {
		
		
		Scanner ler = new Scanner (System.in);
		
		System.out.println("informe o numero para ver o dia");
		 int dia = ler.nextInt();
		
		 switch (dia) {
		 
		 case 1: 
			System.out.println("segunda");
			break;
		 case 2: 
			System.out.println("terça"); 
			break;
	     case 3:
			System.out.println("quarta"); 
			break;
        case 4:
	        System.out.println("quinta"); 
	        break;
        case 5:
			System.out.println("sexta"); 
			break;
		case 6:
			System.out.println("sabado"); 
			break;
		case 7:
			System.out.println("domingo"); 
			break;
	    default:
			System.out.println ("dia invalido");
		 }

	   ler.close();

	}

}
