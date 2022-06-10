import Classes.Tarefa;

import java.util.Scanner;

public class Main {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

    }

    public static Tarefa criaTarefa(){
        Tarefa t = new Tarefa();
        System.out.println("Digite o nome da Tarefa: ");
        t.setNome(in.nextLine());
        System.out.println("Digite a descrição da tarefa: ");
        t.setDescricao(in.nextLine());
        System.out.println("Ordem da tarefa: ");
        t.setOrdem(in.nextInt());
        in.nextLine();
        System.out.println("Tarefa tem checklist? (S/N)");
        System.out.println("Informe o tamanho do checklist: ");
        return t;

    }

}
