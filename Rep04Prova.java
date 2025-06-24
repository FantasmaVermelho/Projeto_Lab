import java.util.Scanner;
/* 
Numa universidade, os alunos das turmas de informática fizeram uma prova de algoritmos. Cada turma possui um número de alunos. Criar um algoritmo que imprima:
    a. Quantidade de alunos aprovados;
    b. Média de cada turma;
    c. Percentual de reprovados.
*/
public class Rep04Prova {
        @SuppressWarnings({ "resource", "unused" })
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int NumTurma, NumAlun, Nota, SomaNota = 0, MTurma, totalAprovados = 0, TotalAlunos = 0, TotalReprovados = 0, NotaReprova = 60, TurmaAprov;
        double ReprovPerc;

        System.out.println("Quantas turmas de informática realizaram a prova?");
        NumTurma = leia.nextInt();

        for (int i = 1; i <= NumTurma; i++) {
            System.out.println("Existem quantos alunos na turma " + i + "?");
            NumAlun = leia.nextInt();
            TotalAlunos += NumAlun;
            SomaNota = 0; // reiniciando variavel
            TurmaAprov = 0;

            for (int j = 1; j <= NumAlun; j++) {
                System.out.println("Digite a nota do aluno #" + j);
                Nota = leia.nextInt();
                SomaNota += Nota;

                if (Nota >= NotaReprova) {
                    TurmaAprov++;
                }
            }
            totalAprovados += TurmaAprov;
            MTurma = SomaNota / NumAlun;
            System.out.println("A turma #" + i + " tem média de: " + MTurma);
            System.out.println("Alunos aprovados: " + TurmaAprov);
        }
        TotalReprovados = TotalAlunos - totalAprovados;
        ReprovPerc = TotalReprovados / TotalAlunos * 100;

        System.out.println("\nResumo Geral:");
        System.out.println("Total de alunos aprovados: " + totalAprovados);
        System.out.println("Percentual de reprovados: " +  ReprovPerc + "%");
    }
}