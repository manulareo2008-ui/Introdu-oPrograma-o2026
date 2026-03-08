import java.util.Scanner;

// Entradas: largura e comprimento
// Saida: area
// Processos: area = largura * comprimento

@SuppressWarnings("ConvertToTryWithResources")

public class Uni03Exe01 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.print("Digite a largura(m): ");
        float largura = leitor.nextFloat();
        System.out.print("Digite o comprimento(m): ");
        float comprimento = leitor.nextFloat();

        float area = largura * comprimento;

        System.out.println("Área = " + area + "m²");

        leitor.close();
    }
}
