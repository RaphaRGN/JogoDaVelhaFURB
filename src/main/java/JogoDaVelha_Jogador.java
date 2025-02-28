import java.util.Scanner;

public class JogoDaVelha_Jogador {

    private JogoDaVelha_Mapa mapa;
    char letra;


    public JogoDaVelha_Jogador(JogoDaVelha_Mapa mapa) {

        this.mapa = mapa;

    }


    public boolean joga(Scanner teclado) {

        letra = 'X';
        System.out.println("linha: ");
        int linhaJogo = teclado.nextInt();

        System.out.println("coluna: ");
        int colunaJogo = teclado.nextInt();

        if(!mapa.jogar(linhaJogo, colunaJogo, letra)){

            System.out.println("Espaço ocupado !");
            joga(teclado);

            return false;
        }
        else{
            if(mapa.ganhou('X')){

                System.out.println("JOGADOR GANHOU !");

            }
            return true;
        }
    }
}