import java.util.Scanner;

public class ContadorVogais {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite uma frase: ");
        String frase = input.nextLine();

        frase = frase.toUpperCase();

        int countA = 0;
        int countE = 0;
        int countI = 0;
        int countO = 0;
        int countU = 0;

        for (int i = 0; i < frase.length(); i++) {
            char letra = frase.charAt(i);

            switch (letra) {
                case 'A':
                    countA++;
                    break;
                case 'E':
                    countE++;
                    break;
                case 'I':
                    countI++;
                    break;
                case 'O':
                    countO++;
                    break;
                case 'U':
                    countU++;
                    break;
            }
        }

        System.out.println("\nQuantidade de vogais:");
        System.out.println("A: " + countA);
        System.out.println("E: " + countE);
        System.out.println("I: " + countI);
        System.out.println("O: " + countO);
        System.out.println("U: " + countU);

        input.close();
    }
}
