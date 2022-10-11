package personagem;

import armas.*;

public class Teste {
    public static void main(String[] args) {

        Personagem o = new Rei();
        o.lutar();
        o.getArma();
        o.setArma(new Machado());
        o.getArma();
    }

}
