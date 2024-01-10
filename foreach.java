public class foreach {
    public static void main(String[] args) {
        String[] frutas = {" Morango ", " Côco "," Tomate "," Uva "," Manga "," Melancia " };
        System.out.println("Você tem [ " + frutas.length + " ] Frutas Cadastradas");
        for (int f = 0; f < frutas.length; f++) {
            System.out.println("Fruta: [" + frutas[f] + "] Conferida com sucesso.");
        }
    }
}
