import java.util.Scanner;

public class OpTernario {
    public static void main(String[] args) {

        int num;
        String resultado;
        Scanner input= new Scanner(System.in);
        System.out.println("Entre com o valor");
        num = input.nextInt();

        resultado = (num%2==0)  ? "O número é par" : "O número é Ímpar";

        System.out.println(resultado);


    }
}
