package br.com.dio.desafio.dominio.pessoas;

public abstract class Pessoa {

    private String nome;

    public Pessoa(String nome){
        this.nome = nome;
    }

    public void apresentarPessoa() {
        System.out.println("Olá, meu nome é " + nome);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
