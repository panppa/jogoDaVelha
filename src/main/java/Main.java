import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[][] casas = new String[3][3];
        int cont= 1;
        int jogador=1;
        int escolha=-1;
        Scanner teclado = new Scanner(System.in);

        construir(casas,escolha,jogador);

        do{
            System.out.println("Vez do jogador " +jogador+" Escolha uma casa:");
            escolha = teclado.nextInt();
            if ((escolha<1 || escolha>9)){
                System.out.println("Escolha não identificada");
            }
        }while(escolha<1 || escolha>9);

        construir(casas,escolha,jogador);

        conferir();
    }

    private static void construir(String[][] casas,int escolha, int jogador) {
        int cont=1;
        System.out.println(" -------------");
        for (String linha[] : casas){
            for (String casa : linha) {
                if (escolha == cont){
                    if (jogador%2!=0){
                        casa =("x");
                    }else{
                        casa =("o");
                    }
                }else{
                    casa = String.valueOf(cont);
                }
                cont++;
                System.out.print(" | "+casa);
            }
            System.out.println(" |\n -------------");
        }
    }

    private static void conferir(String[][] casas) {
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
            (casas[2][0] .equals("o")  && casas[2][1] .equals("o")  && casas[2][2].equals("o") ) ||
        ) {
            //System.out.println("O jogador "+ jogador + "venceu!!");

        }

    }
}
