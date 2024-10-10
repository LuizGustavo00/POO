public class Ciclista extends Atleta implements Equipamento{
    @Override
    public void colocarEquipamento() {
        System.out.println("Ciclista pegou a bicicleta");
    }

    @Override
    public void treinar() {
        System.out.println("Ciclista treinando");
    }
}
