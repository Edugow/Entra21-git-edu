package classes;

public class MiniPizza extends Lanche {
    public boolean bordaRecheada;
    public String saborBorda;
    public MiniPizza() {
        this.adicionarIngrediente("Massa");
        this.adicionarIngrediente("Molho de Tomate");
        this.adicionarIngrediente("Queijo");
        this.adicionarIngrediente("Calabresa");
        this.adicionarIngrediente("Azeitona");
        this.tipo = "Mini Pizza";
    }

    @Override
    public void montarComanda() {
        super.montarComanda();
        if (this.bordaRecheada) {
            System.out.println("---BORDA RECHEADA DE "+this.saborBorda+ "---");
        }
    }
}
