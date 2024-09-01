// --> Crie duas classes chamadas ContaBancaria e Cliente. Na classe ContaBancaria,
//defina os seguintes atributos:
       // ● numeroConta (String) - Atributo público.
       // ● saldo (double) - Atributo privado.
// Na classe Cliente, defina os seguintes atributos:
       // ● nome (String) - Atributo protegido.
       // ● cpf (String) - Atributo com visibilidade padrão.
// Implemente construtores com e sem parâmetros para ambas as classes. Em
// ContaBancaria, implemente um método chamado exibirSaldo que mostre o saldo da
// conta. Em Cliente, implemente um método chamado exibirDadosCliente que exiba o
// nome e CPF do cliente.

package br.ex05;

public class Cliente {
    protected String nome;
    String cpf;

    public Cliente(){
        this.nome = "João";
        this.cpf = "986.456.541-39";
    }
    public Cliente(String nome, String cpf){
        this.nome = nome;
        this.cpf = cpf;
    }

    public void exibirDadosCliente(){
        System.out.println("\n" + "O nome do cliente é: " + this.nome);
        System.out.println("O numero do CPF é: " + this.cpf);
    }
}
