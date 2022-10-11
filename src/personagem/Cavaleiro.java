package personagem;

import armas.*;

public class Cavaleiro extends Personagem{

    public Cavaleiro() {
        arma = new Machado();
    }

    @Override
    public void lutar() {
        System.out.println("Sou um cavaleiro lutando!");
    }


}
