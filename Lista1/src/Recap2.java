import org.w3c.dom.ls.LSOutput;

import java.util.Random;

import java.util.Scanner;

public class Recap2 {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        exe04();
    }

    public static void exe01() {
        System.out.println("Digite o valor do numero");
        String numero = String.valueOf(in.nextInt());
        String inverso = "";
        for (int i = numero.length() - 1; i >= 0; i--) {
            inverso = inverso + String.valueOf(numero.charAt(i));

        }
        System.out.println(inverso);
    }

    public static void exe02() {
        int maior = 0, menor = 0;
        boolean primeiro = true;
        int parada = -1;
        while (parada != 0) {
            System.out.println("Informe o número (0 para sair):");
            parada = in.nextInt();
            if (parada == 0) {
                break;
            }
            if (primeiro) {
                menor = parada;
                maior = parada;
                primeiro = false;
            } else {
                if (parada > maior) {
                    maior = parada;
                }
                if (parada < menor) {
                    menor = parada;
                }
            }
        }
        System.out.println("Menor valor informado é:" + menor);
        System.out.println("Maior valor informado é:" + maior);
    }


    public static void exe03() {
        Random r = new Random();
        int randomico = r.nextInt(101);
        while (true) {
            System.out.println("informe um número:");
            int valorInformado = in.nextInt();
            if (valorInformado == randomico) {
                System.out.println("Acertou corno");
                break;
            } else if (valorInformado > randomico) {
                System.out.println("Chutou muito alto, tente novamente!");
            } else {
                System.out.println("Chutou muito baixo, tente novamente");
            }
        }
    }

    public static void exe04() {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        System.out.println("");

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (i + j < 4) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println("");

        }
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 9; j++) {
                if (i + j < 4 || j - i > 4) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println("");
        }
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 9; j++) {
                if (i + j < 4 || j - i > 4) {
                    System.out.print(" ");
                } else {
                    System.out.print(i + 1);
                }
            }
            System.out.println("");
        }
    }
}
