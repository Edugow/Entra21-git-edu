import java.util.Scanner;

public class ExercicioStringArray {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        exe10();
    }

    public static void exe01() {
        //métodos das Strings do Java
        System.out.println("Digite algo");
        String algo = in.nextLine();
        System.out.println("Length" + algo.length());
        System.out.println("Empty" + algo.isEmpty());
        System.out.println("Uppercase" + algo.toUpperCase());
        System.out.println("Lowercase" + algo.toLowerCase());


    }

    public static void exe02() {
        //Escrever um programa que leia duas strings e cheque
        // se elas são iguais ou iguals com maiusculas e minusculas ignoradas
        System.out.println("Digite algo");
        String algumaCoisa = in.nextLine();
        System.out.println("Digite mais alguma coisa");
        String algumaOutraCoisa = in.nextLine();
        if (algumaCoisa.equals(algumaOutraCoisa)) {
            System.out.println("Elas São iguais");
        } else if (algumaCoisa.equalsIgnoreCase(algumaOutraCoisa)) {
            System.out.println("São iguais ignorando maiúsculas e minúsculas");
        } else {
            System.out.println("Elas são diferentes");
        }
    }

    public static void exe03() {
        //Escrever um programa que leia duas strings e cheque
        // se uma string contem a outra, então plote um aviso para isso
        System.out.println("Digite algo");
        String algumaCoisa = in.nextLine();
        System.out.println("Digite mais alguma coisa");
        String algumaOutraCoisa = in.nextLine();
        if (algumaCoisa.contains(algumaOutraCoisa)) {
            System.out.println(algumaOutraCoisa + "faz parte de" + algumaCoisa);
        } else if (algumaOutraCoisa.contains(algumaCoisa)) {
            System.out.println(algumaCoisa + "faz parte de" + algumaOutraCoisa);
        }
        System.out.println("Nenhuma string faz parte da outra");
    }

    public static void exe04() {
        //Escrever um programa que leia duas strings e cheque
        // se uma palavra é o prefixo de outra
        System.out.println("Digite algo");
        String algumaCoisa = in.nextLine();
        System.out.println("Digite mais alguma coisa");
        String algumaOutraCoisa = in.nextLine();
        if (algumaCoisa.startsWith(algumaOutraCoisa)) {
            System.out.println(algumaOutraCoisa + "é prefixo de" + algumaCoisa);
        } else if (algumaOutraCoisa.startsWith(algumaCoisa)) {
            System.out.println(algumaCoisa + "é prefixo de" + algumaOutraCoisa);
        } else {
            System.out.println("As strings não são prefixo uma da outra");
        }
    }

    public static void exe05() {
        //Escrever um programa que leia duas strings e cheque
        // se uma palavra é o sufixo de outra
        System.out.println("Digite algo");
        String algumaCoisa = in.nextLine();
        System.out.println("Digite mais alguma coisa");
        String algumaOutraCoisa = in.nextLine();
        if (algumaCoisa.endsWith(algumaOutraCoisa)) {
            System.out.println(algumaOutraCoisa + "é sufixo de" + algumaCoisa);
        } else if (algumaOutraCoisa.endsWith(algumaCoisa)) {
            System.out.println(algumaCoisa + "é sufixo de" + algumaOutraCoisa);
        } else {
            System.out.println("As strings não são sufixoabcde uma da outra");
        }
    }

    public static void exe06() {
        //Escrever um programa que leia duas strings e diga
        // o index na qual se encontra o caractere
        System.out.println("Digite algo");
        String algumaCoisa = in.nextLine();
        System.out.println("Digite mais alguma coisa");
        String algumaOutraCoisa = in.nextLine();
        int pos = algumaCoisa.indexOf(algumaOutraCoisa);
        System.out.println("A posição de " + algumaOutraCoisa + " em " + algumaCoisa + " é " + pos);
    }

    public static void exe07() {
        /*-Escrever um programa para decifrar um codigo, utilizando a funcao replace
        // lala#-rwgra22lalalang!#<3
        The code is
                | Code | Letter   |
                |w     | o        |
                |#     |' '(space)|
                |2     | m        |
                |lala  | i        |
                | -    | p        |
         */
        String cyphered = "lala#lwve#-rwgra22lalang!#<3";
        String decyphered = cyphered.replace("w", "o");
        decyphered = decyphered.replace("#", " ");
        decyphered = decyphered.replace("2", "m");
        decyphered = decyphered.replace("lala", "i");
        decyphered = decyphered.replace("-", "p");
        System.out.println(decyphered);
        decyphered.toUpperCase();
    }

    public static void exe08() {
        //Escrever um programa que leia uma lista de inteiros
        // e mostre a soma dos numeros pares e impares
        System.out.println("Informe a quantidade de números:");
        int nums = in.nextInt();
        int[] numeros = new int[nums];
        for (int i = 0; i < nums; i++) {
            System.out.println("Informe um número: ");
            numeros[i] = in.nextInt();
        }
        int somaPar = 0, somaImpar = 0;
        for (int valor : numeros) {
            if (valor % 2 == 0) {
                somaPar += valor;
            } else {
                somaImpar += valor;
            }
        }
        System.out.println("Soma dos valores pares: " + somaPar);
        System.out.println("Soma dos valores ímpares: " + somaImpar);

    }

    public static void exe09() {
        /* 1 Let the use choose how many words thay want to input
         2 - read that many word
         3 - Let the user choose a number bigger than 0
         4 - Remove all words from the array that are shorter than the given number */
        System.out.println("informe a quantidade de palavras");
        int nums = in.nextInt();
        String[] palavras = new String[nums];
        in.nextLine();
        for (int i = 0; i < nums; i++) {
            System.out.println("Informe uma palavra");
            palavras[i] = in.nextLine();
        }
        System.out.println("Informe um número > 0:");
        int numeroCorte = in.nextInt();
        for (int i = 0; i < nums; i++) {
            if (palavras[i].length() < numeroCorte) {
                palavras[i] = null;
            }
        }
        for (String palavra : palavras) {
            if (palavra != null) {
                System.out.println(palavra);
            }
        }
    }

    public static void exe10() {
        /* Take two lists as input and return a new list with all values
        of the first list that are not in the second list */
        System.out.println("informe o tamanho da primeira lista");
        int tam1 = in.nextInt();
        int[] lista1 = new int[tam1];
        for (int i = 0; i < tam1; i++) {
            System.out.println("Digite um valor da lista 1");
            lista1[i] = in.nextInt();
        }
        System.out.println("informe o tamanho da segunda lista");
        int tam2 = in.nextInt();
        int[] lista2 = new int[tam2];
        for (int i = 0; i < tam2; i++) {
            System.out.println("Digite um valor da lista 2");
            lista2[i] = in.nextInt();
        }
        for(int valor1 : lista1) {
            boolean achou = false;
            for (int valor2 : lista2) {
                if(valor1 == valor2) {
                    achou = true;
                    break;
                }
            }
            if(!achou) {
                System.out.println(valor1);
            }
        }
    }
}







