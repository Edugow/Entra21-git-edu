import classes.*;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("-MENU: Escolha uma opção-");
        System.out.println("(1) - X-Salada");
        System.out.println("(2) - X-Burguer");
        System.out.println("(3) - Misto Quente");
        System.out.println("(4) - Hot Dog");
        System.out.println("(5) - Mini Pizza - Calabresa");
        int escolha = in.nextInt();
        Lanche lanche = null;
        switch (escolha) {
            case 1:
                lanche = new XSalada();
                break;
            case 2:
                lanche = new XBurguer();
                break;
            case 3:
                lanche = new MistoQuente();
                break;
            case 4:
                lanche = new HotDog();
                break;
            case 5:
                lanche = new MiniPizza();
                break;
            default:
                System.err.println("Escolha uma opção válida!");

        }
        if (escolha == 1 || escolha == 2) {
            System.out.println("Lanche aberto? (S/N)");
            in.nextLine();
            String aberto = in.next();
            ((XBurguer) lanche).aberto = aberto.equalsIgnoreCase("S");
        }
        if (escolha == 5){
            System.out.println("Borda recheada: (S/N)");
            in.nextLine();
            String borda = in.next();
            MiniPizza miniPizza = ((MiniPizza) lanche);
            miniPizza.bordaRecheada = borda.equalsIgnoreCase("S");
            if (miniPizza.bordaRecheada) {
                System.out.println("Digite o sabor da borda");
                in.nextLine();
                miniPizza.saborBorda= in.nextLine();
            }
        }
        System.out.println("Informe o valor do lanche: R$");
        lanche.valor = in.nextDouble();
        lanche.montarComanda();
    }
}
