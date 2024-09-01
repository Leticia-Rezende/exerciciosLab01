package br.ex05;

public class ContaBancaria {
    public String numeroConta;
    private double saldo;

    public ContaBancaria(){ //construtor sem paramêtro
        this.numeroConta = "18712463-9";
        this.saldo = 154.49;
    }
    public ContaBancaria(String numeroConta, double saldo){ //construtor com paramêtro
        this.numeroConta = numeroConta;
        this.saldo = saldo;

    }
    public void exibirSaldo(){
        System.out.println("O numero da conta bancaria é: " + this.numeroConta);
        System.out.println("O saldo disponível é: " + this.saldo + " reais");
    }
}
