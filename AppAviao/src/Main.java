import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int assentosPorLinha=0;
        int linhasAssentos=0;
        while (true) {
            System.out.println("Digite a quantidade de linhas de assentos:");
            linhasAssentos = in.nextInt();
            if (linhasAssentos<=26){
                break;
            } else{
                System.out.println("A quantidade de linhas não pode ser maior que 26!");
            }
        }
        while (true) {
            System.out.println("Digite a quantidade de assentos por linha:");
            assentosPorLinha = in.nextInt();
            if (assentosPorLinha<=10){
                break;
            } else{
                System.out.println("A quantidade de assentos por linha não pode ser maior que 10!");
            }
        }
        in.nextLine();
        Voo v = new Voo(linhasAssentos, assentosPorLinha);
        while (true) {
            System.out.println("Digite o assento que você quer comprar ou N para parar: ");
            String codigo = in.nextLine();
            if (codigo.equalsIgnoreCase("N")) {
                break;
            } else {
                if (v.verificaOcupacao(codigo)) {
                    System.out.println("Este lugar está ocupado! Selecione outro!");
                    continue;
                } else {
                    v.ocupar(codigo);
                }
                if (v.quantidadeLivre() == 0) {
                    break;
                } else {
                    System.out.println("Ainda restam " + v.quantidadeLivre() + " ");
                    v.mostrarAssentos();
                }
            }
        }
    }
}
