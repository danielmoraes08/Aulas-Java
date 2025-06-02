package Desafio;

import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o limite do cartão: ");
        double limite = scanner.nextDouble();
        Cartao cartao = new Cartao(limite);

        int sair = 1;
        while (sair != 0){
            System.out.println("Digite a descricao da compra: ");
            String descricao = scanner.next();

            System.out.println("Digite o valor da compra: ");
            Double valor = scanner.nextDouble();

            Compra compra = new Compra(descricao,valor);
            boolean compraRealizada = cartao.lancaCompra(compra);

            if (compraRealizada){
                System.out.println("Compra realizada!");
                System.out.println("\nDigite 0 para sair ou 1 para continuar");
                sair = scanner.nextInt();

            } else {
                System.out.println("Saldo insuficiente!");
                sair = 0;

            }

            System.out.println("****************");
            System.out.println("COMPRAS REALIZADAS: \n");

            Collections.sort(cartao.getCompras());

            for (Compra c : cartao.getCompras()){
                System.out.println(c.getDescricao() + " - " +c.getValor());
            }
            System.out.println("\n******************");

            System.out.println("\nSaldo do cartão: "+cartao.getSaldo());


        }
    }
}
