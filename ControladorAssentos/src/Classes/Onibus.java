package Classes;

import java.util.ArrayList;

import Classes.Assento;
import Classes.MeioTransporte;

public class Onibus implements MeioTransporte {
    private ArrayList<AssentoOnibus> assentos = new ArrayList();

    public ArrayList<AssentoOnibus> getAssentos() {
        return assentos;
    }

    public void setAssentos(ArrayList<AssentoOnibus> assentos) {
        this.assentos = assentos;
    }

    @Override
    public boolean verificarOcupacao(String assento) {
        return false;
    }

    @Override
    public int quantidadeLivre() {
        return 0;
    }

    @Override
    public void mostrarAssentos() {

    }

    @Override
    public Assento getAssento(String assento) {
        return null;
    }

    @Override
    public Assento getAssento() {
        return null;
    }
}
