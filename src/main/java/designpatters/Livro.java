package designpatters;

import designpatters.enums.Genero;

public class Livro
{
    private String titulo;
    private String author;
    private int qtdPaginas;
    private Genero genero;

    public Livro(String titulo, String author, int qtdPaginas, Genero genero)
    {
        this.titulo = titulo;
        this.author = author;
        this.qtdPaginas = qtdPaginas;
        this.genero = genero;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getQtdPaginas() {
        return qtdPaginas;
    }

    public void setQtdPaginas(int qtdPaginas) {
        this.qtdPaginas = qtdPaginas;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }
}
