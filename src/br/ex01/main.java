package br.ex01;

public class main {
    public static void main(String[]arg){
        Carro carroEx01 = new Carro(); //Ex01 - define dentro do construtor
        Carro carroEx02 = new Carro( "Chevrolet", "Cruze", 2024, 150000); // define no momento de instanciar
        carroEx01.exibirDetalhes();
        carroEx02.exibirDetalhes();
    }
}
