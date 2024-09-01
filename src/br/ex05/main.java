package br.ex05;

public class main {
    public static void main(String[] args){
        Cliente cliente = new Cliente();
        cliente.exibirDadosCliente();
        ContaBancaria contaBancaria = new ContaBancaria();
        contaBancaria.exibirSaldo();
        Cliente cliente01 = new Cliente( "Amanda" , "654.875.981.65");
        cliente01.exibirDadosCliente();
        ContaBancaria contaBancaria01 = new ContaBancaria("27885469-7", 986.57);
        contaBancaria01.exibirSaldo();
    }
}
