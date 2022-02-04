import java.util.Random;

public class NumAleatório {
    public static void main(String[] args) {

        Random aleatorio = new Random(); //Intaciação do Objeto Random
        int valor = aleatorio.nextInt(); // Variável reecebe um número aleatório
        System.out.println(valor); // Impressão do valor

        // Gerando um número em um intervalo específico

        valor = aleatorio.nextInt(16) +15; // 16 = indica a quantidade de posições da amostragem, +15 significa que será sempre somado 15 ao número (ou seja, partirá de no mínimo 15 )
        System.out.println(valor);

        // O mesmo serve para números de ponto flutuante (float oudouble)

        float valor2 = aleatorio.nextFloat(); // Gerará um numero entre 0.0 e 1.0m (pode ser alterado)
        System.out.println(valor2);



    }
}
