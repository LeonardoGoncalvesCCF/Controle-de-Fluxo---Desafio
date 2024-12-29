package codigos;

import java.security.InvalidParameterException;
import java.util.Scanner;


public class Contador {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("------------------------------");
		System.out.println(" Digite o primeiro parâmetro: ");
		int parametroUm = scanner.nextInt();
		
		System.out.println(" ------------------------------");

		System.out.println(" Digite o segundo parâmetro:   ");
		int parametroDois = scanner.nextInt();
		System.out.println(" ------------------------------");
		
		System.out.println(" Numero 1: " + parametroUm + " Numero 2: " + parametroDois );
		System.out.println(" Numero  " + parametroUm + " - Numero  = " + parametroDois + " " + (parametroUm - parametroDois));
		
		
		
		try {
			//chamando o método contendo a lógica de contagem
			contar(parametroUm, parametroDois);
		
		}catch (? exception) {
			//imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro
		}
		
	}
	
	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
		//validar se parametroUm é MAIOR que parametroDois e lançar a exceção
		
		if (parametroUm > parametroDois) {
		
			throw new ParametrosInvalidosException("O paramentro um deve ser menor que o segundo paramentro");
			
			
		}
		
		
		int contagem = parametroDois - parametroUm;
		//realizar o for para imprimir os números com base na variável contagem
	} 
}