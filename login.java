import java.util.Scanner;

public class login {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try {


            String usuario = "admin";
            int senha = 1234;

            for (int cont = 1; cont <= 4; cont++) {

                System.out.println("---LOGIN---");
                System.out.println("Digite o usuario: ");
                String entradaUsuario = input.next();
                System.out.println("Digite a senha: ");
                int entradaSenha = input.nextInt();

                if (usuario.equals(entradaUsuario) && senha == entradaSenha) {
                    System.out.print("Login efetuado!");
                    cont = 5;
                } else {
                    System.out.println("Usuario ou senha incorretos!");
                    int tentativa;
                    tentativa = 4 - cont;
                    if(tentativa>0){
                        System.out.println("Você tem " + tentativa + " tentativas restantes");
                    } else {
                        System.out.println("Acesso Bloqueado");
                    }
                }
            }
        } catch (java.lang.IllegalStateException e) {
            System.out.println("Erro");
        }

        input.close();
    }

}
