import java.util.Scanner;
// Jogo da senha, descobrir os numeros corretos com as pocições corretas.
public class Senha {
        @SuppressWarnings({ "resource", "unused" })
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int N1, N2, N3, Firewall, Senha, Centena, Dezena, Unidade, ContCertPose, ContNumCert, ContErro = 0, Tentativa = 4;
        Firewall = 420; // senha estabelecida para testes

        System.out.println("Digite a sua senha de três (3) digitos: ");
        Senha = leia.nextInt();
        
        // Descobrindo numeros individuais da senha protegida
        N1 = Firewall/100;
        N2 = (Firewall%100)/10;
        N3 = Firewall%10;
        
        while (Senha != Firewall && Tentativa > 0) {
            // Descobrindo numeros individuais da tentativa de senha
            Centena = Senha/100;
            Dezena = (Senha%100)/10;
            Unidade = Senha%10;
            // reiniciando a contagem
            ContNumCert = 0;
            ContCertPose = 0;

            // Contagem de números corretos
            if (N1 == Centena || N2 == Centena || N3 == Centena) {
                ContNumCert++;
            }
            if (N1 == Dezena || N2 == Dezena || N3 == Dezena) {
                ContNumCert++;
            }
            if (N1 == Unidade || N2 == Unidade || N3 == Unidade) {
                ContNumCert++;
            }
            // contagem de posições corretas
            if (N1 * 100 == Centena * 100) {
                ContCertPose++;
            }
            if (N2 * 10 == Dezena * 10) {
                ContCertPose++;
            }
            if (N3 == Unidade) {
                ContCertPose++;
            }
            // Contagem de tentativa e erro
            ContErro++;
            Tentativa--;
            if (Senha != Firewall) {
                if (Tentativa == 0) {
                    System.out.println("Senha incorreta! Você acertou " + ContNumCert + " números em " + ContCertPose + " posições corretas. " + "Você não tem mais tentativas, sistema bloqueado.");
                } else {
                    System.out.println("Senha incorreta! Você acertou " + ContNumCert + " números em " + ContCertPose + " posições corretas. " + "Você ainda possui " + Tentativa + " tentativas, tente novamente.");
                    System.out.println("Digite a senha de 3 digitos: ");
                    Senha = leia.nextInt();
                }
            }
        } // enfim
        if (Senha == Firewall) {
            System.out.println("Senha Correta!");
        }    
    }
}