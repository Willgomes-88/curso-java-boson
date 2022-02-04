import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Gerador {

    public static void main(String[] args) {
        int[] numeros;
        int quantidade ;

        Random random = new Random();
        Scanner input = new Scanner(System.in);
        System.out.println("Entre com a quantidade de numeros aleatórios:");
        quantidade = input.nextInt();
        numeros = new int[quantidade];

        for (int i=0; i< numeros.length;i++){
           numeros[i] = random.nextInt(25);

        }



        // Ordem Crescente
            Arrays.sort(numeros);
            System.out.println("Em Ordem Crescente");
           for ( int numero : numeros){
               System.out.print(numero + " ");
           }

        }






    }

