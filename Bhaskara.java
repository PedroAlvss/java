import java.util.Scanner;

public class Bhaskara {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double x1 = 0;
        double x2 = 0;
        int opcao;
        do {
            System.out.println("\n---BHASKARA---");
            System.out.println("1- Quero testar!");
            System.out.println("0- Feche o programa!!");
            System.out.print("R: ");
            opcao = input.nextInt();
            if (opcao == 1) {
                System.out.print("Digite o valor de A: ");
                double a = input.nextDouble();
                System.out.print("Digite o valor de B: ");
                double b = input.nextDouble();
                System.out.print("Digite o valor de C: ");
                double c = input.nextDouble();
        
                double delta = Math.pow(b, 2) - 4 * a * c;
                System.out.print("\nO valor de Delta é: " + delta + ", logo ");
        
                if (delta>0) {
                    x1 = ((-b) + Math.sqrt(delta)) / (2 * a);
                    x2 = ((-b) - Math.sqrt(delta)) / (2 * a);
                    System.out.println("possui duas raízes reais, X1: " + String.format("%.2f", x1) + " e X2: " + String.format("%.2f", x2));
                } else if(delta == 0) {
                    x1 = ((-b) + Math.sqrt(delta)) / (2 * a);
                    System.out.println("possui uma raíz real, X: " + String.format("%.2f", x1));
                } else {
                    System.out.println("não possui raízes reais!");
                }
            } else {
                System.out.println("Encerrando a simulação. Nos vemos mais tarde!!");
            }
        } while(opcao != 0);
        input.close();
    }
}
