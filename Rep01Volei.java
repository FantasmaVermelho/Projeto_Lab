import java.util.Scanner;
// Jogo da senha, descobrir os numeros corretos com as pocições corretas.
public class Rep01Volei {
        @SuppressWarnings({ "resource", "unused" })
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        /* 
        Num campeonato europeu de voleibol, inscreveram-se 30 países. Sabendo-se que na lista oficial de cada país constam, além de outros dados, peso e idade de 12 jogadores, criar um algoritmo que apresente as seguintes informações:
            a. O peso médio e a idade média de cada um dos times;
            b. O peso médio e a idade média de todos os participantes.
        */
        int Idade, MIdadeTime, MIdade, MIdadeTotal, SomaIdadeTime, SomaIdadeTotal = 0, TotalJogadores = 0;
        double Peso, MPesoTime, MPeso, MPesoTotal, SomaPesoTime, SomaPesoTotal = 0;

        for (int Pais = 1; Pais <= 30; Pais++) {
            System.out.println("\n País número: " + Pais);
            // reiniciando variaveis
            SomaPesoTime = 0;
            SomaIdadeTime = 0;
            for (int Jogadores = 1; Jogadores < 12; Jogadores++) {
                System.out.println("Jogador #" + Jogadores);
                System.out.println("Peso em Kg: ");
                Peso = leia.nextDouble();
                SomaPesoTime += Peso;
                SomaPesoTotal += Peso;

                System.out.println("Idade: ");
                Idade = leia.nextInt();
                SomaIdadeTime += Idade;
                SomaIdadeTotal += Idade;

                TotalJogadores++;
            }
            MPeso = SomaPesoTime / 12;
            MIdade = SomaIdadeTime / 12;

            System.out.println("Médias do país n" + Pais);
            System.out.println("Peso médio: " + MPeso);
            System.out.println("Idade média: " + MIdade);
        }
        MPesoTotal = SomaPesoTotal / TotalJogadores;
        MIdadeTotal = SomaIdadeTotal / TotalJogadores;

        System.out.println("Médias gerais de todos os participantes: ");
        System.out.println("Peso médio geral: " + MPesoTotal);
        System.out.println("Idade média geral: " + MIdadeTotal);
    }
}