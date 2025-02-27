import java.util.Random;

public class JogoDaVelha_Mapa {

    private char[][] mapa = new char[3][3];


    public int sortear(int inicio, int fim) {
        Random random = new Random();
        int numeroAleatorioMaquina = random.nextInt(inicio, fim);

        return numeroAleatorioMaquina;
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
            System.out.println("Escolha outro local !");

            return false;
        } else {
            mapa[l][c] = jogador;
            return true;
        }
    }


    public boolean ganhou(char jogador) {

        if (jogador == 'c') {

            System.out.println("Computador ganhou !");
            return true;
        }

        if (jogador == 'X') {

            System.out.println("Você ganhou !");
            return true;
        }
        return false;
    }
}
