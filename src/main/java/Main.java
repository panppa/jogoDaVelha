import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[][] casas = {{"1", "2", "3"}, {"2", "5", "6"}, {"7", "8","9"}};
        int jogador=1;
        int escolha=-1;
        boolean vencedor;
        Scanner teclado = new Scanner(System.in);

        casas = construir(casas,escolha,jogador);

        do{
            do{
                System.out.println("Vez do jogador " +jogador+" Escolha uma casa:");
                escolha = teclado.nextInt();
                if ((escolha<1 || escolha>9)){
                    System.out.println("Escolha não identificada");
                }
            }while(escolha<1 || escolha>9);
            casas = construir(casas,escolha,jogador);
            vencedor = conferir(casas,jogador);
        }while(!vencedor);
    }

    private static String[][] construir(String[][] casas,int escolha, int jogador) {
        int cont=1;
        System.out.println(" -------------");
        for (int cont1 = 0; cont1 < casas.length;cont1++){
            for (int cont2 = 0; cont2 < casas[0].length;cont2++) {
                if (escolha == cont){
                    if (jogador%2!=0){
                        casas[cont1][cont2] =("x");
                    }else{
                        casas[cont1][cont2] =("o");
                    }
                }else{
                    if (!(casas[cont1][cont2] .equals("x"))&&!(casas[cont1][cont2] .equals("o"))) {
                        casas[cont1][cont2] = String.valueOf(cont);
                    }
                }
                cont++;
                System.out.print(" | "+casas[cont1][cont2]);
            }
            System.out.println(" |\n -------------");
        }
        return casas;
    }

    private static boolean conferir(String[][] casas,int jogador) {
        if ((casas[0][0] .equals("x")  && casas[0][1] .equals("x")  && casas[0][2].equals("x") ) ||
            (casas[1][0] .equals("x")  && casas[1][1] .equals("x")  && casas[1][2].equals("x") ) ||
            (casas[2][0] .equals("x")  && casas[2][1] .equals("x")  && casas[2][2].equals("x") ) ||

            (casas[0][0] .equals("x")  && casas[1][0] .equals("x")  && casas[2][0].equals("x") ) ||
            (casas[0][1] .equals("x")  && casas[1][1] .equals("x")  && casas[2][1].equals("x") ) ||
            (casas[0][2] .equals("x")  && casas[1][2] .equals("x")  && casas[2][2].equals("x") ) ||

            (casas[0][0] .equals("x")  && casas[1][1] .equals("x")  && casas[2][2].equals("x") ) ||
            (casas[2][2] .equals("x")  && casas[1][1] .equals("x")  && casas[0][0].equals("x") ) ||

            (casas[0][0] .equals("o")  && casas[1][1] .equals("o")  && casas[2][2].equals("o") ) ||
            (casas[0][2] .equals("o")  && casas[1][1] .equals("o")  && casas[2][0].equals("o") ) ||

            (casas[0][0] .equals("o")  && casas[1][0] .equals("o")  && casas[2][0].equals("o") ) ||
            (casas[0][1] .equals("o")  && casas[1][1] .equals("o")  && casas[2][1].equals("o") ) ||
            (casas[0][2] .equals("o")  && casas[1][2] .equals("o")  && casas[2][2].equals("o") ) ||

            (casas[0][0] .equals("o")  && casas[0][1] .equals("o")  && casas[0][2].equals("o") ) ||
            (casas[1][0] .equals("o")  && casas[1][1] .equals("o")  && casas[1][2].equals("o") ) ||
            (casas[2][0] .equals("o")  && casas[2][1] .equals("o")  && casas[2][2].equals("o") )
        ) {
            System.out.println("O jogador "+ jogador + " venceu!!");
            return true;
        }else{
            return false;
        }
    }
}
