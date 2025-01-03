package codigos;

import java.security.InvalidParameterException;
import java.util.Scanner;


public class Contador {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        boolean sucesso = false;

        while(!sucesso) {

            try {

                System.out.println("------------------------------");
                System.out.println(" Digite o primeiro parâmetro: ");
                int parametroUm = scanner.nextInt();

                System.out.println(" ------------------------------");

                System.out.println(" Digite o segundo parâmetro:   ");
                int parametroDois = scanner.nextInt();
                System.out.println(" ------------------------------");

                contar(parametroUm, parametroDois);
                
                sucesso = true;


            }catch (ParametrosInvalidosException exception) {
                //imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro

                System.out.println(exception.getMessage());

            }

           
}
        
        scanner.close();
        System.out.println("Programa concluído com sucesso.");
    }
    
  //-------------------------------------------------------------------------------------------------\
    static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
        //validar se parametroUm é MAIOR que parametroDois e lançar a exceção

        if (parametroUm > parametroDois) {

            throw new ParametrosInvalidosException("O paramentro um deve ser menor que o segundo paramentro");


        }


        int contagem = parametroDois - parametroUm;
        //realizar o for para imprimir os números com base na variável contagem

        System.out.println("Contando a diferença entre " + parametroUm +" até o " + parametroDois);

        int decisao = parametroDois - parametroUm;
        for (int contador = 1; contador <= decisao; contador++ ) {

            System.out.println("Imprimindo os parametros " + contador); 


        }
    } 
}