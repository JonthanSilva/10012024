import java.util.Scanner;

public class ifelse2 {
    public static void main(String[] args) {
        String usuarioCorreto = "Jonathan";
        String senhaCorreta = "4652";
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o nome de usuário: ");
        String usuarioDigitado = scanner.nextLine();
        System.out.print("Digite a senha: ");
        String senhaDigitada = scanner.nextLine();

        if (usuarioDigitado.equals(usuarioCorreto) && senhaDigitada.equals(senhaCorreta)) {
            System.out.println("Login bem-sucedido! Bem-vindo, " + usuarioDigitado + ".");
        } else {
            System.out.println("Nome de usuário ou senha incorretos. Tente novamente.");
        }
    }
} 
    

