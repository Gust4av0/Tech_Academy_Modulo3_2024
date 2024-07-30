import java.util.Scanner;

public class HelloWord {
    public static void main(String[] args) {

        System.out.println("Hello Word");

        System.out.println("Digite seu nome = ");
        Scanner entrada = new Scanner(System.in);
        String nome = entrada.next();

        System.out.println("O nome digitado foi = " + nome);
    }
}
