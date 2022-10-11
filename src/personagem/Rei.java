package personagem;

import armas.*;

public class Rei extends Personagem{

    public Rei() {
        arma = new Espada ();
    }
    @Override
    public void lutar() {
        System.out.println("Sou um rei lutando!");
    }


    }
