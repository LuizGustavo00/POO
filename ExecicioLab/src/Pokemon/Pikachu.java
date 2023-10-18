package Pokemon;

import Interfaces.AtaqueEspecial;
import Interfaces.FazerBarulho;

public class Pikachu extends Pokemon implements AtaqueEspecial, FazerBarulho {
    private float soltarRaios;
    private float paralisiaEletrica;

    public Pikachu(){
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
    public void ataqueEspecial() {
        if(soltarRaios >= 750){
            System.out.println(this.getNome() + " esta usando seu ataque especial...");
            System.out.println(this.getNome() + " conseguiu ganhar a batalha!");
        } else if (soltarRaios < 750){
            System.out.println(this.getNome()+ " perdeu a batalha!");
        }


    }

    @Override
    public void fazerBarulho() {
        System.out.println(this.getNome()+" esta fazendo barulho!");
    }

    public float getSoltarRaios() {
        return soltarRaios;
    }

    public void setSoltarRaios(float soltarRaios) {
        this.soltarRaios = soltarRaios;
    }

    public float getParalisiaEletrica() {
        return paralisiaEletrica;
    }

    public void setParalisiaEletrica(float paralisiaEletrica) {
        this.paralisiaEletrica = paralisiaEletrica;
    }
}
