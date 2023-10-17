import java.util.Scanner;

public class NickName {
    Scanner resposta = new Scanner(System.in);
    public void escolherNome(){
        System.out.println("Qual é o seu nome?");
        String nick = resposta.next();
        System.out.println("Bem vindo " + nick);
    }
}
