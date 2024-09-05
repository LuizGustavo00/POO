public class Calculadora {

    private static float PI;

    public static double circuferencia(double raio){
        return 2*Math.PI*raio;
    }

    public static double volumeEsfera(double raio){
        return (4*Math.PI*Math.pow(raio,3))/3;
    }

    public static double volumeCilindro(double raio, double altura){
        return Math.PI*Math.pow(raio,2)*altura;
    }

}
