import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int semana;
		String dia;
		
		System.out.println("Digite o dia da semana");
			semana = sc.nextInt();
		
		switch (semana) {
		case 1: 
			dia = "domingo";
			break;
		case 2:
			dia = "segunda";
			break;
		case 3:
			dia = "terça";
			break;
		case 4:
			dia = "quarta";
			break;
		case 5:
			dia = "quinta";
			break;
		case 6:
			dia = "sexta";
			break;
		case 7: 
			dia = "sabado";
			break;
		default:
			dia = "valor invalido";
			break;
		}
		
		System.out.println("Dia da semana = " + dia);
		
		sc.close();
	}

}
