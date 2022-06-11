public class Main {
    public static void main(String[] args) {
        String[][] casas = new String[3][3];
        int cont= 1;

        System.out.println(" -------------");
        for (String linha[] : casas){
            for (String casa : linha) {
                casa = String.valueOf(cont);
                cont++;
                System.out.print(" | "+casa);
            }
            System.out.println(" |\n -------------");
        }


    }
}
