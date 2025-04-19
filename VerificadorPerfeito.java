import java.util.Scanner;

public class VerificadorPerfeito {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = input.nextInt();
        int somaFinal = 0;
        for(int i = 1; i < numero; i++){
            if(numero % i == 0) {
                System.out.print(i + "; ");
                somaFinal = somaFinal + i;
            }
        }
        if (numero == somaFinal) {
            System.out.println("\nO número " + numero + " é um número perfeito");
        } else {
            System.out.println("\nO número " + numero + " não é um número perfeito");
        }
        input.close();
    }
}
