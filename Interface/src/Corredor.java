public class Corredor extends Atleta implements Equipamento{
    @Override
    public void colocarEquipamento() {
        System.out.println("Corredor colocou tenis");
    }

    @Override
    public void treinar() {
        System.out.println("Corredor treinando");
    }
}
