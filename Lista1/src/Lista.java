import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;
public class Lista {
    public static void main(String[] args) {exe05();    }

    public static void exe01() { //exercicio 01
        int var1 = 10;
        int var2 = 20;
        int var3 = 1;
        String var4 = "";
        String var5 = "";
        var3 = var1;
        var1 = var2;
        var2 = var3;
        var4 = String.valueOf(var1);
        var5 = String.valueOf(var2);
        System.out.println(var4 + "," + var5);
    }

    public static void exe02() { //exercicio 02
        Scanner in = new Scanner(System.in);
        System.out.print("Digite um valor");
        int valor = in.nextInt();
        System.out.println(--valor);

    }

    public static void exe03() {  //exercicio 03
        Scanner in = new Scanner(System.in);
        System.out.print("Digite a base do retâgulo");
        double base = in.nextDouble();
        System.out.println("Digite a altura do retãngulo");
        double altura = in.nextDouble();
        double area = base * altura;
        double perimetro = (altura * 2 + base * 2);
        System.out.println("Area=" + area);
        System.out.printf("Perimetro= %.2f\n", perimetro); //usando printf
    }

    public static void exe04() { //exercício 04
        Scanner in = new Scanner(System.in);
        System.out.print("Digite a sua idade em anos");
        int anos = in.nextInt();
        System.out.print("Digite os meses além de sua idade em anos");
        int meses = in.nextInt();
        System.out.print("Digite sua idade em dias além de sua idade em meses");
        int dias = in.nextInt();
        System.out.printf("Você viveu %d dias", (anos * 365) + (meses * 30) + dias);
    }

    public static void exe05() { //exercício 05
        Scanner in = new Scanner(System.in);
        System.out.print("Digite a quantidade total de votos");
        double votos = in.nextDouble();
        System.out.print("Digite a quantidade de votos nulos");
        double nulos = in.nextDouble();
        System.out.print("Digite a quantidade de votos em branco");
        double branco = in.nextDouble();
        double validos = votos - nulos - branco;
        double validosp = (validos / votos) * 100;
        double nulosp = (nulos / votos) * 100;
        double brancop = (branco / votos) * 100;
        System.out.println("Porcentagem Válidos=" + validosp + "%");
        System.out.println("Porcentagem Nulos=" + nulosp + "%");
        System.out.println("Porcentagem em branco=" + brancop + "%");
    }

    public static void exe06() { //exercício 06
        Scanner in = new Scanner(System.in);
        System.out.println("Fala quanto tu ganha, pobre");
        double sal = in.nextDouble();
        System.out.println("Qual o percentual de reajuste");
        double perct = in.nextDouble();
        double novo = sal * (1 + perct / 100);
        System.out.println("O novo salário é: " + novo);
    }

    public static void exe07() {  //Exercício 07
        Scanner in = new Scanner(System.in);
        System.out.println("Qual o custo de fábrica do carro?");
        double custo = in.nextDouble();
        double dist = custo * (28 / 100.0);
        double imp = custo * (45 / 100.0);
        double custo2;
        custo2 = custo + dist + imp;
        System.out.println("O custo de venda do carro é:" + custo2);
    }

    public static void exe08() { //Exercício 08
        Scanner in = new Scanner(System.in);
        System.out.println("Quantos carros o funcionário vendeu?");
        double car = in.nextDouble();
        System.out.println("Qual o valor total das vendas?");
        double valort = in.nextDouble();
        System.out.println("Qual o salário fixo do funcionário?");
        double sal = in.nextDouble();
        System.out.println("Qual o valor recebido por carro vendido?");
        double valorc = in.nextDouble();
        double vendas;
        vendas = car * valorc;
        double perct5;
        perct5 = valort * (5 / 100.0);
        double total = sal + perct5 + vendas;
        System.out.println("O salário total é de:" + total);
    }

    public static void exe09() {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite o a temperatua em graus Fahrenheit");
        double fahr = in.nextDouble();
        double celsius;
        celsius = (((fahr - 32) * 5) / 9);
        System.out.printf("O valor da temperatura em Celsius de %.2f", celsius);
    }


}
