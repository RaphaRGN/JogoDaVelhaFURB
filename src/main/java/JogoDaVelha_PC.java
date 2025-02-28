import java.util.Random;
import java.util.Scanner;

public class JogoDaVelha_PC {

        JogoDaVelha_Mapa mapa;
        char letra;


        public JogoDaVelha_PC(JogoDaVelha_Mapa mapa) {

                this.mapa = mapa;

        }

        public boolean joga(Scanner teclado) {

                letra = 'O';
                boolean jogadaSucedida = false;
                Random random = new Random();

                while (!jogadaSucedida) {

                        int jogadalinha = mapa.sortear(0,2);
                        int jogadaColunaPC = mapa.sortear(0,2);

                        if (mapa.jogar(jogadalinha, jogadaColunaPC, letra)) {

                                jogadaSucedida = true;
                                System.out.println("PC [" + jogadalinha + "," + jogadaColunaPC + "]");
                                if(mapa.ganhou('O')){

                                        System.out.println("PC GANHOU !");

                                }
                                return true;
                        }

                }
                return true;
        }

}

