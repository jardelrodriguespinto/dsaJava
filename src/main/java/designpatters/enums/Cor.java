package designpatters.enums;

public enum Cor
{
    CINZA("Cinza"),
    AZUL("Azul"),
    PRATA("Prata"),
    BRANCO("Branco"),
    PRETO("Preto");

    private String descricao;
    Cor(String descricao)
    {
        this.descricao = descricao;
    }

    public String getDescricao(){
        return this.descricao;
    }
}
