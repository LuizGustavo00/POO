public class Main {
    public static void main(String[] args) {
        Contador2 contador = new Contador2();
        new Thread(contador).start();

        Contador4 contador4 = new Contador4();
        new Thread(contador4).start();

        ContadorQuadrado contadorQuadrado = new ContadorQuadrado();
        new Thread(contadorQuadrado).start();
    }
}