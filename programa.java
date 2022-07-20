package aulas;

import java.util.Locale;
import java.util.Scanner;

public class programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner(System.in).useLocale(Locale.US);
				
				String nome;
		int numero = 0;
		char sexo;
		double x = 10.00;
		
		System.out.println("Digite seu nome: ");
		nome = leia.nextLine();
		
		System.out.println("Digite sua idade: ");
		numero = leia.nextInt();
		
		System.out.println("Digite o seu sexo: ");
		sexo = leia.next().charAt(0);
		
		
		System.out.print("Digite o seu saldo bancario: ");
		x = leia.nextDouble();
		
		System.out.println("Pedro tem " + numero );
		
		System.out.println("Seu sexo é " + sexo);
		
		System.out.println("Voce possui uma fortuna de: " + x);
		
		leia.close();
		

	}

}
