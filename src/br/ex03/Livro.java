// --> Crie uma classe chamada Livro com os seguintes atributos:
       // ● titulo (String) - Atributo público.
       // ● autor (String) - Atributo privado.
       // ● preco (double) - Atributo protegido.
       // ● paginas (int) - Atributo com visibilidade padrão.
// Adicione um construtor que inicialize todos os atributos. Implemente um método sem
// parâmetros chamado detalhesDoLivro que exiba todas as informações do livro.

package br.ex03;

public class Livro {
    public String titulo;
    private String autor;
    protected double preco;
    int paginas;

    public Livro(){
        this.titulo = "O vendendor de Sonhos";
        this.autor = "Augusto Cury";
        this.preco = 29.90;
        this.paginas = 305;

    }
    public void detalhesDoLivro(){
        System.out.println("O titulo do livro é : " + this.titulo);
        System.out.println("O nome do autor é : " + this.autor);
        System.out.println("O preço do livro é : " + this.preco);
        System.out.println("A quantidade de paginas é : " + this.paginas);
    }
}
