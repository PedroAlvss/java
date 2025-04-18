import java.util.Scanner;

public class TabuadaLaco {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numero;

        do {
            System.out.println("\n---TABUADA---");
            System.out.print("Escolha qualquer número para ver a Tabuada (0 para cancelar): ");
            numero = input.nextInt();
            if (numero > 0) {
                for(int i = 0; i <= 10; i++){
                    int result = numero * i;
                    System.out.println(numero + " x " + i + " = " + result);
                }
            } else { 
                System.out.println("Encerrando a tabuada. Até a próxima!");   
                break;
            }
        } while (numero != 0);
    input.close();
    }
}
