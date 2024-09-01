// --> Crie uma classe chamada Carro que tenha os seguintes atributos:
       // ● marca (String) - Atributo público.
       // ● modelo (String) - Atributo protegido.
       // ● ano (int) - Atributo com visibilidade padrão (default).
       // ● preco (double) - Atributo privado.
// Defina um construtor sem parâmetros que inicialize os atributos com valores padrão. Crie
// também um método público chamado exibirDetalhes que exiba no console as
// informações do carro.

package br.ex01;

public class Carro {

    public String marca;
    protected String modelo;
    int ano;
    private double preco;

        //Costrutor
    public Carro(){
        this.marca = "Ford";
        this.modelo = "Ranger";
        this.ano = 2024;
        this.preco = 150000;
        }
    public Carro(String marca, String modelo, int ano, double preco){
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.preco = preco;

        }
        //Metódos
    public void exibirDetalhes(){
        System.out.println("\n" + "A marca é: " + this.marca);
        System.out.println("O modelo é: " + this.modelo);
        System.out.println("O ano é: " + this.ano);
        System.out.println("O preço é: " + this.preco);

        }
    }

