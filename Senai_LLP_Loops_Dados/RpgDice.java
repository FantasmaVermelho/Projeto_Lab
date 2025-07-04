package Senai_LLP_Loops_Dados;

import java.util.Scanner;
import java.util.Random;
/* 
Crie um repositorio no github e implemente os algoritmos para (Senai_LLP_Loops_Dados):
    a. Implemente uma aplicação que retorne os valores sorteados de dados(s)
    b. A aplicação recebe a quantidade de dados ou nenhuma informação (considerar como 1 dado) e gera "randomicamente" (Math.random) um número de 1 a 6 para cada dado.
    c. Retorna o desenho do dado com a quantidade sorteada
        ex:
        +---------+     +---------+     +---------+     +---------+     +---------+     +---------+
        |         |     |    ●    |     |  ●      |     |  ●   ●  |     |  ●   ●  |     |  ●   ●  |
        |    ●    |     |         |     |    ●    |     |         |     |    ●    |     |  ●   ●  |
        |         |     |    ●    |     |      ●  |     |  ●   ●  |     |  ●   ●  |     |  ●   ●  |
        +---------+     +---------+     +---------+     +---------+     +---------+     +---------+
*/
public class RpgDice {
        @SuppressWarnings({ "resource", "unused" })
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        Random random = new Random();
        
        // Variaveis
        int Dados, TpDado, d20, d12, d10, d8, d6, d4;             
        // leitura de dados
        System.out.println("Quantos dados deseja rolar?");
        System.out.println("(Max - 3 / Min - 1)");
        Dados = leia.nextInt();
        
