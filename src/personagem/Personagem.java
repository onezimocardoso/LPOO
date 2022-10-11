package personagem;

import armas.*;

public abstract class Personagem {
//variável de instância
    TrocaArma arma;

    public void setArma(TrocaArma arma){
        this.arma=arma;
    }

    public TrocaArma getArma() {
        return arma.arma();
    }

    public abstract void lutar();

}
