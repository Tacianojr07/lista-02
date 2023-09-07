package estruturaDeRepeticao;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite um valor: ");
		int valor = teclado.nextInt();
		
		for(int x = 1; x <= valor; x++ ) {
			System.out.println("");
			System.out.println(x);
		}
		teclado.close();
	}

}
