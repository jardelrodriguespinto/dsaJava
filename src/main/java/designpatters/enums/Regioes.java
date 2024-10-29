package designpatters.enums;

public enum Regioes
{
    NORTE("Norte"),
    NORDESTE("Nordeste"),
    CENTROOESTE("Centro-Oeste"),
    SUDESTE("Sudeste"),
    SUL("Sul");

    private String descricao;

    Regioes(String descricao){
        this.descricao = descricao;
    }

    public String getDescricao(){
        return this.descricao;
    }
}
