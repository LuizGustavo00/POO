import Pokemon.*;

public class Main {
    public static void main(String[] args) {

        Treinador treinador = new Treinador();

        treinador.setNome("Ash");

        Bulbassaur p1 = new Bulbassaur();
        p1.setNome("Bulbassauro");
        p1.setTipo("Planta");
        p1.setHeldItem("Equipado");
        p1.setLuminosidade(30);
        if(p1.getHeldItem()== "Equipado"){
            p1.setLuminosidade(p1.getLuminosidade()+300);
        }

        Pikachu p2 = new Pikachu();
        p2.setNome("Pikachu");
        p2.setTipo("Eletrico");
        p2.setHeldItem("Equipado");
        p2.setParalisiaEletrica(50);
        p2.setSoltarRaios(600);
        if(p2.getHeldItem()== "Equipado"){
            p2.setSoltarRaios(p2.getSoltarRaios()+200);
        }

        Squirtle p3 = new Squirtle();
        p3.setNome("Squirtle");
        p3.setTipo("Agua");
        p3.setHeldItem("Não");

        treinador.addPokemon(p1);
        treinador.addPokemon(p2);
        treinador.addPokemon(p3);

        treinador.monstraInfo();
        System.out.println();

        p1.atacar();
        p1.ataqueEspecial();
        p1.fazerBarulho();
        System.out.println();

        p2.atacar();
        p2.ataqueEspecial();
        p2.fazerBarulho();
        System.out.println();

        p3.atacar();
        p3.fazerBarulho();
        System.out.println();

        System.out.println("O numero de persoagens na cidade é de: " + Pokemon.qtdPokemon);




    }
}