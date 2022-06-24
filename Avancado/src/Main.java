import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        ex3();

    }

    public static void ex1() {
        // Pedir pro usuario digitar n numeros inteiros ate ele digitar 0
        // Quando ele digitar 0, mostrar a lista de numeros digitados por ele
        ArrayList inteiros = new ArrayList();
        while (true) {
            System.out.println("Informe um valor inteiros: ");
            int escolha = in.nextInt();
            inteiros.add(escolha);
            if (escolha == 0) {
                break;
            }
        }
        for (int i = 0; i < inteiros.size(); i++) {
            if (i > 0 && i < inteiros.size()) {
            }
        }
        System.out.println("Valores Informados: ");
        System.out.print(inteiros);
    }

    public static void ex2() {
        //  Pedir pro usuario informar valores inteiros até que seja informado 0
        //  Quando for informado 0, mostrar os valores que o usuario digitou
        //  mostrar a soma dos numeros pares e dos numeros impares informados
        //  mostrar a media de todos os valores informados
        ArrayList inteiros = new ArrayList();
        int somaPar = 0;
        int somaImpar = 0;
        double somaTotal = 0.0;
        while (true) {
            System.out.println("Informe um valor inteiros: ");
            int escolha = in.nextInt();
            if (escolha % 2 == 0) {
                somaPar += escolha;
            } else {
                somaImpar += escolha;
            }
                somaTotal += escolha;
                inteiros.add(escolha);
                if (escolha == 0) {
                    break;
            }
        }
        System.out.println("Valores Informados: " + inteiros);
        System.out.println("Soma dos valores pares: " + somaPar);
        System.out.println("Soma dos valores ímpares: " + somaImpar);
        System.out.println("Soma total dos valores informados: " + somaTotal);
    }

    public static void ex3() {
        /* 1 - Ler o input do usuário (String) até que seja informado SAIR
           2 - Pedir para o usuaria um valor inteiros > 0
           3 - Remover da lista as palavras que tenha a quantidade de caracteres menor que o numero informado
           4 - Mostrar a lista de palavas */

        ArrayList<String> palavras = new ArrayList();
        while (true) {
            System.out.println("Digite a palavras desejada (SAIR para encerrar o programa) ");
            String pal = in.nextLine();
            if (pal.equalsIgnoreCase("sair")){
                break;
            }
            palavras.add(pal);
        }
        System.out.println("Digite um valor inteiro");
        int valorInt = in.nextInt();
        for (int i = 0; i < palavras.size(); i++) {
            if (palavras.get(i).length() < valorInt){
                palavras.remove(i);
                i--;
            }
        }
        System.out.println(palavras);
    }
}