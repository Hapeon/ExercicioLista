import java.util.Scanner;

public class m8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número de linhas (M): ");
        int m = scanner.nextInt();
        System.out.print("Digite o número de colunas (N): ");
        int n = scanner.nextInt();

        int[][] matriz = new int[m][n];

        System.out.println("Preencha a matriz " + m + "x" + n + " com números inteiros:");

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matriz[i][j] = scanner.nextInt();
            }
        }

        System.out.print("Digite o número inteiro X a ser procurado na matriz: ");
        int x = scanner.nextInt();

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matriz[i][j] == x) {
                    System.out.println("Elemento encontrado na posição [" + i + "][" + j + "]");
                    if (i > 0) {
                        System.out.println("Elemento acima: " + matriz[i - 1][j]);
                    }
                    if (i < m - 1) {
                        System.out.println("Elemento abaixo: " + matriz[i + 1][j]);
                    }
                    if (j > 0) {
                        System.out.println("Elemento à esquerda: " + matriz[i][j - 1]);
                    }
                    if (j < n - 1) {
                        System.out.println("Elemento à direita: " + matriz[i][j + 1]);
                    }
                }
            }
        }
    }
}