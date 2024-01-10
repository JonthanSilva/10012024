import java.util.Scanner;*;
public class ifelse {
public static void main(String[] args) {
    boolean sair = false;   
    Scanner scnPalavra = new Scanner(System.in);  
            String texto = "Doente de amor \r\n" +
            "Procurei remédio na vida noturna\r\n" +
            "Com a flor da noite\r\n" +
            "Em uma bote aqui na Zona Sul\r\n" +
            "A dor do amor\r\n" +
           "É com outro amor que a gente cura\r\n" +
           " Vim curar a dor\r\n" +
           " Deste mal de amor na Boate Azul\r\n" +
          "  E quando a noite\r\n" +
           " Vai se agonizando no clarão da aurora\r\n" +
          "  Os integrantes da vida noturna se foram dormir\r\n" +
            "E a dama da noite\r\n" +
           "Estava comigo também foi embora\r\n" +
            "Fecharam-se as portas \r\n" +
           " Sozinho de novo tive que sair\r\n" 
            "Sair de que jeito \r\n" +
           " Se nem sei o rumo para onde vou\r\n" +
          " Muito vagamente me lembro que estou\r\n" +
            "Em uma boate aqui na Zona Sul\r\n" +
            "Eu bebi demais\r\n" +
            "E não consigo me lembrar sequer\r\n" +
           " Qual era o nome daquela mulher\r\n" +
           " A flor da noite da Boate Azul\r\n" +
            String palavra;
            int posicaoPalvra;
            while (sair == false){
                System.out.println(texto);
            System.out.println("Digite uma Palavra a ser pesquisada no texto acima ou digite 's' para sair,depois tecle enter");
            palavra = scnPalavra.nextLine();
            posicaoPalvra = texto.indexOf(palavra);
            if (posicaoPalavra >= 0) {
                System.out.println("A palavra " + palavra + "foi encontrada na posição " = posicaoPalavra + " no texto acima. ");
            } else {
                System.out.println("Ops! palavra não encontrada ");
            }
            System.out.println("Digite 'c' para continuar ou 's' para sair, depois tecle enter");
            if (scnPalavra.nextLine().equals(anoObjects "s" ))  {
                sair = true;
            }
            }
            scnPalavra.close();
        }
        
    }
