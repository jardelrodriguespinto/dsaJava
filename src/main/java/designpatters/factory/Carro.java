package designpatters.factory;
public class Carro extends Transporte
{
    private int qtdPortas;
    private String placa;

    public Carro(int qtdPortas, String placa) {
        this.qtdPortas = qtdPortas;
        this.placa = placa;
    }

    @Override
    void mover() {
        System.out.println("Carro se movendo");
    }

    @Override
    void parar() {
        System.out.println("Carro parando");
    }

    public int getQtdPortas() {
        return qtdPortas;
    }

    public void setQtdPortas(int qtdPortas) {
        this.qtdPortas = qtdPortas;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }
}
