import java.util.Random;
public class Batalha {
    private Random dadosRolar = new Random();
    private Boolean heroiVivo = true;
    private int rodada = 0;

    public void iniciarBatalha(Heroi heroi, Monstro monstro) {
        int HitPointsHeroi = heroi.HitPointsHeroi;
        int ForcaHeroi = heroi.ForcaHeroi;
        int DefesaHeroi = heroi.DefesaHeroi;
        int AgilidadeHeroi = heroi.AgilidadeHeroi;
        int FatorDanoHeroi = heroi.FatorDanoHeroi;

        int HitPointsMonstro = monstro.HitPointsMonstro;
        int ForcaMonstro = monstro.ForcaMonstro;
        int DefesaMonstro = monstro.DefesaMonstro;
        int AgilidadeMonstro = monstro.AgilidadeMonstro;
        int FatorDanoMonstro = monstro.FatorDanoMonstro;


        while (heroiVivo && HitPointsMonstro > 0) {
            rodada++;
            System.out.println("\nRodada #" + rodada + ":");

            int iniciativaHeroi = dadosRolar.nextInt(10) + AgilidadeHeroi;
            int iniciativaMonstro = dadosRolar.nextInt(10) + AgilidadeMonstro;

            System.out.println("Iniciativa do Herói: " + iniciativaHeroi);
            System.out.println("Iniciativa do Monstro: " + iniciativaMonstro);

            if (iniciativaHeroi > iniciativaMonstro) {
                System.out.println("Herói ataca primeiro!");
                int fatorAtaqueHeroi = dadosRolar.nextInt(10) + AgilidadeHeroi + ForcaHeroi;
                int fatorDefesaMonstro = dadosRolar.nextInt(10) + AgilidadeMonstro + DefesaMonstro;
                if (fatorAtaqueHeroi > fatorDefesaMonstro) {
                    int dano = dadosRolar.nextInt(FatorDanoHeroi) + ForcaHeroi;
                    HitPointsMonstro -= dano;
                    System.out.println("Herói causou " + dano + " pontos de dano ao Monstro.");
                } else {
                    System.out.println("Herói errou o ataque.");
                }

                if (HitPointsMonstro <= 0) {
                    System.out.println("Herói venceu a batalha!");

                } else {
                    System.out.println("Monstro ataca!");
                    int fatorAtaqueMonstro = dadosRolar.nextInt(10) + AgilidadeMonstro + ForcaMonstro;
                    int fatorDefesaHeroi = dadosRolar.nextInt(10) + AgilidadeHeroi + DefesaHeroi;

                    if (fatorAtaqueMonstro > fatorDefesaHeroi) {
                        int dano = dadosRolar.nextInt(FatorDanoMonstro) + ForcaMonstro;
                        HitPointsHeroi -= dano;
                        System.out.println("Monstro causou " + dano + " pontos de dano ao Herói.");
                    } else {
                        System.out.println("Monstro errou o ataque.");
                    }

                    if (HitPointsHeroi <= 0) {
                        System.out.println("Monstro venceu a batalha!");
                        heroiVivo = false;
                    }
                }
            } else if (iniciativaHeroi < iniciativaMonstro) {
                System.out.println("Monstro ataca primeiro!");
                int fatorAtaqueMonstro = dadosRolar.nextInt(10) + AgilidadeMonstro + ForcaMonstro;
                int fatorDefesaHeroi = dadosRolar.nextInt(10) + AgilidadeHeroi + DefesaHeroi;

                if (fatorAtaqueMonstro > fatorDefesaHeroi) {
                    int dano = dadosRolar.nextInt(FatorDanoMonstro) + ForcaMonstro;
                    HitPointsHeroi -= dano;
                    System.out.println("Monstro causou " + dano + " pontos de dano ao Herói.");
                } else {
                    System.out.println("Monstro errou o ataque.");
                }

                if (HitPointsHeroi <= 0) {
                    System.out.println("Monstro venceu a batalha!");
                    heroiVivo = false;
                } else {
                    System.out.println("Herói ataca!");
                    int fatorAtaqueHeroi = dadosRolar.nextInt(10) + AgilidadeHeroi + ForcaHeroi;
                    int fatorDefesaMonstro = dadosRolar.nextInt(10) + AgilidadeMonstro + DefesaMonstro;

                    if (fatorAtaqueHeroi > fatorDefesaMonstro) {
                        int dano = dadosRolar.nextInt(FatorDanoHeroi) + ForcaHeroi;
                        HitPointsMonstro -= dano;
                        System.out.println("Herói causou " + dano + " pontos de dano ao Monstro.");
                    } else {
                        System.out.println("Herói errou o ataque.");
                    }
                }
            } else {
                System.out.println("Empate na iniciativa, repetindo o teste.");
            }
        }
        if (HitPointsHeroi <= 0) {
            System.out.println("Herói foi derrotado!");
        }
        if (HitPointsMonstro <= 0) {
            System.out.println("Herói venceu a batalha!");
        }
    }

    public boolean vitoria(Monstro monstro) {
        int HitPointsMonstro = monstro.HitPointsMonstro;
        if (HitPointsMonstro <= 0) {
            return true;
        }else{
            return false;
        }

    }

    public int getRodadas() {
        return rodada;
    }

}
