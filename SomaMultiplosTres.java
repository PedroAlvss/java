import java.util.Scanner;

public class SomaMultiplosTres {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int result = 0;
        System.out.print("Digite um número: ");
        int n = input.nextInt();

        for(int i = 1; i <= n; i++){
            if(i % 3 == 0){
                System.out.println(i);
                result = result + i;
            }
        }
        System.out.println("Esse é o valor final: " + result);
        input.close();
    }
}
