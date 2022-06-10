import java.util.Scanner;

import Classes.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Estante estante = new Estante(5);
        Item item = null;
        for (int i = 0; i < 5; i++) {
            System.out.println("Informe os Itens da estante: ( 1 - Livro | 2 - DVD )");
            int tipo = in.nextInt();
            switch (tipo) {
                case 1:
                    item = new Livro();
                    break;
                case 2:
                    item = new DVD();
                    break;
                default:
                    System.out.println("Digite um valor válido");

            }
            System.out.println("Digite o título: ");
            item.setTitulo(in.nextLine());
            System.out.println("Digite genero do livro: ");
            item.setGenero(in.nextLine());
            if (tipo == 1) {
                Livro litem = ((Livro) item); //Livro Item
                System.out.println("Digite o Autor do livro: ");
                litem.setAutor(in.nextLine());
                System.out.println("Digite a quantidade de páginas do livro: ");
                litem.setQtdepaginas(in.nextInt());
                System.out.println("Digite o ano de publicação do livro: ");
                litem.setAnoPublicacao(in.nextInt());
                System.out.println("Digite a edição do livro: ");
                litem.setEdicao(in.nextInt());
                System.out.println("Sua estante tem " + estante.quantidadeItens() + "Livros");
                System.out.println( i  + " - "+litem.getTitulo() + " ("+litem.getGenero()+") :" +litem.getAnoPublicacao() +
                        " - " + litem.getAutor());
            }
            if (tipo == 2) {
                DVD ditem = ((DVD)item);  //DVD Item
                System.out.println("Digite o diretor do Filme: ");
                ditem.setDiretor(in.nextLine());
                System.out.println("Digite a duração do Filme: ");
                ditem.setDuracao(in.nextDouble());
                System.out.println("Digite o ano de lançamento do filme: ");
                ditem.setAnoLancamento(in.nextInt());
                System.out.println("Sua estante tem " + estante.quantidadeItens() + "Livros");
            }

        }
    }
}
