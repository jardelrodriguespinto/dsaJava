package designpatters.factory;

import designpatters.enums.Cor;

public abstract class Transporte
{
    public Cor cor;
    void mover(){
        System.out.println("Movendo");
    }
    void parar(){
        System.out.println("Parando");
    }
}
