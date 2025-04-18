import java.util.Scanner;
import java.util.Arrays;

public class VerificarAnagramas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite a primeira palavra: ");
        String palavra1 = input.nextLine();
        System.out.print("Digite a segunda palavra: ");
        String palavra2 = input.nextLine();

        //converte as letras para letras minúsculas
        String minuscula1 = palavra1.toLowerCase();
        String minuscula2 = palavra2.toLowerCase();
        // remove espaços
        String semEspaco1 = minuscula1.replace(" ", "");
        String semEspaco2 = minuscula2.replace(" ", "");
        // tranforma as palavras em arrays de caracteres ex: ['a', 'b', 'c', 'd']
        char[] caracter1 = semEspaco1.toCharArray();
        char[] caracter2 = semEspaco2.toCharArray();
        // organiza os arrays em ordem alfabetica
        Arrays.sort(caracter1);
        Arrays.sort(caracter2);

        if(Arrays.equals(caracter1, caracter2)){
            System.out.println("Estas palavras são anagramas");
        } else { 
            System.out.println("Estas palavras não são anagramas");
        }
        input.close();
    }
}
