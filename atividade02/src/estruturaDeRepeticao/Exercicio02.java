package estruturaDeRepeticao;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado = new Scanner(System.in);
		
		
		int valor1 = 0;
		int valor2 = 0;
		while( valor2 == 0){
			
			System.out.println("Digite o primeiro valor: ");
			valor1 = teclado.nextInt();
			
			System.out.println("Digite o segundo valor que precisa ser diferente de zero: ");
			valor2 = teclado.nextInt();

		} 
		
		int result = valor1 / valor2;
		
		System.out.println("O resultado da divisão do primeiro valor, pelo segundo valor é: " + result);
		
		teclado.close();

	}

}