        // Rolagem de dados
        while (Dados != 0) {
            
            // Colocando valores aleatorios nas variaveis
            
            System.out.println("\n");
            System.out.println("Escolha o tipo de dado");
            System.out.println("1 = d20 / 2 = d12 / 3 = d10 / 4 = d8 / 5 = d6 / 6 = d4");
            TpDado = leia.nextInt();
            switch (TpDado) {
                case 1: // d20
                    System.out.println("Rolando " + Dados + " d20s");
                    for (int i = 1; i <= Dados; i++) {
                        d20 = random.nextInt(19) + 1;
                        System.out.println(
                            "                  ██████                  " + "\n" +
                            "              ████  ██  ███               " + "\n" +
                            "           ████     █      ███            " + "\n" +
                            "        ████        █         ███         " + "\n" +
                            "     ███           ██            ████     " + "\n" +
                            "  ███   █████████████████████████   ████  " + "\n" +
                            "███████           ██ ██           ████████" + "\n" +
                            "███              ██   ██               ███" + "\n" +
                            "████            ██      ██            ████" + "\n" +
                            "████           ██        ██           █ ██" + "\n" +
                            "██ ██         ██          ██         ██ ██" + "\n" +
                            "██  ██       ██            ██       ██  ██" + "\n" +
                            "██   ██     ██     "+ d20 + "       ██     ██   ██" + "\n" +
                            "██   ██   ███                ██    ██   ██" + "\n" +
                            "██    ██ ██                   ██  ██    ██" + "\n" +
                            "██     ███                     ████     ██" + "\n" +
                            "██    █████████████████████████████     ██" + "\n" +
                            "██ ████  ██                    ██  ███  ██" + "\n" +
                            "████      ███                ██       ████" + "\n" +
                            " ████       ██              ██       ███  " + "\n" +
                            "    ████     ██           ██      ███     " + "\n" +
                            "        ███    ██        ██   ████        " + "\n" +
                            "           ███  ██     ██  ████           " + "\n" +
                            "              ███ ██  ██████              " + "\n" +
                            "                 ███████                  " + "\n" +
                            "                    █                     "
                        );   
                    }
                    break;
                case 2: // d12
                    System.out.println("Rolando " + Dados + " d12s");
                    for (int i = 1; i <= Dados; i++) {
                        d12 = random.nextInt(11) + 1;
                        System.out.println(
                            "                  ███████████████                 " + "\n" +
                            "             █████      ██       ██████           " + "\n" +
                            "         ████           ██             ███        " + "\n" +
                            "       ███              ██              ███       " + "\n" +
                            "      ██                ██                ██      " + "\n" +
                            "     ██                 ██                 ██`    " + "\n" +
                            "   ██                   ██                   ██   " + "\n" +
                            "  ██                   ███                    ██  " + "\n" +
                            " ██                  ██   ███                   ██" + "\n" +
                            "█                 ███        ███             █████" + "\n" +
                            "██████         ███             ███        ███    █" + "\n" +
                            "█     █████  ███                  ███  ███       █" + "\n" +
                            "█          ███                      ███          █" + "\n" +
                            "█           ██                     ██            █" + "\n" +
                            "█            ██        "+ d12 + "          ██            █" + "\n" +
                            "█             █                   ██             █" + "\n" +
                            "█             ██                  ██             █" + "\n" +
                            "█              █                 ██             ██" + "\n" +
                            "██             ██               ██             ██ " + "\n" +
                            " ███            ██              ██            ██  " + "\n" +
                            "   ██          ████████████████████          ██   " + "\n" +
                            "    ██        ██                  ██       ███    " + "\n" +
                            "      ██    ███                     ██    ██      " + "\n" +
                            "       ██  ██                        ███ ██       " + "\n" +
                            "        ████                          ████        " + "\n" +
                            "           ██████                █████            " + "\n" +
                            "                 ████████████████                 "
                        );    
                    }
                    break;
                case 3: // d10
                    System.out.println("Rolando " + Dados + " d10s");
                    for (int i = 1; i <= Dados; i++) {
                        d10 = random.nextInt(9) + 1;
                        System.out.println(
                            "                         █                          " + "\n" +
                            "                        ████                        " + "\n" +
                            "                      ███  ███                      " + "\n" +
                            "                    ██ █    █ █                     " + "\n" +
                            "                   █  █      █ ██                   " + "\n" +
                            "                 ██  █        █  ██                 " + "\n" +
                            "               ██   █          █   █                " + "\n" +
                            "              █    █            █   ██              " + "\n" +
                            "            ██    █             ██    ██            " + "\n" +
                            "          ██     █               ██     █           " + "\n" +
                            "         █      █       "+ d10 + "        ██     ██         " + "\n" +
                            "       ██      █                   ██      ██       " + "\n" +
                            "     ██       ██                    ██       █      " + "\n" +
                            "    ██       ██                      ██       ██    " + "\n" +
                            "  ██     ████████                  ████████     ██  " + "\n" +
                            "███████           ███         ████           ██████ " + "\n" +
                            "██                     ██████                     ██" + "\n" +
                            "  ██                     ██                     ██  " + "\n" +
                            "    ██                   ██                   ██    " + "\n" +
                            "      ██                 ██                 ██      " + "\n" +
                            "        ██               ██               ██        " + "\n" +
                            "          ██             ██             ██          " + "\n" +
                            "            ██           ██           ██            " + "\n" +
                            "              ██         ██         ██              " + "\n" +
                            "                ██       ██       ██                " + "\n" +
                            "                  ██     ██     ██                  " + "\n" +
                            "                    ██   ██   ██                    " + "\n" +
                            "                      ██ ██ ██                      " + "\n" +
                            "                        ████                        "
                        );
                    }
                    break;
                case 4: // d8
                    System.out.println("Rolando " + Dados + " d8s");
                    for (int i = 1; i < Dados; i++) {
                        d8 = random.nextInt(7) + 1;
                        System.out.println(
                            "                     ██                     " + "\n" +
                            "                  ████████                  " + "\n" +
                            "              ████       ████               " + "\n" +
                            "           ████             ████            " + "\n" +
                            "        ████                    ████        " + "\n" +
                            "     ████                          ████     " + "\n" +
                            "  ████                                ████  " + "\n" +
                            "████████████████████████████████████████████" + "\n" +
                            "██                                        ██" + "\n" +
                            "███                                      ███" + "\n" +
                            "██ █                                   ██ ██" + "\n" +
                            "██  █                                 ██  ██" + "\n" +
                            "██   █                               ██   ██" + "\n" +
                            "██    █                             ██    ██" + "\n" +
                            "██     ██            "+ d8 + "             ██     ██" + "\n" +
                            "██      ██                        ██      ██" + "\n" +
                            "██       ██                      █        ██" + "\n" +
                            "██        ██                    █         ██" + "\n" +
                            "██         ██                  █          ██" + "\n" +
                            "██           █                █           ██" + "\n" +
                            "██            █              █           ███" + "\n" +
                            "  ████         █            █         ████  " + "\n" +
                            "     ████       █          █       ████     " + "\n" +
                            "        ████     █        █     ████        " + "\n" +
                            "           ████   █      █   ████           " + "\n" +
                            "              ████ █   ██ ████              " + "\n" +
                            "                 █████████                  " + "\n" +
                            "                     ██                     "
                        );    
                    }
                    break;
                case 5: // d6
                    System.out.println("Rolando " + Dados + " d6s");
                    for (int i = 1; i <= Dados; i++) {
                        d6 = random.nextInt(5) + 1;
                        System.out.println(
                            "                  ████████                  " + "\n" +
                            "               ████      ████               " + "\n" +
                            "            ████             ████           " + "\n" +
                            "         ████                   ████        " + "\n" +
                            "      ████                         ████     " + "\n" +
                            "   ███                                ████  " + "\n" +
                            "███                  "+ d6 + "                   ███" + "\n" +
                            "██████                                 █████" + "\n" +
                            "██   ████                          ████   ██" + "\n" +
                            "██      ████                    ████      ██" + "\n" +
                            "██          ████             ████         ██" + "\n" +
                            "██             ████       ████            ██" + "\n" +
                            "██                ████ ████               ██" + "\n" +
                            "██                   ██                   ██" + "\n" +
                            "██                   ██                   ██" + "\n" +
                            "██                   ██                   ██" + "\n" +
                            "██                   ██                   ██" + "\n" +
                            "██                   ██                   ██" + "\n" +
                            "██                   ██                   ██" + "\n" +
                            "██                   ██                   ██" + "\n" +
                            " ████                ██                ████ " + "\n" +
                            "    ████             ██             ████    " + "\n" +
                            "        ████         ██          ████       " + "\n" +
                            "           ████      ██       ████          " + "\n" +
                            "              ████   ██    ████             " + "\n" +
                            "                 ██████ ███                 " + "\n" +
                            "                    ████                    "
                        );
                    }
                    break;
                case 6: // d4
                    System.out.println("Rolando " + Dados + " d4s");
                    for (int i = 1; i <= Dados; i++) {
                        d4 = random.nextInt(3) + 1;
                        System.out.println(
                            "                              ██                            " + "\n" +
                            "                             ████                           " + "\n" +
                            "                            ██████                          " + "\n" +
                            "                          ██████████                        " + "\n" +
                            "                         ████████████                       " + "\n" +
                            "                       ███████████████                      " + "\n" +
                            "                      █████  ████  █████                    " + "\n" +
                            "                     ████    ████   █████                   " + "\n" +
                            "                   █████     ████    █████                  " + "\n" +
                            "                  █████      ████      ████                 " + "\n" +
                            "                █████        ████       █████               " + "\n" +
                            "               █████         ████        █████              " + "\n" +
                            "              ████           ████          ████             " + "\n" +
                            "            █████            ████           █████           " + "\n" +
                            "           █████             ████            █████          " + "\n" +
                            "         █████               ████              ████         " + "\n" +
                            "        █████                ████     "+ d4 + "         █████       " + "\n" +
                            "       ████                  ████                █████      " + "\n" +
                            "     █████                   ████                  ████     " + "\n" +
                            "    █████                    ████                   ████    " + "\n" +
                            "   ████                      ████                    █████  " + "\n" +
                            " █████                       ████                     █████ " + "\n" +
                            "█████████                    ████                   ████████" + "\n" +
                            "   ██████████                ████              ███████████  " + "\n" +
                            "       ███████████           ████          ██████████       " + "\n" +
                            "            ███████████      ████     ███████████           " + "\n" +
                            "                 ███████████████████████████                " + "\n" +
                            "                      █████████████████                     " + "\n" +
                            "                           ████████                         "
                        );    
                    }
                    break;
                default: // Caso valor incorreto
                    System.out.println("Valor errado");
                    break;
            }
            System.out.println("\n");
            System.out.println("Quantos dados deseja rolar?");
            System.out.println("Digita 0 caso decida encerrar o programa");
            System.out.println("(Max - 3 / Min - 1)");
            Dados = leia.nextInt();
            
        }
        System.out.println("Programa encerrado");
    }   
}


