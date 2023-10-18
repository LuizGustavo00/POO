package Pokemon;

import Interfaces.AtaqueEspecial;
import Interfaces.FazerBarulho;

public class Bulbassaur extends Pokemon implements FazerBarulho, AtaqueEspecial {
    private float luminosidade;

    public Bulbassaur(){
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
        System.out.println(this.getNome()+" esta usando seu ataque especial...");
        if(luminosidade > 650){
            System.out.println(this.getNome() + " conseguiu ganhar a batalha!");
        }else
            System.out.println(this.getNome()+ " perdeu a batalha!");
    }

    @Override
    public void fazerBarulho() {
        System.out.println(this.getNome()+" esta fazendo barulho!");
    }

    public void setLuminosidade(float luminosidade) {
        this.luminosidade = luminosidade;
    }

    public float getLuminosidade() {
        return luminosidade;
    }

    @Override
    public String getHeldItem() {
        return super.getHeldItem();
    }
}
