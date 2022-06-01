import classes.lanches.*;

import java.util.Scanner;

public class Main {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        montarLanche();
    }

    private static void montarLanche() {
        System.out.println("-MENU: Escolha uma opção-");
        System.out.println("(1) - X-Salada");
        System.out.println("(2) - X-Burguer");
        System.out.println("(3) - Misto Quente");
        System.out.println("(4) - Hot Dog");
        System.out.println("(5) - Mini Pizza");
        System.out.println("(6) - Pizza");

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
            case 6:
                lanche = new Pizza();
                break;
            default:
                System.err.println("Escolha uma opção válida!");
        }
        in.nextLine();
        if (lanche instanceof Sanduiche) {

            System.out.println("Voce Quer adicionais para o seu Lanche?(S/N)");
            String querAdicionais = in.nextLine();
            if (querAdicionais.equalsIgnoreCase("S")) {
                int contadorAdicionais = 10;
                while (contadorAdicionais > 0) {
                    System.out.println("Digite o adicional desejado (N se não quiser mais adicionais)");
                    System.out.println("Você ainda tem " + contadorAdicionais + " adicionais");
                    String adicional = in.nextLine();
                    if (adicional.equalsIgnoreCase("N")) {
                        break;
                    } else {
                        ((Sanduiche) lanche).adicionarAdicional(adicional);
                    }
                    contadorAdicionais--;
                }
            }
            if (lanche instanceof XBurguer) {
                System.out.println("Lanche aberto? (S/N)");
                String aberto = in.next();
                ((XBurguer) lanche).setAberto(aberto.equalsIgnoreCase("S"));
            }
        } else {
            System.out.println("Qual sabor você deseja?");
            System.out.println("(1) - Quatro Queijos");
            System.out.println("(2) - Cababresa");
            System.out.println("(3) - Frango com Catupiry");
            System.out.println("(4) - Marguerita");
            System.out.println("(5) - Portuguesa");
            int sabor = in.nextInt();
            in.nextLine();
            MiniPizza miniPizza = ((MiniPizza) lanche);
            switch (sabor) {
                case 1:
                    miniPizza.adicionarSaborEIngradientes("4 Queijos");
                    break;
                case 2:
                    miniPizza.adicionarSaborEIngradientes("Calabresa");
                    break;
                case 3:
                    miniPizza.adicionarSaborEIngradientes("Frango com Catupiry");
                    break;
                case 4:
                    miniPizza.adicionarSaborEIngradientes("Marguerita");
                    break;
                case 5:
                    miniPizza.adicionarSaborEIngradientes("portuguesa");
                    break;
                default:
                    System.out.println("Escolha um sabor válido");
            }

            if (lanche instanceof Pizza) {
                System.out.println("Informe o tamanho da pizza: ");
                System.out.println("XS - Broto");
                System.out.println("XM - Pequena");
                System.out.println("MD - Média");
                System.out.println("LG - Grande");
                System.out.println("XL - Família");
                ((Pizza) lanche).setTamanho(in.nextLine().toUpperCase());
            }
            System.out.println("Borda recheada: (S/N)");
            String aberto = in.nextLine();
            miniPizza.setBordaRecheada(aberto.equalsIgnoreCase("S"));
            if (miniPizza.isBordaRecheada()) {
                System.out.println("Digite o sabor da borda");
                miniPizza.setSaborBorda(in.nextLine());
            }
        }
        if (escolha < 5) {
        }
        System.out.println("Informe o valor do lanche: R$");
        lanche.setValor(in.nextDouble());
        lanche.montarComanda();
    }
}
