package Classes;

import java.util.ArrayList;
import java.util.Locale;

public class Estante {
    private int capMaxima;
    private ArrayList<Item> itens = new ArrayList<>();


    public Estante(int capacidadeMaxima) {
        setCapMaxima(capacidadeMaxima);
    }
    public boolean estanteCheia(){
        return this.getCapMaxima()==this.quantidadeItens();
    }
    public int quantidadeItens(){
        return this.itens.size();
    }
    public Item buscarItem(String titulo) {
        for (Item i : getItensEstante()) {
            if (i.getTitulo().toLowerCase().contains(titulo.toLowerCase())) {
                return i;
            }
        }
        return null;
    }
    public boolean adicionarItem(Item item){
        if (!estanteCheia()) {
            this.itens.add(item);
            return true;
        } else{
            return false;
        }
    }
    public Item removerItem(int posicao){
        return this.itens.remove(posicao);
    }
    //GETTERS E SETTERS
    public int getCapMaxima() {
        return capMaxima;
    }

    public void setCapMaxima(int capMaxima) {
        this.capMaxima = capMaxima;
    }

    public ArrayList<Item> getItensEstante() {
        return itens;
    }

    public void setItens(ArrayList<Item> itensEstante) {
        this.itens = itensEstante;
    }
}