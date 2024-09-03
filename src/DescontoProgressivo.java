import java.util.Scanner;

public class DescontoProgressivo {
    public static void main(String[] args) {
        // Peça ao usuário para inserir o valor total da compra
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o valor total da compra: R$ ");
        double valorOriginal = scanner.nextDouble();

        // Aplique as regras de desconto progressivo
        double valorDesconto = 0;
        double percentualDesconto = 0;
        if (valorOriginal > 500) {
            percentualDesconto = 0.20;
        } else if (valorOriginal >= 200 && valorOriginal <= 500) {
            percentualDesconto = 0.10;
        } else if (valorOriginal >= 100 && valorOriginal < 200) {
            percentualDesconto = 0.05;
        }

        // Calcule o valor descontado
        valorDesconto = valorOriginal * percentualDesconto;

        // Calcule o valor final após o desconto
        double valorFinal = valorOriginal - valorDesconto;

        // Informe o valor original, o percentual de desconto aplicado, o valor descontado e o valor final da compra
        System.out.println("Valor original: R$ " + valorOriginal);
        System.out.println("Percentual de desconto: " + (percentualDesconto * 100) + "%");
        System.out.println("Valor descontado: R$ " + valorDesconto);
        System.out.println("Valor final: R$ " + valorFinal);
    }
}