package designpatters.builder;

import designpatters.Livro;
import designpatters.enums.Genero;

public class LivroBuilder
{
    private String titulo;
    private String author;
    private int qtdPaginas;
    private Genero genero;

    public LivroBuilder titulo(String titulo){
        this.titulo = titulo;
        return this;
    }
    public LivroBuilder author(String author){
        this.author = author;
        return this;
    }
    public LivroBuilder qtdPaginas(int qtdPaginas){
        this.qtdPaginas = qtdPaginas;
        return this;
    }
    public LivroBuilder genero(Genero genero){
        this.genero = genero;
        return this;
    }

    public Livro build()
    {
        return new Livro(titulo,author,qtdPaginas,genero);
    }
}
