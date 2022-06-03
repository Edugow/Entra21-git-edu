package classes.lanches;

public abstract class Lanche {
    private String[] ingredientes = new String[10];
    private double valor;
    private String tipo;

    public void adicionarIngrediente(String ingrediente) {
        for (int i = 0; i < 10; i++) {
            if (this.ingrediente[i] == null) {
                this.ingrediente[i] = ingrediente;
                break;
            }
        }
    }
    public String[] getIngredientes(){
        return ingredientes;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public double getValor() {
        return this.valor;
    }
}
