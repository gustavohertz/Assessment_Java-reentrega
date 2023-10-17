import java.util.Random;
public class Monstro {
    String nomeMonstro;
    int HitPointsMonstro = 0;
    int ForcaMonstro = 0;
    int DefesaMonstro = 0;
    int AgilidadeMonstro = 0;
    int FatorDanoMonstro = 0;

    Random fatorAleatorio = new Random();
    public void escolherMonstro(){
        int monstroEscolhido = fatorAleatorio.nextInt(1, 3);
        if(monstroEscolhido == 1){
            System.out.println("O monstro é: Morto-vivo");
            nomeMonstro = "Morto-vivo";
            HitPointsMonstro = 25;
            ForcaMonstro = 4;
            DefesaMonstro = 0;
            AgilidadeMonstro = 1;
            FatorDanoMonstro = fatorAleatorio.nextInt(4) + fatorAleatorio.nextInt(4) + 2;
        } else if (monstroEscolhido == 2) {
            System.out.println("O monstro é: Ork");
            nomeMonstro = "Ork";
            HitPointsMonstro = 20;
            ForcaMonstro = 6;
            DefesaMonstro = 2;
            AgilidadeMonstro = 2;
            FatorDanoMonstro = fatorAleatorio.nextInt(8) + 2;
        } else if (monstroEscolhido == 3) {
            System.out.println("O monstro é: Kobold");
            nomeMonstro = "Kobold";
            HitPointsMonstro = 20;
            ForcaMonstro = 4;
            DefesaMonstro = 2;
            AgilidadeMonstro = 4;
            FatorDanoMonstro = fatorAleatorio.nextInt(6) + 2;
        }
    }

    public String getNome() {
        return nomeMonstro;
    }
}
