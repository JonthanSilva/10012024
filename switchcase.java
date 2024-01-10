import java.util.*;
public class switchcase {
public static void main(String[] args) {
    Scanner scnTeste = new Scanner(System.in);
    String[] varOpçoes = {" Criar"," Ler"," Editar","Excluir"};
    for (int o = 0; o < varOpçoes.length; o++)  {
        System.out.println("Opção[" + o + "] - " + varOpçoes[o]);
    }
    System.out.println("Digite uma das opções acima");
    int opcao = scnTeste.nextInt();
    switch(opcao){
        case 0:
        System.out.println("Você selecionou a opção" + varOpçoes[0]);
        break;
        case 1:
        System.out.println("Você selecionou a opção" + varOpçoes[1]);
        break;
         case 2:
        System.out.println("Você selecionou a opção" + varOpçoes[2]);
        break;
         case 3:
        System.out.println("Você selecionou a opção" + varOpçoes[3]);
        break;

    }

}
    
}
