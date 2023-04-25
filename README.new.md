
# Novas implementações criadas por Wagner Kaba

Fiz novas implementações no projeto com o fim de praticar os conceitos aprendidos sobre ABSTRAÇÃO, ENCAPSULAMENTO, HERANÇA E POLIMORFISMO.

## 1. ENCAPSULAMENTO

O encapsulamento refere-se à prática de ocultar os detalhes internos de um objeto e expor apenas o necessário. Isso ajuda a obter proteção de dados e garante que o estado do objeto permaneça consistente.

Exemplo:

```
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
```
Neste exemplo, a classe `Pessoa` possui o campo privado `nome` com o `getter` e o `setter`correspondente.

Os detalhes internos do objeto `Pessoa` são encapsulados e só podem ser acessados e modificados por meio dos métodos `getter` e `setter`, garantindo a devida proteção dos dados.

## 2. HERANÇA

A herança permite que uma classe herde propriedades e métodos de outra classe, permitindo a reutilização de código e criando um relacionamento pai-filho entre as classes.

Exemplo:

```
public class ProfessorJava extends Pessoa implements Professor{

    @Override
    public void ensinar() {
        System.out.println("Eu sou professor de JAVA");
    }
}
```
Neste exemplo, a classe `ProfessorJava` herda da classe abstrata `Pessoa`. Assim, a classe `ProfessorJava` passa a ter um `nome` herdado de `Pessoa`, além de ter seu próprio método `ensinar()`   Dessa forma, há reusabilidade de código através da herança. 

## 3. Polimorfismo

Polimorfismo é a capacidade de um objeto ser referenciado de diversas formas diferentes e com isso realizar as mesmas tarefas (ou chamadas de métodos) de diferentes formas., facilitando a flexibilidade e extensibilidade do código.

Exemplo:

```
        Pessoa andre = new Dev("André");
        Pessoa marcos = new ProfessorJava("Marcos");
        andre.apresentarPessoa();
        marcos.apresentarPessoa();
```

Aqui temos duas classes: `Dev` e `ProfessorJava`, ambas herdando da classe abstrata `Pessoa` A classe `Pessoa` define um método abstrato `apresentarPessoa()`, que é implementado por suas subclasses concretas `Dev` e `ProfessorJava`.

Foram criados dois objetos `andre` e `marcos` da classe `Pessoa`, mas seus tipos de tempo de execução reais são `Dev` e `ProfessorJava`, respectivamente. Isso significa que podemos chamar o método `apresentarPessoa()` em ambos os objetos, mesmo que eles pertençam a diferentes subclasses. Na hora da execução, o Java determina os tipos de tempo de execução reais dos objetos e chama a versão apropriada do método `apresentarPessoa()`, que é definido nas subclasses. Isso é um exemplo de polimorfismo dinâmico ou polimorfismo em tempo de execução.

O polimorfismo nos permite escrever código mais flexível e reutilizável, projetando classes para serem mais genéricas e permitindo que sejam usadas em uma variedade de contextos, com objetos de diferentes tipos que compartilham um comportamento comum. Neste exemplo, a classe `Pessoa` define o comportamento comum de exibir informações, que é implementado de forma diferente pelas subclasses `Dev` e `ProfessorJava`, mas pode ser usado de forma intercambiável onde um objeto `Pessoa` é esperado. Isso torna o código mais modular e mais fácil de manter.