import java.util.Scanner;

public class teste {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Digite um número: ");
            int numeroUm = scanner.nextInt();

            System.out.print("Digite o segundo número: ");
            int numeroDois = scanner.nextInt();

            if (numeroUm > numeroDois) {
                System.out.println("Número 1 é maior que o número 2.");
            } else if (numeroUm < numeroDois) {
                System.out.println("Número 2 é maior que o número 1.");
            } else {
                System.out.println("Os números são iguais.");
            }
        } catch (java.util.InputMismatchException e) {
            System.out.println("Entrada inválida. Por favor, insira números inteiros.");
        } finally {
            scanner.close();
        }
    }
}
