import java.util.Scanner;

public class ParouImpar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um número entre 0 e 10: ");
        int numero = input.nextInt();
        if (numero > 0 || numero < 11) {
            
            System.out.print("Você escolhe Par ou Ímpar: ");
            String escolha = input.next();

            int numRandom = (int)(Math.random()*11);
            System.out.println("O número sorteado foi " + numRandom);
            
            int soma = numRandom + numero;

            if (soma % 2 == 0) {
                if (escolha.equalsIgnoreCase("par")) {
                    System.out.println("UAU, você ganhou como Par, a soma final foi " + soma);
                } else {
                    System.out.println("VISH, infelizmente você perdeu como Ímpar, a soma foi " + soma);
                }
            } else {
                if (escolha.equalsIgnoreCase("impar")) {
                    System.out.println("UAU, você ganhou como Ímpar, a soma final foi " + soma);
                } else {
                    System.out.println("VISH, infelizmente você perdeu como Par, a soma foi" + soma);
                }
            }
        } else {
            System.out.println("Apenas números entre 0 e 10!!");
        }
    input.close();
    }
}