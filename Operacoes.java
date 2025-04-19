import java.util.Scanner;

public class Operacoes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double x1 = 1;
        double x2 = 1;
        int opcao;
        do {
            System.out.println("\n---OPERAÇÕES MATEMÁTICAS---");
            System.out.println("1- Adição");
            System.out.println("2- Subtração");
            System.out.println("3- Multiplicação");
            System.out.println("4- Divisão");
            System.out.println("5- Troca de números");
            System.out.println("6- Ver números");
            System.out.println("0- Sair");
            System.out.print("R: ");
            opcao = input.nextInt();
            if (opcao > 0 && opcao < 7) {
                switch (opcao) {
                    case 1:
                        System.out.println("Soma escolhida, segue com a sua soma abaixo:");
                        double soma = x1 + x2;
                        System.out.println(x1 + " + " + x2 + " = " + soma);
                        break;
                
                    case 2:
                        System.out.println("Subtração escolhida, segue com a sua subtração abaixo:");
                        double subtracao = x1 - x2;
                        System.out.println(x1 + " - " + x2 + " = " + subtracao);
                        break;

                    case 3:
                        System.out.println("Multiplicação escolhida, segue com a sua multiplicação abaixo:");
                        double multiplicacao = x1 * x2;
                        System.out.println(x1 + " x " + x2 + " = " + multiplicacao);
                        break;

                    case 4:
                        System.out.println("Divisão escolhida, segue com a sua divisão abaixo:");
                        if (x2 != 0) {
                            double divisao = x1 / x2;
                            System.out.println(x1 + " / " + x2 + " = " + divisao);
                        } else {
                            System.out.println("Erro: divisão por zero!");
                        }
                        break;
                    
                    case 5:
                        System.out.println("Troca de Números:");
                        System.out.print("Escolha o Primeiro Número: ");
                        x1 = input.nextDouble();
                        System.out.print("Escolha o Segundo Número: ");
                        x2 = input.nextDouble();
                        System.out.println("Números Alterados!!");
                        break;

                    case 6:
                        System.out.println("Ver os Números:");
                        System.out.println("Primeiro número: " + x1);
                        System.out.println("Segundo números: " + x2);
                        break;
                }
            }
        } while(opcao != 0);
        System.out.println("Encerrando o sistema de Operações. Até mais!");
    input.close();
    }
}