/* Rascunhos enormes: 

d20 

"                  ██████                  " + "\n" +                  
"              ████  ██  ███               " + "\n" +                  
"           ████     █      ███            " + "\n" +                  
"        ████        █         ███         " + "\n" +                  
"     ███           ██            ████     " + "\n" +                  
"  ███   █████████████████████████   ████  " + "\n" +                  
"███████           ██ ██           ████████" + "\n" +                  
"███              ██   ██               ███" + "\n" +                  
"████            ██      ██            ████" + "\n" +                  
"████           ██        ██           █ ██" + "\n" +                  
"██ ██         ██          ██         ██ ██" + "\n" +                  
"██  ██       ██            ██       ██  ██" + "\n" +                  
"██   ██     ██     "+ d20[] +"       ██     ██   ██" + "\n" +                  
"██   ██   ███                ██    ██   ██" + "\n" +                  
"██    ██ ██                   ██  ██    ██" + "\n" +                  
"██     ███                     ████     ██" + "\n" +                  
"██    █████████████████████████████     ██" + "\n" +                  
"██ ████  ██                    ██  ███  ██" + "\n" +                  
"████      ███                ██       ████" + "\n" +                  
" ████       ██              ██       ███  " + "\n" +                  
"    ████     ██           ██      ███     " + "\n" +                  
"        ███    ██        ██   ████        " + "\n" +                  
"           ███  ██     ██  ████           " + "\n" +                  
"              ███ ██  ██████              " + "\n" +                  
"                 ███████                  " + "\n" +                  
"                    █                     "                  


    d12



"                  ███████████████                 " + "\n" +  
"             █████      ██       ██████           " + "\n" +  
"         ████           ██             ███        " + "\n" +   
"       ███              ██              ███       " + "\n" +  
"      ██                ██                ██      " + "\n" +  
"     ██                 ██                 ██`    " + "\n" +  
"   ██                   ██                   ██   " + "\n" +  
"  ██                   ███                    ██  " + "\n" +  
" ██                  ██   ███                   ██" + "\n" +  
"█                 ███        ███             █████" + "\n" +  
"██████         ███             ███        ███    █" + "\n" +  
"█     █████  ███                  ███  ███       █" + "\n" +  
"█          ███                      ███          █" + "\n" +  
"█           ██                     ██            █" + "\n" +  
"█            ██        "+ d12[] +"          ██            █" + "\n" +  
"█             █                   ██             █" + "\n" +  
"█             ██                  ██             █" + "\n" +  
"█              █                 ██             ██" + "\n" +  
"██             ██               ██             ██ " + "\n" +  
" ███            ██              ██            ██  " + "\n" +  
"   ██          ████████████████████          ██   " + "\n" +  
"    ██        ██                  ██       ███    " + "\n" +  
"      ██    ███                     ██    ██      " + "\n" +  
"       ██  ██                        ███ ██       " + "\n" +  
"        ████                          ████        " + "\n" +  
"           ██████                █████            " + "\n" +  
"                 ████████████████                 " 


    d10
    
    

"                         █                          " + "\n" +  
"                        ████                        " + "\n" +  
"                      ███  ███                      " + "\n" +  
"                    ██ █    █ █                     " + "\n" +  
"                   █  █      █ ██                   " + "\n" +  
"                 ██  █        █  ██                 " + "\n" +  
"               ██   █          █   █                " + "\n" +  
"              █    █            █   ██              " + "\n" +  
"            ██    █             ██    ██            " + "\n" +  
"          ██     █               ██     █           " + "\n" +  
"         █      █       "+ d10[] +"        ██     ██         " + "\n" +  
"       ██      █                   ██      ██       " + "\n" +  
"     ██       ██                    ██       █      " + "\n" +  
"    ██       ██                      ██       ██    " + "\n" +  
"  ██     ████████                  ████████     ██  " + "\n" +  
"███████           ███         ████           ██████ " + "\n" +  
"██                     ██████                     ██" + "\n" +  
"  ██                     ██                     ██  " + "\n" +  
"    ██                   ██                   ██    " + "\n" +  
"      ██                 ██                 ██      " + "\n" +  
"        ██               ██               ██        " + "\n" +  
"          ██             ██             ██          " + "\n" +  
"            ██           ██           ██            " + "\n" +  
"              ██         ██         ██              " + "\n" +  
"                ██       ██       ██                " + "\n" +  
"                  ██     ██     ██                  " + "\n" +  
"                    ██   ██   ██                    " + "\n" +  
"                      ██ ██ ██                      " + "\n" +  
"                        ████                        "  


    d8 
    

"                     ██                     " + "\n" +                     
"                  ████████                  " + "\n" +                     
"              ████       ████               " + "\n" +                     
"           ████             ████            " + "\n" +                     
"        ████                    ████        " + "\n" +                     
"     ████                          ████     " + "\n" +                     
"  ████                                ████  " + "\n" +                     
"████████████████████████████████████████████" + "\n" +                     
"██                                        ██" + "\n" +                     
"███                                      ███" + "\n" +                     
"██ █                                   ██ ██" + "\n" +                     
"██  █                                 ██  ██" + "\n" +                     
"██   █                               ██   ██" + "\n" +                     
"██    █                             ██    ██" + "\n" +                     
"██     ██            "+ d8[] +"             ██     ██" + "\n" +                     
"██      ██                        ██      ██" + "\n" +                     
"██       ██                      █        ██" + "\n" +                     
"██        ██                    █         ██" + "\n" +                     
"██         ██                  █          ██" + "\n" +                     
"██           █                █           ██" + "\n" +                     
"██            █              █           ███" + "\n" +                     
"  ████         █            █         ████  " + "\n" +                     
"     ████       █          █       ████     " + "\n" +                     
"        ████     █        █     ████        " + "\n" +                     
"           ████   █      █   ████           " + "\n" +                     
"              ████ █   ██ ████              " + "\n" +                     
"                 █████████                  " + "\n" +                     
"                     ██                     "                     


    d6
    
    
"                  ████████                  " + "\n" +                    
"               ████      ████               " + "\n" +                    
"            ████             ████           " + "\n" +                    
"         ████                   ████        " + "\n" +                    
"      ████                         ████     " + "\n" +                    
"   ███                                ████  " + "\n" +                    
"███                  "+ d6[] +"                   ███" + "\n" +                    
"██████                                 █████" + "\n" +                    
"██   ████                          ████   ██" + "\n" +                    
"██      ████                    ████      ██" + "\n" +                    
"██          ████             ████         ██" + "\n" +                    
"██             ████       ████            ██" + "\n" +                    
"██                ████ ████               ██" + "\n" +                    
"██                   ██                   ██" + "\n" +                    
"██                   ██                   ██" + "\n" +                    
"██                   ██                   ██" + "\n" +                    
"██                   ██                   ██" + "\n" +                    
"██                   ██                   ██" + "\n" +                    
"██                   ██                   ██" + "\n" +                    
"██                   ██                   ██" + "\n" +                    
" ████                ██                ████ " + "\n" +                    
"    ████             ██             ████    " + "\n" +                    
"        ████         ██          ████       " + "\n" +                    
"           ████      ██       ████          " + "\n" +                    
"              ████   ██    ████             " + "\n" +                    
"                 ██████ ███                 " + "\n" +                    
"                    ████                    "                    


    d4
    

"                              ██                            " + "\n"              
"                             ████                           " + "\n"              
"                            ██████                          " + "\n"              
"                          ██████████                        " + "\n"              
"                         ████████████                       " + "\n"              
"                       ███████████████                      " + "\n"              
"                      █████  ████  █████                    " + "\n"              
"                     ████    ████   █████                   " + "\n"              
"                   █████     ████    █████                  " + "\n"              
"                  █████      ████      ████                 " + "\n"              
"                █████        ████       █████               " + "\n"              
"               █████         ████        █████              " + "\n"              
"              ████           ████          ████             " + "\n"              
"            █████            ████           █████           " + "\n"              
"           █████             ████            █████          " + "\n"              
"         █████               ████              ████         " + "\n"              
"        █████                ████     "+ d4[] +"         █████       " + "\n"              
"       ████                  ████                █████      " + "\n"              
"     █████                   ████                  ████     " + "\n"              
"    █████                    ████                   ████    " + "\n"              
"   ████                      ████                    █████  " + "\n"              
" █████                       ████                     █████ " + "\n"              
"█████████                    ████                   ████████" + "\n"              
"   ██████████                ████              ███████████  " + "\n"              
"       ███████████           ████          ██████████       " + "\n"              
"            ███████████      ████     ███████████           " + "\n"              
"                 ███████████████████████████                " + "\n"              
"                      █████████████████                     " + "\n"              
"                           ████████                         "
*/