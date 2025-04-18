import java.util.Scanner;

public class AdivinhacaoNumero {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numero;
        int tentativas = 0;
        int adivinha = (int)(Math.random()*101);

        do {
            System.out.println("Advinhe um número de 0 a 100: ");
            numero = input.nextInt();
            if (numero > 100 || numero < 0) {
                System.out.println("Tem que ser entre 0 e 100!");
            } else {
                tentativas = tentativas + 1;
                if (numero == adivinha) {
                    System.out.println("Parabéns você acertou em " + tentativas + " tentativa(s)!!");
                } else {
                    System.out.println("Você errou!! mas calma, você só está na " + tentativas + " tentativa!");
                    if (numero > adivinha) {
                        System.out.println("Uma dica, o seu número é menor do que este!!");
                    } else {
                        System.out.println("Uma dica, o seu número é maior do que este!!");
                    }
                }
            }   
        } while(numero != adivinha);
    input.close();
    }
}
