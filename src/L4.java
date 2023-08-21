import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class L4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Digite a quantidade de números (N): ");
        int n = s.nextInt();

        List<Integer> numerosPares = new ArrayList<>();
        List<Integer> numerosImpares = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            int numero = s.nextInt();

            if (numero % 2 == 0) {
                numerosPares.add(numero);
            } else {
                numerosImpares.add(numero);
            }
        }

        System.out.println("Números pares:");
        for (int num : numerosPares) {
            System.out.print(num + " ");
        }
        System.out.println();

        System.out.println("Números ímpares:");
        for (int num : numerosImpares) {
            System.out.print(num + " ");
        }
    }
}