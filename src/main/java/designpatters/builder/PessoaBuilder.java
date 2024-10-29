package designpatters.builder;

import designpatters.Pessoa;

public class PessoaBuilder
{
    private String nome;
    private String sobrenome;
    private int idade;

    public PessoaBuilder nome(String nome){
        this.nome = nome;
        return this;
    }

    public PessoaBuilder sobrenome(String sobrenome)
    {
        this.sobrenome = sobrenome;
        return this;
    }

    public PessoaBuilder idade(int idade)
    {
        this.idade = idade;
        return this;
    }

    public Pessoa build()
    {
        return new Pessoa(nome, sobrenome, idade);
    }

}
