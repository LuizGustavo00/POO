import java.io.*;

public class Arquivo {

    // Método para escrever no arquivo em modo de anexação
    public void escrever(String x) {
        try (FileOutputStream fluxoSaida = new FileOutputStream("scratch.txt", true);
             OutputStreamWriter geradorFluxoSaida = new OutputStreamWriter(fluxoSaida);
             BufferedWriter bufferSaida = new BufferedWriter(geradorFluxoSaida)) {

            bufferSaida.write(x);
            bufferSaida.newLine();
        } catch (Exception e) {
            System.err.println("Erro ao escrever no arquivo: " + e.getMessage());
        }
    }


    public void ler() {
        try (FileInputStream fluxoEntrada = new FileInputStream("scratch.txt");
             InputStreamReader geradorFluxoEntrada = new InputStreamReader(fluxoEntrada);
             BufferedReader bufferEntrada = new BufferedReader(geradorFluxoEntrada)) {

            String leitura = bufferEntrada.readLine();
            if (leitura == null) {
                System.out.println("O arquivo está vazio.");
                return;
            }

            while (leitura != null) {
                System.out.println(leitura);
                leitura = bufferEntrada.readLine();
            }
        } catch (FileNotFoundException e) {
            System.err.println("O arquivo não foi encontrado: " + e.getMessage());
        } catch (IOException e) {
            System.err.println("Erro ao ler o arquivo: " + e.getMessage());
        }
    }
}
