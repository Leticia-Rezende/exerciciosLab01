// --> Crie uma classe Aluno com os seguintes atributos:
       // ● nome (String) - Atributo protegido.
       // ● idade (int) - Atributo privado.
       // ● matricula (String) - Atributo público.
       // ● curso (String) - Atributo com visibilidade padrão.

// Adicione um construtor sem parâmetros e outro com parâmetros para inicializar os atributos.
// Implemente um método sem parâmetros chamado exibirInformacoes que mostre os
// detalhes do aluno.

package br.ex04;

public class Aluno {
    protected String aluno;
    private int idade;
    public String matricula;
    String curso;

    public Aluno(){ //construtor sem paramêtro
        this.aluno = "Aline";
        this.idade = 24;
        this.matricula = "2024158.15";
        this.curso = "Engenharia de Software";
    }
    public Aluno(String aluno, int idade, String matricula, String curso){ //construtor com paramêtro
        this.aluno = aluno;
        this.idade = idade;
        this.matricula = matricula;
        this.curso = curso;
    }
    public void exibirInformacoes(){
        System.out.println("\n" + "O nome do aluno é: " + this.aluno);
        System.out.println("A idade é: " + this.idade);
        System.out.println("O numero da matricula é: " + this.matricula);
        System.out.println("O nome do curso é : " + this.curso);


    }
}
