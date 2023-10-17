import java.io.IOException;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Qual é o seu nickname? ");
        String nickname = scanner.next();

        NickName nickName = new NickName();
        Heroi heroi = new Heroi();
        Monstro monstro = new Monstro();

        nickName.escolherNome();
        heroi.escolherHeroi();
        monstro.escolherMonstro();

        Batalha batalha = new Batalha();
        batalha.iniciarBatalha(heroi, monstro);

        LogBatalha logBatalha = new LogBatalha();
        logBatalha.setDataPartida(new Date());
        logBatalha.setHeroiEscolhido(heroi.getNome());
        logBatalha.setMonstroEnfrentado(monstro.getNome());
        logBatalha.setQuantidadeDeRodadas(batalha.getRodadas());

        try {
            logBatalha.gravarLog(nickname);
        } catch (IOException e) {
            System.err.println("Erro ao gravar o registro da batalha: " + e.getMessage());
        }
    }
}
