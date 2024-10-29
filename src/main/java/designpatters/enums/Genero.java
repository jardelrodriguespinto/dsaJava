package designpatters.enums;

public enum Genero
{
    TERROR("TERROR"),
    FICCAO("FICÇÃO"),
    DRAMA("DRAMA");

    private String descricao;

    Genero(String descricao)
    {
        this.descricao = descricao;
    }

    public String getDescricao()
    {
        return this.descricao;
    }

}
