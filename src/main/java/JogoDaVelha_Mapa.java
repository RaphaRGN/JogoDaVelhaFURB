import java.util.Random;

public class JogoDaVelha_Mapa {

    private char[][] mapa = new char[3][3];


    public int sortear(int inicio, int fim) {
        Random random = new Random();


        return random.nextInt(3);
    }

    public void limpaMapa() {

        mapa = new char[3][3];

    }

    public void desenha(int jogada) {
        System.out.println("------------- .. jogada: " + jogada);

        for (int i = 0; i < 3; i++) {
            System.out.print(" | ");
            for (int j = 0; j < 3; j++) {
                if (mapa[i][j] == '\0') {
                    System.out.print(" ");
                } else {
                    System.out.print(mapa[i][j]);
                }
                System.out.print(" | ");
            }
            System.out.println();

            if (i < 2) {
                System.out.println("-------------");
            }
        }

        System.out.println("-------------------");

    }

    public boolean jogar(int l, int c, char jogador) {

        if (mapa[l][c] == 'X' || mapa[l][c] == 'O') {

            return false;
        } else {
            mapa[l][c] = jogador;
            return true;
        }
    }


    public boolean ganhou(char jogador) {

        for (int i = 0; i < 3; i++) {
            if (mapa[i][0] == jogador && mapa[i][1] == jogador && mapa[i][2] == jogador) {
                return true;
            }

        }

        for (int i = 0; i < 3; i++) {
            if (mapa[0][i] == jogador && mapa[1][i] == jogador && mapa[2][i] == jogador) {
                return true;

            }

        }

        if (mapa[0][0] == jogador && mapa[1][1] == jogador && mapa[2][2] == jogador) {
            return true;
        }

        if (mapa[0][2] == jogador && mapa[1][1] == jogador && mapa[2][0] == jogador) {
            return true;
        }

        return false;
    }

}