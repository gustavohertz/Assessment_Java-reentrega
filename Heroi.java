import java.util.Scanner;
import java.util.Random;
public class Heroi {
    String nomeHeroi;
    int HitPointsHeroi;
    int ForcaHeroi;
    int DefesaHeroi;
    int AgilidadeHeroi;
    int FatorDanoHeroi;
    Random dadosRolar = new Random();
    public void escolherHeroi(){

        Scanner entrada = new Scanner(System.in);

        System.out.println("escolha uma classe:");
        System.out.println("Guerreiro: HP: 12 | For: 4 | Def: 3 | Agl: 3 | FDano: 2D4 ");
        System.out.println("Barbaro: HP: 13 | For: 6 | Def: 1 | Agl: 3 | FDano: 2D6 ");
        System.out.println("Paladino: HP: 15 | For: 2 | Def: 5 | Agl: 1 | FDano: 2D4 ");

        String classe = entrada.next();

            if (classe.equals("Guerreiro")) {
                System.out.println("Você escolheu Guerreiro!");
                nomeHeroi = "Guerreiro";
                HitPointsHeroi = 12;
                ForcaHeroi = 4;
                DefesaHeroi = 3;
                AgilidadeHeroi = 3;
                FatorDanoHeroi = dadosRolar.nextInt(4) + dadosRolar.nextInt(4) + 2;

            } else if (classe.equals("Barbaro")) {
                System.out.println("Você escolheu Bárbaro!");
                nomeHeroi = "Barbaro";
                HitPointsHeroi = 13;
                ForcaHeroi = 6;
                DefesaHeroi = 1;
                AgilidadeHeroi = 3;
                FatorDanoHeroi = dadosRolar.nextInt(6) + dadosRolar.nextInt(6) + 2;
            } else if (classe.equals("Paladino")) {
                System.out.println("Você escolheu Paladino!");
                nomeHeroi = "Paladino";
                HitPointsHeroi = 15;
                ForcaHeroi = 2;
                DefesaHeroi = 5;
                AgilidadeHeroi = 1;
                FatorDanoHeroi = dadosRolar.nextInt(4) + dadosRolar.nextInt(4) + 2;
            } else {
                System.out.println("Classe inválida. Saindo do programa.");
                return;
            }
        }


    public String getNome() {
        return nomeHeroi;
    }
}
