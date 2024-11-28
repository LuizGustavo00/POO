import Exception.*;

public class Main {
    public static void main(String[] args) {
        Arquivo arquivo = new Arquivo();

        Fetin fetin = new Fetin();

        try {
            fetin.addFetin("Projeto 1", 9.5);
            arquivo.escrever("Projeto 1: 9.5");

            fetin.addFetin("Projeto 2", 6);
            arquivo.escrever("Projeto 2: 6");


            System.out.println("Premiação da FETIN 2024");

            //tentativa de adicionar nome repetido
            fetin.addFetin("Projeto 1", 9.0);
            arquivo.escrever("Projeto 3: 9");

            //tentativa de adicionar nota insuficiente
            //fetin.addFetin("Projeto 3", 4.5);
            //arquivo.escrever("Projeto 3: 4.5");

            System.out.println("Nota do projeto 3: " + fetin.getNota("Projeto 3"));
        } catch (NomeException e) {
        System.err.println("Erro: " + e.getMessage());
        } catch (NotaInsuficienteException e) {
        System.err.println("Error: " + e.getMessage());
        } catch (Exception e) {
        System.err.println("Um erro inesperado aconteceu: " + e.getMessage());
        }

        try {
            arquivo.ler();
        } catch (Exception e) {
            System.err.println("Erro durante a execução: " + e.getMessage());
        }
    }
}
