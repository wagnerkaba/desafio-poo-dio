package br.com.dio.desafio.dominio.pessoas;

public class ProfessorJava extends Pessoa implements Professor{

    public ProfessorJava(String nome) {
        super(nome);
    }

    @Override
    public void ensinar() {
        System.out.println("Eu sou professor de JAVA");
    }
}
