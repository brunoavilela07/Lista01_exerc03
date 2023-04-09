import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // Programa que peça dois números
        int n1;
        int n2;
        int resultado;

        Scanner input = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        n1 = input.nextInt();
        System.out.println("Digite o segundo número: ");
        n2 = input.nextInt();

        // imprima a soma
        resultado = n1 + n2;
        System.out.println("O resultado da soma desses dois números é: " + resultado + " .");

    }
}
