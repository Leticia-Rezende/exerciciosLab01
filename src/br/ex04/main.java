package br.ex04;

public class main {
    public static void main(String[]args){
        Aluno aluno = new Aluno();
        Aluno aluno01 = new Aluno( "Pedro",26, "2024147.89", "Engenharia de Software");
        aluno.exibirInformacoes();
        aluno01.exibirInformacoes();
    }
}
