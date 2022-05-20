
import java.util.Scanner;
//Implementar Implementar um algoritmo que leia o numero de alunos de uma turma e o nome deles, e o numero de questões de uma prova
//Depois ler tam´bem o gabarito da prova (O Usuário irá informar a resposta correta de cada pergunta).
//Depois ler as respostas de cada aluno na prova e mostrar a nota dos alunosno final

public class ExeGabaritoProva {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Digite o número de alunos da sala: ");
        int numAlunos = in.nextInt();
        int acertos = 0; 
        String[] nomes = new String[numAlunos];
        in.nextLine();
        for (int i = 0; i < numAlunos; i++) {
            System.out.print("Digite o nome do aluno " + (i + 1) + ": ");
            nomes[i] = in.nextLine();
        }
        System.out.print("Digite o número de questões da prova: ");
        int numQuestoes = in.nextInt();
        in.nextLine();
        String[] gabarito = new String[numQuestoes];
        for (int i = 0; i < numQuestoes; i++) {
            System.out.print("Digite a resposta da questão " + (i + 1) + ": ");
            gabarito[i] = in.nextLine();
        }
        int[] acertosPorAluno = new int[numAlunos];
        for (int i = 0; i < numAlunos; i++) {
            String[] respostas = new String[numQuestoes];
            for (int j = 0; j < numQuestoes; j++) {
                System.out.print("Digite a resposta do aluno " + nomes[i] + " para a questão " + (j + 1) + ": ");
                respostas[j] = in.nextLine();
                if (gabarito[j].equals(respostas[j])) {
                    acertos+=1;
                }
            }
            acertosPorAluno[i] = acertos;
            acertos = 0;
        }
        System.out.println("Nota dos alunos:");
        for (int i = 0; i < numAlunos; i++) {
            System.out.println(nomes[i] + " - " + ((10.0 / numQuestoes) * acertosPorAluno[i]));
        }
    }
}
