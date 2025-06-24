package Senai_LLP_EnumGen_Pedido;

import java.util.Scanner;
/* 
1. Crie um repositório no Github  e implemente os algoritmos para (Senai_LLP_EnumGen_Pedido):


a) Implemente uma aplicação de Ordem de Pedido, registrando item a item e ao final emitindo o pedido
    - Solicitar a descrição do item
    - A quantidade de item
    -Selecionar a Categoria (Alimento, Eletrônico, etc)
    -Até que informe a descrição em branco
    - Emitir a lista ao final com todos os itens
*/
/*
Ex:
    Usuário informa a descrição do item: Arroz
    Usuário informa a quantidade do item: 10
    Mostra as categorias:
    1. Alimento
    2. Eletronico
    3. Outros
    Usuário seleciona a categoria listada: 1
    ...
    Usuário não informa uma descrição
    ...
    Imprime a lista:
    Alimento Arroz 10
    Alimento Feijão 25
    Outros Tapete para banheiro 2


*/
public class Pedido {
        @SuppressWarnings({ "resource", "unused" })
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        
        String[] descricoes = new String[100];
        int[] quantidades = new int[100];
        String[] categorias = new String[100];
        int totalItens = 0;
        String descricao;
        
        System.out.println("Sistema de Ordem de Pedido");
        System.out.println("Informe os itens do pedido (deixe a descrição em branco para finalizar)");
        
        do {
            System.out.print("\nDescrição do item: ");
            descricao = leia.nextLine().trim();
            
            if (!descricao.isEmpty()) {
                System.out.print("Quantidade do item: ");
                int quantidade = leia.nextInt();
                leia.nextLine();
                
                System.out.println("\nCategorias disponíveis:");
                System.out.println("1. Alimento");
                System.out.println("2. Eletronico");
                System.out.println("3. Outros");
                
                System.out.print("Selecione a categoria (1-3): ");
                int opcaoCategoria = leia.nextInt();
                leia.nextLine();
                
                String categoria = switch (opcaoCategoria) {
                    case 1 -> "Alimento";
                    case 2 -> "Eletronico";
                    case 3 -> "Outros";
                    default -> "Outros";
                };
                
                descricoes[totalItens] = descricao;
                quantidades[totalItens] = quantidade;
                categorias[totalItens] = categoria;
                totalItens++;
            }
        } while (!descricao.isEmpty());
        
        System.out.println("\n\n--- Pedido Finalizado ---");
        System.out.println("Itens do pedido:");
        
        for (int i = 0; i < totalItens; i++) {
            System.out.printf("%s %s %d\n", categorias[i], descricoes[i], quantidades[i]);
        }
    }
}