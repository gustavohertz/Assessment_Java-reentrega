import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

public class LogBatalha {
    private Date dataPartida;
    private String heroiEscolhido;
    private String resultado;
    private String monstroEnfrentado;
    private int quantidadeDeRodadas;

    public Date getDataPartida() {
        return dataPartida;
    }

    public void setDataPartida(Date dataPartida) {
        this.dataPartida = dataPartida;
    }

    public String getHeroiEscolhido() {
        return heroiEscolhido;
    }

    public void setHeroiEscolhido(String heroiEscolhido) {
        this.heroiEscolhido = heroiEscolhido;
    }

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }

    public String getMonstroEnfrentado() {
        return monstroEnfrentado;
    }

    public void setMonstroEnfrentado(String monstroEnfrentado) {
        this.monstroEnfrentado = monstroEnfrentado;
    }

    public int getQuantidadeDeRodadas() {
        return quantidadeDeRodadas;
    }

    public void setQuantidadeDeRodadas(int quantidadeDeRodadas) {
        this.quantidadeDeRodadas = quantidadeDeRodadas;
    }

    public String toCSV() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        return dateFormat.format(dataPartida) + ";" + heroiEscolhido + ";" + resultado + ";" + monstroEnfrentado + ";" + quantidadeDeRodadas;
    }

    public void gravarLog(String nickname) throws IOException {
        String fileName = "temp/" + nickname + ".csv";
        PrintWriter writer = new PrintWriter(new FileWriter(fileName, true));
        writer.println(toCSV());
        writer.close();
    }
}
