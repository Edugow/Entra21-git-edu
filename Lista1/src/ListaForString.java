import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class ListaForString {
    public static void main(String[] args) {
        ex03();
    }

    public static void exe01() {
        Scanner in = new Scanner(System.in);
        ex02();
        System.out.println("Digite a sua frase para contagem de espaços");
        String frase = in.nextLine();
        int j = 0;
        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) == ' ') {
                j++;
            }
        }
        System.out.println("A sua frase tem " + j + " espaços");

    }

    public static void ex02() {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite a quantia de linhas da matriz");
        int i = in.nextInt();
        System.out.println("Digite a quantia de colunas da matriz");
        int j = in.nextInt();
        int k = i;
        int l = j;
        String[][] matriz = new String[i][j];
        for (i = 0; i < k; i++) {
            for (j = 0; j < l; j++) {
                System.out.print("#");
            }
            System.out.println(" ");
        }
    }

    public static void ex03() {
        Scanner in = new Scanner(System.in);
        int soma = 0;
        for (int i = 0; i < 5; i++) {
            System.out.println("Digite um numero");
            soma += in.nextInt();
        }
        System.out.println("A soma é:"+soma);
    }
}