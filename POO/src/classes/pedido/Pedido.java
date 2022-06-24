package classes.pedido;

import classes.lanches.*;
import java.util.ArrayList;
import jdk.swing.interop.SwingInterOpUtils;

public class Pedido {
    private ArrayList<Lanche> lanches = new ArrayList<>();

    public void imprimirComanda() {
        for (Lanche lan : this.getLanches()) {
            if (lan != null) {
                if (lan instanceof MiniPizza) {
                    MiniPizza mp = ((MiniPizza) lan);
                    System.out.println("====" + lan.getTipo() + " - " + mp.getSabor() + "====");
                    if (mp.isBordaRecheada()) {
                        System.out.println("---BORDA RECHEADA DE " + mp.getSaborBorda().toUpperCase() + "---");
                    }
                    if (lan instanceof Pizza) {
                        System.out.println("Tamanho: " + ((Pizza) lan).getTamanho());
                    }
                } else {
                    System.out.println("====" + lan.getTipo() + "====");
                }
                if (lan instanceof XBurguer) {
                    if (((XBurguer) lan).isAberto()) {
                        System.out.println("-- LANCHE ABERTO --");
                    }
                }
                System.out.printf("Valor: R$%.2f\n", lan.getValor());
                System.out.println("-INGREDIENTES-");
                for (String ingrediente : lan.getIngredientes()) {
                    if (ingrediente != null) {
                        System.out.println(ingrediente);
                    }
                }

            if (lan instanceof Sanduiche) {
                Sanduiche s = (Sanduiche) lan;
                    System.out.println("---ADICIONAIS---");
                    for (String adicional : s.getAdicionais()) {
                            System.out.println(adicional);
                }
            }
        }
        System.out.printf("Valor total do pedido: R$%.2f\n", this.calcularValorTotal());
        System.out.println("---------------------------");
    }

    public double calcularValorTotal() {
        double valorTotal = 0.0;
        for (Lanche lan : this.getLanches()) {
                valorTotal += lan.getValor();
        }
        return valorTotal;
    }

    public void adicionarLanche(Lanche lanche) {
        this.lanches.add(lanche);
    }

    public ArrayList<Lanche> getLanches() {
        return this.lanches;
    }
}
