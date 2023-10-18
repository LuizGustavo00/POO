package Pokemon;
import Interfaces.FazerBarulho;

public class Squirtle extends Pokemon implements FazerBarulho {
    private float multiplicadorAgua;

    public Squirtle(){
        super();
    }

    @Override
    public void mostraInfo() {
        super.mostraInfo();
    }

    @Override
    public void atacar() {
        System.out.println(this.getNome() + " esta atacando!");
    }

    @Override
    public void fazerBarulho() {
        System.out.println(this.getNome()+" esta fazendo barulho!");
    }
}
