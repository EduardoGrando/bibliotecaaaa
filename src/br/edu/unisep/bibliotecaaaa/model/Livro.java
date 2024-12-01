package br.edu.unisep.bibliotecaaaa.model;

public class Livro {
    private String titulo;
    private Autor autor;
    private Genero genero;
    private String tipo; // Tipo pode ser "Físico" ou "Digital"
    private int quantidade; // Apenas para livros físicos

    // Construtor para livro físico
    public Livro(String titulo, Autor autor, Genero genero, String tipo, int quantidade) {
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
        this.tipo = tipo;
        this.quantidade = quantidade;
    }

    // Construtor para livro digital
    public Livro(String titulo, Autor autor, Genero genero, String tipo) {
        this(titulo, autor, genero, tipo, 0); // Sem quantidade para digital
    }

    public String getTitulo() {
        return titulo;
    }

    public Autor getAutor() {
        return autor;
    }

    public Genero getGenero() {
        return genero;
    }

    public String getTipo() {
        return tipo;
    }

    public int getQuantidade() {
        return quantidade;
    }

    // Exibe detalhes do livro
    public void exibirDetalhes() {
        System.out.println("Título: " + titulo + ", Autor: " + autor.getNome() + ", Gênero: " + genero.getNome() + ", Tipo: " + tipo);
        if (tipo.equals("Físico")) {
            System.out.println("Quantidade disponível: " + quantidade);
        }
    }
}
