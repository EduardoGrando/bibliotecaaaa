package br.edu.unisep.bibliotecaaaa.view;

import br.edu.unisep.bibliotecaaaa.model.*;


import java.util.Date;

public class Biblioteca {
    public static void main(String[] args) {
   
        Autor autor1 = new Autor("MICKEY", "PORTUGUES");
        Autor autor2 = new Autor("BOB ESPONJA", "CHIINES");
        Genero genero1 = new Genero("ROMANCE");
        Genero genero2 = new Genero("TERROR");


        Livro livro1 = new Livro("A BUSCA DE ALGO ENCONTRADO", autor1, genero1, "FISICO", 10);
        Livro livro2 = new Livro("VENDO O QUE NAO É VISTO", autor2, genero2, "DIGITAL");


        Usuario usuario1 = new Usuario("EDUARDO GRANDO", "PAOCOMBATATA@GMAIL");
        Usuario usuario2 = new Usuario("MURILO GANZALA", "TEMPORAL7654@GMAIL");


        Emprestimo emprestimo1 = new Emprestimo(livro1, usuario1, new Date(), new Date());
        Emprestimo emprestimo2 = new Emprestimo(livro2, usuario2, new Date(), new Date());

        System.out.println("Detalhes do Empréstimo 1:");
        emprestimo1.exibirDetalhesEmprestimo();
        System.out.println("--------------------------------");
        System.out.println("Detalhes do Empréstimo 2:");
        emprestimo2.exibirDetalhesEmprestimo();
    }
}