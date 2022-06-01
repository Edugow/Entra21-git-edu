package classes.lanches;

import java.util.Locale;

public abstract class Sanduiche extends Lanche {
    public String[] adicionais = new String[10];

    public void adicionarAdicional(String adicional) {
        for (int i = 0; i < 10; i++) {
            if (this.adicionais[i] == null) {
                this.adicionais[i] = adicional;
                break;
            }
        }
    }
    @Override
    public void montarComanda() {
        super.montarComanda(); //Chamar comportamento da superclasse da qual esta é estendida
        if (this.adicionais[0] != null) {
            System.out.println("---ADICIONAIS---");
            for (String adicional : adicionais) {
                if (adicional != null) {
                    System.out.println(adicional.toUpperCase(Locale.ROOT));
                }
            }
        }
    }
}
