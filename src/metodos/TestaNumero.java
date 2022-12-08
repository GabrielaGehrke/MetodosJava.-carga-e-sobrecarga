package metodos;

import java.util.Scanner;



import java.util.HashMap;

public class TestaNumero {
 
    /**
     * @param args
     */
    public static void main(String[] args) {
        Numero n = new Numero();


        boolean continuar = true;

        Scanner scan = new Scanner(System.in);
        while(continuar) {
            double x = 0;
            double y = 0;
            int operacao = 0;
            
            System.out.println("Digite a operação que deseja realizar: "
            + " \n 1 para soma "
            + " \n 2 para subtração "
            + " \n 3 para multiplicação "
            + " \n 4 para divisão "
            + " \n 5 ou 0 para finalizar o programa"
            );

            operacao = scan.nextInt();
        
            if(operacao == 0) {
                continuar = false;
                return;
            }  
            
            System.out.println(" Informe o valor do primeiro número");
            x = scan.nextDouble();
            

            System.out.println(" Informe o valor do primeiro número");
            y = scan.nextDouble();
            


switch (operacao) {
    case 1:
    imprimeCalculadora(operacao, n.soma(x, y), x, y);
    break;

    case 2:
    imprimeCalculadora(operacao, n.subtração(x, y), x, y);
    break;

    case 3:
    imprimeCalculadora(operacao, n.multiplicação
    (x, y), x, y);
    break;

    case 4:
    imprimeCalculadora(operacao, n.divisão(x, y), x, y);
        
        break;

    default:
        break;
}

        }



        scan.close();
    }

    static void imprimeCalculadora(int operacao, double resultado, double x, double y) {
        HashMap<Integer, String> mapOperacao = new HashMap<>();
        mapOperacao.put( 1,  " somado" );
        mapOperacao.put( 2,  " subtraído" );
        mapOperacao.put( 3,  " multipicado" );
        mapOperacao.put( 4,  " dividido" );

        System.out.println(("\n o resultado de " + x + mapOperacao.get(operacao) + " por " + y + " é igual a " + resultado + " \n "));

    }
         





}

