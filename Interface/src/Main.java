public class Main {
    public static void main(String[] args) {

        Nadador nadador = new Nadador();
        Ciclista ciclista = new Ciclista();
        Corredor corredor = new Corredor();

        nadador.treinar();

        corredor.colocarEquipamento();
        corredor.treinar();

        ciclista.colocarEquipamento();
        ciclista.treinar();
    }
}