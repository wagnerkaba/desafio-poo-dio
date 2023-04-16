package br.com.dio.desafio.dominio.pessoas;

public class ProfessorJava extends Pessoa implements Professor{

    @Override
    public void ensinar() {
        System.out.println("Eu sou professor de JAVA");
    }
}
