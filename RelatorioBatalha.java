import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RelatorioBatalha {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o nickname do jogador: ");
        String nickname = scanner.next();

        try {
            List<BatalhaRegistro> registros = carregarRegistros(nickname);

            // Realize as análises desejadas com os registros de batalha
        } catch (IOException e) {
            System.err.println("Erro ao carregar registros de batalha: " + e.getMessage());
        }
    }

    private static List<BatalhaRegistro> carregarRegistros(String nickname) throws IOException {
        List<BatalhaRegistro> registros = new ArrayList<>();
        String fileName = "temp/" + nickname + ".csv";

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(";");
                // Parse os dados e crie instâncias de BatalhaRegistro
            }
        }

        return registros;
    }
}
