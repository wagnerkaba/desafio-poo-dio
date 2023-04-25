package br.com.dio.desafio.dominio.pessoas;

public class ProfessorJS extends Pessoa implements Professor{

    public ProfessorJS(String nome){
        super(nome);
    }
    @Override
    public void ensinar() {
        System.out.println("Eu sou professor de JAVASCRIPT");
    }
}
