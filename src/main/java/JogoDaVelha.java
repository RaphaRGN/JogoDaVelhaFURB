import java.util.Scanner;

public class JogoDaVelha {
    private static JogoDaVelha_Mapa jogoMapa;
    private static  JogoDaVelha_PC jogoPC;
    private static JogoDaVelha_Jogador jogoJogador;

    private void jogar(Scanner teclado) {
        boolean continuarJogo = true;

        while (continuarJogo) {
            jogoMapa.limpaMapa();
            int contagemJogadas = 0;
            jogoMapa.desenha(contagemJogadas);

            int sorteioInicio = jogoMapa.sortear(0, 1);
            boolean vezUsuario = (sorteioInicio == 1);


            while (true) {
                if (vezUsuario) {
                    jogoJogador.joga(teclado);
                    jogoMapa.desenha(contagemJogadas);
                    contagemJogadas++;
                } else {
                    jogoPC.joga(teclado);
                    jogoMapa.desenha(contagemJogadas);
                    contagemJogadas++;
                }

                vezUsuario = !vezUsuario;

                if (contagemJogadas == 9 && !jogoMapa.ganhou('X') && !jogoMapa.ganhou('O')) {
                    System.out.println("Empate !");
                    break;
                }

                if (jogoMapa.ganhou('X') || jogoMapa.ganhou('O')) {
                    break;
                }
            }
            System.out.println("Deseja jogar novamente? (s/n)");
            String respostaUser = teclado.next();
            if (!respostaUser.trim().equalsIgnoreCase("S")) {
                continuarJogo = false;
            }
        }

    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        jogoMapa = new JogoDaVelha_Mapa();
        jogoPC = new JogoDaVelha_PC(jogoMapa);
        jogoJogador = new JogoDaVelha_Jogador(jogoMapa);
        JogoDaVelha jogoDaVelha = new JogoDaVelha();
        jogoDaVelha.jogar(teclado);

    }

}