package Classes;

import Classes.Assento;

public interface MeioTransporte {
    public boolean verificarOcupacao(String assento);
    public int quantidadeLivre();
    public void mostrarAssentos();
    public Assento getAssento(String assento);

    Assento getAssento();
}
