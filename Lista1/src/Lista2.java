import java.util.Scanner;

public class Lista2 {
    public static void main(String[] args) {exe09();    }

        public static void exe01() {
            Scanner in = new Scanner(System.in);
            System.out.println("Digite um valor");
            double valor = in.nextDouble();
            if (valor <= 10) {
                System.out.println("Não é maior que 10");
            } else {
                System.out.println(("É maior que 10"));
            }
        }

        public static void exe02() {
            Scanner in = new Scanner(System.in);
            System.out.println("Digite um número");
            double num = in.nextDouble();
            if (num >= 0) {
                System.out.println("O número é positivo ");
            } else {
                System.out.println("O número é negativo");
            }
        }

        public static void exe03() {
            Scanner in = new Scanner(System.in);
            System.out.println("Digite a quantia de maçãs compradas");
            double macas = in.nextDouble();
            if (macas >= 12) {
                System.out.printf("O preço total é: %.2f\n", macas);
            } else {
                System.out.printf("O preço total é: %.2f\n", (macas * 1.3));

            }
        }

        public static void exe04() {
            Scanner in = new Scanner(System.in);
            System.out.println("Digite o ano atual");
            double atual = in.nextDouble();
            System.out.println("Digite seu ano de nascimento");
            double nasc = in.nextDouble();
            double idade = atual - nasc;
            if (idade >= 16) {
                System.out.println("Você pode votar este ano");
            } else {
                System.out.println("Você não pode votar esse ano");
            }
        }

        public static void exe05() {
            Scanner in = new Scanner(System.in);
            System.out.print("Digite um número");
            double n1 = in.nextDouble();
            System.out.print("Digite outro número");
            double n2 = in.nextDouble();
            if (n1 > n2) {
                System.out.println(n1);
            }
            if (n2 > n1) {
                System.out.println(n2);
            }
        }

        public static void exe06() {
            Scanner in = new Scanner(System.in);
            System.out.println("Digite um valor");
            double n1 = in.nextDouble();
            System.out.println("Digite outro valor");
            double n2 = in.nextDouble();
            if (n1 > n2) {
                System.out.println(n2 + "->" + n1);
            } else {
                System.out.println(n1 + "->" + n2);
            }
        }

        public static void exe07() {
            Scanner in = new Scanner(System.in);
            System.out.println("Digite a hora de início do jogo");
            double inicio = in.nextDouble();
            System.out.println("Digite a hora de término do jogo)");
            double fim = in.nextDouble();
            double duracao;
            double duracao2;
            if (inicio<fim) {
                duracao=fim-inicio;
                System.out.println("A duração da partida é de:"+duracao);
            }
            else {
                duracao=inicio-fim;
                duracao2=24-duracao;
                System.out.println("A duração da partida é de:"+duracao2);
            }
        }

        public static void exe08(){
            Scanner in = new Scanner(System.in);
            System.out.println("Digite o salário por hora do funcionário.");
            double salariohora= in.nextDouble();
            System.out.println("Digite quantas horas o funcionário trabalhou este mês.");
            double horas = in.nextDouble();
            double salario = salariohora*horas;
            if (horas>160){
                double total=(((salariohora*160))+((horas-160)*(1.5*salariohora)));
                System.out.println("o salário final é:"+total);
            }
            else System.out.println("O salário final é:"+salario);
        }

        public static void exe09(){
            Scanner in = new Scanner(System.in);
            System.out.println("Digite o nome da pessoa");
            String nome = in.nextLine();
            System.out.println("Digite a altura da pessoa");
            double altura = in.nextDouble();
            System.out.println("Digite o sexo da pessoa (Homem ou Mulher, por extenso)");
            String sexo = in.next();
            if (sexo.equals("Homem")) {
                double ideal = ((72.7*altura)-58.0);
                System.out.println(nome+ "seu peso ideal é"+ideal);}
            else{
                double ideal = ((62.1 * altura) - 44.7);
                System.out.println(nome +"seu peso ideal é"+ideal);
            }
        }

        public static void exe10(){
            Scanner in = new Scanner(System.in);
            System.out.println("Digite o salário fixo do vendedor.");
            double fixo = in.nextDouble();
            System.out.println("Digite o valor das vendas efetuadas pelo vendedor.");
            double vendas = in.nextDouble();
            double total;
            if (vendas<1500){
                total=(fixo+(vendas*0.03));
                System.out.println("O salário total do funcionário é:"+total);
            }
            else {
                total=(fixo+(1500*0.03)+((vendas-1500)*0.05));
                System.out.println("O salário total do funcionário é:"+total);
            }

        }
/*Faça um algoritmo para ler: número da conta do cliente, saldo, débito e crédito.
Após, calcular e escrever o saldo atual (saldo atual = saldo - débito + crédito).
Também testar se saldo atual for maior ou igual a zero escrever a mensagem 'Saldo Positivo', senão escrever a mensagem 'Saldo Negativo'
 */
        public static void exe11(){
            Scanner in = new Scanner(System.in);
            System.out.println("Digite o número da conta do usuário.");
            double numero = in.nextDouble();
            System.out.println("Digite o saldo do cliente");
            double saldo = in.nextDouble();
            System.out.println("Digite o débito do cliente");
            double debito = in.nextDouble();
            System.out.println("Digite o crédito do cliente");
            double credito = in.nextDouble();
            double saldoatual = (saldo-debito+credito);
            System.out.println("O Saldo atual é de:"+saldoatual);
            if (saldoatual>=0) {
                System.out.println("Saldo positivo");
            }
            else {
                System.out.println("Saldo negativo");
            }
        }

    /*Faça um algoritmo para ler: quantidade atual em estoque, quantidade máxima em estoque e quantidade mínima em estoque de um produto.
    Calcular e escrever a quantidade média ((quantidade média = quantidade máxima + quantidade mínima)/2).
    Se a quantidade em estoque for maior ou igual a quantidade média, escrever a mensagem 'Não efetuar compra',
    senão escrever a mensagem 'Efetuar compra'.
     */
    public static void exe12(){
            Scanner in = new Scanner(System.in);
        System.out.println("Qual a quantidade em estoque?");
        double quantidade = in.nextDouble();
        System.out.println("Qual a quantidade máxima?");
        double maxima = in.nextDouble();
        System.out.println("Qual a quantidade mínima?");
        double minima = in.nextDouble();
        double media;
        media=((maxima+minima)/2);
        System.out.println("A média para o produto é:"+media);
        if (quantidade>=media){
            System.out.println("Não efetuar compra");
        }
        else {
            System.out.println("Efetuar a compra");
        }
        }

}
