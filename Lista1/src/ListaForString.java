import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class ListaForString {
    public static void main(String[] args) {
        ex07();
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
        System.out.println("A soma é:" + soma);
    }

    public static void ex04() {   //CALCULAR O FATORIAL DE UM NUMERO
        Scanner in = new Scanner(System.in);
        System.out.println("Digite o número que voce deseja saber o fatorial.");
        int num = in.nextInt();
        int fator = 1;
        for (int i = 1; i <= num; i++) {
            fator *= i;
        }
        System.out.println("O fatorial é:" + fator);
    }

    //Escrever um algoritmo que cheque se o pin informado pelo usuário é válido para ele executar uma ação imaginãria
    //(eX: ACESSO AO CAIXA ELETRÔNICO), o usuário tem 3 tentativas, o pin tem exatos 5 números.
    public static void ex06() {
        Scanner in = new Scanner(System.in);
        int pin = 91352;
        for (int i = 2; i >= 0; i--) {
            System.out.println("Digite a sua senha de acesso.");
            int user = in.nextInt();
            if (user == pin) {
                System.out.println("Ação efetuada");
            } else {
                System.out.println("Senha errada, voce tem mais " + i + " tentativas");
            }
        }
    }

    //Escreva um algoritmo que leia um numero e imprima a soma de 1 até este numero
    public static void ex07() {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite o número");
        int num = in.nextInt();
        int soma = 0;
        for (int i = 1; i <= num; i++) {
            soma += i;
        }
        System.out.print("A soma é:" +soma);
    }
}