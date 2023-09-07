package estruturaDeRepeticao;

import java.util.Scanner;

public class Exercicio06 {
	public static void main(String[] args) {
	Scanner teclado = new Scanner(System.in);
		
		int nota1 = 0;
		int nota2 = 0;
		char res;
		do {
			System.out.println("Digite a primeira nota: ");
			nota1 = teclado.nextInt();
			
			System.out.println("Digite a segunda nota: ");
			nota2 = teclado.nextInt();
			
			if(nota1 > 10 || nota2 > 10) {
				System.out.println("Infome as notas no valor entre 0 a 10 ");
				System.out.println("");
				
				System.out.println("");
				
			} else  {
				int result = (nota1 + nota2) / 2;
				
				System.out.println("A sua média é: " + result);
				
				
				
			}
			
			System.out.println("Deseja continuar? (s/n)");
			 res = teclado.next().charAt(0);	
			 
			 if(res == 'n' ) {
				 System.out.println("ATÉ MAIS");
			 }
			 
			
		}while(nota1 > 10 && nota2 > 10 || res == 's');
		

	}
	
}
