public class Autor {
    private String nome;
    Saga[] sagas;

    public Autor(String nome, Saga[] sagas) {
        this.nome = nome;
        this.sagas = new Saga[sagas.length];
        for (int i = 0; i < sagas.length; i++) {
            this.sagas[i] = sagas[i];
        }
    }

    public void listarSagas() {
        for (int i = 0; i < sagas.length; i++) {
            if (sagas[i] != null) {
                System.out.println("Saga com nota: " + sagas[i].getNota());
                sagas[i].listarLivros();
            }
        }
    }
}
