import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner batata = new Scanner(System.in);
        int valor = 1;
        while (valor != 0) {
            System.out.println("Qual a tabuada deseja saber?");
            valor = batata.nextInt();
            if (valor == 0) {
                break;
            }
            for (int i = 0; i <= 10; i++) {
                System.out.println(i * valor);
            }
        }
    }
}


