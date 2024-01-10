public class dowhile {
    public static void main(String[] args) {
        int tempoTotal = 2; // tempo em milissegundos
        int minutoContado = 0;
        int segundoContado = 0;
        while (minutoContado <= tempoTotal){
            try {
                System.out.println("Assistindo filme. Se passaram" + minutoContado + "minuto(s) e " + segundoContado + "Segundo(s)" );
                Thread.sleep(1000); // contador de tempo a cada 1 segundo(1000 milissegundos)
                segundoContado++;
                if (segundoContado == 60 ) {
                    minutoContado++;
                }
            } catch(Exception e) {
                System.out.println("Ops! Ocorreu um erro" + e);
            }
        }
        System.out.println("Filme encerrado");
    }
}
