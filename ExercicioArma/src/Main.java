public class Main {
    public static void main(String[] args) {

        Arma a1 = new Arma(5,8);
        Arma a2 = new Arma(7,4);

        Jogador j1 = new Jogador(a1,10,5);
        Jogador j2 = new Jogador(a2,10,5);

        System.out.println(j1.toString());
        System.out.println(j2.toString());

        j1.atacar(j2);
        j2.atacar(j1);

        System.out.println(j1.toString());
        System.out.println(j2.toString());


    }
}