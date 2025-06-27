package Senai_LLP_EnumGen_Pedido;

import java.util.ArrayList;
import java.util.Scanner;

public class Pedido {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        ArrayList<ItemPedido> pedidos = new ArrayList<>();
        
        System.out.println("Sistema de Pedidos - Digite a descrição vazia para finalizar");
        
        while (true) {
            System.out.print("\nInforme a descrição do item: ");
            String descricao = leia.nextLine().trim();
            
            if (descricao.isEmpty()) {
                break;
            }
            
            System.out.print("Informe a quantidade do item: ");
            int quantidade = Integer.parseInt(leia.nextLine());
            
            System.out.println("Categorias disponíveis:");
            System.out.println("1. Alimento");
            System.out.println("2. Eletronico");
            System.out.println("3. Outros");
            System.out.print("Selecione a categoria: ");
            int opcaoCategoria = Integer.parseInt(leia.nextLine());
            
            String categoria;
            switch (opcaoCategoria) {
                case 1:
                    categoria = "Alimento";
                    break;
                case 2:
                    categoria = "Eletronico";
                    break;
                case 3:
                    categoria = "Outros";
                    break;
                default:
                    categoria = "Outros";
                    break;
            }
            
            pedidos.add(new ItemPedido(descricao, quantidade, categoria));
        }
        
        System.out.println("\nLista de Pedidos:");
        for (ItemPedido item : pedidos) {
            System.out.printf("%s %s %d%n", item.getCategoria(), item.getDescricao(), item.getQuantidade());
        }
    }
}

class ItemPedido {
    private String descricao;
    private int quantidade;
    private String categoria;
    
    public ItemPedido(String descricao, int quantidade, String categoria) {
        this.descricao = descricao;
        this.quantidade = quantidade;
        this.categoria = categoria;
    }
    
    public String getDescricao() {
        return descricao;
    }
    
    public int getQuantidade() {
        return quantidade;
    }
    
    public String getCategoria() {
        return categoria;
    }
}