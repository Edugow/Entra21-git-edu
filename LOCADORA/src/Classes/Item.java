package Classes;

import java.util.ArrayList;
import java.util.Scanner;

public abstract class Item {
    private String titulo;
    private String genero;
    private double valor;
    private ArrayList<Avaliacao> avaliacoes = new ArrayList<>();
    public abstract void montarItem(Scanner in);
    public abstract void mostrarItem();
    public void avaliar(){
        Scanner in=new Scanner(System.in);
        Avaliacao a=new Avaliacao();
        System.out.print("Informe seu nome: ");
        a.setNome(in.nextLine());
        System.out.print("Qual sua nota para o filme/livro: (0 a 5): ");
        a.setRating(in.nextDouble());
        in.nextLine();
        System.out.print("Digite seu feedback: ");
        a.setFeedback(in.nextLine());
        this.avaliacoes.add(a);
    }
    public double getTotalRating(){
        double soma=0.0;
        return this.avaliacoes.stream().mapToDouble(Avaliacao::getRating).sum()/this.avaliacoes.size();
        }

    //GETTERS E SETTERS

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public ArrayList<Avaliacao> getAvaliacoes() {
        return avaliacoes;
    }

    public void setAvaliacoes(ArrayList<Avaliacao> avaliacoes) {
        this.avaliacoes = avaliacoes;
    }
}